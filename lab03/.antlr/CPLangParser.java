// Generated from /home/daniel/cpl/lab03/CPLangParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, FI=4, BOOL=5, TYPE=6, ID=7, INT=8, FLOAT=9, STRING=10, 
		SEMI=11, COMMA=12, ASSIGN=13, LPAREN=14, RPAREN=15, LBRACE=16, RBRACE=17, 
		PLUS=18, MINUS=19, MULT=20, DIV=21, EQUAL=22, LT=23, LE=24, LINE_COMMENT=25, 
		BLOCK_COMMENT=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_definition_without_assign = 1, RULE_definition = 2, 
		RULE_expr = 3;
	public static final String[] ruleNames = {
		"prog", "definition_without_assign", "definition", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'then'", "'else'", "'fi'", null, null, null, null, null, 
		null, "';'", "','", "'='", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", 
		"'/'", "'=='", "'<'", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "THEN", "ELSE", "FI", "BOOL", "TYPE", "ID", "INT", "FLOAT", 
		"STRING", "SEMI", "COMMA", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"PLUS", "MINUS", "MULT", "DIV", "EQUAL", "LT", "LE", "LINE_COMMENT", "BLOCK_COMMENT", 
		"WS"
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
	public String getGrammarFileName() { return "CPLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPLangParser.EOF, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CPLangParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CPLangParser.SEMI, i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << BOOL) | (1L << TYPE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << LPAREN) | (1L << MINUS))) != 0)) {
				{
				{
				setState(10);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(8);
					definition();
					}
					break;
				case IF:
				case BOOL:
				case ID:
				case INT:
				case FLOAT:
				case LPAREN:
				case MINUS:
					{
					setState(9);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(12);
				match(SEMI);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(EOF);
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

	public static class Definition_without_assignContext extends ParserRuleContext {
		public Definition_without_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_without_assign; }
	 
		public Definition_without_assignContext() { }
		public void copyFrom(Definition_without_assignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VardefContext extends Definition_without_assignContext {
		public TerminalNode TYPE() { return getToken(CPLangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(CPLangParser.ID, 0); }
		public VardefContext(Definition_without_assignContext ctx) { copyFrom(ctx); }
	}

	public final Definition_without_assignContext definition_without_assign() throws RecognitionException {
		Definition_without_assignContext _localctx = new Definition_without_assignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition_without_assign);
		try {
			_localctx = new VardefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(TYPE);
			setState(22);
			match(ID);
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

	public static class DefinitionContext extends ParserRuleContext {
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	 
		public DefinitionContext() { }
		public void copyFrom(DefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarassignContext extends DefinitionContext {
		public Definition_without_assignContext definition_without_assign() {
			return getRuleContext(Definition_without_assignContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CPLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarassignContext(DefinitionContext ctx) { copyFrom(ctx); }
	}
	public static class MethoddefContext extends DefinitionContext {
		public TerminalNode TYPE() { return getToken(CPLangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(CPLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CPLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CPLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CPLangParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CPLangParser.RBRACE, 0); }
		public List<Definition_without_assignContext> definition_without_assign() {
			return getRuleContexts(Definition_without_assignContext.class);
		}
		public Definition_without_assignContext definition_without_assign(int i) {
			return getRuleContext(Definition_without_assignContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CPLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CPLangParser.COMMA, i);
		}
		public MethoddefContext(DefinitionContext ctx) { copyFrom(ctx); }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VarassignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				definition_without_assign();
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(25);
					match(ASSIGN);
					setState(26);
					expr(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new MethoddefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(TYPE);
				setState(30);
				match(ID);
				setState(31);
				match(LPAREN);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(32);
					definition_without_assign();
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(33);
						match(COMMA);
						setState(34);
						definition_without_assign();
						}
						}
						setState(39);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(42);
				match(RPAREN);
				setState(43);
				match(LBRACE);
				setState(44);
				expr(0);
				setState(45);
				match(RBRACE);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CPLangParser.PLUS, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MinusunarContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(CPLangParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MinusunarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(CPLangParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SubtractContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(CPLangParser.MINUS, 0); }
		public SubtractContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessthenContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(CPLangParser.LT, 0); }
		public LessthenContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParantContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(CPLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CPLangParser.RPAREN, 0); }
		public ParantContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(CPLangParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(CPLangParser.EQUAL, 0); }
		public EqContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(CPLangParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MethodcallContext extends ExprContext {
		public TerminalNode ID() { return getToken(CPLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CPLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CPLangParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CPLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CPLangParser.COMMA, i);
		}
		public MethodcallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessequalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(CPLangParser.LE, 0); }
		public LessequalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivideContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(CPLangParser.DIV, 0); }
		public DivideContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(CPLangParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplyContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CPLangParser.MULT, 0); }
		public MultiplyContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IfContext extends ExprContext {
		public ExprContext cond;
		public ExprContext thenBranch;
		public ExprContext elseBranch;
		public TerminalNode IF() { return getToken(CPLangParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CPLangParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CPLangParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CPLangParser.FI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(CPLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CPLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new MethodcallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(50);
				match(ID);
				setState(51);
				match(LPAREN);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << LPAREN) | (1L << MINUS))) != 0)) {
					{
					setState(52);
					expr(0);
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(53);
						match(COMMA);
						setState(54);
						expr(0);
						}
						}
						setState(59);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(62);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(IF);
				setState(64);
				((IfContext)_localctx).cond = expr(0);
				setState(65);
				match(THEN);
				setState(66);
				((IfContext)_localctx).thenBranch = expr(0);
				setState(67);
				match(ELSE);
				setState(68);
				((IfContext)_localctx).elseBranch = expr(0);
				setState(69);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(ID);
				setState(72);
				match(ASSIGN);
				setState(73);
				expr(10);
				}
				break;
			case 4:
				{
				_localctx = new ParantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(LPAREN);
				setState(75);
				expr(0);
				setState(76);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new MinusunarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(MINUS);
				setState(79);
				expr(8);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(INT);
				}
				break;
			case 8:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(BOOL);
				}
				break;
			case 9:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(FLOAT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(87);
						match(PLUS);
						setState(88);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(90);
						match(MULT);
						setState(91);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new SubtractContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(93);
						match(MINUS);
						setState(94);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new DivideContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(96);
						match(DIV);
						setState(97);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new EqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(99);
						match(EQUAL);
						setState(100);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new LessthenContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(102);
						match(LT);
						setState(103);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new LessequalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
						match(LE);
						setState(106);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35s\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\5\2\r\n\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4\36\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4&\n\4\f\4\16\4)\13\4\5\4+\n\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\5\5?\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5W\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5n\n\5\f\5\16\5q\13\5\3\5\2\3\b\6\2\4\6\b\2"+
		"\2\2\u0085\2\22\3\2\2\2\4\27\3\2\2\2\6\61\3\2\2\2\bV\3\2\2\2\n\r\5\6\4"+
		"\2\13\r\5\b\5\2\f\n\3\2\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\17\7\r\2\2\17"+
		"\21\3\2\2\2\20\f\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23"+
		"\25\3\2\2\2\24\22\3\2\2\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\7\b\2\2\30"+
		"\31\7\t\2\2\31\5\3\2\2\2\32\35\5\4\3\2\33\34\7\17\2\2\34\36\5\b\5\2\35"+
		"\33\3\2\2\2\35\36\3\2\2\2\36\62\3\2\2\2\37 \7\b\2\2 !\7\t\2\2!*\7\20\2"+
		"\2\"\'\5\4\3\2#$\7\16\2\2$&\5\4\3\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'("+
		"\3\2\2\2(+\3\2\2\2)\'\3\2\2\2*\"\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\21\2"+
		"\2-.\7\22\2\2./\5\b\5\2/\60\7\23\2\2\60\62\3\2\2\2\61\32\3\2\2\2\61\37"+
		"\3\2\2\2\62\7\3\2\2\2\63\64\b\5\1\2\64\65\7\t\2\2\65>\7\20\2\2\66;\5\b"+
		"\5\2\678\7\16\2\28:\5\b\5\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2"+
		"<?\3\2\2\2=;\3\2\2\2>\66\3\2\2\2>?\3\2\2\2?@\3\2\2\2@W\7\21\2\2AB\7\3"+
		"\2\2BC\5\b\5\2CD\7\4\2\2DE\5\b\5\2EF\7\5\2\2FG\5\b\5\2GH\7\6\2\2HW\3\2"+
		"\2\2IJ\7\t\2\2JK\7\17\2\2KW\5\b\5\fLM\7\20\2\2MN\5\b\5\2NO\7\21\2\2OW"+
		"\3\2\2\2PQ\7\25\2\2QW\5\b\5\nRW\7\t\2\2SW\7\n\2\2TW\7\7\2\2UW\7\13\2\2"+
		"V\63\3\2\2\2VA\3\2\2\2VI\3\2\2\2VL\3\2\2\2VP\3\2\2\2VR\3\2\2\2VS\3\2\2"+
		"\2VT\3\2\2\2VU\3\2\2\2Wo\3\2\2\2XY\f\20\2\2YZ\7\24\2\2Zn\5\b\5\21[\\\f"+
		"\17\2\2\\]\7\26\2\2]n\5\b\5\20^_\f\16\2\2_`\7\25\2\2`n\5\b\5\17ab\f\r"+
		"\2\2bc\7\27\2\2cn\5\b\5\16de\f\t\2\2ef\7\30\2\2fn\5\b\5\ngh\f\b\2\2hi"+
		"\7\31\2\2in\5\b\5\tjk\f\7\2\2kl\7\32\2\2ln\5\b\5\bmX\3\2\2\2m[\3\2\2\2"+
		"m^\3\2\2\2ma\3\2\2\2md\3\2\2\2mg\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2p\t\3\2\2\2qo\3\2\2\2\r\f\22\35\'*\61;>Vmo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}