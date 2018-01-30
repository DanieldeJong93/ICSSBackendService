package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.ASTNode;
import com.devdaniel.icss.Service.icss.ast.BooleanOperation;
import com.devdaniel.icss.Service.icss.ast.Operation;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class ComparisonOperationBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.ComparisonContext comparisonContext = (ICSSParser.ComparisonContext) context;

        this.builder = new ComparableBuilder();

        Operation operation = new BooleanOperation();
        this.builder.make(operation, comparisonContext.comparable(0));
        this.builder.make(operation, comparisonContext.comparable(1));

        operation.operator = this.getOperator(comparisonContext.compoperator());

        node.addChild(operation);
    }

    private Operation.Operator getOperator (ICSSParser.CompoperatorContext context) {
        Operation.Operator operator = Operation.Operator.EQ;
        if(context.BIGGERTHAN() != null) {
            operator =  Operation.Operator.GT;
        } else if (context.SMALLERTHAN() != null) {
            operator = Operation.Operator.LT;
        } else if (context.DOUBLEEQUALS() != null) {
            operator = Operation.Operator.EQ;
        }

        return operator;
    }
}
