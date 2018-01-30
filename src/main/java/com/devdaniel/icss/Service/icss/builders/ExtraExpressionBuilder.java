package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.ASTNode;
import com.devdaniel.icss.Service.icss.ast.BooleanOperation;
import com.devdaniel.icss.Service.icss.ast.Expression;
import com.devdaniel.icss.Service.icss.ast.Operation;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class ExtraExpressionBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.ExtraexpressionContext extraexpressionContext = (ICSSParser.ExtraexpressionContext) context;
        this.builder = new BooleanExpressionBuilder();

        if (extraexpressionContext.booleanexpression() != null) {
            Operation operation = new BooleanOperation();
            operation.lhs = (Expression) node.getChildren().get(0);
            node.removeChild(operation.lhs);
            this.builder.make(operation, extraexpressionContext.booleanexpression());
            if(extraexpressionContext.DOUBLEPIPE() != null) {
                operation.operator = Operation.Operator.OR;
            } else if (extraexpressionContext.DOUBLEAMPERSAND() != null) {
                operation.operator = Operation.Operator.AND;
            }
            node.addChild(operation);
        }
    }
}
