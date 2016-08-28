package scan;

import java.io.FileReader;
import java.util.Map;

import lang.Languages;
import lang.Language;
import scan.TechProfile;


public final class Main {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Missing arguments");
            return;
        }
        switch( args[0].toLowerCase() ) {
            case "parse":
                if (args.length != 3) {
                    System.out.println("Wrong number of arguments");
                    return;
                }
                Language language = Languages.get(args[1]);
                TechProfile profile = language.parse(new FileReader(args[2]));
                for (Map.Entry<String, Integer> entry : profile.data.entrySet()) {
                        System.out.println(entry.getKey()+" : "+entry.getValue());
                }
                break;
            case "languages":
                Languages.languages.forEach((l)->System.out.println(l.name()));
                break;
            case "rules":
                if (args.length != 2) {
                    System.out.println("Missing language argument");
                    return;
                }
                String[] rules = Languages.get(args[1]).grammarRules();
                for ( int i=0; i < rules.length; i++ ) {
                    System.out.println(rules[i]);
                }
                break;
        }
    }

}
