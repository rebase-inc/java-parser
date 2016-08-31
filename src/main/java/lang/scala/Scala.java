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


public class Scala implements Language {

    @Override
        public TechProfile grammar_use(Reader code) throws IOException {
            ANTLRInputStream input = new ANTLRInputStream(code);
            ScalaLexer lexer = new ScalaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ScalaParser parser = new ScalaParser(tokens);
            ParserRuleContext tree = parser.compilationUnit();
            TechProfile profile = new TechProfile(parser);
            ParseTreeWalker.DEFAULT.walk(profile, tree);
            return profile;
        }

    @Override
        public final String[] grammarRules() {
            return ScalaParser.ruleNames;
        }

    @Override
        public final String name() { return "scala"; }

    @Override
        public HashMap<String, String[]> extract_library_bindings(Reader code, String filename) throws IOException {
            HashMap<String, String[]> bindings = new HashMap<String, String[]>();
            return bindings;
        }


}


