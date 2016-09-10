package lang.java8;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.reflect.Type;
import static java.lang.System.out;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.scanners.SubTypesScanner;


public class JavaLang {

    public static HashMap<String, String> types;

    private static final NotFromJavaLang notFromJavaLang = new NotFromJavaLang();
    private static final String javaLangResource = "lang/java8/java-lang.json";

    static {
        InputStream in = JavaLang.class.getClassLoader().getResourceAsStream(javaLangResource); 
        if (in == null) {
            String msg = "Resource does not exist: "+javaLangResource;
            out.println(msg);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Gson gson = new Gson();
        Type type = new TypeToken<HashMap<String, String>>(){}.getType();
        types = gson.fromJson(reader, type);
    }

    public static void save() throws Exception {
        Reflections reflections = new Reflections(
                ClasspathHelper.forClass(Object.class), 
                new SubTypesScanner(false)
                );
        Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
        allClasses.removeIf(notFromJavaLang);
        out.println("---------------------");
        allClasses.forEach((type)->out.println(type));
        out.println("---------------------");
        Gson gson = new Gson();
        HashMap<String, String> javaLang = new HashMap<>();
        allClasses.forEach(type -> {
            if (!type.getSimpleName().isEmpty()) {
                // we need to map local name to FQN
                // but we also need to map FQN to FQN
                // so we can detect var/field declaration that use the FQN.
                // Example:
                //
                // String foo = "bar";
                //
                // versus:
                //
                // java.lang.String foo = "bar";
                //
                javaLang.put(type.getSimpleName(), type.getName());
                javaLang.put(type.getName(), type.getName());
            }
        });
        FileWriter file = new FileWriter("src/main/resources/lang/java8/java-lang.json");
        file.write(gson.toJson(javaLang));
        file.flush();
        file.close();
    }

}


