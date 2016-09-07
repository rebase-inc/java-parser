package lang.cpp;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.cpp.CPP14Lexer;
import lang.cpp.CPP14Parser;
import lang.Language;
import scan.TechProfile;
import scan.TechListener;


public class CPP14 implements Language {

    @Override
    public TechProfile grammarUse(Reader code) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(code);
        CPP14Lexer lexer = new CPP14Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CPP14Parser parser = new CPP14Parser(tokens);
        CPP14Parser.TranslationunitContext tree = parser.translationunit();
        TechListener listener = new TechListener(this, parser);
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.profile;
    }

    @Override
	public final String[] grammarRules() {
        return CPP14Parser.ruleNames;
    }

    @Override
    public final String name() { return "cpp"; }

    @Override
    public HashMap<String, String[]> extractLibraryBindings(Reader code, String filename) throws IOException {
        HashMap<String, String[]> bindings = new HashMap<String, String[]>();
        return bindings;
    }

}


