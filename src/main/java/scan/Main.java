package scan;

import java.io.FileReader;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

import lang.Languages;
import lang.Language;
import lang.java8.JavaLang;
import scan.TechProfile;


public final class Main {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            out.println("Commands: [ languages | grammar | scan_contents | save-java-lang ]");
            return;
        }
        switch( args[0].toLowerCase() ) {
            case "scan_contents":
                {
                    if (args.length != 3) {
                        out.println("Wrong number of arguments");
                        return;
                    }
                    Language language = Languages.get(args[1]);
                    TechProfile profile = language.scan_contents(new FileReader(args[2]));
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

            case "save-java-lang":
                {
                    JavaLang.save();
                }
                break;
        }
    }

}


