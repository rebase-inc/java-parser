package scan;

import java.util.HashMap;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;


public final class TechProfile implements ParseTreeListener {

    public HashMap<String, Integer> data = new HashMap<String, Integer>();

    private Parser _parser;

    public TechProfile(Parser parser) {
        _parser = parser;
    }

	@Override public void enterEveryRule(ParserRuleContext ctx) {
        String rule = _parser.getRuleNames()[ctx.getRuleIndex()];
        data.merge(rule, 1, (old, new_) -> old++ );
    }

	@Override public void exitEveryRule(ParserRuleContext ctx)  { }
	@Override public void visitTerminal(TerminalNode node)      { }
	@Override public void visitErrorNode(ErrorNode node)        { }

}


