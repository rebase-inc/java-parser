package scan;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

import lang.Languages;
import lang.Language;
import scan.TechProfile;


public final class Main {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Commands: [ languages | grammar_rules | grammar_use | extract_library_bindings ]");
            return;
        }
        switch( args[0].toLowerCase() ) {
            case "grammar_use":
                {
                    if (args.length != 3) {
                        System.out.println("Wrong number of arguments");
                        return;
                    }
                    Language language = Languages.get(args[1]);
                    TechProfile profile = language.grammarUse(new FileReader(args[2]));
                    for (Map.Entry<String, Integer> entry : profile.toMap().entrySet()) {
                        System.out.println(entry.getKey()+" : "+entry.getValue());
                    }
                }
                break;

            case "languages":
                Languages.languages.forEach((l)->System.out.println(l.name()));
                break;

            case "grammar_rules":
                {
                    if (args.length != 2) {
                        System.out.println("Missing language argument");
                        return;
                    }
                    String[] rules = Languages.get(args[1]).grammarRules();
                    for ( int i=0; i < rules.length; i++ ) {
                        System.out.println(rules[i]);
                    }
                }
                break;

            case "extract_library_bindings":
                {
                    if (args.length != 4) {
                        System.out.printf("Wrong number of arguments. Found %d, should be 4", args.length);
                        return;
                    }
                    Language language = Languages.get(args[1]);
                    HashMap<String, String[]> bindings = language.extractLibraryBindings(new FileReader(args[2]), args[3]);
                    System.out.println(Arrays.toString(bindings.entrySet().toArray()));
                }
                break;
        }
    }

}
