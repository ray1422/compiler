// Generated from /home/ray1422/workspace/compiler/project_2/Cactus.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CactusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "Cactus.g4"; }

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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GEQ) | (1L << LT) | (1L << LEQ))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6f\n\6\f\6\16\6i\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u008e\n\13\f\13\16\13\u0091\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009f\n\f\f\f\16\f\u00a2\13\f\3\r"+
		"\3\r\3\r\5\r\u00a7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00af\n\16\3"+
		"\16\2\6\n\f\24\26\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\n\17\2\u00b7"+
		"\2\34\3\2\2\2\4)\3\2\2\2\6/\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2\fj\3\2\2\2\16"+
		"|\3\2\2\2\20~\3\2\2\2\22\u0082\3\2\2\2\24\u0084\3\2\2\2\26\u0092\3\2\2"+
		"\2\30\u00a6\3\2\2\2\32\u00ae\3\2\2\2\34\35\7!\2\2\35\36\7\24\2\2\36\37"+
		"\7\25\2\2\37 \7\26\2\2 !\5\4\3\2!\"\5\6\4\2\"#\7\27\2\2#\3\3\2\2\2$%\7"+
		"\"\2\2%&\7#\2\2&\'\7\30\2\2\'*\5\4\3\2(*\3\2\2\2)$\3\2\2\2)(\3\2\2\2*"+
		"\5\3\2\2\2+,\5\b\5\2,-\5\6\4\2-\60\3\2\2\2.\60\3\2\2\2/+\3\2\2\2/.\3\2"+
		"\2\2\60\7\3\2\2\2\61\62\7\32\2\2\62\63\7\24\2\2\63\64\5\n\6\2\64\65\7"+
		"\25\2\2\65\66\7\26\2\2\66\67\5\6\4\2\678\7\27\2\289\7\33\2\29:\7\26\2"+
		"\2:;\5\6\4\2;<\7\27\2\2<=\7\34\2\2=^\3\2\2\2>?\7\32\2\2?@\7\24\2\2@A\5"+
		"\n\6\2AB\7\25\2\2BC\7\26\2\2CD\5\6\4\2DE\7\27\2\2EF\7\34\2\2F^\3\2\2\2"+
		"GH\7\35\2\2HI\7\24\2\2IJ\5\n\6\2JK\7\25\2\2KL\7\26\2\2LM\5\6\4\2MN\7\27"+
		"\2\2N^\3\2\2\2OP\7#\2\2PQ\7\23\2\2QR\5\24\13\2RS\7\30\2\2S^\3\2\2\2TU"+
		"\7\37\2\2UV\7#\2\2V^\7\30\2\2WX\7 \2\2XY\5\24\13\2YZ\7\30\2\2Z^\3\2\2"+
		"\2[\\\7\36\2\2\\^\7\30\2\2]\61\3\2\2\2]>\3\2\2\2]G\3\2\2\2]O\3\2\2\2]"+
		"T\3\2\2\2]W\3\2\2\2][\3\2\2\2^\t\3\2\2\2_`\b\6\1\2`a\5\f\7\2ag\3\2\2\2"+
		"bc\f\4\2\2cd\7\21\2\2df\5\f\7\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2h\13\3\2\2\2ig\3\2\2\2jk\b\7\1\2kl\5\16\b\2lr\3\2\2\2mn\f\4\2\2no\7"+
		"\20\2\2oq\5\16\b\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r\3\2\2\2"+
		"tr\3\2\2\2uv\7\22\2\2v}\5\16\b\2wx\7\24\2\2xy\5\n\6\2yz\7\25\2\2z}\3\2"+
		"\2\2{}\5\20\t\2|u\3\2\2\2|w\3\2\2\2|{\3\2\2\2}\17\3\2\2\2~\177\5\24\13"+
		"\2\177\u0080\5\22\n\2\u0080\u0081\5\24\13\2\u0081\21\3\2\2\2\u0082\u0083"+
		"\t\2\2\2\u0083\23\3\2\2\2\u0084\u0085\b\13\1\2\u0085\u0086\5\26\f\2\u0086"+
		"\u008f\3\2\2\2\u0087\u0088\f\5\2\2\u0088\u0089\7\5\2\2\u0089\u008e\5\26"+
		"\f\2\u008a\u008b\f\4\2\2\u008b\u008c\7\6\2\2\u008c\u008e\5\26\f\2\u008d"+
		"\u0087\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093"+
		"\b\f\1\2\u0093\u0094\5\30\r\2\u0094\u00a0\3\2\2\2\u0095\u0096\f\6\2\2"+
		"\u0096\u0097\7\7\2\2\u0097\u009f\5\30\r\2\u0098\u0099\f\5\2\2\u0099\u009a"+
		"\7\b\2\2\u009a\u009f\5\30\r\2\u009b\u009c\f\4\2\2\u009c\u009d\7\t\2\2"+
		"\u009d\u009f\5\30\r\2\u009e\u0095\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009b"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\27\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a7\5\30\r"+
		"\2\u00a5\u00a7\5\32\16\2\u00a6\u00a3\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\31\3\2\2\2\u00a8\u00af\7%\2\2\u00a9\u00af\7#\2\2\u00aa\u00ab\7\24\2\2"+
		"\u00ab\u00ac\5\24\13\2\u00ac\u00ad\7\25\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00a8\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\33\3\2\2"+
		"\2\16)/]gr|\u008d\u008f\u009e\u00a0\u00a6\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}