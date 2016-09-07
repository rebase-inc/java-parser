package lang.clojure;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.clojure.ClojureLexer;
import lang.clojure.ClojureParser;
import lang.Language;
import scan.TechProfile;
import scan.TechListener;


public class Clojure implements Language {

    @Override
    public TechProfile grammarUse(Reader code) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(code);
        ClojureLexer lexer = new ClojureLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClojureParser parser = new ClojureParser(tokens);
        ClojureParser.FileContext tree = parser.file();
        TechListener listener = new TechListener(parser);
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.profile;
    }

    @Override
	public final String[] grammarRules() {
        return ClojureParser.ruleNames;
    }

    @Override
    public final String name() { return "clojure"; }

    @Override
    public HashMap<String, String[]> extractLibraryBindings(Reader code, String filename) throws IOException {
        HashMap<String, String[]> bindings = new HashMap<String, String[]>();
        return bindings;
    }

}


