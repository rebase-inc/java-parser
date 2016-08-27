package lang;

import java.util.Set;

import org.reflections.Reflections;

import lang.Language;


public class Languages {

    public static Language[] languages;

    static {
        Reflections reflections = new Reflections("lang");
        Set<Class<? extends Language>> languages_ = reflections.getSubTypesOf(Language.class);
        languages = (Language[])(languages_.toArray());
    }

    public static Language get(int index) throws Exception {
        if ((index < 0) || (index >= languages.length)) {
            throw new Exception("index is out of bounds");
        }
        return languages[index];
    }

}


