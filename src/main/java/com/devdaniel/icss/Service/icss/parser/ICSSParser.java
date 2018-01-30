// Generated from C:/Users/Danie/OneDrive/Documenten/ASD/APP/BPprog/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.7
package com.devdaniel.icss.Service.icss.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ICSSParser extends Parser {
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
	public static final int
		RULE_stylesheet = 0, RULE_stylerule = 1, RULE_constant = 2, RULE_selector = 3, 
		RULE_classselector = 4, RULE_tagselector = 5, RULE_idselector = 6, RULE_declaration = 7, 
		RULE_colorline = 8, RULE_dimensionline = 9, RULE_colorternarydeclaration = 10, 
		RULE_dimensionternarydeclaration = 11, RULE_operation = 12, RULE_extraoperation = 13, 
		RULE_statement = 14, RULE_booleanexpression = 15, RULE_extraexpression = 16, 
		RULE_comparison = 17, RULE_type = 18, RULE_comparable = 19, RULE_dimensionvalue = 20, 
		RULE_colorvalue = 21, RULE_calculatable = 22, RULE_operator = 23, RULE_compoperator = 24;
	public static final String[] ruleNames = {
		"stylesheet", "stylerule", "constant", "selector", "classselector", "tagselector", 
		"idselector", "declaration", "colorline", "dimensionline", "colorternarydeclaration", 
		"dimensionternarydeclaration", "operation", "extraoperation", "statement", 
		"booleanexpression", "extraexpression", "comparison", "type", "comparable", 
		"dimensionvalue", "colorvalue", "calculatable", "operator", "compoperator"
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

	@Override
	public String getGrammarFileName() { return "ICSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ICSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StylesheetContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<StyleruleContext> stylerule() {
			return getRuleContexts(StyleruleContext.class);
		}
		public StyleruleContext stylerule(int i) {
			return getRuleContext(StyleruleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylesheet(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << CONSTANTNAME) | (1L << HASH) | (1L << DOT))) != 0)) {
				{
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONSTANTNAME:
					{
					setState(50);
					constant();
					}
					break;
				case TEXT:
				case HASH:
				case DOT:
					{
					setState(51);
					stylerule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(56);
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

	public static class StyleruleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode CURLYOPEN() { return getToken(ICSSParser.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(ICSSParser.CURLYCLOSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public StyleruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylerule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylerule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylerule(this);
		}
	}

	public final StyleruleContext stylerule() throws RecognitionException {
		StyleruleContext _localctx = new StyleruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stylerule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			selector();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQUAREOPEN) {
				{
				setState(58);
				statement();
				}
			}

			setState(61);
			match(CURLYOPEN);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				declaration();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIMENSIONPROPERTY || _la==COLOR_PROPERTY );
			setState(67);
			match(CURLYCLOSE);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONSTANTNAME() { return getToken(ICSSParser.CONSTANTNAME, 0); }
		public TerminalNode COLON() { return getToken(ICSSParser.COLON, 0); }
		public TerminalNode EQUALS() { return getToken(ICSSParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ICSSParser.SEMICOLON, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CONSTANTNAME);
			setState(70);
			match(COLON);
			setState(71);
			match(EQUALS);
			setState(72);
			type();
			setState(73);
			match(SEMICOLON);
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

	public static class SelectorContext extends ParserRuleContext {
		public ClassselectorContext classselector() {
			return getRuleContext(ClassselectorContext.class,0);
		}
		public TagselectorContext tagselector() {
			return getRuleContext(TagselectorContext.class,0);
		}
		public IdselectorContext idselector() {
			return getRuleContext(IdselectorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(75);
				classselector();
				}
				break;
			case TEXT:
				{
				setState(76);
				tagselector();
				}
				break;
			case HASH:
				{
				setState(77);
				idselector();
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

	public static class ClassselectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ICSSParser.DOT, 0); }
		public TerminalNode TEXT() { return getToken(ICSSParser.TEXT, 0); }
		public ClassselectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classselector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterClassselector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitClassselector(this);
		}
	}

	public final ClassselectorContext classselector() throws RecognitionException {
		ClassselectorContext _localctx = new ClassselectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classselector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(DOT);
			setState(81);
			match(TEXT);
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

	public static class TagselectorContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ICSSParser.TEXT, 0); }
		public TagselectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagselector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterTagselector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitTagselector(this);
		}
	}

	public final TagselectorContext tagselector() throws RecognitionException {
		TagselectorContext _localctx = new TagselectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tagselector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(TEXT);
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

	public static class IdselectorContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(ICSSParser.HASH, 0); }
		public TerminalNode TEXT() { return getToken(ICSSParser.TEXT, 0); }
		public IdselectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idselector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterIdselector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitIdselector(this);
		}
	}

	public final IdselectorContext idselector() throws RecognitionException {
		IdselectorContext _localctx = new IdselectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_idselector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(HASH);
			setState(86);
			match(TEXT);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ICSSParser.SEMICOLON, 0); }
		public ColorlineContext colorline() {
			return getRuleContext(ColorlineContext.class,0);
		}
		public DimensionlineContext dimensionline() {
			return getRuleContext(DimensionlineContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR_PROPERTY:
				{
				setState(88);
				colorline();
				}
				break;
			case DIMENSIONPROPERTY:
				{
				setState(89);
				dimensionline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(92);
			match(SEMICOLON);
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

	public static class ColorlineContext extends ParserRuleContext {
		public TerminalNode COLOR_PROPERTY() { return getToken(ICSSParser.COLOR_PROPERTY, 0); }
		public TerminalNode COLON() { return getToken(ICSSParser.COLON, 0); }
		public ColorvalueContext colorvalue() {
			return getRuleContext(ColorvalueContext.class,0);
		}
		public ColorternarydeclarationContext colorternarydeclaration() {
			return getRuleContext(ColorternarydeclarationContext.class,0);
		}
		public ColorlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterColorline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitColorline(this);
		}
	}

	public final ColorlineContext colorline() throws RecognitionException {
		ColorlineContext _localctx = new ColorlineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_colorline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(COLOR_PROPERTY);
			setState(95);
			match(COLON);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(96);
				colorvalue();
				}
				break;
			case 2:
				{
				setState(97);
				colorternarydeclaration();
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

	public static class DimensionlineContext extends ParserRuleContext {
		public TerminalNode DIMENSIONPROPERTY() { return getToken(ICSSParser.DIMENSIONPROPERTY, 0); }
		public TerminalNode COLON() { return getToken(ICSSParser.COLON, 0); }
		public DimensionvalueContext dimensionvalue() {
			return getRuleContext(DimensionvalueContext.class,0);
		}
		public DimensionternarydeclarationContext dimensionternarydeclaration() {
			return getRuleContext(DimensionternarydeclarationContext.class,0);
		}
		public DimensionlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterDimensionline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitDimensionline(this);
		}
	}

	public final DimensionlineContext dimensionline() throws RecognitionException {
		DimensionlineContext _localctx = new DimensionlineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensionline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(DIMENSIONPROPERTY);
			setState(101);
			match(COLON);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(102);
				dimensionvalue();
				}
				break;
			case 2:
				{
				setState(103);
				dimensionternarydeclaration();
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

	public static class ColorternarydeclarationContext extends ParserRuleContext {
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public TerminalNode TERNARYOPERATOR() { return getToken(ICSSParser.TERNARYOPERATOR, 0); }
		public List<ColorvalueContext> colorvalue() {
			return getRuleContexts(ColorvalueContext.class);
		}
		public ColorvalueContext colorvalue(int i) {
			return getRuleContext(ColorvalueContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ICSSParser.COLON, 0); }
		public List<ExtraexpressionContext> extraexpression() {
			return getRuleContexts(ExtraexpressionContext.class);
		}
		public ExtraexpressionContext extraexpression(int i) {
			return getRuleContext(ExtraexpressionContext.class,i);
		}
		public ColorternarydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorternarydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterColorternarydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitColorternarydeclaration(this);
		}
	}

	public final ColorternarydeclarationContext colorternarydeclaration() throws RecognitionException {
		ColorternarydeclarationContext _localctx = new ColorternarydeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_colorternarydeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			booleanexpression();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLEPIPE || _la==DOUBLEAMPERSAND) {
				{
				{
				setState(107);
				extraexpression();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(TERNARYOPERATOR);
			setState(114);
			colorvalue();
			setState(115);
			match(COLON);
			setState(116);
			colorvalue();
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

	public static class DimensionternarydeclarationContext extends ParserRuleContext {
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public TerminalNode TERNARYOPERATOR() { return getToken(ICSSParser.TERNARYOPERATOR, 0); }
		public List<DimensionvalueContext> dimensionvalue() {
			return getRuleContexts(DimensionvalueContext.class);
		}
		public DimensionvalueContext dimensionvalue(int i) {
			return getRuleContext(DimensionvalueContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ICSSParser.COLON, 0); }
		public List<ExtraexpressionContext> extraexpression() {
			return getRuleContexts(ExtraexpressionContext.class);
		}
		public ExtraexpressionContext extraexpression(int i) {
			return getRuleContext(ExtraexpressionContext.class,i);
		}
		public DimensionternarydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionternarydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterDimensionternarydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitDimensionternarydeclaration(this);
		}
	}

	public final DimensionternarydeclarationContext dimensionternarydeclaration() throws RecognitionException {
		DimensionternarydeclarationContext _localctx = new DimensionternarydeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dimensionternarydeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			booleanexpression();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLEPIPE || _la==DOUBLEAMPERSAND) {
				{
				{
				setState(119);
				extraexpression();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(TERNARYOPERATOR);
			setState(126);
			dimensionvalue();
			setState(127);
			match(COLON);
			setState(128);
			dimensionvalue();
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

	public static class OperationContext extends ParserRuleContext {
		public List<CalculatableContext> calculatable() {
			return getRuleContexts(CalculatableContext.class);
		}
		public CalculatableContext calculatable(int i) {
			return getRuleContext(CalculatableContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<ExtraoperationContext> extraoperation() {
			return getRuleContexts(ExtraoperationContext.class);
		}
		public ExtraoperationContext extraoperation(int i) {
			return getRuleContext(ExtraoperationContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			calculatable();
			setState(131);
			operator();
			setState(132);
			calculatable();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==DASH) {
				{
				{
				setState(133);
				extraoperation();
				}
				}
				setState(138);
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

	public static class ExtraoperationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public CalculatableContext calculatable() {
			return getRuleContext(CalculatableContext.class,0);
		}
		public ExtraoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraoperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterExtraoperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitExtraoperation(this);
		}
	}

	public final ExtraoperationContext extraoperation() throws RecognitionException {
		ExtraoperationContext _localctx = new ExtraoperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_extraoperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			operator();
			setState(140);
			calculatable();
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
		public TerminalNode SQUAREOPEN() { return getToken(ICSSParser.SQUAREOPEN, 0); }
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public TerminalNode SQUARECLOSE() { return getToken(ICSSParser.SQUARECLOSE, 0); }
		public List<ExtraexpressionContext> extraexpression() {
			return getRuleContexts(ExtraexpressionContext.class);
		}
		public ExtraexpressionContext extraexpression(int i) {
			return getRuleContext(ExtraexpressionContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(SQUAREOPEN);
			setState(143);
			booleanexpression();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLEPIPE || _la==DOUBLEAMPERSAND) {
				{
				{
				setState(144);
				extraexpression();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(SQUARECLOSE);
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

	public static class BooleanexpressionContext extends ParserRuleContext {
		public TerminalNode CONSTANTNAME() { return getToken(ICSSParser.CONSTANTNAME, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public BooleanexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterBooleanexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitBooleanexpression(this);
		}
	}

	public final BooleanexpressionContext booleanexpression() throws RecognitionException {
		BooleanexpressionContext _localctx = new BooleanexpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_booleanexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(152);
				match(CONSTANTNAME);
				}
				break;
			case 2:
				{
				setState(153);
				comparison();
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

	public static class ExtraexpressionContext extends ParserRuleContext {
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public TerminalNode DOUBLEPIPE() { return getToken(ICSSParser.DOUBLEPIPE, 0); }
		public TerminalNode DOUBLEAMPERSAND() { return getToken(ICSSParser.DOUBLEAMPERSAND, 0); }
		public ExtraexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterExtraexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitExtraexpression(this);
		}
	}

	public final ExtraexpressionContext extraexpression() throws RecognitionException {
		ExtraexpressionContext _localctx = new ExtraexpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_extraexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==DOUBLEPIPE || _la==DOUBLEAMPERSAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			booleanexpression();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ComparableContext> comparable() {
			return getRuleContexts(ComparableContext.class);
		}
		public ComparableContext comparable(int i) {
			return getRuleContext(ComparableContext.class,i);
		}
		public CompoperatorContext compoperator() {
			return getRuleContext(CompoperatorContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			comparable();
			setState(160);
			compoperator();
			setState(161);
			comparable();
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
		public TerminalNode COLOR_LITERAL() { return getToken(ICSSParser.COLOR_LITERAL, 0); }
		public TerminalNode PERCENTAGE_LITERAL() { return getToken(ICSSParser.PERCENTAGE_LITERAL, 0); }
		public TerminalNode PIXEL_LITERAL() { return getToken(ICSSParser.PIXEL_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ICSSParser.BOOLEAN_LITERAL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIXEL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << PERCENTAGE_LITERAL) | (1L << COLOR_LITERAL))) != 0)) ) {
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

	public static class ComparableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CONSTANTNAME() { return getToken(ICSSParser.CONSTANTNAME, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ComparableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterComparable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitComparable(this);
		}
	}

	public final ComparableContext comparable() throws RecognitionException {
		ComparableContext _localctx = new ComparableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(165);
				type();
				}
				break;
			case 2:
				{
				setState(166);
				match(CONSTANTNAME);
				}
				break;
			case 3:
				{
				setState(167);
				operation();
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

	public static class DimensionvalueContext extends ParserRuleContext {
		public TerminalNode PERCENTAGE_LITERAL() { return getToken(ICSSParser.PERCENTAGE_LITERAL, 0); }
		public TerminalNode PIXEL_LITERAL() { return getToken(ICSSParser.PIXEL_LITERAL, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode CONSTANTNAME() { return getToken(ICSSParser.CONSTANTNAME, 0); }
		public DimensionvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterDimensionvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitDimensionvalue(this);
		}
	}

	public final DimensionvalueContext dimensionvalue() throws RecognitionException {
		DimensionvalueContext _localctx = new DimensionvalueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dimensionvalue);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(PERCENTAGE_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(PIXEL_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(CONSTANTNAME);
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

	public static class ColorvalueContext extends ParserRuleContext {
		public TerminalNode COLOR_LITERAL() { return getToken(ICSSParser.COLOR_LITERAL, 0); }
		public TerminalNode CONSTANTNAME() { return getToken(ICSSParser.CONSTANTNAME, 0); }
		public ColorvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterColorvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitColorvalue(this);
		}
	}

	public final ColorvalueContext colorvalue() throws RecognitionException {
		ColorvalueContext _localctx = new ColorvalueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_colorvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==CONSTANTNAME || _la==COLOR_LITERAL) ) {
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

	public static class CalculatableContext extends ParserRuleContext {
		public TerminalNode CONSTANTNAME() { return getToken(ICSSParser.CONSTANTNAME, 0); }
		public TerminalNode PERCENTAGE_LITERAL() { return getToken(ICSSParser.PERCENTAGE_LITERAL, 0); }
		public TerminalNode PIXEL_LITERAL() { return getToken(ICSSParser.PIXEL_LITERAL, 0); }
		public CalculatableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculatable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterCalculatable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitCalculatable(this);
		}
	}

	public final CalculatableContext calculatable() throws RecognitionException {
		CalculatableContext _localctx = new CalculatableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_calculatable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIXEL_LITERAL) | (1L << CONSTANTNAME) | (1L << PERCENTAGE_LITERAL))) != 0)) ) {
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(ICSSParser.SUM, 0); }
		public TerminalNode DASH() { return getToken(ICSSParser.DASH, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==SUM || _la==DASH) ) {
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

	public static class CompoperatorContext extends ParserRuleContext {
		public TerminalNode BIGGERTHAN() { return getToken(ICSSParser.BIGGERTHAN, 0); }
		public TerminalNode SMALLERTHAN() { return getToken(ICSSParser.SMALLERTHAN, 0); }
		public TerminalNode DOUBLEEQUALS() { return getToken(ICSSParser.DOUBLEEQUALS, 0); }
		public CompoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterCompoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitCompoperator(this);
		}
	}

	public final CompoperatorContext compoperator() throws RecognitionException {
		CompoperatorContext _localctx = new CompoperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_compoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGERTHAN) | (1L << SMALLERTHAN) | (1L << DOUBLEEQUALS))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\3\3\5\3>\n\3\3\3\3\3"+
		"\6\3B\n\3\r\3\16\3C\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5Q\n"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t]\n\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\ne\n\n\3\13\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\7\fo\n\f\f\f\16"+
		"\fr\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r{\n\r\f\r\16\r~\13\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0089\n\16\f\16\16\16\u008c\13\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u0094\n\20\f\20\16\20\u0097\13\20"+
		"\3\20\3\20\3\21\3\21\5\21\u009d\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\5\25\u00ab\n\25\3\26\3\26\3\26\3\26\5\26\u00b1"+
		"\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\b\3\2\32\33\4\2\5\6\t\n\4"+
		"\2\b\b\n\n\4\2\5\5\b\t\3\2\24\25\3\2\27\31\2\u00b4\28\3\2\2\2\4;\3\2\2"+
		"\2\6G\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fU\3\2\2\2\16W\3\2\2\2\20\\\3\2\2"+
		"\2\22`\3\2\2\2\24f\3\2\2\2\26l\3\2\2\2\30x\3\2\2\2\32\u0084\3\2\2\2\34"+
		"\u008d\3\2\2\2\36\u0090\3\2\2\2 \u009c\3\2\2\2\"\u009e\3\2\2\2$\u00a1"+
		"\3\2\2\2&\u00a5\3\2\2\2(\u00aa\3\2\2\2*\u00b0\3\2\2\2,\u00b2\3\2\2\2."+
		"\u00b4\3\2\2\2\60\u00b6\3\2\2\2\62\u00b8\3\2\2\2\64\67\5\6\4\2\65\67\5"+
		"\4\3\2\66\64\3\2\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29"+
		"\3\3\2\2\2:8\3\2\2\2;=\5\b\5\2<>\5\36\20\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2"+
		"\2?A\7\f\2\2@B\5\20\t\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2"+
		"\2\2EF\7\r\2\2F\5\3\2\2\2GH\7\b\2\2HI\7\22\2\2IJ\7\23\2\2JK\5&\24\2KL"+
		"\7\20\2\2L\7\3\2\2\2MQ\5\n\6\2NQ\5\f\7\2OQ\5\16\b\2PM\3\2\2\2PN\3\2\2"+
		"\2PO\3\2\2\2Q\t\3\2\2\2RS\7\21\2\2ST\7\7\2\2T\13\3\2\2\2UV\7\7\2\2V\r"+
		"\3\2\2\2WX\7\13\2\2XY\7\7\2\2Y\17\3\2\2\2Z]\5\22\n\2[]\5\24\13\2\\Z\3"+
		"\2\2\2\\[\3\2\2\2]^\3\2\2\2^_\7\20\2\2_\21\3\2\2\2`a\7\4\2\2ad\7\22\2"+
		"\2be\5,\27\2ce\5\26\f\2db\3\2\2\2dc\3\2\2\2e\23\3\2\2\2fg\7\3\2\2gj\7"+
		"\22\2\2hk\5*\26\2ik\5\30\r\2jh\3\2\2\2ji\3\2\2\2k\25\3\2\2\2lp\5 \21\2"+
		"mo\5\"\22\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2"+
		"\2st\7\34\2\2tu\5,\27\2uv\7\22\2\2vw\5,\27\2w\27\3\2\2\2x|\5 \21\2y{\5"+
		"\"\22\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2"+
		"\177\u0080\7\34\2\2\u0080\u0081\5*\26\2\u0081\u0082\7\22\2\2\u0082\u0083"+
		"\5*\26\2\u0083\31\3\2\2\2\u0084\u0085\5.\30\2\u0085\u0086\5\60\31\2\u0086"+
		"\u008a\5.\30\2\u0087\u0089\5\34\17\2\u0088\u0087\3\2\2\2\u0089\u008c\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\33\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\5\60\31\2\u008e\u008f\5.\30\2\u008f\35\3\2"+
		"\2\2\u0090\u0091\7\16\2\2\u0091\u0095\5 \21\2\u0092\u0094\5\"\22\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\17\2\2\u0099"+
		"\37\3\2\2\2\u009a\u009d\7\b\2\2\u009b\u009d\5$\23\2\u009c\u009a\3\2\2"+
		"\2\u009c\u009b\3\2\2\2\u009d!\3\2\2\2\u009e\u009f\t\2\2\2\u009f\u00a0"+
		"\5 \21\2\u00a0#\3\2\2\2\u00a1\u00a2\5(\25\2\u00a2\u00a3\5\62\32\2\u00a3"+
		"\u00a4\5(\25\2\u00a4%\3\2\2\2\u00a5\u00a6\t\3\2\2\u00a6\'\3\2\2\2\u00a7"+
		"\u00ab\5&\24\2\u00a8\u00ab\7\b\2\2\u00a9\u00ab\5\32\16\2\u00aa\u00a7\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab)\3\2\2\2\u00ac\u00b1"+
		"\7\t\2\2\u00ad\u00b1\7\5\2\2\u00ae\u00b1\5\32\16\2\u00af\u00b1\7\b\2\2"+
		"\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1+\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3-\3\2\2\2\u00b4\u00b5"+
		"\t\5\2\2\u00b5/\3\2\2\2\u00b6\u00b7\t\6\2\2\u00b7\61\3\2\2\2\u00b8\u00b9"+
		"\t\7\2\2\u00b9\63\3\2\2\2\21\668=CP\\djp|\u008a\u0095\u009c\u00aa\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}