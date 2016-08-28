package lang.clojure;

import java.io.IOException;
import java.io.Reader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.clojure.ClojureLexer;
import lang.clojure.ClojureParser;
import lang.Language;
import scan.TechProfile;


public class Clojure implements Language {

    @Override
    public TechProfile parse(Reader code) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(code);
        ClojureLexer lexer = new ClojureLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClojureParser parser = new ClojureParser(tokens);
        ClojureParser.FileContext tree = parser.file();
        TechProfile profile = new TechProfile(parser);
        ParseTreeWalker.DEFAULT.walk(profile, tree);
        return profile;
    }

    @Override
	public final String[] grammarRules() {
        return ClojureParser.ruleNames;
    }

    @Override
    public final String name() { return "clojure"; }

}


