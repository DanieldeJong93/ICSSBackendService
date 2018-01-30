package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.ASTNode;
import com.devdaniel.icss.Service.icss.ast.ColorLiteral;
import com.devdaniel.icss.Service.icss.ast.VariableReference;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class ColorValueBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.ColorvalueContext colorvalueContext = (ICSSParser.ColorvalueContext) context;

        if(colorvalueContext.COLOR_LITERAL() != null) {
            node.addChild(new ColorLiteral(colorvalueContext.COLOR_LITERAL().getText()));
        } else if (colorvalueContext.CONSTANTNAME() != null) {
            node.addChild(new VariableReference(colorvalueContext.CONSTANTNAME().getText()));
        }
    }
}
