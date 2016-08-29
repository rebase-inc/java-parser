package lang.lua;

import java.io.IOException;
import java.io.Reader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import lang.lua.LuaLexer;
import lang.lua.LuaParser;
import lang.Language;
import scan.TechProfile;


public class Lua implements Language {

    @Override
    public TechProfile parse(Reader code) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(code);
        LuaLexer lexer = new LuaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LuaParser parser = new LuaParser(tokens);
        ParserRuleContext tree = parser.chunk();
        TechProfile profile = new TechProfile(parser);
        ParseTreeWalker.DEFAULT.walk(profile, tree);
        return profile;
    }

    @Override
	public final String[] grammarRules() {
        return LuaParser.ruleNames;
    }

    @Override
    public final String name() { return "lua"; }

}

