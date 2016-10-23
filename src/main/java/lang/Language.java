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

    default public TechProfile scan_patch(
            String code,
            String context,
            String previous_code,
            String previous_context
            ) throws IOException {
        StringReader code_reader = new StringReader(code);
        StringReader context_reader = new StringReader(context);
        StringReader previous_code_reader = new StringReader(previous_code);
        StringReader previous_context_reader = new StringReader(previous_context);

        TechProfile before = scan_contents(previous_code_reader, previous_context_reader);
        TechProfile after = scan_contents(code_reader, context_reader);
        try {
            return TechProfile.abs_diff(before, after);
        } catch (Exception e) {
            out.println(e);
            return new TechProfile(before.language);
        }
            }

}


