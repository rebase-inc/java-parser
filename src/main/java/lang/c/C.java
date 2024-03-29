package lang.c;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.c.CLexer;
import lang.c.CParser;
import lang.Language;
import scan.TechProfile;
import scan.TechListener;


public class C implements Language {

    @Override
        public TechProfile scan_contents(Reader code, StringReader context) throws IOException {
            ANTLRInputStream input = new ANTLRInputStream(code);
            CLexer lexer = new CLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CParser parser = new CParser(tokens);
            CParser.TranslationUnitContext tree = parser.translationUnit();
            TechListener listener = new TechListener(this, parser);
            ParseTreeWalker.DEFAULT.walk(listener, tree);
            return listener.profile;
        }

    @Override
        public final String[] grammarRules() {
            return CParser.ruleNames;
        }

    @Override
        public final String name() { return "c"; }

}


