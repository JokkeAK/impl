// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IDENTIFIER=15, HVIDRUM=16, 
		KOMMENTAR=17, MULTILINECOMMENTS=18;
	public static final int
		RULE_start = 0, RULE_simInp = 1, RULE_latchAct = 2, RULE_command = 3, 
		RULE_commands = 4, RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "simInp", "latchAct", "command", "commands", "expr"
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
			null, null, null, "IDENTIFIER", "HVIDRUM", "KOMMENTAR", "MULTILINECOMMENTS"
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

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public implParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(implParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(implParser.IDENTIFIER, i);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public SimInpContext simInp() {
			return getRuleContext(SimInpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public List<LatchActContext> latchAct() {
			return getRuleContexts(LatchActContext.class);
		}
		public LatchActContext latchAct(int i) {
			return getRuleContext(LatchActContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			match(IDENTIFIER);
			setState(14);
			match(T__1);
			setState(15);
			match(IDENTIFIER);
			setState(16);
			match(T__2);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(17);
				match(IDENTIFIER);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(23);
				latchAct();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(T__3);
			setState(30);
			commands();
			setState(31);
			match(T__4);
			setState(32);
			simInp();
			setState(33);
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

	public static class SimInpContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(implParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(implParser.IDENTIFIER, i);
		}
		public SimInpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simInp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSimInp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSimInp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSimInp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimInpContext simInp() throws RecognitionException {
		SimInpContext _localctx = new SimInpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simInp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(IDENTIFIER);
			setState(36);
			match(T__5);
			setState(37);
			match(IDENTIFIER);
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

	public static class LatchActContext extends ParserRuleContext {
		public LatchActContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latchAct; }
	 
		public LatchActContext() { }
		public void copyFrom(LatchActContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LatchesContext extends LatchActContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(implParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(implParser.IDENTIFIER, i);
		}
		public LatchesContext(LatchActContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchActContext latchAct() throws RecognitionException {
		LatchActContext _localctx = new LatchActContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_latchAct);
		int _la;
		try {
			_localctx = new LatchesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__6);
			setState(40);
			match(IDENTIFIER);
			setState(41);
			match(T__7);
			setState(42);
			match(IDENTIFIER);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(43);
				match(T__8);
				}
				}
				setState(48);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends CommandContext {
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IDENTIFIER);
			setState(50);
			match(T__5);
			setState(51);
			expr(0);
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

	public static class CommandsContext extends ParserRuleContext {
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	 
		public CommandsContext() { }
		public void copyFrom(CommandsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SequenceContext extends CommandsContext {
		public CommandContext command;
		public List<CommandContext> cmds = new ArrayList<CommandContext>();
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public SequenceContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commands);
		int _la;
		try {
			_localctx = new SequenceContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(53);
				((SequenceContext)_localctx).command = command();
				((SequenceContext)_localctx).cmds.add(((SequenceContext)_localctx).command);
				}
				}
				setState(58);
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
	public static class NOTContext extends ExprContext {
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NOTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitNOT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ORContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ORContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ANDContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ANDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExprContext {
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringVarContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public StringVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStringVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStringVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStringVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new StringVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(60);
				match(IDENTIFIER);
				}
				break;
			case T__9:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__9);
				setState(62);
				((ParenthesesContext)_localctx).e1 = expr(0);
				setState(63);
				match(T__10);
				}
				break;
			case T__11:
				{
				_localctx = new NOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(65);
				match(T__11);
				}
				setState(66);
				((NOTContext)_localctx).e1 = expr(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ANDContext(new ExprContext(_parentctx, _parentState));
						((ANDContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(70);
						match(T__12);
						}
						setState(71);
						((ANDContext)_localctx).e2 = expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ORContext(new ExprContext(_parentctx, _parentState));
						((ORContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						{
						setState(73);
						match(T__13);
						}
						setState(74);
						((ORContext)_localctx).e2 = expr(2);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012Q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016\t\u0000"+
		"\u0001\u0000\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0005"+
		"\u00047\b\u0004\n\u0004\f\u0004:\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005D\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005L\b\u0005\n\u0005\f\u0005O\t\u0005\u0001"+
		"\u0005\u0000\u0001\n\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000R\u0000"+
		"\f\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004\'\u0001"+
		"\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000"+
		"\u0000\nC\u0001\u0000\u0000\u0000\f\r\u0005\u0001\u0000\u0000\r\u000e"+
		"\u0005\u000f\u0000\u0000\u000e\u000f\u0005\u0002\u0000\u0000\u000f\u0010"+
		"\u0005\u000f\u0000\u0000\u0010\u0014\u0005\u0003\u0000\u0000\u0011\u0013"+
		"\u0005\u000f\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0016"+
		"\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0001\u0000\u0000\u0000\u0015\u001a\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0017\u0019\u0003\u0004\u0002\u0000\u0018\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001d"+
		"\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0005\u0004\u0000\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f \u0005"+
		"\u0005\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\u0000\u0000\u0001"+
		"\"\u0001\u0001\u0000\u0000\u0000#$\u0005\u000f\u0000\u0000$%\u0005\u0006"+
		"\u0000\u0000%&\u0005\u000f\u0000\u0000&\u0003\u0001\u0000\u0000\u0000"+
		"\'(\u0005\u0007\u0000\u0000()\u0005\u000f\u0000\u0000)*\u0005\b\u0000"+
		"\u0000*.\u0005\u000f\u0000\u0000+-\u0005\t\u0000\u0000,+\u0001\u0000\u0000"+
		"\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/\u0005\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"12\u0005\u000f\u0000\u000023\u0005\u0006\u0000\u000034\u0003\n\u0005\u0000"+
		"4\u0007\u0001\u0000\u0000\u000057\u0003\u0006\u0003\u000065\u0001\u0000"+
		"\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009\t\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		";<\u0006\u0005\uffff\uffff\u0000<D\u0005\u000f\u0000\u0000=>\u0005\n\u0000"+
		"\u0000>?\u0003\n\u0005\u0000?@\u0005\u000b\u0000\u0000@D\u0001\u0000\u0000"+
		"\u0000AB\u0005\f\u0000\u0000BD\u0003\n\u0005\u0003C;\u0001\u0000\u0000"+
		"\u0000C=\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DM\u0001\u0000"+
		"\u0000\u0000EF\n\u0002\u0000\u0000FG\u0005\r\u0000\u0000GL\u0003\n\u0005"+
		"\u0003HI\n\u0001\u0000\u0000IJ\u0005\u000e\u0000\u0000JL\u0003\n\u0005"+
		"\u0002KE\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000LO\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u000b"+
		"\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000\u0007\u0014\u001a."+
		"8CKM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}