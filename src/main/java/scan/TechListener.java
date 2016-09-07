package scan;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import lang.Language;
import scan.TechProfile;


public final class TechListener implements ParseTreeListener {

    public TechProfile profile;

    private Parser _parser;

    public TechListener(Language language, Parser parser) {
        profile = new TechProfile(language);
        _parser = parser;
    }

	@Override public void enterEveryRule(ParserRuleContext ctx) {
        profile.data[ctx.getRuleIndex()]++;
        profile.nodes_visited++;
    }

	@Override public void exitEveryRule(ParserRuleContext ctx)  { }
	@Override public void visitTerminal(TerminalNode node)      { }
	@Override public void visitErrorNode(ErrorNode node)        { }

}


