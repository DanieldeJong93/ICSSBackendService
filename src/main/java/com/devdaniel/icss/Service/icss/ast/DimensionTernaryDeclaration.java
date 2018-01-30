package com.devdaniel.icss.Service.icss.ast;

import java.util.HashMap;

public class DimensionTernaryDeclaration extends TernaryDeclaration {

    protected void checkExpression (Expression expression, HashMap<String, Assignment> symbolTable) {
        if (!(expression instanceof PixelLiteral) && !(expression instanceof PercentageLiteral)) {
            if(expression instanceof Operation) {
                this.checkExpression(((Operation) expression).rhs, symbolTable);
                this.checkExpression(((Operation) expression).lhs, symbolTable);
            } else if (!(expression instanceof VariableReference)) {
                this.setError(expression.getNodeLabel() + " is not a Dimensional value!");
            }
        }
    }
}
