// Generated from CPLangLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, FI=2, ELSE=3, THEN=4, TRUE=5, FALSE=6, OPEN_PARANTHESIS=7, CLOSE_PARANTHESIS=8, 
		OPEN_PARANTHESIS2=9, CLOSE_PARANTHESIS2=10, SEMI_COLUMN=11, COMMA=12, 
		ASSIGN=13, EQUAL=14, PLUS=15, MULTIPLY=16, INT=17, ID=18, TYPE=19, REAL=20, 
		STRING=21, LINE_COMMENT=22, WS=23, BLOCK_COMMENT_EOF=24, BLOCK_COMMENT_END=25, 
		LETTERS=26, BLOCK_COMMENT_OPEN=27;
	public static final int
		IN_COMMENT=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_COMMENT"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "FI", "ELSE", "THEN", "TRUE", "FALSE", "OPEN_PARANTHESIS", "CLOSE_PARANTHESIS", 
			"OPEN_PARANTHESIS2", "CLOSE_PARANTHESIS2", "SEMI_COLUMN", "COMMA", "ASSIGN", 
			"EQUAL", "PLUS", "MULTIPLY", "DIGIT", "INT", "LETTER", "ID", "TYPE", 
			"DIGITS", "FRACTION", "EXPONENT", "REAL", "STRING", "LINE_COMMENT", "WS", 
			"BLOCK_COMMENT_OPEN", "BLOCK_COMMENT_OPEN2", "BLOCK_COMMENT_EOF", "BLOCK_COMMENT_END", 
			"LETTERS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'fi'", "'else'", "'then'", "'true'", "'false'", "'('", 
			"')'", "'{'", "'}'", "';'", "','", "'='", "'=='", "'+'", "'*'", null, 
			null, null, null, null, null, null, null, "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "FI", "ELSE", "THEN", "TRUE", "FALSE", "OPEN_PARANTHESIS", 
			"CLOSE_PARANTHESIS", "OPEN_PARANTHESIS2", "CLOSE_PARANTHESIS2", "SEMI_COLUMN", 
			"COMMA", "ASSIGN", "EQUAL", "PLUS", "MULTIPLY", "INT", "ID", "TYPE", 
			"REAL", "STRING", "LINE_COMMENT", "WS", "BLOCK_COMMENT_EOF", "BLOCK_COMMENT_END", 
			"LETTERS", "BLOCK_COMMENT_OPEN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CPLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CPLangLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			BLOCK_COMMENT_EOF_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.println("there are no strings in CPLang, but shhh.."); 
			break;
		}
	}
	private void BLOCK_COMMENT_EOF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("EOF in comment");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00e2\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4"+
		" \t \4!\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\6\23z\n\23\r\23\16\23{\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\7\25\u0084\n\25\f\25\16\25\u0087\13\25\3\26\3\26\3\26\3\26\7"+
		"\26\u008d\n\26\f\26\16\26\u0090\13\26\3\27\6\27\u0093\n\27\r\27\16\27"+
		"\u0094\3\30\3\30\5\30\u0099\n\30\3\31\3\31\5\31\u009d\n\31\3\31\5\31\u00a0"+
		"\n\31\3\32\3\32\3\32\3\32\5\32\u00a6\n\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\7\33\u00ae\n\33\f\33\16\33\u00b1\13\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\7\34\u00ba\n\34\f\34\16\34\u00bd\13\34\3\34\3\34\3\34\3\34\3\35"+
		"\6\35\u00c4\n\35\r\35\16\35\u00c5\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\4\u00af\u00bb\2#\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f"+
		"\30\r\32\16\34\17\36\20 \21\"\22$\2&\23(\2*\24,\25.\2\60\2\62\2\64\26"+
		"\66\278\30:\31<\35>\2@\32B\33D\34\4\2\3\b\3\2\62;\4\2C\\c|\3\2c|\3\2C"+
		"\\\4\2--//\5\2\13\f\17\17\"\"\2\u00eb\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2"+
		"\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2"+
		"\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3"+
		"\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2&\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2\64\3"+
		"\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\3>\3\2\2\2\3@\3\2"+
		"\2\2\3B\3\2\2\2\3D\3\2\2\2\4F\3\2\2\2\6I\3\2\2\2\bL\3\2\2\2\nQ\3\2\2\2"+
		"\fV\3\2\2\2\16[\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24e\3\2\2\2\26g\3\2\2"+
		"\2\30i\3\2\2\2\32k\3\2\2\2\34m\3\2\2\2\36o\3\2\2\2 r\3\2\2\2\"t\3\2\2"+
		"\2$v\3\2\2\2&y\3\2\2\2(}\3\2\2\2*\177\3\2\2\2,\u0088\3\2\2\2.\u0092\3"+
		"\2\2\2\60\u0096\3\2\2\2\62\u009f\3\2\2\2\64\u00a5\3\2\2\2\66\u00a9\3\2"+
		"\2\28\u00b5\3\2\2\2:\u00c3\3\2\2\2<\u00c9\3\2\2\2>\u00cf\3\2\2\2@\u00d5"+
		"\3\2\2\2B\u00d9\3\2\2\2D\u00de\3\2\2\2FG\7k\2\2GH\7h\2\2H\5\3\2\2\2IJ"+
		"\7h\2\2JK\7k\2\2K\7\3\2\2\2LM\7g\2\2MN\7n\2\2NO\7u\2\2OP\7g\2\2P\t\3\2"+
		"\2\2QR\7v\2\2RS\7j\2\2ST\7g\2\2TU\7p\2\2U\13\3\2\2\2VW\7v\2\2WX\7t\2\2"+
		"XY\7w\2\2YZ\7g\2\2Z\r\3\2\2\2[\\\7h\2\2\\]\7c\2\2]^\7n\2\2^_\7u\2\2_`"+
		"\7g\2\2`\17\3\2\2\2ab\7*\2\2b\21\3\2\2\2cd\7+\2\2d\23\3\2\2\2ef\7}\2\2"+
		"f\25\3\2\2\2gh\7\177\2\2h\27\3\2\2\2ij\7=\2\2j\31\3\2\2\2kl\7.\2\2l\33"+
		"\3\2\2\2mn\7?\2\2n\35\3\2\2\2op\7?\2\2pq\7?\2\2q\37\3\2\2\2rs\7-\2\2s"+
		"!\3\2\2\2tu\7,\2\2u#\3\2\2\2vw\t\2\2\2w%\3\2\2\2xz\5$\22\2yx\3\2\2\2z"+
		"{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\'\3\2\2\2}~\t\3\2\2~)\3\2\2\2\177\u0085"+
		"\t\4\2\2\u0080\u0084\5(\24\2\u0081\u0084\7a\2\2\u0082\u0084\5$\22\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086+\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008e\t\5\2\2\u0089\u008d\5(\24\2\u008a\u008d\7a\2\2\u008b"+
		"\u008d\5$\22\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"-\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\5$\22\2\u0092\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095/\3"+
		"\2\2\2\u0096\u0098\7\60\2\2\u0097\u0099\5.\27\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\61\3\2\2\2\u009a\u009c\7g\2\2\u009b\u009d\t\6\2\2"+
		"\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0"+
		"\5.\27\2\u009f\u009a\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\63\3\2\2\2\u00a1"+
		"\u00a2\5.\27\2\u00a2\u00a3\5\60\30\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6\5"+
		"\60\30\2\u00a5\u00a1\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\5\62\31\2\u00a8\65\3\2\2\2\u00a9\u00af\7$\2\2\u00aa\u00ab\7^\2"+
		"\2\u00ab\u00ae\7$\2\2\u00ac\u00ae\13\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ac"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3\u00b4\b\33"+
		"\2\2\u00b4\67\3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b7\7\61\2\2\u00b7"+
		"\u00bb\3\2\2\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\34"+
		"\3\2\u00c19\3\2\2\2\u00c2\u00c4\t\7\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\b\35\3\2\u00c8;\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7,\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\36\4\2\u00cd\u00ce\b\36\5\2\u00ce="+
		"\3\2\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00d1\7,\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\b\37\4\2\u00d3\u00d4\b\37\5\2\u00d4?\3\2\2\2\u00d5\u00d6\13\2\2"+
		"\2\u00d6\u00d7\7\2\2\3\u00d7\u00d8\b \6\2\u00d8A\3\2\2\2\u00d9\u00da\7"+
		",\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b!\7\2\u00dd"+
		"C\3\2\2\2\u00de\u00df\13\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\"\3\2"+
		"\u00e1E\3\2\2\2\22\2\3{\u0083\u0085\u008c\u008e\u0094\u0098\u009c\u009f"+
		"\u00a5\u00ad\u00af\u00bb\u00c5\b\3\33\2\b\2\2\7\3\2\5\2\2\3 \3\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}