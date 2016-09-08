package scan;

import java.io.FileReader;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

import lang.Languages;
import lang.Language;
import lang.java8.JavaLangTypes;
import scan.TechProfile;


public final class Main {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            out.println("Commands: [ languages | grammar | profile | extract_library_bindings | save-java-lang ]");
            return;
        }
        switch( args[0].toLowerCase() ) {
            case "profile":
                {
                    if (args.length != 3) {
                        out.println("Wrong number of arguments");
                        return;
                    }
                    Language language = Languages.get(args[1]);
                    TechProfile profile = language.grammarUse(new FileReader(args[2]));
                    for (Map.Entry<String, Integer> entry : profile.toMap().entrySet()) {
                        out.println(entry.getKey()+" : "+entry.getValue());
                    }
                }
                break;

            case "languages":
                Languages.languages.forEach((l)->out.println(l.name()));
                break;

            case "grammar":
                {
                    if (args.length != 2) {
                        out.println("Missing language argument");
                        return;
                    }
                    String[] rules = Languages.get(args[1]).grammarRules();
                    for ( int i=0; i < rules.length; i++ ) {
                        out.println(rules[i]);
                    }
                }
                break;

            case "extract-library-bindings":
                {
                    if (args.length != 4) {
                        out.printf("Wrong number of arguments. Found %d, should be 4", args.length);
                        return;
                    }
                    Language language = Languages.get(args[1]);
                    HashMap<String, String[]> bindings = language.extractLibraryBindings(new FileReader(args[2]), args[3]);
                    out.println(Arrays.toString(bindings.entrySet().toArray()));
                }
                break;

            case "save-java-lang":
                {
                    JavaLangTypes.saveJavaLang();
                }
                break;
        }
    }

}
