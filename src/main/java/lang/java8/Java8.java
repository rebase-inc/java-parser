package lang.java8;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.visitor.TreeVisitor;
import com.google.common.reflect.ClassPath;

import lang.Language;
import scan.TechProfile;


class VisitAll extends TreeVisitor {

    private TechProfile _profile;

    public VisitAll(TechProfile profile) {
        _profile = profile;
    }

    @Override
        public void process(Node node) {
            _profile.inc(node.getClass().getSimpleName());
        }

}


public class Java8 implements Language {

    private static String[] _rules;
    private static ArrayList<Class<?>> _nodeTypes = new ArrayList<>();

    static {
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try {
            for (final ClassPath.ClassInfo info : ClassPath.from(loader).getTopLevelClasses()) {
                if (info.getName().startsWith("com.github.javaparser.ast")) {
                    final Class<?> clazz = info.load();
                    if (Node.class.isAssignableFrom(clazz)) {
                        _nodeTypes.add(clazz);
                    }
                }
            }
            _rules = new String[_nodeTypes.size()];
            for (int i=0; i < _rules.length; i++) {
                Class<?> nodeClass = _nodeTypes.get(i);
                _rules[i] = nodeClass.getSimpleName();
            }
            Arrays.sort(_rules);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @Override
        public TechProfile grammar_use(Reader code) throws IOException {
            TechProfile profile = new TechProfile(_rules);
            CompilationUnit cu;
            try {
                cu = JavaParser.parse(code);
                new VisitAll(profile).visitDepthFirst(cu);
            } catch (ParseException e) {
                System.out.println("Cannot parse this code");
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
        public HashMap<String, String[]> extract_library_bindings(Reader code, String filename) throws IOException {
            HashMap<String, String[]> bindings = new HashMap<String, String[]>();
            return bindings;
        }

}
