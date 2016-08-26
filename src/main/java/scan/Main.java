package scan;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.java8.Java8Lexer;
import lang.java8.Java8Parser;
import scan.TechProfile;



public final class Main {

    private static TechProfile getJava8Profile(Reader r) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(r);
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);
        Java8Parser.CompilationUnitContext tree = parser.compilationUnit(); // parse a compilationUnit
        TechProfile profile = new TechProfile(parser);
        ParseTreeWalker.DEFAULT.walk(profile, tree);
        return profile;
    }

    public static void main(String[] args) throws Exception {
        TechProfile profile = getJava8Profile(new StringReader(args[0]));
        for (Map.Entry<String, Integer> entry : profile.data.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}
