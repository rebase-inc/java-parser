// Generated from scala/Scala.g4 by ANTLR 4.5
package lang.scala;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScalaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, BooleanLiteral=62, CharacterLiteral=63, StringLiteral=64, 
		SymbolLiteral=65, IntegerLiteral=66, FloatingPointLiteral=67, Id=68, Varid=69, 
		WS=70, Semi=71, Paren=72, Delim=73, Comment=74;
	public static final int
		RULE_literal = 0, RULE_qualId = 1, RULE_ids = 2, RULE_stableId = 3, RULE_classQualifier = 4, 
		RULE_type = 5, RULE_functionArgTypes = 6, RULE_existentialClause = 7, 
		RULE_existentialDcl = 8, RULE_infixType = 9, RULE_compoundType = 10, RULE_annotType = 11, 
		RULE_simpleType = 12, RULE_typeArgs = 13, RULE_types = 14, RULE_refinement = 15, 
		RULE_refineStat = 16, RULE_typePat = 17, RULE_ascription = 18, RULE_expr = 19, 
		RULE_expr1 = 20, RULE_postfixExpr = 21, RULE_infixExpr = 22, RULE_prefixExpr = 23, 
		RULE_simpleExpr1 = 24, RULE_exprs = 25, RULE_argumentExprs = 26, RULE_blockExpr = 27, 
		RULE_block = 28, RULE_blockStat = 29, RULE_resultExpr = 30, RULE_enumerators = 31, 
		RULE_generator = 32, RULE_caseClauses = 33, RULE_caseClause = 34, RULE_guard = 35, 
		RULE_pattern = 36, RULE_pattern1 = 37, RULE_pattern2 = 38, RULE_pattern3 = 39, 
		RULE_simplePattern = 40, RULE_patterns = 41, RULE_typeParamClause = 42, 
		RULE_funTypeParamClause = 43, RULE_variantTypeParam = 44, RULE_typeParam = 45, 
		RULE_paramClauses = 46, RULE_paramClause = 47, RULE_params = 48, RULE_param = 49, 
		RULE_paramType = 50, RULE_classParamClauses = 51, RULE_classParamClause = 52, 
		RULE_classParams = 53, RULE_classParam = 54, RULE_bindings = 55, RULE_binding = 56, 
		RULE_modifier = 57, RULE_localModifier = 58, RULE_accessModifier = 59, 
		RULE_accessQualifier = 60, RULE_annotation = 61, RULE_constrAnnotation = 62, 
		RULE_templateBody = 63, RULE_templateStat = 64, RULE_selfType = 65, RULE_import_ = 66, 
		RULE_importExpr = 67, RULE_importSelectors = 68, RULE_importSelector = 69, 
		RULE_dcl = 70, RULE_valDcl = 71, RULE_varDcl = 72, RULE_funDcl = 73, RULE_funSig = 74, 
		RULE_typeDcl = 75, RULE_patVarDef = 76, RULE_def = 77, RULE_patDef = 78, 
		RULE_varDef = 79, RULE_funDef = 80, RULE_typeDef = 81, RULE_tmplDef = 82, 
		RULE_classDef = 83, RULE_traitDef = 84, RULE_objectDef = 85, RULE_classTemplateOpt = 86, 
		RULE_traitTemplateOpt = 87, RULE_classTemplate = 88, RULE_traitTemplate = 89, 
		RULE_classParents = 90, RULE_traitParents = 91, RULE_constr = 92, RULE_earlyDefs = 93, 
		RULE_earlyDef = 94, RULE_constrExpr = 95, RULE_constrBlock = 96, RULE_selfInvocation = 97, 
		RULE_topStatSeq = 98, RULE_topStat = 99, RULE_packaging = 100, RULE_packageObject = 101, 
		RULE_compilationUnit = 102;
	public static final String[] ruleNames = {
		"literal", "qualId", "ids", "stableId", "classQualifier", "type", "functionArgTypes", 
		"existentialClause", "existentialDcl", "infixType", "compoundType", "annotType", 
		"simpleType", "typeArgs", "types", "refinement", "refineStat", "typePat", 
		"ascription", "expr", "expr1", "postfixExpr", "infixExpr", "prefixExpr", 
		"simpleExpr1", "exprs", "argumentExprs", "blockExpr", "block", "blockStat", 
		"resultExpr", "enumerators", "generator", "caseClauses", "caseClause", 
		"guard", "pattern", "pattern1", "pattern2", "pattern3", "simplePattern", 
		"patterns", "typeParamClause", "funTypeParamClause", "variantTypeParam", 
		"typeParam", "paramClauses", "paramClause", "params", "param", "paramType", 
		"classParamClauses", "classParamClause", "classParams", "classParam", 
		"bindings", "binding", "modifier", "localModifier", "accessModifier", 
		"accessQualifier", "annotation", "constrAnnotation", "templateBody", "templateStat", 
		"selfType", "import_", "importExpr", "importSelectors", "importSelector", 
		"dcl", "valDcl", "varDcl", "funDcl", "funSig", "typeDcl", "patVarDef", 
		"def", "patDef", "varDef", "funDef", "typeDef", "tmplDef", "classDef", 
		"traitDef", "objectDef", "classTemplateOpt", "traitTemplateOpt", "classTemplate", 
		"traitTemplate", "classParents", "traitParents", "constr", "earlyDefs", 
		"earlyDef", "constrExpr", "constrBlock", "selfInvocation", "topStatSeq", 
		"topStat", "packaging", "packageObject", "compilationUnit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'null'", "'.'", "','", "'this'", "'super'", "'['", "']'", 
		"'=>'", "'('", "')'", "'forSome'", "'{'", "'}'", "'type'", "'val'", "'with'", 
		"'#'", "':'", "'_'", "'*'", "'implicit'", "'if'", "'else'", "'while'", 
		"'try'", "'catch'", "'finally'", "'do'", "'for'", "'yield'", "'throw'", 
		"'return'", "'new'", "'='", "'match'", "'+'", "'~'", "'!'", "'lazy'", 
		"'<-'", "'case'", "'|'", "'@'", "'>:'", "'<:'", "'<%'", "'var'", "'override'", 
		"'abstract'", "'final'", "'sealed'", "'private'", "'protected'", "'import'", 
		"'def'", "'class'", "'object'", "'trait'", "'extends'", "'package'", null, 
		null, null, null, null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "BooleanLiteral", "CharacterLiteral", "StringLiteral", "SymbolLiteral", 
		"IntegerLiteral", "FloatingPointLiteral", "Id", "Varid", "WS", "Semi", 
		"Paren", "Delim", "Comment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Scala.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScalaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ScalaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ScalaParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ScalaParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ScalaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ScalaParser.StringLiteral, 0); }
		public TerminalNode SymbolLiteral() { return getToken(ScalaParser.SymbolLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(206);
					match(T__0);
					}
				}

				setState(209);
				match(IntegerLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(210);
					match(T__0);
					}
				}

				setState(213);
				match(FloatingPointLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(CharacterLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(StringLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(SymbolLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualIdContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public QualIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualId; }
	}

	public final QualIdContext qualId() throws RecognitionException {
		QualIdContext _localctx = new QualIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(Id);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(222);
				match(T__2);
				setState(223);
				match(Id);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdsContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(Id);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(230);
				match(T__3);
				setState(231);
				match(Id);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StableIdContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public ClassQualifierContext classQualifier() {
			return getRuleContext(ClassQualifierContext.class,0);
		}
		public StableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stableId; }
	}

	public final StableIdContext stableId() throws RecognitionException {
		StableIdContext _localctx = new StableIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stableId);
		int _la;
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(237);
					match(Id);
					}
					break;
				case 2:
					{
					setState(240);
					_la = _input.LA(1);
					if (_la==Id) {
						{
						setState(238);
						match(Id);
						setState(239);
						match(T__2);
						}
					}

					setState(242);
					match(T__4);
					}
					break;
				}
				setState(245);
				match(T__2);
				setState(246);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(247);
					match(Id);
					setState(248);
					match(T__2);
					}
				}

				setState(251);
				match(T__5);
				setState(253);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(252);
					classQualifier();
					}
				}

				setState(255);
				match(T__2);
				setState(256);
				match(Id);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassQualifierContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ClassQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classQualifier; }
	}

	public final ClassQualifierContext classQualifier() throws RecognitionException {
		ClassQualifierContext _localctx = new ClassQualifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__6);
			setState(260);
			match(Id);
			setState(261);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public FunctionArgTypesContext functionArgTypes() {
			return getRuleContext(FunctionArgTypesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public ExistentialClauseContext existentialClause() {
			return getRuleContext(ExistentialClauseContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				functionArgTypes();
				setState(264);
				match(T__8);
				setState(265);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				infixType();
				setState(269);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(268);
					existentialClause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgTypesContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public List<ParamTypeContext> paramType() {
			return getRuleContexts(ParamTypeContext.class);
		}
		public ParamTypeContext paramType(int i) {
			return getRuleContext(ParamTypeContext.class,i);
		}
		public FunctionArgTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgTypes; }
	}

	public final FunctionArgTypesContext functionArgTypes() throws RecognitionException {
		FunctionArgTypesContext _localctx = new FunctionArgTypesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionArgTypes);
		int _la;
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				infixType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__9);
				setState(283);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__5 - 5)) | (1L << (T__8 - 5)) | (1L << (T__9 - 5)) | (1L << (T__12 - 5)) | (1L << (Id - 5)))) != 0)) {
					{
					setState(275);
					paramType();
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(276);
						match(T__3);
						setState(277);
						paramType();
						}
						}
						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(285);
				match(T__10);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistentialClauseContext extends ParserRuleContext {
		public List<ExistentialDclContext> existentialDcl() {
			return getRuleContexts(ExistentialDclContext.class);
		}
		public ExistentialDclContext existentialDcl(int i) {
			return getRuleContext(ExistentialDclContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public ExistentialClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existentialClause; }
	}

	public final ExistentialClauseContext existentialClause() throws RecognitionException {
		ExistentialClauseContext _localctx = new ExistentialClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_existentialClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__11);
			setState(289);
			match(T__12);
			setState(290);
			existentialDcl();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(291);
				match(Semi);
				setState(292);
				existentialDcl();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistentialDclContext extends ParserRuleContext {
		public TypeDclContext typeDcl() {
			return getRuleContext(TypeDclContext.class,0);
		}
		public ValDclContext valDcl() {
			return getRuleContext(ValDclContext.class,0);
		}
		public ExistentialDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existentialDcl; }
	}

	public final ExistentialDclContext existentialDcl() throws RecognitionException {
		ExistentialDclContext _localctx = new ExistentialDclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_existentialDcl);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__14);
				setState(301);
				typeDcl();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(T__15);
				setState(303);
				valDcl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixTypeContext extends ParserRuleContext {
		public List<CompoundTypeContext> compoundType() {
			return getRuleContexts(CompoundTypeContext.class);
		}
		public CompoundTypeContext compoundType(int i) {
			return getRuleContext(CompoundTypeContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public InfixTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixType; }
	}

	public final InfixTypeContext infixType() throws RecognitionException {
		InfixTypeContext _localctx = new InfixTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_infixType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			compoundType();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(Id);
					setState(308);
					compoundType();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundTypeContext extends ParserRuleContext {
		public List<AnnotTypeContext> annotType() {
			return getRuleContexts(AnnotTypeContext.class);
		}
		public AnnotTypeContext annotType(int i) {
			return getRuleContext(AnnotTypeContext.class,i);
		}
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public CompoundTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundType; }
	}

	public final CompoundTypeContext compoundType() throws RecognitionException {
		CompoundTypeContext _localctx = new CompoundTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compoundType);
		int _la;
		try {
			setState(326);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__9:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				annotType();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(315);
					match(T__16);
					setState(316);
					annotType();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(322);
					refinement();
					}
					break;
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				refinement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotType; }
	}

	public final AnnotTypeContext annotType() throws RecognitionException {
		AnnotTypeContext _localctx = new AnnotTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			simpleType(0);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					annotation();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypeArgsContext typeArgs() {
			return getRuleContext(TypeArgsContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		return simpleType(0);
	}

	private SimpleTypeContext simpleType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, _parentState);
		SimpleTypeContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_simpleType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(336);
				stableId();
				}
				break;
			case 2:
				{
				setState(343);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(337);
					stableId();
					}
					break;
				case 2:
					{
					setState(340);
					_la = _input.LA(1);
					if (_la==Id) {
						{
						setState(338);
						match(Id);
						setState(339);
						match(T__2);
						}
					}

					setState(342);
					match(T__4);
					}
					break;
				}
				setState(345);
				match(T__2);
				setState(346);
				match(T__14);
				}
				break;
			case 3:
				{
				setState(347);
				match(T__9);
				setState(348);
				types();
				setState(349);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(358);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleType);
						setState(353);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(354);
						typeArgs();
						}
						break;
					case 2:
						{
						_localctx = new SimpleTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleType);
						setState(355);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(356);
						match(T__17);
						setState(357);
						match(Id);
						}
						break;
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeArgsContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TypeArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgs; }
	}

	public final TypeArgsContext typeArgs() throws RecognitionException {
		TypeArgsContext _localctx = new TypeArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__6);
			setState(364);
			types();
			setState(365);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			type();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(368);
				match(T__3);
				setState(369);
				type();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefinementContext extends ParserRuleContext {
		public List<RefineStatContext> refineStat() {
			return getRuleContexts(RefineStatContext.class);
		}
		public RefineStatContext refineStat(int i) {
			return getRuleContext(RefineStatContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public RefinementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinement; }
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_refinement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__12);
			setState(376);
			refineStat();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(377);
				match(Semi);
				setState(378);
				refineStat();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefineStatContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public RefineStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refineStat; }
	}

	public final RefineStatContext refineStat() throws RecognitionException {
		RefineStatContext _localctx = new RefineStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_refineStat);
		try {
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				dcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(T__14);
				setState(388);
				typeDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypePatContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypePatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePat; }
	}

	public final TypePatContext typePat() throws RecognitionException {
		TypePatContext _localctx = new TypePatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typePat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AscriptionContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AscriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascription; }
	}

	public final AscriptionContext ascription() throws RecognitionException {
		AscriptionContext _localctx = new AscriptionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ascription);
		int _la;
		try {
			setState(405);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T__18);
				setState(395);
				infixType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(T__18);
				setState(398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(397);
					annotation();
					}
					}
					setState(400); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__43 );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(T__18);
				setState(403);
				match(T__19);
				setState(404);
				match(T__20);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BindingsContext bindings() {
			return getRuleContext(BindingsContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		int _la;
		try {
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(407);
					bindings();
					}
					break;
				case T__21:
				case Id:
					{
					setState(409);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(408);
						match(T__21);
						}
					}

					setState(411);
					match(Id);
					}
					break;
				case T__19:
					{
					setState(412);
					match(T__19);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(415);
				match(T__8);
				setState(416);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				expr1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Semi() { return getToken(ScalaParser.Semi, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseClausesContext caseClauses() {
			return getRuleContext(CaseClausesContext.class,0);
		}
		public EnumeratorsContext enumerators() {
			return getRuleContext(EnumeratorsContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public SimpleExpr1Context simpleExpr1() {
			return getRuleContext(SimpleExpr1Context.class,0);
		}
		public ClassTemplateContext classTemplate() {
			return getRuleContext(ClassTemplateContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public AscriptionContext ascription() {
			return getRuleContext(AscriptionContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr1);
		int _la;
		try {
			setState(522);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(T__22);
				setState(421);
				match(T__9);
				setState(422);
				expr();
				setState(423);
				match(T__10);
				setState(424);
				expr();
				setState(430);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(426);
					_la = _input.LA(1);
					if (_la==Semi) {
						{
						setState(425);
						match(Semi);
						}
					}

					setState(428);
					match(T__23);
					setState(429);
					expr();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(T__24);
				setState(433);
				match(T__9);
				setState(434);
				expr();
				setState(435);
				match(T__10);
				setState(436);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(T__25);
				setState(444);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(439);
					match(T__12);
					setState(440);
					block();
					setState(441);
					match(T__13);
					}
					break;
				case 2:
					{
					setState(443);
					expr();
					}
					break;
				}
				setState(451);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(446);
					match(T__26);
					setState(447);
					match(T__12);
					setState(448);
					caseClauses();
					setState(449);
					match(T__13);
					}
					break;
				}
				setState(455);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(453);
					match(T__27);
					setState(454);
					expr();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				match(T__28);
				setState(458);
				expr();
				setState(460);
				_la = _input.LA(1);
				if (_la==Semi) {
					{
					setState(459);
					match(Semi);
					}
				}

				setState(462);
				match(T__24);
				setState(463);
				match(T__9);
				setState(464);
				expr();
				setState(465);
				match(T__10);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				match(T__29);
				setState(476);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(468);
					match(T__9);
					setState(469);
					enumerators();
					setState(470);
					match(T__10);
					}
					break;
				case T__12:
					{
					setState(472);
					match(T__12);
					setState(473);
					enumerators();
					setState(474);
					match(T__13);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(479);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(478);
					match(T__30);
					}
				}

				setState(481);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(483);
				match(T__31);
				setState(484);
				expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(485);
				match(T__32);
				setState(487);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(486);
					expr();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(499);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(489);
					match(T__33);
					setState(492);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(490);
						classTemplate();
						}
						break;
					case 2:
						{
						setState(491);
						templateBody();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(494);
					blockExpr();
					}
					break;
				case 3:
					{
					setState(495);
					simpleExpr1(0);
					setState(497);
					_la = _input.LA(1);
					if (_la==T__19) {
						{
						setState(496);
						match(T__19);
						}
					}

					}
					break;
				}
				setState(501);
				match(T__2);
				}
				setState(503);
				match(Id);
				setState(504);
				match(T__34);
				setState(505);
				expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(507);
				simpleExpr1(0);
				setState(508);
				argumentExprs();
				setState(509);
				match(T__34);
				setState(510);
				expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(512);
				postfixExpr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(513);
				postfixExpr();
				setState(514);
				ascription();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(516);
				postfixExpr();
				setState(517);
				match(T__35);
				setState(518);
				match(T__12);
				setState(519);
				caseClauses();
				setState(520);
				match(T__13);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExprContext extends ParserRuleContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_postfixExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			infixExpr(0);
			setState(526);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(525);
				match(Id);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixExprContext extends ParserRuleContext {
		public PrefixExprContext prefixExpr() {
			return getRuleContext(PrefixExprContext.class,0);
		}
		public List<InfixExprContext> infixExpr() {
			return getRuleContexts(InfixExprContext.class);
		}
		public InfixExprContext infixExpr(int i) {
			return getRuleContext(InfixExprContext.class,i);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public InfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExpr; }
	}

	public final InfixExprContext infixExpr() throws RecognitionException {
		return infixExpr(0);
	}

	private InfixExprContext infixExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprContext _localctx = new InfixExprContext(_ctx, _parentState);
		InfixExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_infixExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(529);
			prefixExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
					setState(531);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(532);
					match(Id);
					setState(533);
					infixExpr(2);
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrefixExprContext extends ParserRuleContext {
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public SimpleExpr1Context simpleExpr1() {
			return getRuleContext(SimpleExpr1Context.class,0);
		}
		public ClassTemplateContext classTemplate() {
			return getRuleContext(ClassTemplateContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public PrefixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpr; }
	}

	public final PrefixExprContext prefixExpr() throws RecognitionException {
		PrefixExprContext _localctx = new PrefixExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_prefixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(539);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(542);
				match(T__33);
				setState(545);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(543);
					classTemplate();
					}
					break;
				case 2:
					{
					setState(544);
					templateBody();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(547);
				blockExpr();
				}
				break;
			case 3:
				{
				setState(548);
				simpleExpr1(0);
				setState(550);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(549);
					match(T__19);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpr1Context extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public ClassTemplateContext classTemplate() {
			return getRuleContext(ClassTemplateContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TypeArgsContext typeArgs() {
			return getRuleContext(TypeArgsContext.class,0);
		}
		public SimpleExpr1Context simpleExpr1() {
			return getRuleContext(SimpleExpr1Context.class,0);
		}
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public SimpleExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr1; }
	}

	public final SimpleExpr1Context simpleExpr1() throws RecognitionException {
		return simpleExpr1(0);
	}

	private SimpleExpr1Context simpleExpr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpr1Context _localctx = new SimpleExpr1Context(_ctx, _parentState);
		SimpleExpr1Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_simpleExpr1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(555);
				literal();
				}
				break;
			case 2:
				{
				setState(556);
				stableId();
				}
				break;
			case 3:
				{
				setState(559);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(557);
					match(Id);
					setState(558);
					match(T__2);
					}
				}

				setState(561);
				match(T__4);
				}
				break;
			case 4:
				{
				setState(562);
				match(T__19);
				}
				break;
			case 5:
				{
				setState(563);
				match(T__9);
				setState(565);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__12) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Id - 64)))) != 0)) {
					{
					setState(564);
					exprs();
					}
				}

				setState(567);
				match(T__10);
				}
				break;
			case 6:
				{
				setState(574);
				switch (_input.LA(1)) {
				case T__33:
					{
					setState(568);
					match(T__33);
					setState(571);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(569);
						classTemplate();
						}
						break;
					case 2:
						{
						setState(570);
						templateBody();
						}
						break;
					}
					}
					break;
				case T__12:
					{
					setState(573);
					blockExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(576);
				match(T__2);
				setState(577);
				match(Id);
				}
				break;
			case 7:
				{
				setState(585);
				switch (_input.LA(1)) {
				case T__33:
					{
					setState(579);
					match(T__33);
					setState(582);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(580);
						classTemplate();
						}
						break;
					case 2:
						{
						setState(581);
						templateBody();
						}
						break;
					}
					}
					break;
				case T__12:
					{
					setState(584);
					blockExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(587);
				typeArgs();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpr1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr1);
					setState(591);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(592);
					argumentExprs();
					}
					} 
				}
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			expr();
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					match(T__3);
					setState(600);
					expr();
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExprsContext extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public ArgumentExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExprs; }
	}

	public final ArgumentExprsContext argumentExprs() throws RecognitionException {
		ArgumentExprsContext _localctx = new ArgumentExprsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argumentExprs);
		int _la;
		try {
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(T__9);
				setState(608);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__12) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Id - 64)))) != 0)) {
					{
					setState(607);
					exprs();
					}
				}

				setState(610);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(T__9);
				setState(615);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(612);
					exprs();
					setState(613);
					match(T__3);
					}
					break;
				}
				setState(617);
				postfixExpr();
				setState(618);
				match(T__18);
				setState(619);
				match(T__19);
				setState(620);
				match(T__20);
				setState(621);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				blockExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockExprContext extends ParserRuleContext {
		public CaseClausesContext caseClauses() {
			return getRuleContext(CaseClausesContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpr; }
	}

	public final BlockExprContext blockExpr() throws RecognitionException {
		BlockExprContext _localctx = new BlockExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_blockExpr);
		try {
			setState(634);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(T__12);
				setState(627);
				caseClauses();
				setState(628);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(T__12);
				setState(631);
				block();
				setState(632);
				match(T__13);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatContext> blockStat() {
			return getRuleContexts(BlockStatContext.class);
		}
		public BlockStatContext blockStat(int i) {
			return getRuleContext(BlockStatContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public ResultExprContext resultExpr() {
			return getRuleContext(ResultExprContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			blockStat();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(637);
				match(Semi);
				setState(638);
				blockStat();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__12) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Id - 64)))) != 0)) {
				{
				setState(644);
				resultExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatContext extends ParserRuleContext {
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TmplDefContext tmplDef() {
			return getRuleContext(TmplDefContext.class,0);
		}
		public List<LocalModifierContext> localModifier() {
			return getRuleContexts(LocalModifierContext.class);
		}
		public LocalModifierContext localModifier(int i) {
			return getRuleContext(LocalModifierContext.class,i);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public BlockStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStat; }
	}

	public final BlockStatContext blockStat() throws RecognitionException {
		BlockStatContext _localctx = new BlockStatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_blockStat);
		int _la;
		try {
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				import_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(648);
					annotation();
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(655);
				_la = _input.LA(1);
				if (_la==T__21 || _la==T__39) {
					{
					setState(654);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__39) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(657);
				def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(658);
					annotation();
					}
					}
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) {
					{
					{
					setState(664);
					localModifier();
					}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(670);
				tmplDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(671);
				expr1();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultExprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BindingsContext bindings() {
			return getRuleContext(BindingsContext.class,0);
		}
		public CompoundTypeContext compoundType() {
			return getRuleContext(CompoundTypeContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ResultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultExpr; }
	}

	public final ResultExprContext resultExpr() throws RecognitionException {
		ResultExprContext _localctx = new ResultExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_resultExpr);
		int _la;
		try {
			setState(691);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(676);
					bindings();
					}
					break;
				case T__19:
				case T__21:
				case Id:
					{
					setState(682);
					switch (_input.LA(1)) {
					case T__21:
					case Id:
						{
						setState(678);
						_la = _input.LA(1);
						if (_la==T__21) {
							{
							setState(677);
							match(T__21);
							}
						}

						setState(680);
						match(Id);
						}
						break;
					case T__19:
						{
						setState(681);
						match(T__19);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(684);
					match(T__18);
					setState(685);
					compoundType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(688);
				match(T__8);
				setState(689);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorsContext extends ParserRuleContext {
		public List<GeneratorContext> generator() {
			return getRuleContexts(GeneratorContext.class);
		}
		public GeneratorContext generator(int i) {
			return getRuleContext(GeneratorContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public EnumeratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerators; }
	}

	public final EnumeratorsContext enumerators() throws RecognitionException {
		EnumeratorsContext _localctx = new EnumeratorsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumerators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			generator();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(694);
				match(Semi);
				setState(695);
				generator();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorContext extends ParserRuleContext {
		public List<Pattern1Context> pattern1() {
			return getRuleContexts(Pattern1Context.class);
		}
		public Pattern1Context pattern1(int i) {
			return getRuleContext(Pattern1Context.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<GuardContext> guard() {
			return getRuleContexts(GuardContext.class);
		}
		public GuardContext guard(int i) {
			return getRuleContext(GuardContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public GeneratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generator; }
	}

	public final GeneratorContext generator() throws RecognitionException {
		GeneratorContext _localctx = new GeneratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_generator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			pattern1();
			setState(702);
			match(T__40);
			setState(703);
			expr();
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(713);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(705);
						_la = _input.LA(1);
						if (_la==Semi) {
							{
							setState(704);
							match(Semi);
							}
						}

						setState(707);
						guard();
						}
						break;
					case 2:
						{
						setState(708);
						match(Semi);
						setState(709);
						pattern1();
						setState(710);
						match(T__34);
						setState(711);
						expr();
						}
						break;
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(718);
				caseClause();
				}
				}
				setState(721); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__41 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(T__41);
			setState(724);
			pattern();
			setState(726);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(725);
				guard();
				}
			}

			setState(728);
			match(T__8);
			setState(729);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardContext extends ParserRuleContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(T__22);
			setState(732);
			postfixExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public List<Pattern1Context> pattern1() {
			return getRuleContexts(Pattern1Context.class);
		}
		public Pattern1Context pattern1(int i) {
			return getRuleContext(Pattern1Context.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			pattern1();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(735);
				match(T__42);
				setState(736);
				pattern1();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern1Context extends ParserRuleContext {
		public TerminalNode Varid() { return getToken(ScalaParser.Varid, 0); }
		public TypePatContext typePat() {
			return getRuleContext(TypePatContext.class,0);
		}
		public Pattern2Context pattern2() {
			return getRuleContext(Pattern2Context.class,0);
		}
		public Pattern1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern1; }
	}

	public final Pattern1Context pattern1() throws RecognitionException {
		Pattern1Context _localctx = new Pattern1Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_pattern1);
		try {
			setState(749);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				match(Varid);
				setState(743);
				match(T__18);
				setState(744);
				typePat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				match(T__19);
				setState(746);
				match(T__18);
				setState(747);
				typePat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				pattern2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern2Context extends ParserRuleContext {
		public TerminalNode Varid() { return getToken(ScalaParser.Varid, 0); }
		public Pattern3Context pattern3() {
			return getRuleContext(Pattern3Context.class,0);
		}
		public Pattern2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern2; }
	}

	public final Pattern2Context pattern2() throws RecognitionException {
		Pattern2Context _localctx = new Pattern2Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_pattern2);
		int _la;
		try {
			setState(757);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				match(Varid);
				setState(754);
				_la = _input.LA(1);
				if (_la==T__43) {
					{
					setState(752);
					match(T__43);
					setState(753);
					pattern3();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				pattern3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern3Context extends ParserRuleContext {
		public List<SimplePatternContext> simplePattern() {
			return getRuleContexts(SimplePatternContext.class);
		}
		public SimplePatternContext simplePattern(int i) {
			return getRuleContext(SimplePatternContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public Pattern3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern3; }
	}

	public final Pattern3Context pattern3() throws RecognitionException {
		Pattern3Context _localctx = new Pattern3Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_pattern3);
		int _la;
		try {
			setState(768);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				simplePattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				simplePattern();
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Id) {
					{
					{
					setState(761);
					match(Id);
					setState(762);
					simplePattern();
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplePatternContext extends ParserRuleContext {
		public TerminalNode Varid() { return getToken(ScalaParser.Varid, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public SimplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePattern; }
	}

	public final SimplePatternContext simplePattern() throws RecognitionException {
		SimplePatternContext _localctx = new SimplePatternContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_simplePattern);
		int _la;
		try {
			setState(800);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(T__19);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(Varid);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(773);
				stableId();
				setState(778);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(774);
					match(T__9);
					setState(775);
					patterns();
					setState(776);
					match(T__10);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(780);
				stableId();
				setState(781);
				match(T__9);
				setState(785);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(782);
					patterns();
					setState(783);
					match(T__3);
					}
					break;
				}
				setState(789);
				_la = _input.LA(1);
				if (_la==Varid) {
					{
					setState(787);
					match(Varid);
					setState(788);
					match(T__43);
					}
				}

				setState(791);
				match(T__19);
				setState(792);
				match(T__20);
				setState(793);
				match(T__10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(795);
				match(T__9);
				setState(797);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(796);
					patterns();
					}
					break;
				}
				setState(799);
				match(T__10);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternsContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<PatternsContext> patterns() {
			return getRuleContexts(PatternsContext.class);
		}
		public PatternsContext patterns(int i) {
			return getRuleContext(PatternsContext.class,i);
		}
		public PatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patterns; }
	}

	public final PatternsContext patterns() throws RecognitionException {
		PatternsContext _localctx = new PatternsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_patterns);
		int _la;
		try {
			int _alt;
			setState(816);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				pattern();
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(803);
						match(T__3);
						setState(804);
						patterns();
						}
						} 
					}
					setState(809);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19) {
					{
					{
					setState(810);
					match(T__19);
					}
					}
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParamClauseContext extends ParserRuleContext {
		public List<VariantTypeParamContext> variantTypeParam() {
			return getRuleContexts(VariantTypeParamContext.class);
		}
		public VariantTypeParamContext variantTypeParam(int i) {
			return getRuleContext(VariantTypeParamContext.class,i);
		}
		public TypeParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamClause; }
	}

	public final TypeParamClauseContext typeParamClause() throws RecognitionException {
		TypeParamClauseContext _localctx = new TypeParamClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(T__6);
			setState(819);
			variantTypeParam();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(820);
				match(T__3);
				setState(821);
				variantTypeParam();
				}
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(827);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunTypeParamClauseContext extends ParserRuleContext {
		public List<TypeParamContext> typeParam() {
			return getRuleContexts(TypeParamContext.class);
		}
		public TypeParamContext typeParam(int i) {
			return getRuleContext(TypeParamContext.class,i);
		}
		public FunTypeParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funTypeParamClause; }
	}

	public final FunTypeParamClauseContext funTypeParamClause() throws RecognitionException {
		FunTypeParamClauseContext _localctx = new FunTypeParamClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_funTypeParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(T__6);
			setState(830);
			typeParam();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(831);
				match(T__3);
				setState(832);
				typeParam();
				}
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(838);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantTypeParamContext extends ParserRuleContext {
		public TypeParamContext typeParam() {
			return getRuleContext(TypeParamContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariantTypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantTypeParam; }
	}

	public final VariantTypeParamContext variantTypeParam() throws RecognitionException {
		VariantTypeParamContext _localctx = new VariantTypeParamContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variantTypeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(840);
				annotation();
				}
			}

			setState(844);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__36) {
				{
				setState(843);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(846);
			typeParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParamContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParam; }
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==Id) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(850);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(849);
				typeParamClause();
				}
			}

			setState(854);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(852);
				match(T__44);
				setState(853);
				type();
				}
			}

			setState(858);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(856);
				match(T__45);
				setState(857);
				type();
				}
			}

			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(860);
				match(T__46);
				setState(861);
				type();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(867);
				match(T__18);
				setState(868);
				type();
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamClausesContext extends ParserRuleContext {
		public List<ParamClauseContext> paramClause() {
			return getRuleContexts(ParamClauseContext.class);
		}
		public ParamClauseContext paramClause(int i) {
			return getRuleContext(ParamClauseContext.class,i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramClauses; }
	}

	public final ParamClausesContext paramClauses() throws RecognitionException {
		ParamClausesContext _localctx = new ParamClausesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_paramClauses);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(874);
					paramClause();
					}
					} 
				}
				setState(879);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			setState(885);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(880);
				match(T__9);
				setState(881);
				match(T__21);
				setState(882);
				params();
				setState(883);
				match(T__10);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamClauseContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramClause; }
	}

	public final ParamClauseContext paramClause() throws RecognitionException {
		ParamClauseContext _localctx = new ParamClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_paramClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(T__9);
			setState(889);
			_la = _input.LA(1);
			if (_la==T__43 || _la==Id) {
				{
				setState(888);
				params();
				}
			}

			setState(891);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			param();
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(894);
				match(T__3);
				setState(895);
				param();
				}
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(901);
				annotation();
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(907);
			match(Id);
			setState(910);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(908);
				match(T__18);
				setState(909);
				paramType();
				}
			}

			setState(914);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(912);
				match(T__34);
				setState(913);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_paramType);
		try {
			setState(922);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(T__8);
				setState(918);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
				type();
				setState(920);
				match(T__20);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParamClausesContext extends ParserRuleContext {
		public List<ClassParamClauseContext> classParamClause() {
			return getRuleContexts(ClassParamClauseContext.class);
		}
		public ClassParamClauseContext classParamClause(int i) {
			return getRuleContext(ClassParamClauseContext.class,i);
		}
		public ClassParamsContext classParams() {
			return getRuleContext(ClassParamsContext.class,0);
		}
		public ClassParamClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParamClauses; }
	}

	public final ClassParamClausesContext classParamClauses() throws RecognitionException {
		ClassParamClausesContext _localctx = new ClassParamClausesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classParamClauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(924);
					classParamClause();
					}
					} 
				}
				setState(929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(935);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(930);
				match(T__9);
				setState(931);
				match(T__21);
				setState(932);
				classParams();
				setState(933);
				match(T__10);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParamClauseContext extends ParserRuleContext {
		public ClassParamsContext classParams() {
			return getRuleContext(ClassParamsContext.class,0);
		}
		public ClassParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParamClause; }
	}

	public final ClassParamClauseContext classParamClause() throws RecognitionException {
		ClassParamClauseContext _localctx = new ClassParamClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(T__9);
			setState(939);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (T__15 - 16)) | (1L << (T__21 - 16)) | (1L << (T__39 - 16)) | (1L << (T__43 - 16)) | (1L << (T__47 - 16)) | (1L << (T__48 - 16)) | (1L << (T__49 - 16)) | (1L << (T__50 - 16)) | (1L << (T__51 - 16)) | (1L << (T__52 - 16)) | (1L << (T__53 - 16)) | (1L << (Id - 16)))) != 0)) {
				{
				setState(938);
				classParams();
				}
			}

			setState(941);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParamsContext extends ParserRuleContext {
		public List<ClassParamContext> classParam() {
			return getRuleContexts(ClassParamContext.class);
		}
		public ClassParamContext classParam(int i) {
			return getRuleContext(ClassParamContext.class,i);
		}
		public ClassParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParams; }
	}

	public final ClassParamsContext classParams() throws RecognitionException {
		ClassParamsContext _localctx = new ClassParamsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_classParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			classParam();
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(944);
				match(T__3);
				setState(945);
				classParam();
				}
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParamContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClassParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParam; }
	}

	public final ClassParamContext classParam() throws RecognitionException {
		ClassParamContext _localctx = new ClassParamContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_classParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(951);
				annotation();
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
				{
				{
				setState(957);
				modifier();
				}
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(964);
			_la = _input.LA(1);
			if (_la==T__15 || _la==T__47) {
				{
				setState(963);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__47) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(966);
			match(Id);
			setState(967);
			match(T__18);
			setState(968);
			paramType();
			setState(971);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(969);
				match(T__34);
				setState(970);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingsContext extends ParserRuleContext {
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public BindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindings; }
	}

	public final BindingsContext bindings() throws RecognitionException {
		BindingsContext _localctx = new BindingsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(T__9);
			setState(974);
			binding();
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(975);
				match(T__3);
				setState(976);
				binding();
				}
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(982);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==Id) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(987);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(985);
				match(T__18);
				setState(986);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public LocalModifierContext localModifier() {
			return getRuleContext(LocalModifierContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_modifier);
		try {
			setState(992);
			switch (_input.LA(1)) {
			case T__21:
			case T__39:
			case T__49:
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				localModifier();
				}
				break;
			case T__52:
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				accessModifier();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(991);
				match(T__48);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalModifierContext extends ParserRuleContext {
		public LocalModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localModifier; }
	}

	public final LocalModifierContext localModifier() throws RecognitionException {
		LocalModifierContext _localctx = new LocalModifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_localModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifierContext extends ParserRuleContext {
		public AccessQualifierContext accessQualifier() {
			return getRuleContext(AccessQualifierContext.class,0);
		}
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==T__53) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(998);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(997);
				accessQualifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessQualifierContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public AccessQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessQualifier; }
	}

	public final AccessQualifierContext accessQualifier() throws RecognitionException {
		AccessQualifierContext _localctx = new AccessQualifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_accessQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(T__6);
			setState(1001);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==Id) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1002);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public List<ArgumentExprsContext> argumentExprs() {
			return getRuleContexts(ArgumentExprsContext.class);
		}
		public ArgumentExprsContext argumentExprs(int i) {
			return getRuleContext(ArgumentExprsContext.class,i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(T__43);
			setState(1005);
			simpleType(0);
			setState(1009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1006);
					argumentExprs();
					}
					} 
				}
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrAnnotationContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public ConstrAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrAnnotation; }
	}

	public final ConstrAnnotationContext constrAnnotation() throws RecognitionException {
		ConstrAnnotationContext _localctx = new ConstrAnnotationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constrAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(T__43);
			setState(1013);
			simpleType(0);
			setState(1014);
			argumentExprs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateBodyContext extends ParserRuleContext {
		public List<TemplateStatContext> templateStat() {
			return getRuleContexts(TemplateStatContext.class);
		}
		public TemplateStatContext templateStat(int i) {
			return getRuleContext(TemplateStatContext.class,i);
		}
		public SelfTypeContext selfType() {
			return getRuleContext(SelfTypeContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public TemplateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBody; }
	}

	public final TemplateBodyContext templateBody() throws RecognitionException {
		TemplateBodyContext _localctx = new TemplateBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_templateBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(T__12);
			setState(1018);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1017);
				selfType();
				}
				break;
			}
			setState(1020);
			templateStat();
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(1021);
				match(Semi);
				setState(1022);
				templateStat();
				}
				}
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1028);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateStatContext extends ParserRuleContext {
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TemplateStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStat; }
	}

	public final TemplateStatContext templateStat() throws RecognitionException {
		TemplateStatContext _localctx = new TemplateStatContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_templateStat);
		int _la;
		try {
			setState(1059);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				import_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(1031);
					annotation();
					}
					}
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
					{
					{
					setState(1037);
					modifier();
					}
					}
					setState(1042);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1043);
				def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(1044);
					annotation();
					}
					}
					setState(1049);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
					{
					{
					setState(1050);
					modifier();
					}
					}
					setState(1055);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1056);
				dcl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1057);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfTypeContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SelfTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfType; }
	}

	public final SelfTypeContext selfType() throws RecognitionException {
		SelfTypeContext _localctx = new SelfTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_selfType);
		int _la;
		try {
			setState(1072);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				match(Id);
				setState(1064);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(1062);
					match(T__18);
					setState(1063);
					type();
					}
				}

				setState(1066);
				match(T__8);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				match(T__4);
				setState(1068);
				match(T__18);
				setState(1069);
				type();
				setState(1070);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_Context extends ParserRuleContext {
		public List<ImportExprContext> importExpr() {
			return getRuleContexts(ImportExprContext.class);
		}
		public ImportExprContext importExpr(int i) {
			return getRuleContext(ImportExprContext.class,i);
		}
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 132, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(T__54);
			setState(1075);
			importExpr();
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1076);
				match(T__3);
				setState(1077);
				importExpr();
				}
				}
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportExprContext extends ParserRuleContext {
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ImportSelectorsContext importSelectors() {
			return getRuleContext(ImportSelectorsContext.class,0);
		}
		public ImportExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importExpr; }
	}

	public final ImportExprContext importExpr() throws RecognitionException {
		ImportExprContext _localctx = new ImportExprContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_importExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			stableId();
			setState(1084);
			match(T__2);
			setState(1088);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(1085);
				match(Id);
				}
				break;
			case T__19:
				{
				setState(1086);
				match(T__19);
				}
				break;
			case T__12:
				{
				setState(1087);
				importSelectors();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSelectorsContext extends ParserRuleContext {
		public List<ImportSelectorContext> importSelector() {
			return getRuleContexts(ImportSelectorContext.class);
		}
		public ImportSelectorContext importSelector(int i) {
			return getRuleContext(ImportSelectorContext.class,i);
		}
		public ImportSelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSelectors; }
	}

	public final ImportSelectorsContext importSelectors() throws RecognitionException {
		ImportSelectorsContext _localctx = new ImportSelectorsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_importSelectors);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(T__12);
			setState(1096);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1091);
					importSelector();
					setState(1092);
					match(T__3);
					}
					} 
				}
				setState(1098);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(1101);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(1099);
				importSelector();
				}
				break;
			case T__19:
				{
				setState(1100);
				match(T__19);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1103);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSelectorContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public ImportSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSelector; }
	}

	public final ImportSelectorContext importSelector() throws RecognitionException {
		ImportSelectorContext _localctx = new ImportSelectorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_importSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(Id);
			setState(1110);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1106);
				match(T__8);
				setState(1107);
				match(Id);
				}
				break;
			case 2:
				{
				setState(1108);
				match(T__8);
				setState(1109);
				match(T__19);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclContext extends ParserRuleContext {
		public ValDclContext valDcl() {
			return getRuleContext(ValDclContext.class,0);
		}
		public VarDclContext varDcl() {
			return getRuleContext(VarDclContext.class,0);
		}
		public FunDclContext funDcl() {
			return getRuleContext(FunDclContext.class,0);
		}
		public TypeDclContext typeDcl() {
			return getRuleContext(TypeDclContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dcl);
		try {
			setState(1120);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				match(T__15);
				setState(1113);
				valDcl();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				match(T__47);
				setState(1115);
				varDcl();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(1116);
				match(T__55);
				setState(1117);
				funDcl();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(1118);
				match(T__14);
				setState(1119);
				typeDcl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValDclContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valDcl; }
	}

	public final ValDclContext valDcl() throws RecognitionException {
		ValDclContext _localctx = new ValDclContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_valDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			ids();
			setState(1123);
			match(T__18);
			setState(1124);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDclContext extends ParserRuleContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDcl; }
	}

	public final VarDclContext varDcl() throws RecognitionException {
		VarDclContext _localctx = new VarDclContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_varDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			ids();
			setState(1127);
			match(T__18);
			setState(1128);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDclContext extends ParserRuleContext {
		public FunSigContext funSig() {
			return getRuleContext(FunSigContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDcl; }
	}

	public final FunDclContext funDcl() throws RecognitionException {
		FunDclContext _localctx = new FunDclContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_funDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			funSig();
			setState(1133);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(1131);
				match(T__18);
				setState(1132);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunSigContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ParamClausesContext paramClauses() {
			return getRuleContext(ParamClausesContext.class,0);
		}
		public FunTypeParamClauseContext funTypeParamClause() {
			return getRuleContext(FunTypeParamClauseContext.class,0);
		}
		public FunSigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funSig; }
	}

	public final FunSigContext funSig() throws RecognitionException {
		FunSigContext _localctx = new FunSigContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_funSig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(Id);
			setState(1137);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1136);
				funTypeParamClause();
				}
			}

			setState(1139);
			paramClauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDclContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDcl; }
	}

	public final TypeDclContext typeDcl() throws RecognitionException {
		TypeDclContext _localctx = new TypeDclContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_typeDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(Id);
			setState(1143);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1142);
				typeParamClause();
				}
			}

			setState(1147);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(1145);
				match(T__44);
				setState(1146);
				type();
				}
			}

			setState(1151);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(1149);
				match(T__45);
				setState(1150);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatVarDefContext extends ParserRuleContext {
		public PatDefContext patDef() {
			return getRuleContext(PatDefContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public PatVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patVarDef; }
	}

	public final PatVarDefContext patVarDef() throws RecognitionException {
		PatVarDefContext _localctx = new PatVarDefContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_patVarDef);
		try {
			setState(1157);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153);
				match(T__15);
				setState(1154);
				patDef();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(1155);
				match(T__47);
				setState(1156);
				varDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public PatVarDefContext patVarDef() {
			return getRuleContext(PatVarDefContext.class,0);
		}
		public FunDefContext funDef() {
			return getRuleContext(FunDefContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TmplDefContext tmplDef() {
			return getRuleContext(TmplDefContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_def);
		try {
			setState(1165);
			switch (_input.LA(1)) {
			case T__15:
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				patVarDef();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(1160);
				match(T__55);
				setState(1161);
				funDef();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(1162);
				match(T__14);
				setState(1163);
				typeDef();
				}
				break;
			case T__41:
			case T__56:
			case T__58:
				enterOuterAlt(_localctx, 4);
				{
				setState(1164);
				tmplDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatDefContext extends ParserRuleContext {
		public List<Pattern2Context> pattern2() {
			return getRuleContexts(Pattern2Context.class);
		}
		public Pattern2Context pattern2(int i) {
			return getRuleContext(Pattern2Context.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public PatDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patDef; }
	}

	public final PatDefContext patDef() throws RecognitionException {
		PatDefContext _localctx = new PatDefContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_patDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			pattern2();
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1168);
				match(T__3);
				setState(1169);
				pattern2();
				}
				}
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(1175);
				match(T__18);
				setState(1176);
				type();
				}
				}
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1182);
			match(T__34);
			setState(1183);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public PatDefContext patDef() {
			return getRuleContext(PatDefContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_varDef);
		try {
			setState(1192);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1185);
				patDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				ids();
				setState(1187);
				match(T__18);
				setState(1188);
				type();
				setState(1189);
				match(T__34);
				setState(1190);
				match(T__19);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDefContext extends ParserRuleContext {
		public FunSigContext funSig() {
			return getRuleContext(FunSigContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamClauseContext paramClause() {
			return getRuleContext(ParamClauseContext.class,0);
		}
		public ParamClausesContext paramClauses() {
			return getRuleContext(ParamClausesContext.class,0);
		}
		public ConstrExprContext constrExpr() {
			return getRuleContext(ConstrExprContext.class,0);
		}
		public ConstrBlockContext constrBlock() {
			return getRuleContext(ConstrBlockContext.class,0);
		}
		public FunDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDef; }
	}

	public final FunDefContext funDef() throws RecognitionException {
		FunDefContext _localctx = new FunDefContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_funDef);
		int _la;
		try {
			setState(1215);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				funSig();
				setState(1197);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(1195);
					match(T__18);
					setState(1196);
					type();
					}
				}

				setState(1199);
				match(T__34);
				setState(1200);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202);
				funSig();
				setState(1203);
				match(T__12);
				setState(1204);
				block();
				setState(1205);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1207);
				match(T__4);
				setState(1208);
				paramClause();
				setState(1209);
				paramClauses();
				setState(1213);
				switch (_input.LA(1)) {
				case T__34:
					{
					setState(1210);
					match(T__34);
					setState(1211);
					constrExpr();
					}
					break;
				case T__12:
					{
					setState(1212);
					constrBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(Id);
			setState(1219);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1218);
				typeParamClause();
				}
			}

			setState(1221);
			match(T__34);
			setState(1222);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TmplDefContext extends ParserRuleContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public ObjectDefContext objectDef() {
			return getRuleContext(ObjectDefContext.class,0);
		}
		public TraitDefContext traitDef() {
			return getRuleContext(TraitDefContext.class,0);
		}
		public TmplDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplDef; }
	}

	public final TmplDefContext tmplDef() throws RecognitionException {
		TmplDefContext _localctx = new TmplDefContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_tmplDef);
		int _la;
		try {
			setState(1234);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(1224);
					match(T__41);
					}
				}

				setState(1227);
				match(T__56);
				setState(1228);
				classDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
				match(T__41);
				setState(1230);
				match(T__57);
				setState(1231);
				objectDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1232);
				match(T__58);
				setState(1233);
				traitDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ClassParamClausesContext classParamClauses() {
			return getRuleContext(ClassParamClausesContext.class,0);
		}
		public ClassTemplateOptContext classTemplateOpt() {
			return getRuleContext(ClassTemplateOptContext.class,0);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public List<ConstrAnnotationContext> constrAnnotation() {
			return getRuleContexts(ConstrAnnotationContext.class);
		}
		public ConstrAnnotationContext constrAnnotation(int i) {
			return getRuleContext(ConstrAnnotationContext.class,i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(Id);
			setState(1238);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1237);
				typeParamClause();
				}
			}

			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(1240);
				constrAnnotation();
				}
				}
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1247);
			_la = _input.LA(1);
			if (_la==T__52 || _la==T__53) {
				{
				setState(1246);
				accessModifier();
				}
			}

			setState(1249);
			classParamClauses();
			setState(1250);
			classTemplateOpt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TraitTemplateOptContext traitTemplateOpt() {
			return getRuleContext(TraitTemplateOptContext.class,0);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public TraitDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitDef; }
	}

	public final TraitDefContext traitDef() throws RecognitionException {
		TraitDefContext _localctx = new TraitDefContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_traitDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(Id);
			setState(1254);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1253);
				typeParamClause();
				}
			}

			setState(1256);
			traitTemplateOpt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ClassTemplateOptContext classTemplateOpt() {
			return getRuleContext(ClassTemplateOptContext.class,0);
		}
		public ObjectDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDef; }
	}

	public final ObjectDefContext objectDef() throws RecognitionException {
		ObjectDefContext _localctx = new ObjectDefContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_objectDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(Id);
			setState(1259);
			classTemplateOpt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTemplateOptContext extends ParserRuleContext {
		public ClassTemplateContext classTemplate() {
			return getRuleContext(ClassTemplateContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public ClassTemplateOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTemplateOpt; }
	}

	public final ClassTemplateOptContext classTemplateOpt() throws RecognitionException {
		ClassTemplateOptContext _localctx = new ClassTemplateOptContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_classTemplateOpt);
		int _la;
		try {
			setState(1269);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				match(T__59);
				setState(1262);
				classTemplate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1264);
					_la = _input.LA(1);
					if (_la==T__59) {
						{
						setState(1263);
						match(T__59);
						}
					}

					setState(1266);
					templateBody();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitTemplateOptContext extends ParserRuleContext {
		public TraitTemplateContext traitTemplate() {
			return getRuleContext(TraitTemplateContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TraitTemplateOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitTemplateOpt; }
	}

	public final TraitTemplateOptContext traitTemplateOpt() throws RecognitionException {
		TraitTemplateOptContext _localctx = new TraitTemplateOptContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_traitTemplateOpt);
		int _la;
		try {
			setState(1279);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				match(T__59);
				setState(1272);
				traitTemplate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1274);
					_la = _input.LA(1);
					if (_la==T__59) {
						{
						setState(1273);
						match(T__59);
						}
					}

					setState(1276);
					templateBody();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTemplateContext extends ParserRuleContext {
		public ClassParentsContext classParents() {
			return getRuleContext(ClassParentsContext.class,0);
		}
		public EarlyDefsContext earlyDefs() {
			return getRuleContext(EarlyDefsContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public ClassTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTemplate; }
	}

	public final ClassTemplateContext classTemplate() throws RecognitionException {
		ClassTemplateContext _localctx = new ClassTemplateContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_classTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1281);
				earlyDefs();
				}
			}

			setState(1284);
			classParents();
			setState(1286);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1285);
				templateBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitTemplateContext extends ParserRuleContext {
		public TraitParentsContext traitParents() {
			return getRuleContext(TraitParentsContext.class,0);
		}
		public EarlyDefsContext earlyDefs() {
			return getRuleContext(EarlyDefsContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TraitTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitTemplate; }
	}

	public final TraitTemplateContext traitTemplate() throws RecognitionException {
		TraitTemplateContext _localctx = new TraitTemplateContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_traitTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1288);
				earlyDefs();
				}
			}

			setState(1291);
			traitParents();
			setState(1293);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1292);
				templateBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParentsContext extends ParserRuleContext {
		public ConstrContext constr() {
			return getRuleContext(ConstrContext.class,0);
		}
		public List<AnnotTypeContext> annotType() {
			return getRuleContexts(AnnotTypeContext.class);
		}
		public AnnotTypeContext annotType(int i) {
			return getRuleContext(AnnotTypeContext.class,i);
		}
		public ClassParentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParents; }
	}

	public final ClassParentsContext classParents() throws RecognitionException {
		ClassParentsContext _localctx = new ClassParentsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_classParents);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			constr();
			setState(1300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1296);
					match(T__16);
					setState(1297);
					annotType();
					}
					} 
				}
				setState(1302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitParentsContext extends ParserRuleContext {
		public List<AnnotTypeContext> annotType() {
			return getRuleContexts(AnnotTypeContext.class);
		}
		public AnnotTypeContext annotType(int i) {
			return getRuleContext(AnnotTypeContext.class,i);
		}
		public TraitParentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitParents; }
	}

	public final TraitParentsContext traitParents() throws RecognitionException {
		TraitParentsContext _localctx = new TraitParentsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_traitParents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			annotType();
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(1304);
				match(T__16);
				setState(1305);
				annotType();
				}
				}
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrContext extends ParserRuleContext {
		public AnnotTypeContext annotType() {
			return getRuleContext(AnnotTypeContext.class,0);
		}
		public List<ArgumentExprsContext> argumentExprs() {
			return getRuleContexts(ArgumentExprsContext.class);
		}
		public ArgumentExprsContext argumentExprs(int i) {
			return getRuleContext(ArgumentExprsContext.class,i);
		}
		public ConstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr; }
	}

	public final ConstrContext constr() throws RecognitionException {
		ConstrContext _localctx = new ConstrContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			annotType();
			setState(1315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1312);
					argumentExprs();
					}
					} 
				}
				setState(1317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EarlyDefsContext extends ParserRuleContext {
		public List<EarlyDefContext> earlyDef() {
			return getRuleContexts(EarlyDefContext.class);
		}
		public EarlyDefContext earlyDef(int i) {
			return getRuleContext(EarlyDefContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public EarlyDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_earlyDefs; }
	}

	public final EarlyDefsContext earlyDefs() throws RecognitionException {
		EarlyDefsContext _localctx = new EarlyDefsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_earlyDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			match(T__12);
			setState(1327);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__21) | (1L << T__39) | (1L << T__43) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
				{
				setState(1319);
				earlyDef();
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Semi) {
					{
					{
					setState(1320);
					match(Semi);
					setState(1321);
					earlyDef();
					}
					}
					setState(1326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1329);
			match(T__13);
			setState(1330);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EarlyDefContext extends ParserRuleContext {
		public PatVarDefContext patVarDef() {
			return getRuleContext(PatVarDefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public EarlyDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_earlyDef; }
	}

	public final EarlyDefContext earlyDef() throws RecognitionException {
		EarlyDefContext _localctx = new EarlyDefContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_earlyDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43) {
				{
				{
				setState(1332);
				annotation();
				}
				}
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
				{
				{
				setState(1338);
				modifier();
				}
				}
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1344);
			patVarDef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrExprContext extends ParserRuleContext {
		public SelfInvocationContext selfInvocation() {
			return getRuleContext(SelfInvocationContext.class,0);
		}
		public ConstrBlockContext constrBlock() {
			return getRuleContext(ConstrBlockContext.class,0);
		}
		public ConstrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrExpr; }
	}

	public final ConstrExprContext constrExpr() throws RecognitionException {
		ConstrExprContext _localctx = new ConstrExprContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_constrExpr);
		try {
			setState(1348);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1346);
				selfInvocation();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(1347);
				constrBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrBlockContext extends ParserRuleContext {
		public SelfInvocationContext selfInvocation() {
			return getRuleContext(SelfInvocationContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public List<BlockStatContext> blockStat() {
			return getRuleContexts(BlockStatContext.class);
		}
		public BlockStatContext blockStat(int i) {
			return getRuleContext(BlockStatContext.class,i);
		}
		public ConstrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrBlock; }
	}

	public final ConstrBlockContext constrBlock() throws RecognitionException {
		ConstrBlockContext _localctx = new ConstrBlockContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_constrBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(T__12);
			setState(1351);
			selfInvocation();
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(1352);
				match(Semi);
				setState(1353);
				blockStat();
				}
				}
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1359);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfInvocationContext extends ParserRuleContext {
		public List<ArgumentExprsContext> argumentExprs() {
			return getRuleContexts(ArgumentExprsContext.class);
		}
		public ArgumentExprsContext argumentExprs(int i) {
			return getRuleContext(ArgumentExprsContext.class,i);
		}
		public SelfInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfInvocation; }
	}

	public final SelfInvocationContext selfInvocation() throws RecognitionException {
		SelfInvocationContext _localctx = new SelfInvocationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_selfInvocation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			match(T__4);
			setState(1363); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1362);
					argumentExprs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1365); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopStatSeqContext extends ParserRuleContext {
		public List<TopStatContext> topStat() {
			return getRuleContexts(TopStatContext.class);
		}
		public TopStatContext topStat(int i) {
			return getRuleContext(TopStatContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public TopStatSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatSeq; }
	}

	public final TopStatSeqContext topStatSeq() throws RecognitionException {
		TopStatSeqContext _localctx = new TopStatSeqContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_topStatSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			topStat();
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(1368);
				match(Semi);
				setState(1369);
				topStat();
				}
				}
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopStatContext extends ParserRuleContext {
		public TmplDefContext tmplDef() {
			return getRuleContext(TmplDefContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public PackagingContext packaging() {
			return getRuleContext(PackagingContext.class,0);
		}
		public PackageObjectContext packageObject() {
			return getRuleContext(PackageObjectContext.class,0);
		}
		public TopStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStat; }
	}

	public final TopStatContext topStat() throws RecognitionException {
		TopStatContext _localctx = new TopStatContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_topStat);
		int _la;
		try {
			setState(1392);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(1375);
					annotation();
					}
					}
					setState(1380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
					{
					{
					setState(1381);
					modifier();
					}
					}
					setState(1386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1387);
				tmplDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				import_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1389);
				packaging();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1390);
				packageObject();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackagingContext extends ParserRuleContext {
		public QualIdContext qualId() {
			return getRuleContext(QualIdContext.class,0);
		}
		public TopStatSeqContext topStatSeq() {
			return getRuleContext(TopStatSeqContext.class,0);
		}
		public PackagingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packaging; }
	}

	public final PackagingContext packaging() throws RecognitionException {
		PackagingContext _localctx = new PackagingContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_packaging);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			match(T__60);
			setState(1395);
			qualId();
			setState(1396);
			match(T__12);
			setState(1397);
			topStatSeq();
			setState(1398);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageObjectContext extends ParserRuleContext {
		public ObjectDefContext objectDef() {
			return getRuleContext(ObjectDefContext.class,0);
		}
		public PackageObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageObject; }
	}

	public final PackageObjectContext packageObject() throws RecognitionException {
		PackageObjectContext _localctx = new PackageObjectContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_packageObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			match(T__60);
			setState(1401);
			match(T__57);
			setState(1402);
			objectDef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TopStatSeqContext topStatSeq() {
			return getRuleContext(TopStatSeqContext.class,0);
		}
		public List<QualIdContext> qualId() {
			return getRuleContexts(QualIdContext.class);
		}
		public QualIdContext qualId(int i) {
			return getRuleContext(QualIdContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_compilationUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1404);
					match(T__60);
					setState(1405);
					qualId();
					setState(1406);
					match(Semi);
					}
					} 
				}
				setState(1412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			setState(1413);
			topStatSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return simpleType_sempred((SimpleTypeContext)_localctx, predIndex);
		case 22:
			return infixExpr_sempred((InfixExprContext)_localctx, predIndex);
		case 24:
			return simpleExpr1_sempred((SimpleExpr1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleType_sempred(SimpleTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean infixExpr_sempred(InfixExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean simpleExpr1_sempred(SimpleExpr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3L\u058a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\5\2\u00d2\n\2"+
		"\3\2\3\2\5\2\u00d6\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00de\n\2\3\3\3\3\3"+
		"\3\7\3\u00e3\n\3\f\3\16\3\u00e6\13\3\3\4\3\4\3\4\7\4\u00eb\n\4\f\4\16"+
		"\4\u00ee\13\4\3\5\3\5\3\5\5\5\u00f3\n\5\3\5\5\5\u00f6\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00fc\n\5\3\5\3\5\5\5\u0100\n\5\3\5\3\5\5\5\u0104\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0110\n\7\5\7\u0112\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u0119\n\b\f\b\16\b\u011c\13\b\5\b\u011e\n\b\3\b\5\b\u0121"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u0128\n\t\f\t\16\t\u012b\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\n\u0133\n\n\3\13\3\13\3\13\7\13\u0138\n\13\f\13\16\13\u013b"+
		"\13\13\3\f\3\f\3\f\7\f\u0140\n\f\f\f\16\f\u0143\13\f\3\f\5\f\u0146\n\f"+
		"\3\f\5\f\u0149\n\f\3\r\3\r\7\r\u014d\n\r\f\r\16\r\u0150\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0157\n\16\3\16\5\16\u015a\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u0162\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u0169\n\16"+
		"\f\16\16\16\u016c\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u0175"+
		"\n\20\f\20\16\20\u0178\13\20\3\21\3\21\3\21\3\21\7\21\u017e\n\21\f\21"+
		"\16\21\u0181\13\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0189\n\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\6\24\u0191\n\24\r\24\16\24\u0192\3\24\3\24\3"+
		"\24\5\24\u0198\n\24\3\25\3\25\5\25\u019c\n\25\3\25\3\25\5\25\u01a0\n\25"+
		"\3\25\3\25\3\25\5\25\u01a5\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ad"+
		"\n\26\3\26\3\26\5\26\u01b1\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u01bf\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u01c6"+
		"\n\26\3\26\3\26\5\26\u01ca\n\26\3\26\3\26\3\26\5\26\u01cf\n\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01df"+
		"\n\26\3\26\5\26\u01e2\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ea\n"+
		"\26\3\26\3\26\3\26\5\26\u01ef\n\26\3\26\3\26\3\26\5\26\u01f4\n\26\5\26"+
		"\u01f6\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u020d\n\26\3\27\3\27"+
		"\5\27\u0211\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0219\n\30\f\30\16"+
		"\30\u021c\13\30\3\31\5\31\u021f\n\31\3\31\3\31\3\31\5\31\u0224\n\31\3"+
		"\31\3\31\3\31\5\31\u0229\n\31\5\31\u022b\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0232\n\32\3\32\3\32\3\32\3\32\5\32\u0238\n\32\3\32\3\32\3\32\3"+
		"\32\5\32\u023e\n\32\3\32\5\32\u0241\n\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0249\n\32\3\32\5\32\u024c\n\32\3\32\3\32\5\32\u0250\n\32\3\32\3"+
		"\32\7\32\u0254\n\32\f\32\16\32\u0257\13\32\3\33\3\33\3\33\7\33\u025c\n"+
		"\33\f\33\16\33\u025f\13\33\3\34\3\34\5\34\u0263\n\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u026a\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0273"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u027d\n\35\3\36\3\36"+
		"\3\36\7\36\u0282\n\36\f\36\16\36\u0285\13\36\3\36\5\36\u0288\n\36\3\37"+
		"\3\37\7\37\u028c\n\37\f\37\16\37\u028f\13\37\3\37\5\37\u0292\n\37\3\37"+
		"\3\37\7\37\u0296\n\37\f\37\16\37\u0299\13\37\3\37\7\37\u029c\n\37\f\37"+
		"\16\37\u029f\13\37\3\37\3\37\3\37\5\37\u02a4\n\37\3 \3 \3 \5 \u02a9\n"+
		" \3 \3 \5 \u02ad\n \3 \3 \5 \u02b1\n \3 \3 \3 \5 \u02b6\n \3!\3!\3!\7"+
		"!\u02bb\n!\f!\16!\u02be\13!\3\"\3\"\3\"\3\"\5\"\u02c4\n\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\7\"\u02cc\n\"\f\"\16\"\u02cf\13\"\3#\6#\u02d2\n#\r#\16#\u02d3"+
		"\3$\3$\3$\5$\u02d9\n$\3$\3$\3$\3%\3%\3%\3&\3&\3&\7&\u02e4\n&\f&\16&\u02e7"+
		"\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02f0\n\'\3(\3(\3(\5(\u02f5\n(\3"+
		"(\5(\u02f8\n(\3)\3)\3)\3)\7)\u02fe\n)\f)\16)\u0301\13)\5)\u0303\n)\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\5*\u030d\n*\3*\3*\3*\3*\3*\5*\u0314\n*\3*\3*\5*"+
		"\u0318\n*\3*\3*\3*\3*\3*\3*\5*\u0320\n*\3*\5*\u0323\n*\3+\3+\3+\7+\u0328"+
		"\n+\f+\16+\u032b\13+\3+\7+\u032e\n+\f+\16+\u0331\13+\5+\u0333\n+\3,\3"+
		",\3,\3,\7,\u0339\n,\f,\16,\u033c\13,\3,\3,\3-\3-\3-\3-\7-\u0344\n-\f-"+
		"\16-\u0347\13-\3-\3-\3.\5.\u034c\n.\3.\5.\u034f\n.\3.\3.\3/\3/\5/\u0355"+
		"\n/\3/\3/\5/\u0359\n/\3/\3/\5/\u035d\n/\3/\3/\7/\u0361\n/\f/\16/\u0364"+
		"\13/\3/\3/\7/\u0368\n/\f/\16/\u036b\13/\3\60\7\60\u036e\n\60\f\60\16\60"+
		"\u0371\13\60\3\60\3\60\3\60\3\60\3\60\5\60\u0378\n\60\3\61\3\61\5\61\u037c"+
		"\n\61\3\61\3\61\3\62\3\62\3\62\7\62\u0383\n\62\f\62\16\62\u0386\13\62"+
		"\3\63\7\63\u0389\n\63\f\63\16\63\u038c\13\63\3\63\3\63\3\63\5\63\u0391"+
		"\n\63\3\63\3\63\5\63\u0395\n\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u039d"+
		"\n\64\3\65\7\65\u03a0\n\65\f\65\16\65\u03a3\13\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u03aa\n\65\3\66\3\66\5\66\u03ae\n\66\3\66\3\66\3\67\3\67\3"+
		"\67\7\67\u03b5\n\67\f\67\16\67\u03b8\13\67\38\78\u03bb\n8\f8\168\u03be"+
		"\138\38\78\u03c1\n8\f8\168\u03c4\138\38\58\u03c7\n8\38\38\38\38\38\58"+
		"\u03ce\n8\39\39\39\39\79\u03d4\n9\f9\169\u03d7\139\39\39\3:\3:\3:\5:\u03de"+
		"\n:\3;\3;\3;\5;\u03e3\n;\3<\3<\3=\3=\5=\u03e9\n=\3>\3>\3>\3>\3?\3?\3?"+
		"\7?\u03f2\n?\f?\16?\u03f5\13?\3@\3@\3@\3@\3A\3A\5A\u03fd\nA\3A\3A\3A\7"+
		"A\u0402\nA\fA\16A\u0405\13A\3A\3A\3B\3B\7B\u040b\nB\fB\16B\u040e\13B\3"+
		"B\7B\u0411\nB\fB\16B\u0414\13B\3B\3B\7B\u0418\nB\fB\16B\u041b\13B\3B\7"+
		"B\u041e\nB\fB\16B\u0421\13B\3B\3B\3B\5B\u0426\nB\3C\3C\3C\5C\u042b\nC"+
		"\3C\3C\3C\3C\3C\3C\5C\u0433\nC\3D\3D\3D\3D\7D\u0439\nD\fD\16D\u043c\13"+
		"D\3E\3E\3E\3E\3E\5E\u0443\nE\3F\3F\3F\3F\7F\u0449\nF\fF\16F\u044c\13F"+
		"\3F\3F\5F\u0450\nF\3F\3F\3G\3G\3G\3G\3G\5G\u0459\nG\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\5H\u0463\nH\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\5K\u0470\nK\3L\3L"+
		"\5L\u0474\nL\3L\3L\3M\3M\5M\u047a\nM\3M\3M\5M\u047e\nM\3M\3M\5M\u0482"+
		"\nM\3N\3N\3N\3N\5N\u0488\nN\3O\3O\3O\3O\3O\3O\5O\u0490\nO\3P\3P\3P\7P"+
		"\u0495\nP\fP\16P\u0498\13P\3P\3P\7P\u049c\nP\fP\16P\u049f\13P\3P\3P\3"+
		"P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u04ab\nQ\3R\3R\3R\5R\u04b0\nR\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04c0\nR\5R\u04c2\nR\3S\3S\5S\u04c6\n"+
		"S\3S\3S\3S\3T\5T\u04cc\nT\3T\3T\3T\3T\3T\3T\3T\5T\u04d5\nT\3U\3U\5U\u04d9"+
		"\nU\3U\7U\u04dc\nU\fU\16U\u04df\13U\3U\5U\u04e2\nU\3U\3U\3U\3V\3V\5V\u04e9"+
		"\nV\3V\3V\3W\3W\3W\3X\3X\3X\5X\u04f3\nX\3X\5X\u04f6\nX\5X\u04f8\nX\3Y"+
		"\3Y\3Y\5Y\u04fd\nY\3Y\5Y\u0500\nY\5Y\u0502\nY\3Z\5Z\u0505\nZ\3Z\3Z\5Z"+
		"\u0509\nZ\3[\5[\u050c\n[\3[\3[\5[\u0510\n[\3\\\3\\\3\\\7\\\u0515\n\\\f"+
		"\\\16\\\u0518\13\\\3]\3]\3]\7]\u051d\n]\f]\16]\u0520\13]\3^\3^\7^\u0524"+
		"\n^\f^\16^\u0527\13^\3_\3_\3_\3_\7_\u052d\n_\f_\16_\u0530\13_\5_\u0532"+
		"\n_\3_\3_\3_\3`\7`\u0538\n`\f`\16`\u053b\13`\3`\7`\u053e\n`\f`\16`\u0541"+
		"\13`\3`\3`\3a\3a\5a\u0547\na\3b\3b\3b\3b\7b\u054d\nb\fb\16b\u0550\13b"+
		"\3b\3b\3c\3c\6c\u0556\nc\rc\16c\u0557\3d\3d\3d\7d\u055d\nd\fd\16d\u0560"+
		"\13d\3e\7e\u0563\ne\fe\16e\u0566\13e\3e\7e\u0569\ne\fe\16e\u056c\13e\3"+
		"e\3e\3e\3e\3e\5e\u0573\ne\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\3h\3h\3h\3h\7"+
		"h\u0583\nh\fh\16h\u0586\13h\3h\3h\3h\2\5\32.\62i\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\2\n\4\2\3\3\')\4\2\30\30**\4\2\3\3\'\'"+
		"\4\2\26\26FF\4\2\22\22\62\62\5\2\30\30**\64\66\3\2\678\4\2\7\7FF\u0610"+
		"\2\u00dd\3\2\2\2\4\u00df\3\2\2\2\6\u00e7\3\2\2\2\b\u0103\3\2\2\2\n\u0105"+
		"\3\2\2\2\f\u0111\3\2\2\2\16\u0120\3\2\2\2\20\u0122\3\2\2\2\22\u0132\3"+
		"\2\2\2\24\u0134\3\2\2\2\26\u0148\3\2\2\2\30\u014a\3\2\2\2\32\u0161\3\2"+
		"\2\2\34\u016d\3\2\2\2\36\u0171\3\2\2\2 \u0179\3\2\2\2\"\u0188\3\2\2\2"+
		"$\u018a\3\2\2\2&\u0197\3\2\2\2(\u01a4\3\2\2\2*\u020c\3\2\2\2,\u020e\3"+
		"\2\2\2.\u0212\3\2\2\2\60\u021e\3\2\2\2\62\u024f\3\2\2\2\64\u0258\3\2\2"+
		"\2\66\u0272\3\2\2\28\u027c\3\2\2\2:\u027e\3\2\2\2<\u02a3\3\2\2\2>\u02b5"+
		"\3\2\2\2@\u02b7\3\2\2\2B\u02bf\3\2\2\2D\u02d1\3\2\2\2F\u02d5\3\2\2\2H"+
		"\u02dd\3\2\2\2J\u02e0\3\2\2\2L\u02ef\3\2\2\2N\u02f7\3\2\2\2P\u0302\3\2"+
		"\2\2R\u0322\3\2\2\2T\u0332\3\2\2\2V\u0334\3\2\2\2X\u033f\3\2\2\2Z\u034b"+
		"\3\2\2\2\\\u0352\3\2\2\2^\u036f\3\2\2\2`\u0379\3\2\2\2b\u037f\3\2\2\2"+
		"d\u038a\3\2\2\2f\u039c\3\2\2\2h\u03a1\3\2\2\2j\u03ab\3\2\2\2l\u03b1\3"+
		"\2\2\2n\u03bc\3\2\2\2p\u03cf\3\2\2\2r\u03da\3\2\2\2t\u03e2\3\2\2\2v\u03e4"+
		"\3\2\2\2x\u03e6\3\2\2\2z\u03ea\3\2\2\2|\u03ee\3\2\2\2~\u03f6\3\2\2\2\u0080"+
		"\u03fa\3\2\2\2\u0082\u0425\3\2\2\2\u0084\u0432\3\2\2\2\u0086\u0434\3\2"+
		"\2\2\u0088\u043d\3\2\2\2\u008a\u0444\3\2\2\2\u008c\u0453\3\2\2\2\u008e"+
		"\u0462\3\2\2\2\u0090\u0464\3\2\2\2\u0092\u0468\3\2\2\2\u0094\u046c\3\2"+
		"\2\2\u0096\u0471\3\2\2\2\u0098\u0477\3\2\2\2\u009a\u0487\3\2\2\2\u009c"+
		"\u048f\3\2\2\2\u009e\u0491\3\2\2\2\u00a0\u04aa\3\2\2\2\u00a2\u04c1\3\2"+
		"\2\2\u00a4\u04c3\3\2\2\2\u00a6\u04d4\3\2\2\2\u00a8\u04d6\3\2\2\2\u00aa"+
		"\u04e6\3\2\2\2\u00ac\u04ec\3\2\2\2\u00ae\u04f7\3\2\2\2\u00b0\u0501\3\2"+
		"\2\2\u00b2\u0504\3\2\2\2\u00b4\u050b\3\2\2\2\u00b6\u0511\3\2\2\2\u00b8"+
		"\u0519\3\2\2\2\u00ba\u0521\3\2\2\2\u00bc\u0528\3\2\2\2\u00be\u0539\3\2"+
		"\2\2\u00c0\u0546\3\2\2\2\u00c2\u0548\3\2\2\2\u00c4\u0553\3\2\2\2\u00c6"+
		"\u0559\3\2\2\2\u00c8\u0572\3\2\2\2\u00ca\u0574\3\2\2\2\u00cc\u057a\3\2"+
		"\2\2\u00ce\u0584\3\2\2\2\u00d0\u00d2\7\3\2\2\u00d1\u00d0\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00de\7D\2\2\u00d4\u00d6\7\3"+
		"\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00de\7E\2\2\u00d8\u00de\7@\2\2\u00d9\u00de\7A\2\2\u00da\u00de\7B\2\2"+
		"\u00db\u00de\7C\2\2\u00dc\u00de\7\4\2\2\u00dd\u00d1\3\2\2\2\u00dd\u00d5"+
		"\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\3\3\2\2\2\u00df\u00e4\7F\2\2"+
		"\u00e0\u00e1\7\5\2\2\u00e1\u00e3\7F\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\5\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00ec\7F\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00eb\7F\2"+
		"\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\7\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f6\7F\2\2\u00f0"+
		"\u00f1\7F\2\2\u00f1\u00f3\7\5\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\7\7\2\2\u00f5\u00ef\3\2\2\2\u00f5"+
		"\u00f2\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\5\2\2\u00f8\u0104\7F"+
		"\2\2\u00f9\u00fa\7F\2\2\u00fa\u00fc\7\5\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\7\b\2\2\u00fe\u0100\5\n"+
		"\6\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\7\5\2\2\u0102\u0104\7F\2\2\u0103\u00f5\3\2\2\2\u0103\u00fb\3\2"+
		"\2\2\u0104\t\3\2\2\2\u0105\u0106\7\t\2\2\u0106\u0107\7F\2\2\u0107\u0108"+
		"\7\n\2\2\u0108\13\3\2\2\2\u0109\u010a\5\16\b\2\u010a\u010b\7\13\2\2\u010b"+
		"\u010c\5\f\7\2\u010c\u0112\3\2\2\2\u010d\u010f\5\24\13\2\u010e\u0110\5"+
		"\20\t\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u0109\3\2\2\2\u0111\u010d\3\2\2\2\u0112\r\3\2\2\2\u0113\u0121\5\24\13"+
		"\2\u0114\u011d\7\f\2\2\u0115\u011a\5f\64\2\u0116\u0117\7\6\2\2\u0117\u0119"+
		"\5f\64\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0115\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\7\r\2\2\u0120"+
		"\u0113\3\2\2\2\u0120\u0114\3\2\2\2\u0121\17\3\2\2\2\u0122\u0123\7\16\2"+
		"\2\u0123\u0124\7\17\2\2\u0124\u0129\5\22\n\2\u0125\u0126\7I\2\2\u0126"+
		"\u0128\5\22\n\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3"+
		"\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\7\20\2\2\u012d\21\3\2\2\2\u012e\u012f\7\21\2\2\u012f\u0133\5\u0098"+
		"M\2\u0130\u0131\7\22\2\2\u0131\u0133\5\u0090I\2\u0132\u012e\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\23\3\2\2\2\u0134\u0139\5\26\f\2\u0135\u0136\7F\2"+
		"\2\u0136\u0138\5\26\f\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\25\3\2\2\2\u013b\u0139\3\2\2"+
		"\2\u013c\u0141\5\30\r\2\u013d\u013e\7\23\2\2\u013e\u0140\5\30\r\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\5 \21\2\u0145"+
		"\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0149\5 "+
		"\21\2\u0148\u013c\3\2\2\2\u0148\u0147\3\2\2\2\u0149\27\3\2\2\2\u014a\u014e"+
		"\5\32\16\2\u014b\u014d\5|?\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\31\3\2\2\2\u0150\u014e\3\2\2"+
		"\2\u0151\u0152\b\16\1\2\u0152\u0162\5\b\5\2\u0153\u015a\5\b\5\2\u0154"+
		"\u0155\7F\2\2\u0155\u0157\7\5\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u015a\7\7\2\2\u0159\u0153\3\2\2\2\u0159"+
		"\u0156\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\5\2\2\u015c\u0162\7\21"+
		"\2\2\u015d\u015e\7\f\2\2\u015e\u015f\5\36\20\2\u015f\u0160\7\r\2\2\u0160"+
		"\u0162\3\2\2\2\u0161\u0151\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u015d\3\2"+
		"\2\2\u0162\u016a\3\2\2\2\u0163\u0164\f\7\2\2\u0164\u0169\5\34\17\2\u0165"+
		"\u0166\f\6\2\2\u0166\u0167\7\24\2\2\u0167\u0169\7F\2\2\u0168\u0163\3\2"+
		"\2\2\u0168\u0165\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\33\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7\t\2"+
		"\2\u016e\u016f\5\36\20\2\u016f\u0170\7\n\2\2\u0170\35\3\2\2\2\u0171\u0176"+
		"\5\f\7\2\u0172\u0173\7\6\2\2\u0173\u0175\5\f\7\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\37\3\2\2"+
		"\2\u0178\u0176\3\2\2\2\u0179\u017a\7\17\2\2\u017a\u017f\5\"\22\2\u017b"+
		"\u017c\7I\2\2\u017c\u017e\5\"\22\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0183\7\20\2\2\u0183!\3\2\2\2\u0184\u0189\5\u008e"+
		"H\2\u0185\u0186\7\21\2\2\u0186\u0189\5\u00a4S\2\u0187\u0189\3\2\2\2\u0188"+
		"\u0184\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0187\3\2\2\2\u0189#\3\2\2\2"+
		"\u018a\u018b\5\f\7\2\u018b%\3\2\2\2\u018c\u018d\7\25\2\2\u018d\u0198\5"+
		"\24\13\2\u018e\u0190\7\25\2\2\u018f\u0191\5|?\2\u0190\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0198\3\2"+
		"\2\2\u0194\u0195\7\25\2\2\u0195\u0196\7\26\2\2\u0196\u0198\7\27\2\2\u0197"+
		"\u018c\3\2\2\2\u0197\u018e\3\2\2\2\u0197\u0194\3\2\2\2\u0198\'\3\2\2\2"+
		"\u0199\u01a0\5p9\2\u019a\u019c\7\30\2\2\u019b\u019a\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\7F\2\2\u019e\u01a0\7\26\2\2\u019f"+
		"\u0199\3\2\2\2\u019f\u019b\3\2\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a2\7\13\2\2\u01a2\u01a5\5(\25\2\u01a3\u01a5\5*\26\2\u01a4"+
		"\u019f\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5)\3\2\2\2\u01a6\u01a7\7\31\2\2"+
		"\u01a7\u01a8\7\f\2\2\u01a8\u01a9\5(\25\2\u01a9\u01aa\7\r\2\2\u01aa\u01b0"+
		"\5(\25\2\u01ab\u01ad\7I\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\7\32\2\2\u01af\u01b1\5(\25\2\u01b0\u01ac\3"+
		"\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u020d\3\2\2\2\u01b2\u01b3\7\33\2\2\u01b3"+
		"\u01b4\7\f\2\2\u01b4\u01b5\5(\25\2\u01b5\u01b6\7\r\2\2\u01b6\u01b7\5("+
		"\25\2\u01b7\u020d\3\2\2\2\u01b8\u01be\7\34\2\2\u01b9\u01ba\7\17\2\2\u01ba"+
		"\u01bb\5:\36\2\u01bb\u01bc\7\20\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bf\5"+
		"(\25\2\u01be\u01b9\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c5\3\2\2\2\u01c0"+
		"\u01c1\7\35\2\2\u01c1\u01c2\7\17\2\2\u01c2\u01c3\5D#\2\u01c3\u01c4\7\20"+
		"\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c9\3\2\2\2\u01c7\u01c8\7\36\2\2\u01c8\u01ca\5(\25\2\u01c9\u01c7\3"+
		"\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u020d\3\2\2\2\u01cb\u01cc\7\37\2\2\u01cc"+
		"\u01ce\5(\25\2\u01cd\u01cf\7I\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7\33\2\2\u01d1\u01d2\7\f\2\2\u01d2"+
		"\u01d3\5(\25\2\u01d3\u01d4\7\r\2\2\u01d4\u020d\3\2\2\2\u01d5\u01de\7 "+
		"\2\2\u01d6\u01d7\7\f\2\2\u01d7\u01d8\5@!\2\u01d8\u01d9\7\r\2\2\u01d9\u01df"+
		"\3\2\2\2\u01da\u01db\7\17\2\2\u01db\u01dc\5@!\2\u01dc\u01dd\7\20\2\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01d6\3\2\2\2\u01de\u01da\3\2\2\2\u01df\u01e1\3\2"+
		"\2\2\u01e0\u01e2\7!\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e4\5(\25\2\u01e4\u020d\3\2\2\2\u01e5\u01e6\7\""+
		"\2\2\u01e6\u020d\5(\25\2\u01e7\u01e9\7#\2\2\u01e8\u01ea\5(\25\2\u01e9"+
		"\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u020d\3\2\2\2\u01eb\u01ee\7$"+
		"\2\2\u01ec\u01ef\5\u00b2Z\2\u01ed\u01ef\5\u0080A\2\u01ee\u01ec\3\2\2\2"+
		"\u01ee\u01ed\3\2\2\2\u01ef\u01f6\3\2\2\2\u01f0\u01f6\58\35\2\u01f1\u01f3"+
		"\5\62\32\2\u01f2\u01f4\7\26\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2"+
		"\2\u01f4\u01f6\3\2\2\2\u01f5\u01eb\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f5\u01f1"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7\5\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\7F\2\2\u01fa\u01fb\7%\2\2\u01fb\u01fc\5(\25\2\u01fc\u020d\3\2\2"+
		"\2\u01fd\u01fe\5\62\32\2\u01fe\u01ff\5\66\34\2\u01ff\u0200\7%\2\2\u0200"+
		"\u0201\5(\25\2\u0201\u020d\3\2\2\2\u0202\u020d\5,\27\2\u0203\u0204\5,"+
		"\27\2\u0204\u0205\5&\24\2\u0205\u020d\3\2\2\2\u0206\u0207\5,\27\2\u0207"+
		"\u0208\7&\2\2\u0208\u0209\7\17\2\2\u0209\u020a\5D#\2\u020a\u020b\7\20"+
		"\2\2\u020b\u020d\3\2\2\2\u020c\u01a6\3\2\2\2\u020c\u01b2\3\2\2\2\u020c"+
		"\u01b8\3\2\2\2\u020c\u01cb\3\2\2\2\u020c\u01d5\3\2\2\2\u020c\u01e5\3\2"+
		"\2\2\u020c\u01e7\3\2\2\2\u020c\u01f5\3\2\2\2\u020c\u01fd\3\2\2\2\u020c"+
		"\u0202\3\2\2\2\u020c\u0203\3\2\2\2\u020c\u0206\3\2\2\2\u020d+\3\2\2\2"+
		"\u020e\u0210\5.\30\2\u020f\u0211\7F\2\2\u0210\u020f\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211-\3\2\2\2\u0212\u0213\b\30\1\2\u0213\u0214\5\60\31\2\u0214"+
		"\u021a\3\2\2\2\u0215\u0216\f\3\2\2\u0216\u0217\7F\2\2\u0217\u0219\5.\30"+
		"\4\u0218\u0215\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b"+
		"\3\2\2\2\u021b/\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021f\t\2\2\2\u021e"+
		"\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u022a\3\2\2\2\u0220\u0223\7$"+
		"\2\2\u0221\u0224\5\u00b2Z\2\u0222\u0224\5\u0080A\2\u0223\u0221\3\2\2\2"+
		"\u0223\u0222\3\2\2\2\u0224\u022b\3\2\2\2\u0225\u022b\58\35\2\u0226\u0228"+
		"\5\62\32\2\u0227\u0229\7\26\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2"+
		"\2\u0229\u022b\3\2\2\2\u022a\u0220\3\2\2\2\u022a\u0225\3\2\2\2\u022a\u0226"+
		"\3\2\2\2\u022b\61\3\2\2\2\u022c\u022d\b\32\1\2\u022d\u0250\5\2\2\2\u022e"+
		"\u0250\5\b\5\2\u022f\u0230\7F\2\2\u0230\u0232\7\5\2\2\u0231\u022f\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0250\7\7\2\2\u0234"+
		"\u0250\7\26\2\2\u0235\u0237\7\f\2\2\u0236\u0238\5\64\33\2\u0237\u0236"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0250\7\r\2\2\u023a"+
		"\u023d\7$\2\2\u023b\u023e\5\u00b2Z\2\u023c\u023e\5\u0080A\2\u023d\u023b"+
		"\3\2\2\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u0241\58\35\2\u0240"+
		"\u023a\3\2\2\2\u0240\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\7\5"+
		"\2\2\u0243\u0244\7F\2\2\u0244\u0250\3\2\2\2\u0245\u0248\7$\2\2\u0246\u0249"+
		"\5\u00b2Z\2\u0247\u0249\5\u0080A\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2"+
		"\2\2\u0249\u024c\3\2\2\2\u024a\u024c\58\35\2\u024b\u0245\3\2\2\2\u024b"+
		"\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\5\34\17\2\u024e\u0250\3"+
		"\2\2\2\u024f\u022c\3\2\2\2\u024f\u022e\3\2\2\2\u024f\u0231\3\2\2\2\u024f"+
		"\u0234\3\2\2\2\u024f\u0235\3\2\2\2\u024f\u0240\3\2\2\2\u024f\u024b\3\2"+
		"\2\2\u0250\u0255\3\2\2\2\u0251\u0252\f\3\2\2\u0252\u0254\5\66\34\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\63\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u025d\5(\25\2\u0259\u025a"+
		"\7\6\2\2\u025a\u025c\5(\25\2\u025b\u0259\3\2\2\2\u025c\u025f\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\65\3\2\2\2\u025f\u025d\3\2\2"+
		"\2\u0260\u0262\7\f\2\2\u0261\u0263\5\64\33\2\u0262\u0261\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0273\7\r\2\2\u0265\u0269\7\f"+
		"\2\2\u0266\u0267\5\64\33\2\u0267\u0268\7\6\2\2\u0268\u026a\3\2\2\2\u0269"+
		"\u0266\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\5,"+
		"\27\2\u026c\u026d\7\25\2\2\u026d\u026e\7\26\2\2\u026e\u026f\7\27\2\2\u026f"+
		"\u0270\7\r\2\2\u0270\u0273\3\2\2\2\u0271\u0273\58\35\2\u0272\u0260\3\2"+
		"\2\2\u0272\u0265\3\2\2\2\u0272\u0271\3\2\2\2\u0273\67\3\2\2\2\u0274\u0275"+
		"\7\17\2\2\u0275\u0276\5D#\2\u0276\u0277\7\20\2\2\u0277\u027d\3\2\2\2\u0278"+
		"\u0279\7\17\2\2\u0279\u027a\5:\36\2\u027a\u027b\7\20\2\2\u027b\u027d\3"+
		"\2\2\2\u027c\u0274\3\2\2\2\u027c\u0278\3\2\2\2\u027d9\3\2\2\2\u027e\u0283"+
		"\5<\37\2\u027f\u0280\7I\2\2\u0280\u0282\5<\37\2\u0281\u027f\3\2\2\2\u0282"+
		"\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0287\3\2"+
		"\2\2\u0285\u0283\3\2\2\2\u0286\u0288\5> \2\u0287\u0286\3\2\2\2\u0287\u0288"+
		"\3\2\2\2\u0288;\3\2\2\2\u0289\u02a4\5\u0086D\2\u028a\u028c\5|?\2\u028b"+
		"\u028a\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0292\t\3\2\2\u0291"+
		"\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u02a4\5\u009c"+
		"O\2\u0294\u0296\5|?\2\u0295\u0294\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029d\3\2\2\2\u0299\u0297\3\2\2\2\u029a"+
		"\u029c\5v<\2\u029b\u029a\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2"+
		"\2\u029d\u029e\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a4"+
		"\5\u00a6T\2\u02a1\u02a4\5*\26\2\u02a2\u02a4\3\2\2\2\u02a3\u0289\3\2\2"+
		"\2\u02a3\u028d\3\2\2\2\u02a3\u0297\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a2"+
		"\3\2\2\2\u02a4=\3\2\2\2\u02a5\u02b6\5*\26\2\u02a6\u02b1\5p9\2\u02a7\u02a9"+
		"\7\30\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2"+
		"\u02aa\u02ad\7F\2\2\u02ab\u02ad\7\26\2\2\u02ac\u02a8\3\2\2\2\u02ac\u02ab"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\7\25\2\2\u02af\u02b1\5\26\f\2"+
		"\u02b0\u02a6\3\2\2\2\u02b0\u02ac\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3"+
		"\7\13\2\2\u02b3\u02b4\5:\36\2\u02b4\u02b6\3\2\2\2\u02b5\u02a5\3\2\2\2"+
		"\u02b5\u02b0\3\2\2\2\u02b6?\3\2\2\2\u02b7\u02bc\5B\"\2\u02b8\u02b9\7I"+
		"\2\2\u02b9\u02bb\5B\"\2\u02ba\u02b8\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc"+
		"\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bdA\3\2\2\2\u02be\u02bc\3\2\2\2"+
		"\u02bf\u02c0\5L\'\2\u02c0\u02c1\7+\2\2\u02c1\u02cd\5(\25\2\u02c2\u02c4"+
		"\7I\2\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"\u02cc\5H%\2\u02c6\u02c7\7I\2\2\u02c7\u02c8\5L\'\2\u02c8\u02c9\7%\2\2"+
		"\u02c9\u02ca\5(\25\2\u02ca\u02cc\3\2\2\2\u02cb\u02c3\3\2\2\2\u02cb\u02c6"+
		"\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"C\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d2\5F$\2\u02d1\u02d0\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4E\3\2\2\2"+
		"\u02d5\u02d6\7,\2\2\u02d6\u02d8\5J&\2\u02d7\u02d9\5H%\2\u02d8\u02d7\3"+
		"\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\7\13\2\2\u02db"+
		"\u02dc\5:\36\2\u02dcG\3\2\2\2\u02dd\u02de\7\31\2\2\u02de\u02df\5,\27\2"+
		"\u02dfI\3\2\2\2\u02e0\u02e5\5L\'\2\u02e1\u02e2\7-\2\2\u02e2\u02e4\5L\'"+
		"\2\u02e3\u02e1\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6"+
		"\3\2\2\2\u02e6K\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02e9\7G\2\2\u02e9\u02ea"+
		"\7\25\2\2\u02ea\u02f0\5$\23\2\u02eb\u02ec\7\26\2\2\u02ec\u02ed\7\25\2"+
		"\2\u02ed\u02f0\5$\23\2\u02ee\u02f0\5N(\2\u02ef\u02e8\3\2\2\2\u02ef\u02eb"+
		"\3\2\2\2\u02ef\u02ee\3\2\2\2\u02f0M\3\2\2\2\u02f1\u02f4\7G\2\2\u02f2\u02f3"+
		"\7.\2\2\u02f3\u02f5\5P)\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f8\3\2\2\2\u02f6\u02f8\5P)\2\u02f7\u02f1\3\2\2\2\u02f7\u02f6\3\2\2"+
		"\2\u02f8O\3\2\2\2\u02f9\u0303\5R*\2\u02fa\u02ff\5R*\2\u02fb\u02fc\7F\2"+
		"\2\u02fc\u02fe\5R*\2\u02fd\u02fb\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0302"+
		"\u02f9\3\2\2\2\u0302\u02fa\3\2\2\2\u0303Q\3\2\2\2\u0304\u0323\7\26\2\2"+
		"\u0305\u0323\7G\2\2\u0306\u0323\5\2\2\2\u0307\u030c\5\b\5\2\u0308\u0309"+
		"\7\f\2\2\u0309\u030a\5T+\2\u030a\u030b\7\r\2\2\u030b\u030d\3\2\2\2\u030c"+
		"\u0308\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0323\3\2\2\2\u030e\u030f\5\b"+
		"\5\2\u030f\u0313\7\f\2\2\u0310\u0311\5T+\2\u0311\u0312\7\6\2\2\u0312\u0314"+
		"\3\2\2\2\u0313\u0310\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0317\3\2\2\2\u0315"+
		"\u0316\7G\2\2\u0316\u0318\7.\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2"+
		"\2\u0318\u0319\3\2\2\2\u0319\u031a\7\26\2\2\u031a\u031b\7\27\2\2\u031b"+
		"\u031c\7\r\2\2\u031c\u0323\3\2\2\2\u031d\u031f\7\f\2\2\u031e\u0320\5T"+
		"+\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321"+
		"\u0323\7\r\2\2\u0322\u0304\3\2\2\2\u0322\u0305\3\2\2\2\u0322\u0306\3\2"+
		"\2\2\u0322\u0307\3\2\2\2\u0322\u030e\3\2\2\2\u0322\u031d\3\2\2\2\u0323"+
		"S\3\2\2\2\u0324\u0329\5J&\2\u0325\u0326\7\6\2\2\u0326\u0328\5T+\2\u0327"+
		"\u0325\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2"+
		"\2\2\u032a\u0333\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032e\7\26\2\2\u032d"+
		"\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0324\3\2\2\2\u0332"+
		"\u032f\3\2\2\2\u0333U\3\2\2\2\u0334\u0335\7\t\2\2\u0335\u033a\5Z.\2\u0336"+
		"\u0337\7\6\2\2\u0337\u0339\5Z.\2\u0338\u0336\3\2\2\2\u0339\u033c\3\2\2"+
		"\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033a"+
		"\3\2\2\2\u033d\u033e\7\n\2\2\u033eW\3\2\2\2\u033f\u0340\7\t\2\2\u0340"+
		"\u0345\5\\/\2\u0341\u0342\7\6\2\2\u0342\u0344\5\\/\2\u0343\u0341\3\2\2"+
		"\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348"+
		"\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u0349\7\n\2\2\u0349Y\3\2\2\2\u034a"+
		"\u034c\5|?\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2"+
		"\2\u034d\u034f\t\4\2\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350"+
		"\3\2\2\2\u0350\u0351\5\\/\2\u0351[\3\2\2\2\u0352\u0354\t\5\2\2\u0353\u0355"+
		"\5V,\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0358\3\2\2\2\u0356"+
		"\u0357\7/\2\2\u0357\u0359\5\f\7\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2"+
		"\2\2\u0359\u035c\3\2\2\2\u035a\u035b\7\60\2\2\u035b\u035d\5\f\7\2\u035c"+
		"\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0362\3\2\2\2\u035e\u035f\7\61"+
		"\2\2\u035f\u0361\5\f\7\2\u0360\u035e\3\2\2\2\u0361\u0364\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0369\3\2\2\2\u0364\u0362\3\2"+
		"\2\2\u0365\u0366\7\25\2\2\u0366\u0368\5\f\7\2\u0367\u0365\3\2\2\2\u0368"+
		"\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a]\3\2\2\2"+
		"\u036b\u0369\3\2\2\2\u036c\u036e\5`\61\2\u036d\u036c\3\2\2\2\u036e\u0371"+
		"\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0377\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0372\u0373\7\f\2\2\u0373\u0374\7\30\2\2\u0374\u0375\5"+
		"b\62\2\u0375\u0376\7\r\2\2\u0376\u0378\3\2\2\2\u0377\u0372\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378_\3\2\2\2\u0379\u037b\7\f\2\2\u037a\u037c\5b\62\2"+
		"\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e"+
		"\7\r\2\2\u037ea\3\2\2\2\u037f\u0384\5d\63\2\u0380\u0381\7\6\2\2\u0381"+
		"\u0383\5d\63\2\u0382\u0380\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385c\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0389"+
		"\5|?\2\u0388\u0387\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u0390\7F"+
		"\2\2\u038e\u038f\7\25\2\2\u038f\u0391\5f\64\2\u0390\u038e\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0393\7%\2\2\u0393\u0395\5(\25"+
		"\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395e\3\2\2\2\u0396\u039d"+
		"\5\f\7\2\u0397\u0398\7\13\2\2\u0398\u039d\5\f\7\2\u0399\u039a\5\f\7\2"+
		"\u039a\u039b\7\27\2\2\u039b\u039d\3\2\2\2\u039c\u0396\3\2\2\2\u039c\u0397"+
		"\3\2\2\2\u039c\u0399\3\2\2\2\u039dg\3\2\2\2\u039e\u03a0\5j\66\2\u039f"+
		"\u039e\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2"+
		"\2\2\u03a2\u03a9\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03a5\7\f\2\2\u03a5"+
		"\u03a6\7\30\2\2\u03a6\u03a7\5l\67\2\u03a7\u03a8\7\r\2\2\u03a8\u03aa\3"+
		"\2\2\2\u03a9\u03a4\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aai\3\2\2\2\u03ab\u03ad"+
		"\7\f\2\2\u03ac\u03ae\5l\67\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03b0\7\r\2\2\u03b0k\3\2\2\2\u03b1\u03b6\5n8\2\u03b2"+
		"\u03b3\7\6\2\2\u03b3\u03b5\5n8\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8\3\2\2"+
		"\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7m\3\2\2\2\u03b8\u03b6"+
		"\3\2\2\2\u03b9\u03bb\5|?\2\u03ba\u03b9\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc"+
		"\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03c2\3\2\2\2\u03be\u03bc\3\2"+
		"\2\2\u03bf\u03c1\5t;\2\u03c0\u03bf\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0"+
		"\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5"+
		"\u03c7\t\6\2\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2"+
		"\2\2\u03c8\u03c9\7F\2\2\u03c9\u03ca\7\25\2\2\u03ca\u03cd\5f\64\2\u03cb"+
		"\u03cc\7%\2\2\u03cc\u03ce\5(\25\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2"+
		"\2\2\u03ceo\3\2\2\2\u03cf\u03d0\7\f\2\2\u03d0\u03d5\5r:\2\u03d1\u03d2"+
		"\7\6\2\2\u03d2\u03d4\5r:\2\u03d3\u03d1\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5"+
		"\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d5\3\2"+
		"\2\2\u03d8\u03d9\7\r\2\2\u03d9q\3\2\2\2\u03da\u03dd\t\5\2\2\u03db\u03dc"+
		"\7\25\2\2\u03dc\u03de\5\f\7\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2"+
		"\u03des\3\2\2\2\u03df\u03e3\5v<\2\u03e0\u03e3\5x=\2\u03e1\u03e3\7\63\2"+
		"\2\u03e2\u03df\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3u"+
		"\3\2\2\2\u03e4\u03e5\t\7\2\2\u03e5w\3\2\2\2\u03e6\u03e8\t\b\2\2\u03e7"+
		"\u03e9\5z>\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9y\3\2\2\2\u03ea"+
		"\u03eb\7\t\2\2\u03eb\u03ec\t\t\2\2\u03ec\u03ed\7\n\2\2\u03ed{\3\2\2\2"+
		"\u03ee\u03ef\7.\2\2\u03ef\u03f3\5\32\16\2\u03f0\u03f2\5\66\34\2\u03f1"+
		"\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2"+
		"\2\2\u03f4}\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f7\7.\2\2\u03f7\u03f8"+
		"\5\32\16\2\u03f8\u03f9\5\66\34\2\u03f9\177\3\2\2\2\u03fa\u03fc\7\17\2"+
		"\2\u03fb\u03fd\5\u0084C\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u03fe\3\2\2\2\u03fe\u0403\5\u0082B\2\u03ff\u0400\7I\2\2\u0400\u0402\5"+
		"\u0082B\2\u0401\u03ff\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2"+
		"\u0403\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u0407"+
		"\7\20\2\2\u0407\u0081\3\2\2\2\u0408\u0426\5\u0086D\2\u0409\u040b\5|?\2"+
		"\u040a\u0409\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d"+
		"\3\2\2\2\u040d\u0412\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0411\5t;\2\u0410"+
		"\u040f\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2"+
		"\2\2\u0413\u0415\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0426\5\u009cO\2\u0416"+
		"\u0418\5|?\2\u0417\u0416\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2"+
		"\2\u0419\u041a\3\2\2\2\u041a\u041f\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041e"+
		"\5t;\2\u041d\u041c\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u0422\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0426\5\u008e"+
		"H\2\u0423\u0426\5(\25\2\u0424\u0426\3\2\2\2\u0425\u0408\3\2\2\2\u0425"+
		"\u040c\3\2\2\2\u0425\u0419\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0424\3\2"+
		"\2\2\u0426\u0083\3\2\2\2\u0427\u042a\7F\2\2\u0428\u0429\7\25\2\2\u0429"+
		"\u042b\5\f\7\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2"+
		"\2\2\u042c\u0433\7\13\2\2\u042d\u042e\7\7\2\2\u042e\u042f\7\25\2\2\u042f"+
		"\u0430\5\f\7\2\u0430\u0431\7\13\2\2\u0431\u0433\3\2\2\2\u0432\u0427\3"+
		"\2\2\2\u0432\u042d\3\2\2\2\u0433\u0085\3\2\2\2\u0434\u0435\79\2\2\u0435"+
		"\u043a\5\u0088E\2\u0436\u0437\7\6\2\2\u0437\u0439\5\u0088E\2\u0438\u0436"+
		"\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u0087\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u043e\5\b\5\2\u043e\u0442\7\5"+
		"\2\2\u043f\u0443\7F\2\2\u0440\u0443\7\26\2\2\u0441\u0443\5\u008aF\2\u0442"+
		"\u043f\3\2\2\2\u0442\u0440\3\2\2\2\u0442\u0441\3\2\2\2\u0443\u0089\3\2"+
		"\2\2\u0444\u044a\7\17\2\2\u0445\u0446\5\u008cG\2\u0446\u0447\7\6\2\2\u0447"+
		"\u0449\3\2\2\2\u0448\u0445\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2"+
		"\2\2\u044a\u044b\3\2\2\2\u044b\u044f\3\2\2\2\u044c\u044a\3\2\2\2\u044d"+
		"\u0450\5\u008cG\2\u044e\u0450\7\26\2\2\u044f\u044d\3\2\2\2\u044f\u044e"+
		"\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\7\20\2\2\u0452\u008b\3\2\2\2"+
		"\u0453\u0458\7F\2\2\u0454\u0455\7\13\2\2\u0455\u0459\7F\2\2\u0456\u0457"+
		"\7\13\2\2\u0457\u0459\7\26\2\2\u0458\u0454\3\2\2\2\u0458\u0456\3\2\2\2"+
		"\u0459\u008d\3\2\2\2\u045a\u045b\7\22\2\2\u045b\u0463\5\u0090I\2\u045c"+
		"\u045d\7\62\2\2\u045d\u0463\5\u0092J\2\u045e\u045f\7:\2\2\u045f\u0463"+
		"\5\u0094K\2\u0460\u0461\7\21\2\2\u0461\u0463\5\u0098M\2\u0462\u045a\3"+
		"\2\2\2\u0462\u045c\3\2\2\2\u0462\u045e\3\2\2\2\u0462\u0460\3\2\2\2\u0463"+
		"\u008f\3\2\2\2\u0464\u0465\5\6\4\2\u0465\u0466\7\25\2\2\u0466\u0467\5"+
		"\f\7\2\u0467\u0091\3\2\2\2\u0468\u0469\5\6\4\2\u0469\u046a\7\25\2\2\u046a"+
		"\u046b\5\f\7\2\u046b\u0093\3\2\2\2\u046c\u046f\5\u0096L\2\u046d\u046e"+
		"\7\25\2\2\u046e\u0470\5\f\7\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2"+
		"\u0470\u0095\3\2\2\2\u0471\u0473\7F\2\2\u0472\u0474\5X-\2\u0473\u0472"+
		"\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\5^\60\2\u0476"+
		"\u0097\3\2\2\2\u0477\u0479\7F\2\2\u0478\u047a\5V,\2\u0479\u0478\3\2\2"+
		"\2\u0479\u047a\3\2\2\2\u047a\u047d\3\2\2\2\u047b\u047c\7/\2\2\u047c\u047e"+
		"\5\f\7\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0481\3\2\2\2\u047f"+
		"\u0480\7\60\2\2\u0480\u0482\5\f\7\2\u0481\u047f\3\2\2\2\u0481\u0482\3"+
		"\2\2\2\u0482\u0099\3\2\2\2\u0483\u0484\7\22\2\2\u0484\u0488\5\u009eP\2"+
		"\u0485\u0486\7\62\2\2\u0486\u0488\5\u00a0Q\2\u0487\u0483\3\2\2\2\u0487"+
		"\u0485\3\2\2\2\u0488\u009b\3\2\2\2\u0489\u0490\5\u009aN\2\u048a\u048b"+
		"\7:\2\2\u048b\u0490\5\u00a2R\2\u048c\u048d\7\21\2\2\u048d\u0490\5\u00a4"+
		"S\2\u048e\u0490\5\u00a6T\2\u048f\u0489\3\2\2\2\u048f\u048a\3\2\2\2\u048f"+
		"\u048c\3\2\2\2\u048f\u048e\3\2\2\2\u0490\u009d\3\2\2\2\u0491\u0496\5N"+
		"(\2\u0492\u0493\7\6\2\2\u0493\u0495\5N(\2\u0494\u0492\3\2\2\2\u0495\u0498"+
		"\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u049d\3\2\2\2\u0498"+
		"\u0496\3\2\2\2\u0499\u049a\7\25\2\2\u049a\u049c\5\f\7\2\u049b\u0499\3"+
		"\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e"+
		"\u04a0\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04a1\7%\2\2\u04a1\u04a2\5(\25"+
		"\2\u04a2\u009f\3\2\2\2\u04a3\u04ab\5\u009eP\2\u04a4\u04a5\5\6\4\2\u04a5"+
		"\u04a6\7\25\2\2\u04a6\u04a7\5\f\7\2\u04a7\u04a8\7%\2\2\u04a8\u04a9\7\26"+
		"\2\2\u04a9\u04ab\3\2\2\2\u04aa\u04a3\3\2\2\2\u04aa\u04a4\3\2\2\2\u04ab"+
		"\u00a1\3\2\2\2\u04ac\u04af\5\u0096L\2\u04ad\u04ae\7\25\2\2\u04ae\u04b0"+
		"\5\f\7\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1"+
		"\u04b2\7%\2\2\u04b2\u04b3\5(\25\2\u04b3\u04c2\3\2\2\2\u04b4\u04b5\5\u0096"+
		"L\2\u04b5\u04b6\7\17\2\2\u04b6\u04b7\5:\36\2\u04b7\u04b8\7\20\2\2\u04b8"+
		"\u04c2\3\2\2\2\u04b9\u04ba\7\7\2\2\u04ba\u04bb\5`\61\2\u04bb\u04bf\5^"+
		"\60\2\u04bc\u04bd\7%\2\2\u04bd\u04c0\5\u00c0a\2\u04be\u04c0\5\u00c2b\2"+
		"\u04bf\u04bc\3\2\2\2\u04bf\u04be\3\2\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04ac"+
		"\3\2\2\2\u04c1\u04b4\3\2\2\2\u04c1\u04b9\3\2\2\2\u04c2\u00a3\3\2\2\2\u04c3"+
		"\u04c5\7F\2\2\u04c4\u04c6\5V,\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3\2\2"+
		"\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\7%\2\2\u04c8\u04c9\5\f\7\2\u04c9\u00a5"+
		"\3\2\2\2\u04ca\u04cc\7,\2\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc"+
		"\u04cd\3\2\2\2\u04cd\u04ce\7;\2\2\u04ce\u04d5\5\u00a8U\2\u04cf\u04d0\7"+
		",\2\2\u04d0\u04d1\7<\2\2\u04d1\u04d5\5\u00acW\2\u04d2\u04d3\7=\2\2\u04d3"+
		"\u04d5\5\u00aaV\2\u04d4\u04cb\3\2\2\2\u04d4\u04cf\3\2\2\2\u04d4\u04d2"+
		"\3\2\2\2\u04d5\u00a7\3\2\2\2\u04d6\u04d8\7F\2\2\u04d7\u04d9\5V,\2\u04d8"+
		"\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04dd\3\2\2\2\u04da\u04dc\5~"+
		"@\2\u04db\u04da\3\2\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e2\5x"+
		"=\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u04e4\5h\65\2\u04e4\u04e5\5\u00aeX\2\u04e5\u00a9\3\2\2\2\u04e6\u04e8"+
		"\7F\2\2\u04e7\u04e9\5V,\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04ea\3\2\2\2\u04ea\u04eb\5\u00b0Y\2\u04eb\u00ab\3\2\2\2\u04ec\u04ed"+
		"\7F\2\2\u04ed\u04ee\5\u00aeX\2\u04ee\u00ad\3\2\2\2\u04ef\u04f0\7>\2\2"+
		"\u04f0\u04f8\5\u00b2Z\2\u04f1\u04f3\7>\2\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3"+
		"\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6\5\u0080A\2\u04f5\u04f2\3\2\2"+
		"\2\u04f5\u04f6\3\2\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04ef\3\2\2\2\u04f7\u04f5"+
		"\3\2\2\2\u04f8\u00af\3\2\2\2\u04f9\u04fa\7>\2\2\u04fa\u0502\5\u00b4[\2"+
		"\u04fb\u04fd\7>\2\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe"+
		"\3\2\2\2\u04fe\u0500\5\u0080A\2\u04ff\u04fc\3\2\2\2\u04ff\u0500\3\2\2"+
		"\2\u0500\u0502\3\2\2\2\u0501\u04f9\3\2\2\2\u0501\u04ff\3\2\2\2\u0502\u00b1"+
		"\3\2\2\2\u0503\u0505\5\u00bc_\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2"+
		"\2\u0505\u0506\3\2\2\2\u0506\u0508\5\u00b6\\\2\u0507\u0509\5\u0080A\2"+
		"\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u00b3\3\2\2\2\u050a\u050c"+
		"\5\u00bc_\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3\2\2"+
		"\2\u050d\u050f\5\u00b8]\2\u050e\u0510\5\u0080A\2\u050f\u050e\3\2\2\2\u050f"+
		"\u0510\3\2\2\2\u0510\u00b5\3\2\2\2\u0511\u0516\5\u00ba^\2\u0512\u0513"+
		"\7\23\2\2\u0513\u0515\5\30\r\2\u0514\u0512\3\2\2\2\u0515\u0518\3\2\2\2"+
		"\u0516\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u00b7\3\2\2\2\u0518\u0516"+
		"\3\2\2\2\u0519\u051e\5\30\r\2\u051a\u051b\7\23\2\2\u051b\u051d\5\30\r"+
		"\2\u051c\u051a\3\2\2\2\u051d\u0520\3\2\2\2\u051e\u051c\3\2\2\2\u051e\u051f"+
		"\3\2\2\2\u051f\u00b9\3\2\2\2\u0520\u051e\3\2\2\2\u0521\u0525\5\30\r\2"+
		"\u0522\u0524\5\66\34\2\u0523\u0522\3\2\2\2\u0524\u0527\3\2\2\2\u0525\u0523"+
		"\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u00bb\3\2\2\2\u0527\u0525\3\2\2\2\u0528"+
		"\u0531\7\17\2\2\u0529\u052e\5\u00be`\2\u052a\u052b\7I\2\2\u052b\u052d"+
		"\5\u00be`\2\u052c\u052a\3\2\2\2\u052d\u0530\3\2\2\2\u052e\u052c\3\2\2"+
		"\2\u052e\u052f\3\2\2\2\u052f\u0532\3\2\2\2\u0530\u052e\3\2\2\2\u0531\u0529"+
		"\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\7\20\2\2"+
		"\u0534\u0535\7\23\2\2\u0535\u00bd\3\2\2\2\u0536\u0538\5|?\2\u0537\u0536"+
		"\3\2\2\2\u0538\u053b\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"\u053f\3\2\2\2\u053b\u0539\3\2\2\2\u053c\u053e\5t;\2\u053d\u053c\3\2\2"+
		"\2\u053e\u0541\3\2\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0542"+
		"\3\2\2\2\u0541\u053f\3\2\2\2\u0542\u0543\5\u009aN\2\u0543\u00bf\3\2\2"+
		"\2\u0544\u0547\5\u00c4c\2\u0545\u0547\5\u00c2b\2\u0546\u0544\3\2\2\2\u0546"+
		"\u0545\3\2\2\2\u0547\u00c1\3\2\2\2\u0548\u0549\7\17\2\2\u0549\u054e\5"+
		"\u00c4c\2\u054a\u054b\7I\2\2\u054b\u054d\5<\37\2\u054c\u054a\3\2\2\2\u054d"+
		"\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0551\3\2"+
		"\2\2\u0550\u054e\3\2\2\2\u0551\u0552\7\20\2\2\u0552\u00c3\3\2\2\2\u0553"+
		"\u0555\7\7\2\2\u0554\u0556\5\66\34\2\u0555\u0554\3\2\2\2\u0556\u0557\3"+
		"\2\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u00c5\3\2\2\2\u0559"+
		"\u055e\5\u00c8e\2\u055a\u055b\7I\2\2\u055b\u055d\5\u00c8e\2\u055c\u055a"+
		"\3\2\2\2\u055d\u0560\3\2\2\2\u055e\u055c\3\2\2\2\u055e\u055f\3\2\2\2\u055f"+
		"\u00c7\3\2\2\2\u0560\u055e\3\2\2\2\u0561\u0563\5|?\2\u0562\u0561\3\2\2"+
		"\2\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u056a"+
		"\3\2\2\2\u0566\u0564\3\2\2\2\u0567\u0569\5t;\2\u0568\u0567\3\2\2\2\u0569"+
		"\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2"+
		"\2\2\u056c\u056a\3\2\2\2\u056d\u0573\5\u00a6T\2\u056e\u0573\5\u0086D\2"+
		"\u056f\u0573\5\u00caf\2\u0570\u0573\5\u00ccg\2\u0571\u0573\3\2\2\2\u0572"+
		"\u0564\3\2\2\2\u0572\u056e\3\2\2\2\u0572\u056f\3\2\2\2\u0572\u0570\3\2"+
		"\2\2\u0572\u0571\3\2\2\2\u0573\u00c9\3\2\2\2\u0574\u0575\7?\2\2\u0575"+
		"\u0576\5\4\3\2\u0576\u0577\7\17\2\2\u0577\u0578\5\u00c6d\2\u0578\u0579"+
		"\7\20\2\2\u0579\u00cb\3\2\2\2\u057a\u057b\7?\2\2\u057b\u057c\7<\2\2\u057c"+
		"\u057d\5\u00acW\2\u057d\u00cd\3\2\2\2\u057e\u057f\7?\2\2\u057f\u0580\5"+
		"\4\3\2\u0580\u0581\7I\2\2\u0581\u0583\3\2\2\2\u0582\u057e\3\2\2\2\u0583"+
		"\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\3\2"+
		"\2\2\u0586\u0584\3\2\2\2\u0587\u0588\5\u00c6d\2\u0588\u00cf\3\2\2\2\u00be"+
		"\u00d1\u00d5\u00dd\u00e4\u00ec\u00f2\u00f5\u00fb\u00ff\u0103\u010f\u0111"+
		"\u011a\u011d\u0120\u0129\u0132\u0139\u0141\u0145\u0148\u014e\u0156\u0159"+
		"\u0161\u0168\u016a\u0176\u017f\u0188\u0192\u0197\u019b\u019f\u01a4\u01ac"+
		"\u01b0\u01be\u01c5\u01c9\u01ce\u01de\u01e1\u01e9\u01ee\u01f3\u01f5\u020c"+
		"\u0210\u021a\u021e\u0223\u0228\u022a\u0231\u0237\u023d\u0240\u0248\u024b"+
		"\u024f\u0255\u025d\u0262\u0269\u0272\u027c\u0283\u0287\u028d\u0291\u0297"+
		"\u029d\u02a3\u02a8\u02ac\u02b0\u02b5\u02bc\u02c3\u02cb\u02cd\u02d3\u02d8"+
		"\u02e5\u02ef\u02f4\u02f7\u02ff\u0302\u030c\u0313\u0317\u031f\u0322\u0329"+
		"\u032f\u0332\u033a\u0345\u034b\u034e\u0354\u0358\u035c\u0362\u0369\u036f"+
		"\u0377\u037b\u0384\u038a\u0390\u0394\u039c\u03a1\u03a9\u03ad\u03b6\u03bc"+
		"\u03c2\u03c6\u03cd\u03d5\u03dd\u03e2\u03e8\u03f3\u03fc\u0403\u040c\u0412"+
		"\u0419\u041f\u0425\u042a\u0432\u043a\u0442\u044a\u044f\u0458\u0462\u046f"+
		"\u0473\u0479\u047d\u0481\u0487\u048f\u0496\u049d\u04aa\u04af\u04bf\u04c1"+
		"\u04c5\u04cb\u04d4\u04d8\u04dd\u04e1\u04e8\u04f2\u04f5\u04f7\u04fc\u04ff"+
		"\u0501\u0504\u0508\u050b\u050f\u0516\u051e\u0525\u052e\u0531\u0539\u053f"+
		"\u0546\u054e\u0557\u055e\u0564\u056a\u0572\u0584";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}