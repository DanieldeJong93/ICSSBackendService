package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.*;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class CalculatableBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.CalculatableContext calculatableContext = (ICSSParser.CalculatableContext)context;

        if(calculatableContext.PERCENTAGE_LITERAL() != null) {
            node.addChild(new PercentageLiteral(calculatableContext.PERCENTAGE_LITERAL().getText()));
        } else if (calculatableContext.PIXEL_LITERAL() != null) {
            node.addChild(new PixelLiteral(calculatableContext.PIXEL_LITERAL().getText()));
        } else if (calculatableContext.CONSTANTNAME() != null) {
            node.addChild(new VariableReference(calculatableContext.CONSTANTNAME().getText()));
        }
    }
}
