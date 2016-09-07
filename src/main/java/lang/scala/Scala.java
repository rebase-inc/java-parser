package lang.scala;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.scala.ScalaLexer;
import lang.scala.ScalaParser;
import lang.Language;
import scan.TechProfile;
import scan.TechListener;


public class Scala implements Language {

    @Override
        public TechProfile grammarUse(Reader code) throws IOException {
            ANTLRInputStream input = new ANTLRInputStream(code);
            ScalaLexer lexer = new ScalaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ScalaParser parser = new ScalaParser(tokens);
            ParserRuleContext tree = parser.compilationUnit();
            TechListener listener = new TechListener(this, parser);
            ParseTreeWalker.DEFAULT.walk(listener, tree);
            return listener.profile;
        }

    @Override
        public final String[] grammarRules() {
            return ScalaParser.ruleNames;
        }

    @Override
        public final String name() { return "scala"; }

    @Override
        public HashMap<String, String[]> extractLibraryBindings(Reader code, String filename) throws IOException {
            HashMap<String, String[]> bindings = new HashMap<String, String[]>();
            return bindings;
        }

}


