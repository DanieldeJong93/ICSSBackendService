// Generated from C:/Users/Danie/OneDrive/Documenten/ASD/APP/BPprog/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.7
package com.devdaniel.icss.Service.icss.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ICSSParser}.
 */
public interface ICSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void enterStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void exitStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ICSSParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ICSSParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ICSSParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ICSSParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#classselector}.
	 * @param ctx the parse tree
	 */
	void enterClassselector(ICSSParser.ClassselectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#classselector}.
	 * @param ctx the parse tree
	 */
	void exitClassselector(ICSSParser.ClassselectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#tagselector}.
	 * @param ctx the parse tree
	 */
	void enterTagselector(ICSSParser.TagselectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#tagselector}.
	 * @param ctx the parse tree
	 */
	void exitTagselector(ICSSParser.TagselectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#idselector}.
	 * @param ctx the parse tree
	 */
	void enterIdselector(ICSSParser.IdselectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#idselector}.
	 * @param ctx the parse tree
	 */
	void exitIdselector(ICSSParser.IdselectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ICSSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ICSSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#colorline}.
	 * @param ctx the parse tree
	 */
	void enterColorline(ICSSParser.ColorlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#colorline}.
	 * @param ctx the parse tree
	 */
	void exitColorline(ICSSParser.ColorlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#dimensionline}.
	 * @param ctx the parse tree
	 */
	void enterDimensionline(ICSSParser.DimensionlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#dimensionline}.
	 * @param ctx the parse tree
	 */
	void exitDimensionline(ICSSParser.DimensionlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#colorternarydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterColorternarydeclaration(ICSSParser.ColorternarydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#colorternarydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitColorternarydeclaration(ICSSParser.ColorternarydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#dimensionternarydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDimensionternarydeclaration(ICSSParser.DimensionternarydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#dimensionternarydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDimensionternarydeclaration(ICSSParser.DimensionternarydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ICSSParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ICSSParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#extraoperation}.
	 * @param ctx the parse tree
	 */
	void enterExtraoperation(ICSSParser.ExtraoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#extraoperation}.
	 * @param ctx the parse tree
	 */
	void exitExtraoperation(ICSSParser.ExtraoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ICSSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ICSSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexpression(ICSSParser.BooleanexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexpression(ICSSParser.BooleanexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#extraexpression}.
	 * @param ctx the parse tree
	 */
	void enterExtraexpression(ICSSParser.ExtraexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#extraexpression}.
	 * @param ctx the parse tree
	 */
	void exitExtraexpression(ICSSParser.ExtraexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ICSSParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ICSSParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ICSSParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ICSSParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#comparable}.
	 * @param ctx the parse tree
	 */
	void enterComparable(ICSSParser.ComparableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#comparable}.
	 * @param ctx the parse tree
	 */
	void exitComparable(ICSSParser.ComparableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#dimensionvalue}.
	 * @param ctx the parse tree
	 */
	void enterDimensionvalue(ICSSParser.DimensionvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#dimensionvalue}.
	 * @param ctx the parse tree
	 */
	void exitDimensionvalue(ICSSParser.DimensionvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#colorvalue}.
	 * @param ctx the parse tree
	 */
	void enterColorvalue(ICSSParser.ColorvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#colorvalue}.
	 * @param ctx the parse tree
	 */
	void exitColorvalue(ICSSParser.ColorvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#calculatable}.
	 * @param ctx the parse tree
	 */
	void enterCalculatable(ICSSParser.CalculatableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#calculatable}.
	 * @param ctx the parse tree
	 */
	void exitCalculatable(ICSSParser.CalculatableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(ICSSParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(ICSSParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#compoperator}.
	 * @param ctx the parse tree
	 */
	void enterCompoperator(ICSSParser.CompoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#compoperator}.
	 * @param ctx the parse tree
	 */
	void exitCompoperator(ICSSParser.CompoperatorContext ctx);
}