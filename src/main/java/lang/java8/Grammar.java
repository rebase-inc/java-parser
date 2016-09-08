package lang.java8;

import java.io.IOException;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.ArrayList;

import com.google.common.reflect.ClassPath;
import com.github.javaparser.ast.Node;


class Grammar {

    public static String[] rules;

    static {
        // As a one-time operation, detect all the grammar rules
        // by scanning the Node subtypes in the 'com.github.javaparser.ast' package
        // Then store all the rules in the private variable 'rules'.
        //
        // Note: this functionality should be provided by the 'javaparser' library.
        // TODO: write an issue on https://github.com/javaparser/javaparser
        //
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        
        try {
            ArrayList<Class<?>> nodeTypes = new ArrayList<>();
            for (final ClassPath.ClassInfo info : ClassPath.from(loader).getTopLevelClasses()) {
                if (info.getName().startsWith("com.github.javaparser.ast")) {
                    final Class<?> clazz = info.load();
                    if (Node.class.isAssignableFrom(clazz)) {
                        nodeTypes.add(clazz);
                    }
                }
            }
            rules = new String[nodeTypes.size()];
            for (int i=0; i < rules.length; i++) {
                rules[i] = nodeTypes.get(i).getSimpleName();
            }
            Arrays.sort(rules);

        } catch (IOException e) {
            out.println(e.toString());
        }
    }

}


