package lang;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

import scan.TechProfile;


public interface Language {
    public String name();
	public String[] grammarRules();
    public TechProfile grammar_use(Reader code) throws IOException;
    public HashMap<String, String[]> extract_library_bindings(Reader code, String filename) throws IOException;
}


