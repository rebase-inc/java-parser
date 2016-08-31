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


public class CPP14 implements Language {

    @Override
    public TechProfile grammar_use(Reader code) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(code);
        CPP14Lexer lexer = new CPP14Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CPP14Parser parser = new CPP14Parser(tokens);
        CPP14Parser.TranslationunitContext tree = parser.translationunit();
        TechProfile profile = new TechProfile(parser);
        ParseTreeWalker.DEFAULT.walk(profile, tree);
        return profile;
    }

    @Override
	public final String[] grammarRules() {
        return CPP14Parser.ruleNames;
    }

    @Override
    public final String name() { return "cpp"; }

    @Override
    public HashMap<String, String[]> extract_library_bindings(Reader code, String filename) throws IOException {
        HashMap<String, String[]> bindings = new HashMap<String, String[]>();
        return bindings;
    }

}


