package lang.java8;

import java.io.IOException;
import java.io.Reader;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.google.common.reflect.ClassPath;

import lang.Language;
import scan.TechProfile;


public class Java8 implements Language {

    private static String[] _rules;
    private static ArrayList<Class<?>> nodeTypes = new ArrayList<>();
    private static ArrayList<Class<?>> javaLangTypes = new ArrayList<>();

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
                visitor.namedExprToFQN.forEach((name, qual)-> out.printf("%s: %s\n", qual, name));

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

}
