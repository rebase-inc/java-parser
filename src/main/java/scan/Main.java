package scan;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import lang.java8.Java8BaseListener;
import lang.java8.Java8Lexer;
import lang.java8.Java8Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

final class TechProfile extends Java8BaseListener {

    public HashMap<String, Integer> data = new HashMap<String, Integer>();

    private Java8Parser parser;

    public TechProfile(Java8Parser parser_) {
        parser = parser_;
    }

	@Override public void enterEveryRule(ParserRuleContext ctx) {
        String rule = parser.getRuleNames()[ctx.getRuleIndex()];
        data.merge(rule, 1, (old, new_) -> old++ );
    }
}

public final class Main {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new StringReader(args[0]));
        Java8Lexer lexer = new Java8Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);
        Java8Parser.CompilationUnitContext tree = parser.compilationUnit(); // parse a compilationUnit

        TechProfile profile = new TechProfile(parser);
        ParseTreeWalker.DEFAULT.walk(profile, tree);
        for (Map.Entry<String, Integer> entry : profile.data.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
