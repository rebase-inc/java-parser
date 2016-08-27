package scan;

import java.io.StringReader;
import java.util.Map;

import lang.Languages;
import lang.Language;
import scan.TechProfile;



public final class Main {

    public static void main(String[] args) throws Exception {
        Language java8 = Languages.get(0);
        TechProfile profile = java8.parse(new StringReader(args[0]));
        for (Map.Entry<String, Integer> entry : profile.data.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}
