package lang.java8;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

import lang.Language;
import scan.TechProfile;


public class Java8 implements Language {

    @Override
        public TechProfile grammar_use(Reader code) throws IOException {
            TechProfile profile = new TechProfile();
            return profile;
        }

    @Override
        public final String[] grammarRules() { return Java8Parser.ruleNames; }

    @Override
        public final String name() { return "java8"; }

    @Override
        public HashMap<String, String[]> extract_library_bindings(Reader code, String filename) throws IOException {
            HashMap<String, String[]> bindings = new HashMap<String, String[]>();
            return bindings;
        }

}
