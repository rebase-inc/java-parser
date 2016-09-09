package lang.java8;

import java.io.File;
import java.io.FileWriter;
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

    static {
        try {
            String javaLang_as_JSON = FileUtils.readFileToString(
                    new File("src/main/resources/java8/java-lang.json"),
                    Charset.defaultCharset()
                    );
            Gson gson = new Gson();
            Type type = new TypeToken<HashMap<String, String>>(){}.getType();
            types = gson.fromJson(javaLang_as_JSON, type);
        } catch (IOException e) {
            out.println(e.toString());
        }
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
                javaLang.put(type.getSimpleName(), type.getName());
            }
        });
        FileWriter file = new FileWriter("src/main/resources/java8/java-lang.json");
        file.write(gson.toJson(javaLang));
        file.flush();
        file.close();
    }

}


