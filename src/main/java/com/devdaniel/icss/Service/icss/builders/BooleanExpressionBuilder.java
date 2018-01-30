package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.ASTNode;
import com.devdaniel.icss.Service.icss.ast.VariableReference;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class BooleanExpressionBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.BooleanexpressionContext booleanexpressionContext = (ICSSParser.BooleanexpressionContext) context;

        if(booleanexpressionContext.CONSTANTNAME() != null) {
            node.addChild(new VariableReference(booleanexpressionContext.CONSTANTNAME().getText()));
        }

        if(booleanexpressionContext.comparison() != null) {
            this.builder = new ComparisonOperationBuilder();
            this.builder.make(node, booleanexpressionContext.comparison());
        }
    }
}
