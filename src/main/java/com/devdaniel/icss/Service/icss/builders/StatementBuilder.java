package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.ASTNode;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class StatementBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.StatementContext statementContext = (ICSSParser.StatementContext) context;

        if (statementContext.booleanexpression() != null) {
            this.builder = new BooleanExpressionBuilder();
            this.builder.make(node, statementContext.booleanexpression());
        }
        if (statementContext.extraexpression().size() > 0) {
            for (ICSSParser.ExtraexpressionContext extraexpressionContext : statementContext.extraexpression()) {
                this.builder = new ExtraExpressionBuilder();
                this.builder.make(node, extraexpressionContext);
            }
        }
    }
}
