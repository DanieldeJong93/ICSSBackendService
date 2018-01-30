package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.ASTNode;
import com.devdaniel.icss.Service.icss.ast.PercentageLiteral;
import com.devdaniel.icss.Service.icss.ast.PixelLiteral;
import com.devdaniel.icss.Service.icss.ast.VariableReference;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class DimensionValueBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.DimensionvalueContext dimensionvalueContext = (ICSSParser.DimensionvalueContext) context;

        if(dimensionvalueContext.PIXEL_LITERAL() != null){
            node.addChild(new PixelLiteral(dimensionvalueContext.PIXEL_LITERAL().getText()));
        } else if (dimensionvalueContext.PERCENTAGE_LITERAL() != null) {
            node.addChild(new PercentageLiteral(dimensionvalueContext.PERCENTAGE_LITERAL().getText()));
        } else if (dimensionvalueContext.operation() != null) {
            this.builder = new CalculationOperationBuilder();
            this.builder.make(node, dimensionvalueContext.operation());
        } else if (dimensionvalueContext.CONSTANTNAME() != null) {
            node.addChild(new VariableReference(dimensionvalueContext.CONSTANTNAME().getText()));
        }
    }
}
