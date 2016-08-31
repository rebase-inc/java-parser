package lang.swift;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.swift.SwiftLexer;
import lang.swift.SwiftParser;
import lang.Language;
import scan.TechProfile;


public class Swift implements Language {

    @Override
    public TechProfile grammar_use(Reader code) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(code);
        SwiftLexer lexer = new SwiftLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SwiftParser parser = new SwiftParser(tokens);
        ParserRuleContext tree = parser.top_level();
        TechProfile profile = new TechProfile(parser);
        ParseTreeWalker.DEFAULT.walk(profile, tree);
        return profile;
    }

    @Override
	public final String[] grammarRules() {
        return SwiftParser.ruleNames;
    }

    @Override
    public final String name() { return "swift"; }


    @Override
    public HashMap<String, String[]> extract_library_bindings(Reader code, String filename) throws IOException {
        HashMap<String, String[]> bindings = new HashMap<String, String[]>();
        return bindings;
    }


}


