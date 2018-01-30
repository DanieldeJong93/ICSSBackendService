// Generated from C:/Users/Danie/OneDrive/Documenten/ASD/APP/BPprog/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.7
package com.devdaniel.icss.Service.icss.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ICSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIMENSIONPROPERTY=1, COLOR_PROPERTY=2, PIXEL_LITERAL=3, BOOLEAN_LITERAL=4, 
		TEXT=5, CONSTANTNAME=6, PERCENTAGE_LITERAL=7, COLOR_LITERAL=8, HASH=9, 
		CURLYOPEN=10, CURLYCLOSE=11, SQUAREOPEN=12, SQUARECLOSE=13, SEMICOLON=14, 
		DOT=15, COLON=16, EQUALS=17, SUM=18, DASH=19, PIPE=20, BIGGERTHAN=21, 
		SMALLERTHAN=22, DOUBLEEQUALS=23, DOUBLEPIPE=24, DOUBLEAMPERSAND=25, TERNARYOPERATOR=26, 
		WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIMENSIONPROPERTY", "COLOR_PROPERTY", "PIXEL_LITERAL", "BOOLEAN_LITERAL", 
		"TEXT", "CONSTANTNAME", "PERCENTAGE_LITERAL", "COLOR_LITERAL", "HASH", 
		"CURLYOPEN", "CURLYCLOSE", "SQUAREOPEN", "SQUARECLOSE", "SEMICOLON", "DOT", 
		"COLON", "EQUALS", "SUM", "DASH", "PIPE", "BIGGERTHAN", "SMALLERTHAN", 
		"DOUBLEEQUALS", "DOUBLEPIPE", "DOUBLEAMPERSAND", "TERNARYOPERATOR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'=='", 
		"'||'", "'&&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DIMENSIONPROPERTY", "COLOR_PROPERTY", "PIXEL_LITERAL", "BOOLEAN_LITERAL", 
		"TEXT", "CONSTANTNAME", "PERCENTAGE_LITERAL", "COLOR_LITERAL", "HASH", 
		"CURLYOPEN", "CURLYCLOSE", "SQUAREOPEN", "SQUARECLOSE", "SEMICOLON", "DOT", 
		"COLON", "EQUALS", "SUM", "DASH", "PIPE", "BIGGERTHAN", "SMALLERTHAN", 
		"DOUBLEEQUALS", "DOUBLEPIPE", "DOUBLEAMPERSAND", "TERNARYOPERATOR", "WS"
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


	public ICSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ICSS.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2E\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\\\n\3\3\4\6\4_\n\4\r\4\16\4`\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\6\6\6r\n\6\r"+
		"\6\16\6s\3\7\6\7w\n\7\r\7\16\7x\3\b\6\b|\n\b\r\b\16\b}\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\6\34\u00b2\n\34\r\34\16\34\u00b3\3\34\3\34\2\2\35\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\26\3\2\62;\4\2\62"+
		";c|\4\2C\\aa\5\2\62;CHch\3\2%%\3\2}}\3\2\177\177\3\2]]\3\2__\3\2==\3\2"+
		"\60\60\3\2<<\3\2??\3\2--\3\2//\3\2~~\3\2@@\3\2>>\3\2AA\5\2\13\f\17\17"+
		"\"\"\2\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3D\3"+
		"\2\2\2\5[\3\2\2\2\7^\3\2\2\2\tn\3\2\2\2\13q\3\2\2\2\rv\3\2\2\2\17{\3\2"+
		"\2\2\21\u0081\3\2\2\2\23\u0089\3\2\2\2\25\u008b\3\2\2\2\27\u008d\3\2\2"+
		"\2\31\u008f\3\2\2\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2"+
		"!\u0097\3\2\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u009d\3\2\2\2)\u009f\3"+
		"\2\2\2+\u00a1\3\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a8\3\2\2\2\63"+
		"\u00ab\3\2\2\2\65\u00ae\3\2\2\2\67\u00b1\3\2\2\29:\7y\2\2:;\7k\2\2;<\7"+
		"f\2\2<=\7v\2\2=E\7j\2\2>?\7j\2\2?@\7g\2\2@A\7k\2\2AB\7i\2\2BC\7j\2\2C"+
		"E\7v\2\2D9\3\2\2\2D>\3\2\2\2E\4\3\2\2\2FG\7e\2\2GH\7q\2\2HI\7n\2\2IJ\7"+
		"q\2\2J\\\7t\2\2KL\7d\2\2LM\7c\2\2MN\7e\2\2NO\7m\2\2OP\7i\2\2PQ\7t\2\2"+
		"QR\7q\2\2RS\7w\2\2ST\7p\2\2TU\7f\2\2UV\7/\2\2VW\7e\2\2WX\7q\2\2XY\7n\2"+
		"\2YZ\7q\2\2Z\\\7t\2\2[F\3\2\2\2[K\3\2\2\2\\\6\3\2\2\2]_\t\2\2\2^]\3\2"+
		"\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7r\2\2cd\7z\2\2d\b\3\2"+
		"\2\2ef\7v\2\2fg\7t\2\2gh\7w\2\2ho\7g\2\2ij\7h\2\2jk\7c\2\2kl\7n\2\2lm"+
		"\7u\2\2mo\7g\2\2ne\3\2\2\2ni\3\2\2\2o\n\3\2\2\2pr\t\3\2\2qp\3\2\2\2rs"+
		"\3\2\2\2sq\3\2\2\2st\3\2\2\2t\f\3\2\2\2uw\t\4\2\2vu\3\2\2\2wx\3\2\2\2"+
		"xv\3\2\2\2xy\3\2\2\2y\16\3\2\2\2z|\t\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\'\2\2\u0080\20\3\2\2\2\u0081\u0082"+
		"\7%\2\2\u0082\u0083\t\5\2\2\u0083\u0084\t\5\2\2\u0084\u0085\t\5\2\2\u0085"+
		"\u0086\t\5\2\2\u0086\u0087\t\5\2\2\u0087\u0088\t\5\2\2\u0088\22\3\2\2"+
		"\2\u0089\u008a\t\6\2\2\u008a\24\3\2\2\2\u008b\u008c\t\7\2\2\u008c\26\3"+
		"\2\2\2\u008d\u008e\t\b\2\2\u008e\30\3\2\2\2\u008f\u0090\t\t\2\2\u0090"+
		"\32\3\2\2\2\u0091\u0092\t\n\2\2\u0092\34\3\2\2\2\u0093\u0094\t\13\2\2"+
		"\u0094\36\3\2\2\2\u0095\u0096\t\f\2\2\u0096 \3\2\2\2\u0097\u0098\t\r\2"+
		"\2\u0098\"\3\2\2\2\u0099\u009a\t\16\2\2\u009a$\3\2\2\2\u009b\u009c\t\17"+
		"\2\2\u009c&\3\2\2\2\u009d\u009e\t\20\2\2\u009e(\3\2\2\2\u009f\u00a0\t"+
		"\21\2\2\u00a0*\3\2\2\2\u00a1\u00a2\t\22\2\2\u00a2,\3\2\2\2\u00a3\u00a4"+
		"\t\23\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\7?\2\2\u00a7\60"+
		"\3\2\2\2\u00a8\u00a9\7~\2\2\u00a9\u00aa\7~\2\2\u00aa\62\3\2\2\2\u00ab"+
		"\u00ac\7(\2\2\u00ac\u00ad\7(\2\2\u00ad\64\3\2\2\2\u00ae\u00af\t\24\2\2"+
		"\u00af\66\3\2\2\2\u00b0\u00b2\t\25\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\b\34\2\2\u00b68\3\2\2\2\13\2D[`nsx}\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}