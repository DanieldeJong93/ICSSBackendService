package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.*;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class ColorExpressionBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.ColorlineContext colorlineContext = (ICSSParser.ColorlineContext) context;

        if(colorlineContext.colorvalue() != null) {
            this.builder = new ColorValueBuilder();
            this.builder.make(node, colorlineContext.colorvalue());
        } else if (colorlineContext.colorternarydeclaration() != null) {
            Expression expression = new ColorTernaryDeclaration();
            this.builder = new BooleanExpressionBuilder ();
            this.builder.make(expression, colorlineContext.colorternarydeclaration().booleanexpression());
            for (ICSSParser.ColorvalueContext colorvalueContext : colorlineContext.colorternarydeclaration().colorvalue()) {
                this.builder = new ColorValueBuilder();
                this.builder.make(expression,colorvalueContext);
            }

            node.addChild(expression);
        }
    }
}
