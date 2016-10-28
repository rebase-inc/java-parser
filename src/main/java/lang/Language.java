package lang;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import static java.lang.System.out;
import java.util.HashMap;

import scan.TechProfile;


public interface Language {

    public String name();

	public String[] grammarRules();

    public TechProfile scan_contents(Reader code, StringReader context) throws IOException;

}


