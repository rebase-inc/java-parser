package scan;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;


public final class TechProfile implements ParseTreeListener {

    public int[] data;

    private Parser _parser;

    public int nodes_visited = 0;

    public TechProfile(Parser parser) {
        _parser = parser;
        data = new int[parser.getRuleNames().length];
    }

    public void merge(TechProfile in) {
        int[] in_data = in.data;
        for (int i=0; i < data.length; i++ ) {
            data[i] += in_data[i];
        }
    }

    public HashMap<String, Integer> toMap() {
        String[] rules = _parser.getRuleNames();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i=0; i<data.length; i++) {
            map.put(rules[i], data[i]);
        }
        return map;
    }

	@Override public void enterEveryRule(ParserRuleContext ctx) {
        data[ctx.getRuleIndex()]++;
        nodes_visited++;
    }

	@Override public void exitEveryRule(ParserRuleContext ctx)  { }
	@Override public void visitTerminal(TerminalNode node)      { }
	@Override public void visitErrorNode(ErrorNode node)        { }

}


