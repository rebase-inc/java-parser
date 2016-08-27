package lang;

import java.io.IOException;
import java.io.Reader;

import scan.TechProfile;


public interface Language {
    public TechProfile parse(Reader code) throws IOException;
	public String[] grammarRules();
    public String name();
}


