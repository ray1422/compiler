// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CactusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, WS=2, ADD=3, SUB=4, MUL=5, DIV=6, MOD=7, EQ=8, NEQ=9, GT=10, 
		GEQ=11, LT=12, LEQ=13, AND=14, OR=15, NOT=16, ASSIGN=17, LPAR=18, RPAR=19, 
		LCB=20, RCB=21, SEMICOLON=22, NEWLINE=23, IF=24, ELSE=25, FI=26, WHILE=27, 
		RETURN=28, READ=29, WRITE=30, MAIN=31, INT=32, ID=33, KEYWORDS=34, INT_CONST=35, 
		OPERATOR=36;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_bool_expression = 4, RULE_bool_term = 5, RULE_bool_factor = 6, RULE_rel_expression = 7, 
		RULE_rel_op = 8, RULE_arith_expression = 9, RULE_arith_term = 10, RULE_arith_factor = 11, 
		RULE_primary_expression = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "statements", "statement", "bool_expression", 
			"bool_term", "bool_factor", "rel_expression", "rel_op", "arith_expression", 
			"arith_term", "arith_factor", "primary_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", 
			"'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'!'", "'='", "'('", "')'", 
			"'{'", "'}'", "';'", null, "'if'", "'else'", "'fi'", "'while'", "'return'", 
			"'read'", "'write'", "'main'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "WS", "ADD", "SUB", "MUL", "DIV", "MOD", "EQ", "NEQ", 
			"GT", "GEQ", "LT", "LEQ", "AND", "OR", "NOT", "ASSIGN", "LPAR", "RPAR", 
			"LCB", "RCB", "SEMICOLON", "NEWLINE", "IF", "ELSE", "FI", "WHILE", "RETURN", 
			"READ", "WRITE", "MAIN", "INT", "ID", "KEYWORDS", "INT_CONST", "OPERATOR"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CactusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CactusParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(CactusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CactusParser.RPAR, 0); }
		public TerminalNode LCB() { return getToken(CactusParser.LCB, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCB() { return getToken(CactusParser.RCB, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(MAIN);
			setState(27);
			match(LPAR);
			setState(28);
			match(RPAR);
			setState(29);
			match(LCB);
			setState(30);
			declarations();
			setState(31);
			statements();
			setState(32);
			match(RCB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CactusParser.INT, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(CactusParser.SEMICOLON, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(INT);
				setState(35);
				match(ID);
				setState(36);
				match(SEMICOLON);
				setState(37);
				declarations();
				}
				break;
			case RCB:
			case IF:
			case WHILE:
			case RETURN:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case RETURN:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				statement();
				setState(42);
				statements();
				}
				break;
			case RCB:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CactusParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(CactusParser.LPAR, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CactusParser.RPAR, 0); }
		public List<TerminalNode> LCB() { return getTokens(CactusParser.LCB); }
		public TerminalNode LCB(int i) {
			return getToken(CactusParser.LCB, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> RCB() { return getTokens(CactusParser.RCB); }
		public TerminalNode RCB(int i) {
			return getToken(CactusParser.RCB, i);
		}
		public TerminalNode ELSE() { return getToken(CactusParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CactusParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(CactusParser.WHILE, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CactusParser.ASSIGN, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CactusParser.SEMICOLON, 0); }
		public TerminalNode READ() { return getToken(CactusParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(CactusParser.WRITE, 0); }
		public TerminalNode RETURN() { return getToken(CactusParser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(IF);
				setState(48);
				match(LPAR);
				setState(49);
				bool_expression(0);
				setState(50);
				match(RPAR);
				setState(51);
				match(LCB);
				setState(52);
				statements();
				setState(53);
				match(RCB);
				setState(54);
				match(ELSE);
				setState(55);
				match(LCB);
				setState(56);
				statements();
				setState(57);
				match(RCB);
				setState(58);
				match(FI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(IF);
				setState(61);
				match(LPAR);
				setState(62);
				bool_expression(0);
				setState(63);
				match(RPAR);
				setState(64);
				match(LCB);
				setState(65);
				statements();
				setState(66);
				match(RCB);
				setState(67);
				match(FI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(WHILE);
				setState(70);
				match(LPAR);
				setState(71);
				bool_expression(0);
				setState(72);
				match(RPAR);
				setState(73);
				match(LCB);
				setState(74);
				statements();
				setState(75);
				match(RCB);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(ID);
				setState(78);
				match(ASSIGN);
				setState(79);
				arith_expression(0);
				setState(80);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(READ);
				setState(83);
				match(ID);
				setState(84);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(WRITE);
				setState(86);
				arith_expression(0);
				setState(87);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				match(RETURN);
				setState(90);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expressionContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(CactusParser.OR, 0); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		return bool_expression(0);
	}

	private Bool_expressionContext bool_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, _parentState);
		Bool_expressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_bool_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			bool_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
					setState(96);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(97);
					match(OR);
					setState(98);
					bool_term(0);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public TerminalNode AND() { return getToken(CactusParser.AND, 0); }
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		return bool_term(0);
	}

	private Bool_termContext bool_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_termContext _localctx = new Bool_termContext(_ctx, _parentState);
		Bool_termContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_bool_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			bool_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_termContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_term);
					setState(107);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(108);
					match(AND);
					setState(109);
					bool_factor();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_factorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(CactusParser.NOT, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(CactusParser.LPAR, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CactusParser.RPAR, 0); }
		public Rel_expressionContext rel_expression() {
			return getRuleContext(Rel_expressionContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bool_factor);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(NOT);
				setState(116);
				bool_factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(LPAR);
				setState(118);
				bool_expression(0);
				setState(119);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				rel_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Rel_expressionContext extends ParserRuleContext {
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Rel_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterRel_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitRel_expression(this);
		}
	}

	public final Rel_expressionContext rel_expression() throws RecognitionException {
		Rel_expressionContext _localctx = new Rel_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rel_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			arith_expression(0);
			setState(125);
			rel_op();
			setState(126);
			arith_expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CactusParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CactusParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(CactusParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(CactusParser.GEQ, 0); }
		public TerminalNode LT() { return getToken(CactusParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(CactusParser.LEQ, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arith_expressionContext extends ParserRuleContext {
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CactusParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CactusParser.SUB, 0); }
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		return arith_expression(0);
	}

	private Arith_expressionContext arith_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, _parentState);
		Arith_expressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arith_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			arith_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Arith_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expression);
						setState(133);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(134);
						match(ADD);
						setState(135);
						arith_term(0);
						}
						break;
					case 2:
						{
						_localctx = new Arith_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expression);
						setState(136);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(137);
						match(SUB);
						setState(138);
						arith_term(0);
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arith_termContext extends ParserRuleContext {
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public TerminalNode MUL() { return getToken(CactusParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CactusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CactusParser.MOD, 0); }
		public Arith_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_term(this);
		}
	}

	public final Arith_termContext arith_term() throws RecognitionException {
		return arith_term(0);
	}

	private Arith_termContext arith_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arith_termContext _localctx = new Arith_termContext(_ctx, _parentState);
		Arith_termContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arith_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			arith_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Arith_termContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_term);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						match(MUL);
						setState(149);
						arith_factor();
						}
						break;
					case 2:
						{
						_localctx = new Arith_termContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_term);
						setState(150);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(151);
						match(DIV);
						setState(152);
						arith_factor();
						}
						break;
					case 3:
						{
						_localctx = new Arith_termContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_term);
						setState(153);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(154);
						match(MOD);
						setState(155);
						arith_factor();
						}
						break;
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arith_factorContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(CactusParser.SUB, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_factor(this);
		}
	}

	public final Arith_factorContext arith_factor() throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arith_factor);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(SUB);
				setState(162);
				arith_factor();
				}
				break;
			case LPAR:
			case ID:
			case INT_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				primary_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode INT_CONST() { return getToken(CactusParser.INT_CONST, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(CactusParser.LPAR, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CactusParser.RPAR, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primary_expression);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(INT_CONST);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(ID);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(LPAR);
				setState(169);
				arith_expression(0);
				setState(170);
				match(RPAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return bool_expression_sempred((Bool_expressionContext)_localctx, predIndex);
		case 5:
			return bool_term_sempred((Bool_termContext)_localctx, predIndex);
		case 9:
			return arith_expression_sempred((Arith_expressionContext)_localctx, predIndex);
		case 10:
			return arith_term_sempred((Arith_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_expression_sempred(Bool_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_term_sempred(Bool_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arith_expression_sempred(Arith_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arith_term_sempred(Arith_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\\\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004d\b\u0004\n\u0004\f\u0004g\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005o\b\u0005\n\u0005\f\u0005r\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"{\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u008c\b\t\n\t\f\t\u008f\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u009d\b\n\n\n\f\n\u00a0\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00a5\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00ad\b\f\u0001\f\u0000\u0004\b\n\u0012\u0014\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\b\r"+
		"\u00b5\u0000\u001a\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000"+
		"\u0004-\u0001\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\b]\u0001"+
		"\u0000\u0000\u0000\nh\u0001\u0000\u0000\u0000\fz\u0001\u0000\u0000\u0000"+
		"\u000e|\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000\u0000\u0012"+
		"\u0082\u0001\u0000\u0000\u0000\u0014\u0090\u0001\u0000\u0000\u0000\u0016"+
		"\u00a4\u0001\u0000\u0000\u0000\u0018\u00ac\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0005\u001f\u0000\u0000\u001b\u001c\u0005\u0012\u0000\u0000\u001c"+
		"\u001d\u0005\u0013\u0000\u0000\u001d\u001e\u0005\u0014\u0000\u0000\u001e"+
		"\u001f\u0003\u0002\u0001\u0000\u001f \u0003\u0004\u0002\u0000 !\u0005"+
		"\u0015\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\"#\u0005 \u0000\u0000"+
		"#$\u0005!\u0000\u0000$%\u0005\u0016\u0000\u0000%(\u0003\u0002\u0001\u0000"+
		"&(\u0001\u0000\u0000\u0000\'\"\u0001\u0000\u0000\u0000\'&\u0001\u0000"+
		"\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0003\u0006\u0003\u0000"+
		"*+\u0003\u0004\u0002\u0000+.\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000"+
		"\u0000-)\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0005\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0018\u0000\u000001\u0005\u0012\u0000\u0000"+
		"12\u0003\b\u0004\u000023\u0005\u0013\u0000\u000034\u0005\u0014\u0000\u0000"+
		"45\u0003\u0004\u0002\u000056\u0005\u0015\u0000\u000067\u0005\u0019\u0000"+
		"\u000078\u0005\u0014\u0000\u000089\u0003\u0004\u0002\u00009:\u0005\u0015"+
		"\u0000\u0000:;\u0005\u001a\u0000\u0000;\\\u0001\u0000\u0000\u0000<=\u0005"+
		"\u0018\u0000\u0000=>\u0005\u0012\u0000\u0000>?\u0003\b\u0004\u0000?@\u0005"+
		"\u0013\u0000\u0000@A\u0005\u0014\u0000\u0000AB\u0003\u0004\u0002\u0000"+
		"BC\u0005\u0015\u0000\u0000CD\u0005\u001a\u0000\u0000D\\\u0001\u0000\u0000"+
		"\u0000EF\u0005\u001b\u0000\u0000FG\u0005\u0012\u0000\u0000GH\u0003\b\u0004"+
		"\u0000HI\u0005\u0013\u0000\u0000IJ\u0005\u0014\u0000\u0000JK\u0003\u0004"+
		"\u0002\u0000KL\u0005\u0015\u0000\u0000L\\\u0001\u0000\u0000\u0000MN\u0005"+
		"!\u0000\u0000NO\u0005\u0011\u0000\u0000OP\u0003\u0012\t\u0000PQ\u0005"+
		"\u0016\u0000\u0000Q\\\u0001\u0000\u0000\u0000RS\u0005\u001d\u0000\u0000"+
		"ST\u0005!\u0000\u0000T\\\u0005\u0016\u0000\u0000UV\u0005\u001e\u0000\u0000"+
		"VW\u0003\u0012\t\u0000WX\u0005\u0016\u0000\u0000X\\\u0001\u0000\u0000"+
		"\u0000YZ\u0005\u001c\u0000\u0000Z\\\u0005\u0016\u0000\u0000[/\u0001\u0000"+
		"\u0000\u0000[<\u0001\u0000\u0000\u0000[E\u0001\u0000\u0000\u0000[M\u0001"+
		"\u0000\u0000\u0000[R\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000\\\u0007\u0001\u0000\u0000\u0000]^\u0006\u0004"+
		"\uffff\uffff\u0000^_\u0003\n\u0005\u0000_e\u0001\u0000\u0000\u0000`a\n"+
		"\u0002\u0000\u0000ab\u0005\u000f\u0000\u0000bd\u0003\n\u0005\u0000c`\u0001"+
		"\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000f\t\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000hi\u0006\u0005\uffff\uffff\u0000ij\u0003\f\u0006\u0000jp\u0001\u0000"+
		"\u0000\u0000kl\n\u0002\u0000\u0000lm\u0005\u000e\u0000\u0000mo\u0003\f"+
		"\u0006\u0000nk\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u000b\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000st\u0005\u0010\u0000\u0000t{\u0003\f\u0006"+
		"\u0000uv\u0005\u0012\u0000\u0000vw\u0003\b\u0004\u0000wx\u0005\u0013\u0000"+
		"\u0000x{\u0001\u0000\u0000\u0000y{\u0003\u000e\u0007\u0000zs\u0001\u0000"+
		"\u0000\u0000zu\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\r\u0001"+
		"\u0000\u0000\u0000|}\u0003\u0012\t\u0000}~\u0003\u0010\b\u0000~\u007f"+
		"\u0003\u0012\t\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0007"+
		"\u0000\u0000\u0000\u0081\u0011\u0001\u0000\u0000\u0000\u0082\u0083\u0006"+
		"\t\uffff\uffff\u0000\u0083\u0084\u0003\u0014\n\u0000\u0084\u008d\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\n\u0003\u0000\u0000\u0086\u0087\u0005\u0003"+
		"\u0000\u0000\u0087\u008c\u0003\u0014\n\u0000\u0088\u0089\n\u0002\u0000"+
		"\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u008c\u0003\u0014\n\u0000"+
		"\u008b\u0085\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0013\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0006\n\uffff\uffff\u0000"+
		"\u0091\u0092\u0003\u0016\u000b\u0000\u0092\u009e\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\n\u0004\u0000\u0000\u0094\u0095\u0005\u0005\u0000\u0000\u0095"+
		"\u009d\u0003\u0016\u000b\u0000\u0096\u0097\n\u0003\u0000\u0000\u0097\u0098"+
		"\u0005\u0006\u0000\u0000\u0098\u009d\u0003\u0016\u000b\u0000\u0099\u009a"+
		"\n\u0002\u0000\u0000\u009a\u009b\u0005\u0007\u0000\u0000\u009b\u009d\u0003"+
		"\u0016\u000b\u0000\u009c\u0093\u0001\u0000\u0000\u0000\u009c\u0096\u0001"+
		"\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u0015\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005\u0004\u0000\u0000\u00a2\u00a5\u0003"+
		"\u0016\u000b\u0000\u00a3\u00a5\u0003\u0018\f\u0000\u00a4\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u0017\u0001\u0000"+
		"\u0000\u0000\u00a6\u00ad\u0005#\u0000\u0000\u00a7\u00ad\u0005!\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0012\u0000\u0000\u00a9\u00aa\u0003\u0012\t\u0000\u00aa"+
		"\u00ab\u0005\u0013\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac"+
		"\u00a6\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ad\u0019\u0001\u0000\u0000\u0000\f\'"+
		"-[epz\u008b\u008d\u009c\u009e\u00a4\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}