package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.*;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class CalculationOperationBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.OperationContext operationContext = (ICSSParser.OperationContext) context;

        this.builder = new CalculatableBuilder();

        Operation operation = new CalculateOperation();
        this.builder.make(operation, operationContext.calculatable(0));
        this.builder.make(operation, operationContext.calculatable(1));

        operation.operator = operationContext.operator().DASH() != null ? Operation.Operator.MIN : Operation.Operator.PLUS;

        for(ICSSParser.ExtraoperationContext extraoperationContext : operationContext.extraoperation()) {
            if(extraoperationContext.calculatable() != null) {
                Operation operationHandler = new CalculateOperation();
                operationHandler.lhs = operation;
                operationHandler.operator = extraoperationContext.operator().DASH() != null ? Operation.Operator.MIN : Operation.Operator.PLUS;
                this.builder.make(operationHandler, extraoperationContext.calculatable());
                operation = operationHandler;
            }
        }
        node.addChild(operation);
    }

}
