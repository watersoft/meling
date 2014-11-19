// Generated from com\watersoft\parser\Meling.g4 by ANTLR 4.3
package com.watersoft.parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MelingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		MUL=10, DIV=11, MOD=12, PLUS=13, MINUS=14, ID=15, INT=16, WS=17, LINE_COMMENT=18, 
		COMMENT=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"MUL", "DIV", "MOD", "PLUS", "MINUS", "ID", "INT", "WS", "LINE_COMMENT", 
		"COMMENT"
	};


	public MelingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Meling.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20N\n\20\f\20\16\20Q\13\20\3\21\6\21"+
		"T\n\21\r\21\16\21U\3\22\6\22Y\n\22\r\22\16\22Z\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\7\23c\n\23\f\23\16\23f\13\23\3\23\5\23i\n\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\7\24s\n\24\f\24\16\24v\13\24\3\24\3\24\3\24\3\24"+
		"\3\24\4dt\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2"+
		"\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\17;\3"+
		"\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33"+
		"G\3\2\2\2\35I\3\2\2\2\37K\3\2\2\2!S\3\2\2\2#X\3\2\2\2%^\3\2\2\2\'n\3\2"+
		"\2\2)*\7e\2\2*+\7n\2\2+,\7c\2\2,-\7u\2\2-.\7u\2\2.\4\3\2\2\2/\60\7=\2"+
		"\2\60\6\3\2\2\2\61\62\7}\2\2\62\b\3\2\2\2\63\64\7?\2\2\64\n\3\2\2\2\65"+
		"\66\7\177\2\2\66\f\3\2\2\2\678\7k\2\289\7p\2\29:\7v\2\2:\16\3\2\2\2;<"+
		"\7*\2\2<\20\3\2\2\2=>\7+\2\2>\22\3\2\2\2?@\7.\2\2@\24\3\2\2\2AB\7,\2\2"+
		"B\26\3\2\2\2CD\7\61\2\2D\30\3\2\2\2EF\7\'\2\2F\32\3\2\2\2GH\7-\2\2H\34"+
		"\3\2\2\2IJ\7/\2\2J\36\3\2\2\2KO\t\2\2\2LN\t\3\2\2ML\3\2\2\2NQ\3\2\2\2"+
		"OM\3\2\2\2OP\3\2\2\2P \3\2\2\2QO\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2V\"\3\2\2\2WY\t\5\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\22\2\2]$\3\2\2\2^_\7\61\2\2_`\7\61\2\2`d"+
		"\3\2\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2\2\2db\3\2\2\2eh\3\2\2\2"+
		"fd\3\2\2\2gi\7\17\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\f\2\2kl\3\2\2"+
		"\2lm\b\23\2\2m&\3\2\2\2no\7\61\2\2op\7,\2\2pt\3\2\2\2qs\13\2\2\2rq\3\2"+
		"\2\2sv\3\2\2\2tu\3\2\2\2tr\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7,\2\2xy\7\61"+
		"\2\2yz\3\2\2\2z{\b\24\2\2{(\3\2\2\2\t\2OUZdht\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}