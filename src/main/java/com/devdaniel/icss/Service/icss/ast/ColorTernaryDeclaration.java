package com.devdaniel.icss.Service.icss.ast;

import java.util.HashMap;

public class ColorTernaryDeclaration extends TernaryDeclaration {

    protected void checkExpression (Expression expression, HashMap<String, Assignment> symbolTable) {
        if (!(expression instanceof ColorLiteral)) {
            if (expression instanceof VariableReference) {
                this.checkExpression(symbolTable.get(((VariableReference) expression).name).expression, symbolTable);
            } else {
                this.setError(expression.getNodeLabel() + " is not a Color value!");
            }
        }
    }
}
