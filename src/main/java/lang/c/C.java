package lang.c;

import java.io.IOException;
import java.io.Reader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.c.CLexer;
import lang.c.CParser;
import lang.Language;
import scan.TechProfile;


public class C implements Language {

    @Override
    public TechProfile parse(Reader code) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(code);
        CLexer lexer = new CLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CParser parser = new CParser(tokens);
		CParser.TranslationUnitContext tree = parser.translationUnit();
        TechProfile profile = new TechProfile(parser);
        ParseTreeWalker.DEFAULT.walk(profile, tree);
        return profile;
    }

    @Override
	public final String[] grammarRules() {
        return CParser.ruleNames;
    }

    @Override
    public final String name() { return "c"; }

}

