package lang;

import java.util.HashMap;
import java.util.ArrayList;

import lang.Language;
import lang.java8.Java8;
import lang.clojure.Clojure;
import lang.c.C;
import lang.cpp.CPP14;
import lang.golang.Golang;


public class Languages {

    public static HashMap<String, Language> languages_by_name = new HashMap<>();
    public static ArrayList<Language> languages;

    static {
        Language java8 = new Java8();
        languages_by_name.put(java8.name(), java8);

        Language clojure = new Clojure();
        languages_by_name.put(clojure.name(), clojure);

        Language cpp14 = new CPP14();
        languages_by_name.put(cpp14.name(), cpp14);

        Language c = new C();
        languages_by_name.put(c.name(), c);

        Language golang = new Golang();
        languages_by_name.put(golang.name(), golang);

        languages = new ArrayList<>(languages_by_name.values());
    }

    public static Language get(String name) throws Exception {
        if (languages_by_name.containsKey(name)) {
            return languages_by_name.get(name);
        }
        throw new Exception(name+" is not a supported language.");
    }

    public static Language get(Integer index) throws Exception {
        if ( (index>=languages.size()) || (index < 0) ) {
            throw new Exception("invalid language index");
        }
        return languages.get(index);
    }

}


