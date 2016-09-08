package lang.java8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import static java.lang.System.out;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.QualifiedNameExpr;
import com.github.javaparser.ast.visitor.TreeVisitor;
import com.google.common.reflect.ClassPath;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.scanners.SubTypesScanner;

import lang.Language;
import scan.TechProfile;


class VisitAll extends TreeVisitor {

    private static HashMap<String, String> javaLangTypes;

    static {
        try {
            String javaLang_as_JSON = FileUtils.readFileToString(
                    new File("src/main/resources/java8/java-lang.json"),
                    Charset.defaultCharset()
                    );
            Gson gson = new Gson();
            Type type = new TypeToken<HashMap<String, String>>(){}.getType();
            javaLangTypes = gson.fromJson(javaLang_as_JSON, type);
        } catch (IOException e) {
            out.println(e.toString());
        }
    }

    private TechProfile _profile;

    public HashSet<Node> nodes = new HashSet<>();

    public HashMap<String, String> namedType = new HashMap<>();

    public VisitAll(TechProfile profile) {
        _profile = profile;
    }

    private String Add(String full, String name) {
        if (full.isEmpty()) {
            return name;
        } else {
            return name+"."+full;
        }
    }

    private String fullyQualifiedName(NameExpr name) {
        String full = new String();
        NameExpr _name = name;
        do {
            full = Add(full, _name.getName());
            if (_name instanceof QualifiedNameExpr) {
                QualifiedNameExpr qualName = (QualifiedNameExpr)_name;
                _name = qualName.getQualifier();
            } else {
                break;
            }
        } while (true);
        return full;
    }

    @Override
        public void process(Node node) {
            _profile.incrementGrammar(node.getClass().getSimpleName());
            nodes.add(node);
            if (node instanceof ImportDeclaration) {
                ImportDeclaration imp = (ImportDeclaration)node;
                NameExpr name = imp.getName();
                namedType.put(name.getName(), fullyQualifiedName(name));
            } else if (node instanceof ImportDeclaration) {
            }
        }

}


final class NotFromJavaLang implements Predicate<Class<? extends Object>> {

    @Override
        public boolean test(Class<? extends Object> clazz) {
            String name = clazz.getName();
            if (name.startsWith("java.lang.")) {
                return name.substring(10).indexOf('.') != -1;
            }
            return true;
        }

}


public class Java8 implements Language {

    private static String[] _rules;
    private static ArrayList<Class<?>> nodeTypes = new ArrayList<>();
    private static ArrayList<Class<?>> javaLangTypes = new ArrayList<>();
    private static final NotFromJavaLang notFromJavaLang = new NotFromJavaLang();

    static {
        // As a one-time operation, detect all the grammar rules
        // by scanning the Node subtypes in the 'com.github.javaparser.ast' package
        // Then store all the rules in the private variable '_rules'.
        //
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        
        try {
            for (final ClassPath.ClassInfo info : ClassPath.from(loader).getTopLevelClasses()) {
                if (info.getName().startsWith("com.github.javaparser.ast")) {
                    final Class<?> clazz = info.load();
                    if (Node.class.isAssignableFrom(clazz)) {
                        nodeTypes.add(clazz);
                    }
                }
            }
            _rules = new String[nodeTypes.size()];
            for (int i=0; i < _rules.length; i++) {
                _rules[i] = nodeTypes.get(i).getSimpleName();
            }
            Arrays.sort(_rules);

        } catch (IOException e) {
            out.println(e.toString());
        }
    }

    @Override
        public TechProfile grammarUse(Reader code) throws IOException {
            TechProfile profile = new TechProfile(this);
            CompilationUnit cu;
            try {
                cu = JavaParser.parse(code);
                VisitAll visitor = new VisitAll(profile);
                visitor.visitDepthFirst(cu);
                visitor.nodes.forEach((node)-> {
                    out.println("++++++++++++++");
                    out.println(node.getParentNode());
                    out.println(node.getClass().getSimpleName());
                    out.println(node);
                    out.println("--------------");
                });
                visitor.namedType.forEach((name, qual)-> out.printf("%s: %s\n", qual, name));

            } catch (ParseException e) {
                out.println("Cannot parse this code");
            } finally {
                code.close();
            }
            return profile;
        }

    @Override
        public final String[] grammarRules() { return _rules; }

    @Override
        public final String name() { return "java8"; }

    @Override
        public HashMap<String, String[]> extractLibraryBindings(Reader code, String filename) throws IOException {
            HashMap<String, String[]> bindings = new HashMap<String, String[]>();
            return bindings;
        }

    public void saveJavaLang() throws Exception {
        Reflections reflections = new Reflections(
                ClasspathHelper.forClass(Object.class), 
                new SubTypesScanner(false)
                );
        Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
        out.println("---------------------");
        allClasses.removeIf(notFromJavaLang);
        allClasses.forEach((type)->out.println(type));
        out.println("---------------------");
        Gson gson = new Gson();
        HashMap<String, String> javaLang = new HashMap<>();
        allClasses.forEach(type -> javaLang.put(type.getSimpleName(), type.getName()));
        FileWriter file = new FileWriter("src/main/resources/java8/java-lang.json");
        file.write(gson.toJson(javaLang));
        file.flush();
        file.close();
    }

}
