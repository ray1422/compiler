// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CactusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, KEYWORDS=2, IF=3, ELSE=4, FI=5, WHILE=6, RETURN=7, READ=8, 
		WRITE=9, MAIN=10, INT=11, ID=12, CONST=13, OPERATOR=14, ADD=15, SUB=16, 
		MUL=17, DIV=18, MOD=19, EQ=20, NEQ=21, GT=22, GEQ=23, LT=24, LEQ=25, AND=26, 
		OR=27, NOT=28, ASSIGN=29, LPAR=30, RPAR=31, LCB=32, RCB=33, SEMICOLON=34, 
		WHITESPACE=35, NEWLINE=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "KEYWORDS", "IF", "ELSE", "FI", "WHILE", "RETURN", "READ", 
			"WRITE", "MAIN", "INT", "ID", "CONST", "OPERATOR", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "EQ", "NEQ", "GT", "GEQ", "LT", "LEQ", "AND", "OR", "NOT", 
			"ASSIGN", "LPAR", "RPAR", "LCB", "RCB", "SEMICOLON", "WHITESPACE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'if'", "'else'", "'fi'", "'while'", "'return'", "'read'", 
			"'write'", "'main'", "'int'", null, null, null, "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
			"'!'", "'='", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "KEYWORDS", "IF", "ELSE", "FI", "WHILE", "RETURN", "READ", 
			"WRITE", "MAIN", "INT", "ID", "CONST", "OPERATOR", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "EQ", "NEQ", "GT", "GEQ", "LT", "LEQ", "AND", "OR", "NOT", 
			"ASSIGN", "LPAR", "RPAR", "LCB", "RCB", "SEMICOLON", "WHITESPACE", "NEWLINE"
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


	public CactusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cactus.g4"; }

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
		"\u0004\u0000$\u00ec\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000N\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001a\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0091\b\u000b\n\u000b\f\u000b\u0094\t\u000b"+
		"\u0001\f\u0001\f\u0005\f\u0098\b\f\n\f\f\f\u009b\t\f\u0001\f\u0003\f\u009e"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00b4\b\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003#\u00eb\b#\u0001"+
		"O\u0000$\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0000"+
		"19\u0001\u000009\u0003\u0000\t\n\r\r  \u010b\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0001I\u0001\u0000\u0000\u0000\u0003`\u0001\u0000\u0000\u0000\u0005b"+
		"\u0001\u0000\u0000\u0000\u0007e\u0001\u0000\u0000\u0000\tj\u0001\u0000"+
		"\u0000\u0000\u000bm\u0001\u0000\u0000\u0000\rs\u0001\u0000\u0000\u0000"+
		"\u000fz\u0001\u0000\u0000\u0000\u0011\u007f\u0001\u0000\u0000\u0000\u0013"+
		"\u0085\u0001\u0000\u0000\u0000\u0015\u008a\u0001\u0000\u0000\u0000\u0017"+
		"\u008e\u0001\u0000\u0000\u0000\u0019\u009d\u0001\u0000\u0000\u0000\u001b"+
		"\u00b3\u0001\u0000\u0000\u0000\u001d\u00b5\u0001\u0000\u0000\u0000\u001f"+
		"\u00b7\u0001\u0000\u0000\u0000!\u00b9\u0001\u0000\u0000\u0000#\u00bb\u0001"+
		"\u0000\u0000\u0000%\u00bd\u0001\u0000\u0000\u0000\'\u00bf\u0001\u0000"+
		"\u0000\u0000)\u00c2\u0001\u0000\u0000\u0000+\u00c5\u0001\u0000\u0000\u0000"+
		"-\u00c7\u0001\u0000\u0000\u0000/\u00ca\u0001\u0000\u0000\u00001\u00cc"+
		"\u0001\u0000\u0000\u00003\u00cf\u0001\u0000\u0000\u00005\u00d2\u0001\u0000"+
		"\u0000\u00007\u00d5\u0001\u0000\u0000\u00009\u00d7\u0001\u0000\u0000\u0000"+
		";\u00d9\u0001\u0000\u0000\u0000=\u00db\u0001\u0000\u0000\u0000?\u00dd"+
		"\u0001\u0000\u0000\u0000A\u00df\u0001\u0000\u0000\u0000C\u00e1\u0001\u0000"+
		"\u0000\u0000E\u00e3\u0001\u0000\u0000\u0000G\u00ea\u0001\u0000\u0000\u0000"+
		"IJ\u0005/\u0000\u0000JK\u0005*\u0000\u0000KO\u0001\u0000\u0000\u0000L"+
		"N\t\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000RS\u0005*\u0000\u0000ST\u0005/\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UV\u0006\u0000\u0000\u0000V\u0002\u0001\u0000"+
		"\u0000\u0000Wa\u0003\u0005\u0002\u0000Xa\u0003\u0007\u0003\u0000Ya\u0003"+
		"\t\u0004\u0000Za\u0003\u000b\u0005\u0000[a\u0003\r\u0006\u0000\\a\u0003"+
		"\u000f\u0007\u0000]a\u0003\u0011\b\u0000^a\u0003\u0013\t\u0000_a\u0003"+
		"\u0015\n\u0000`W\u0001\u0000\u0000\u0000`X\u0001\u0000\u0000\u0000`Y\u0001"+
		"\u0000\u0000\u0000`Z\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000"+
		"`\\\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000a\u0004\u0001\u0000\u0000\u0000bc\u0005"+
		"i\u0000\u0000cd\u0005f\u0000\u0000d\u0006\u0001\u0000\u0000\u0000ef\u0005"+
		"e\u0000\u0000fg\u0005l\u0000\u0000gh\u0005s\u0000\u0000hi\u0005e\u0000"+
		"\u0000i\b\u0001\u0000\u0000\u0000jk\u0005f\u0000\u0000kl\u0005i\u0000"+
		"\u0000l\n\u0001\u0000\u0000\u0000mn\u0005w\u0000\u0000no\u0005h\u0000"+
		"\u0000op\u0005i\u0000\u0000pq\u0005l\u0000\u0000qr\u0005e\u0000\u0000"+
		"r\f\u0001\u0000\u0000\u0000st\u0005r\u0000\u0000tu\u0005e\u0000\u0000"+
		"uv\u0005t\u0000\u0000vw\u0005u\u0000\u0000wx\u0005r\u0000\u0000xy\u0005"+
		"n\u0000\u0000y\u000e\u0001\u0000\u0000\u0000z{\u0005r\u0000\u0000{|\u0005"+
		"e\u0000\u0000|}\u0005a\u0000\u0000}~\u0005d\u0000\u0000~\u0010\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005w\u0000\u0000\u0080\u0081\u0005r\u0000\u0000"+
		"\u0081\u0082\u0005i\u0000\u0000\u0082\u0083\u0005t\u0000\u0000\u0083\u0084"+
		"\u0005e\u0000\u0000\u0084\u0012\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"m\u0000\u0000\u0086\u0087\u0005a\u0000\u0000\u0087\u0088\u0005i\u0000"+
		"\u0000\u0088\u0089\u0005n\u0000\u0000\u0089\u0014\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005i\u0000\u0000\u008b\u008c\u0005n\u0000\u0000\u008c\u008d"+
		"\u0005t\u0000\u0000\u008d\u0016\u0001\u0000\u0000\u0000\u008e\u0092\u0007"+
		"\u0000\u0000\u0000\u008f\u0091\u0007\u0001\u0000\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0018\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0099\u0007"+
		"\u0002\u0000\u0000\u0096\u0098\u0007\u0003\u0000\u0000\u0097\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009e\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0007"+
		"\u0003\u0000\u0000\u009d\u0095\u0001\u0000\u0000\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u001a\u0001\u0000\u0000\u0000\u009f\u00b4\u0003"+
		"\u001d\u000e\u0000\u00a0\u00b4\u0003\u001f\u000f\u0000\u00a1\u00b4\u0003"+
		"!\u0010\u0000\u00a2\u00b4\u0003#\u0011\u0000\u00a3\u00b4\u0003%\u0012"+
		"\u0000\u00a4\u00b4\u0003\'\u0013\u0000\u00a5\u00b4\u0003)\u0014\u0000"+
		"\u00a6\u00b4\u0003+\u0015\u0000\u00a7\u00b4\u0003-\u0016\u0000\u00a8\u00b4"+
		"\u0003/\u0017\u0000\u00a9\u00b4\u00031\u0018\u0000\u00aa\u00b4\u00033"+
		"\u0019\u0000\u00ab\u00b4\u00035\u001a\u0000\u00ac\u00b4\u00037\u001b\u0000"+
		"\u00ad\u00b4\u00039\u001c\u0000\u00ae\u00b4\u0003;\u001d\u0000\u00af\u00b4"+
		"\u0003=\u001e\u0000\u00b0\u00b4\u0003?\u001f\u0000\u00b1\u00b4\u0003A"+
		" \u0000\u00b2\u00b4\u0003C!\u0000\u00b3\u009f\u0001\u0000\u0000\u0000"+
		"\u00b3\u00a0\u0001\u0000\u0000\u0000\u00b3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00a2\u0001\u0000\u0000\u0000\u00b3\u00a3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00a4\u0001\u0000\u0000\u0000\u00b3\u00a5\u0001\u0000\u0000\u0000"+
		"\u00b3\u00a6\u0001\u0000\u0000\u0000\u00b3\u00a7\u0001\u0000\u0000\u0000"+
		"\u00b3\u00a8\u0001\u0000\u0000\u0000\u00b3\u00a9\u0001\u0000\u0000\u0000"+
		"\u00b3\u00aa\u0001\u0000\u0000\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b3\u00ac\u0001\u0000\u0000\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u001c\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005+\u0000\u0000\u00b6\u001e\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005-\u0000\u0000\u00b8 \u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"*\u0000\u0000\u00ba\"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005/\u0000"+
		"\u0000\u00bc$\u0001\u0000\u0000\u0000\u00bd\u00be\u0005%\u0000\u0000\u00be"+
		"&\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005=\u0000\u0000\u00c0\u00c1\u0005"+
		"=\u0000\u0000\u00c1(\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005!\u0000"+
		"\u0000\u00c3\u00c4\u0005=\u0000\u0000\u00c4*\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0005>\u0000\u0000\u00c6,\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		">\u0000\u0000\u00c8\u00c9\u0005=\u0000\u0000\u00c9.\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005<\u0000\u0000\u00cb0\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005<\u0000\u0000\u00cd\u00ce\u0005=\u0000\u0000\u00ce2\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005&\u0000\u0000\u00d0\u00d1\u0005&\u0000"+
		"\u0000\u00d14\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005|\u0000\u0000\u00d3"+
		"\u00d4\u0005|\u0000\u0000\u00d46\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"!\u0000\u0000\u00d68\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005=\u0000"+
		"\u0000\u00d8:\u0001\u0000\u0000\u0000\u00d9\u00da\u0005(\u0000\u0000\u00da"+
		"<\u0001\u0000\u0000\u0000\u00db\u00dc\u0005)\u0000\u0000\u00dc>\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005{\u0000\u0000\u00de@\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0005}\u0000\u0000\u00e0B\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005;\u0000\u0000\u00e2D\u0001\u0000\u0000\u0000\u00e3\u00e4\u0007"+
		"\u0004\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0006"+
		"\"\u0000\u0000\u00e6F\u0001\u0000\u0000\u0000\u00e7\u00eb\u0005\n\u0000"+
		"\u0000\u00e8\u00e9\u0005\r\u0000\u0000\u00e9\u00eb\u0005\n\u0000\u0000"+
		"\u00ea\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ebH\u0001\u0000\u0000\u0000\b\u0000O`\u0092\u0099\u009d\u00b3\u00ea"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}