// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IDENTIFIER=15, BINARY=16, 
		HVIDRUM=17, KOMMENTAR=18, MULTILINECOMMENTS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "IDENTIFIER", "BINARY", "HVIDRUM", 
			"KOMMENTAR", "MULTILINECOMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.update'", "'.simulate'", 
			"'='", "'.latch'", "' -> '", "'M'", "'('", "')'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENTIFIER", "BINARY", "HVIDRUM", "KOMMENTAR", "MULTILINECOMMENTS"
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0005\u000er\b\u000e\n\u000e\f\u000eu\t\u000e\u0001\u000e\u0005\u000e"+
		"x\b\u000e\n\u000e\f\u000e{\t\u000e\u0001\u000f\u0005\u000f~\b\u000f\n"+
		"\u000f\f\u000f\u0081\t\u000f\u0001\u0010\u0004\u0010\u0084\b\u0010\u000b"+
		"\u0010\f\u0010\u0085\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u008e\b\u0011\n\u0011\f\u0011\u0091\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u009b\b\u0012\n\u0012\f\u0012\u009e"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0007"+
		"\u0003\u0000AZ__az\u0002\u0000AZaz\u0001\u000001\u0002\u0000\t\n  \u0001"+
		"\u0000\n\n\u0001\u0000//\u0001\u0000**\u00aa\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000"+
		"\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000"+
		"\u0007B\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000bT\u0001"+
		"\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000\u000f]\u0001\u0000\u0000"+
		"\u0000\u0011b\u0001\u0000\u0000\u0000\u0013d\u0001\u0000\u0000\u0000\u0015"+
		"f\u0001\u0000\u0000\u0000\u0017h\u0001\u0000\u0000\u0000\u0019j\u0001"+
		"\u0000\u0000\u0000\u001bm\u0001\u0000\u0000\u0000\u001ds\u0001\u0000\u0000"+
		"\u0000\u001f\u007f\u0001\u0000\u0000\u0000!\u0083\u0001\u0000\u0000\u0000"+
		"#\u0089\u0001\u0000\u0000\u0000%\u0094\u0001\u0000\u0000\u0000\'(\u0005"+
		".\u0000\u0000()\u0005h\u0000\u0000)*\u0005a\u0000\u0000*+\u0005r\u0000"+
		"\u0000+,\u0005d\u0000\u0000,-\u0005w\u0000\u0000-.\u0005a\u0000\u0000"+
		"./\u0005r\u0000\u0000/0\u0005e\u0000\u00000\u0002\u0001\u0000\u0000\u0000"+
		"12\u0005.\u0000\u000023\u0005i\u0000\u000034\u0005n\u0000\u000045\u0005"+
		"p\u0000\u000056\u0005u\u0000\u000067\u0005t\u0000\u000078\u0005s\u0000"+
		"\u00008\u0004\u0001\u0000\u0000\u00009:\u0005.\u0000\u0000:;\u0005o\u0000"+
		"\u0000;<\u0005u\u0000\u0000<=\u0005t\u0000\u0000=>\u0005p\u0000\u0000"+
		">?\u0005u\u0000\u0000?@\u0005t\u0000\u0000@A\u0005s\u0000\u0000A\u0006"+
		"\u0001\u0000\u0000\u0000BC\u0005.\u0000\u0000CD\u0005u\u0000\u0000DE\u0005"+
		"p\u0000\u0000EF\u0005d\u0000\u0000FG\u0005a\u0000\u0000GH\u0005t\u0000"+
		"\u0000HI\u0005e\u0000\u0000I\b\u0001\u0000\u0000\u0000JK\u0005.\u0000"+
		"\u0000KL\u0005s\u0000\u0000LM\u0005i\u0000\u0000MN\u0005m\u0000\u0000"+
		"NO\u0005u\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005"+
		"t\u0000\u0000RS\u0005e\u0000\u0000S\n\u0001\u0000\u0000\u0000TU\u0005"+
		"=\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0005.\u0000\u0000WX\u0005"+
		"l\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005c\u0000"+
		"\u0000[\\\u0005h\u0000\u0000\\\u000e\u0001\u0000\u0000\u0000]^\u0005 "+
		"\u0000\u0000^_\u0005-\u0000\u0000_`\u0005>\u0000\u0000`a\u0005 \u0000"+
		"\u0000a\u0010\u0001\u0000\u0000\u0000bc\u0005M\u0000\u0000c\u0012\u0001"+
		"\u0000\u0000\u0000de\u0005(\u0000\u0000e\u0014\u0001\u0000\u0000\u0000"+
		"fg\u0005)\u0000\u0000g\u0016\u0001\u0000\u0000\u0000hi\u0005!\u0000\u0000"+
		"i\u0018\u0001\u0000\u0000\u0000jk\u0005&\u0000\u0000kl\u0005&\u0000\u0000"+
		"l\u001a\u0001\u0000\u0000\u0000mn\u0005|\u0000\u0000no\u0005|\u0000\u0000"+
		"o\u001c\u0001\u0000\u0000\u0000pr\u0007\u0000\u0000\u0000qp\u0001\u0000"+
		"\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000ty\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"vx\u0007\u0001\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u001e\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0007\u0002\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080 \u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0003"+
		"\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0006\u0010"+
		"\u0000\u0000\u0088\"\u0001\u0000\u0000\u0000\u0089\u008a\u0005/\u0000"+
		"\u0000\u008a\u008b\u0005/\u0000\u0000\u008b\u008f\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\b\u0004\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0006\u0011\u0000\u0000\u0093"+
		"$\u0001\u0000\u0000\u0000\u0094\u0095\u0005/\u0000\u0000\u0095\u0096\u0005"+
		"*\u0000\u0000\u0096\u009c\u0001\u0000\u0000\u0000\u0097\u0098\u0005*\u0000"+
		"\u0000\u0098\u009b\b\u0005\u0000\u0000\u0099\u009b\b\u0006\u0000\u0000"+
		"\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005*\u0000\u0000\u00a0"+
		"\u00a1\u0005/\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0006\u0012\u0000\u0000\u00a3&\u0001\u0000\u0000\u0000\b\u0000sy\u007f"+
		"\u0085\u008f\u009a\u009c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}