package lang.swift;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
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
import scan.TechListener;


public class Swift implements Language {

    @Override
    public TechProfile scan_contents(Reader code, StringReader context) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(code);
        SwiftLexer lexer = new SwiftLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SwiftParser parser = new SwiftParser(tokens);
        ParserRuleContext tree = parser.top_level();
        TechListener listener = new TechListener(this, parser);
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.profile;
    }

    @Override
	public final String[] grammarRules() {
        return SwiftParser.ruleNames;
    }

    @Override
    public final String name() { return "swift"; }

}


