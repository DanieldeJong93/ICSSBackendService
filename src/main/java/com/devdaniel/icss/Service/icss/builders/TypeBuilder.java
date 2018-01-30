package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.*;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class TypeBuilder extends ASTBuilder{

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.TypeContext typeContext = (ICSSParser.TypeContext) context;

        if(typeContext.BOOLEAN_LITERAL() != null) {
            node.addChild(new BoolLiteral(typeContext.BOOLEAN_LITERAL().getText()));
        } else if (typeContext.COLOR_LITERAL() != null) {
            node.addChild(new ColorLiteral(typeContext.COLOR_LITERAL().getText()));
        } else if (typeContext.PERCENTAGE_LITERAL() != null) {
            node.addChild(new PercentageLiteral(typeContext.PERCENTAGE_LITERAL().getText()));
        } else if (typeContext.PIXEL_LITERAL() != null) {
            node.addChild(new PixelLiteral(typeContext.PIXEL_LITERAL().getText()));
        }
    }
}
