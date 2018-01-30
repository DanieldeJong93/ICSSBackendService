package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.*;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class DimensionExpressionBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.DimensionlineContext dimensionlineContext = (ICSSParser.DimensionlineContext) context;

        if(dimensionlineContext.dimensionvalue() != null) {
            this.builder = new DimensionValueBuilder();
            this.builder.make(node, dimensionlineContext.dimensionvalue());
        } else if (dimensionlineContext.dimensionternarydeclaration() != null) {
            Expression expression = new DimensionTernaryDeclaration();
            this.builder = new BooleanExpressionBuilder ();
            this.builder.make(expression, dimensionlineContext.dimensionternarydeclaration().booleanexpression());
            if (dimensionlineContext.dimensionternarydeclaration().extraexpression().size() > 0) {
                for (ICSSParser.ExtraexpressionContext extraexpressionContext : dimensionlineContext.dimensionternarydeclaration().extraexpression()) {
                    this.builder = new ExtraExpressionBuilder();
                    this.builder.make(expression, extraexpressionContext);
                }
            }
            for (ICSSParser.DimensionvalueContext dimensionvalueContext : dimensionlineContext.dimensionternarydeclaration().dimensionvalue()) {
                this.builder = new DimensionValueBuilder();
                this.builder.make(expression,dimensionvalueContext);
            }

            node.addChild(expression);
        }
    }
}
