package lang.golang;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.golang.GolangLexer;
import lang.golang.GolangParser;
import lang.Language;
import scan.TechProfile;


public class Golang implements Language {

    @Override
        public TechProfile grammar_use(Reader code) throws IOException {
            ANTLRInputStream input = new ANTLRInputStream(code);
            GolangLexer lexer = new GolangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GolangParser parser = new GolangParser(tokens);
            GolangParser.SourceFileContext tree = parser.sourceFile();
            TechProfile profile = new TechProfile(parser);
            ParseTreeWalker.DEFAULT.walk(profile, tree);
            return profile;
        }

    @Override
        public final String[] grammarRules() {
            return GolangParser.ruleNames;
        }

    @Override
        public final String name() { return "golang"; }

    @Override
        public HashMap<String, String[]> extract_library_bindings(Reader code, String filename) throws IOException {
            HashMap<String, String[]> bindings = new HashMap<String, String[]>();
            return bindings;
        }
}


