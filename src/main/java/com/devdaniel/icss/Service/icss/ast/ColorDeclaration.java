package com.devdaniel.icss.Service.icss.ast;

import java.util.HashMap;

/*
* Added this class as my syntax is more complex and needed extra differentiation to be handled in the checker
*/
public class ColorDeclaration extends Declaration {

    @Override
    protected void checkType(Expression expression, HashMap<String, Assignment> symbolTable) {
        if (!(expression instanceof ColorLiteral)) {
           if (expression instanceof VariableReference) {
                this.checkType(symbolTable.get(((VariableReference) expression).name).expression, symbolTable);
           } else {
                this.setError(expression.getNodeLabel() + " is not a Color value!");
           }
        }
    }
}
