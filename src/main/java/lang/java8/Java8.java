package lang.java8;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.java8.Java8Lexer;
import lang.java8.Java8Parser;
import lang.Language;
import scan.TechProfile;


public class Java8 implements Language {

    @Override
        public TechProfile grammar_use(Reader code) throws IOException {
            ANTLRInputStream input = new ANTLRInputStream(code);
            Java8Lexer lexer = new Java8Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Java8Parser parser = new Java8Parser(tokens);
            Java8Parser.CompilationUnitContext tree = parser.compilationUnit(); // parse a compilationUnit
            TechProfile profile = new TechProfile(parser);
            ParseTreeWalker.DEFAULT.walk(profile, tree);
            System.out.printf("Nodes visited: %d", profile.nodes_visited);
            return profile;
        }

    @Override
        public final String[] grammarRules() { return Java8Parser.ruleNames; }

    @Override
        public final String name() { return "java8"; }

    @Override
        public HashMap<String, String[]> extract_library_bindings(Reader code, String filename) throws IOException {
            HashMap<String, String[]> bindings = new HashMap<String, String[]>();
            return bindings;
        }

}
