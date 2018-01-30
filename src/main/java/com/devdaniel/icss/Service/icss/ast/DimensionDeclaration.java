package com.devdaniel.icss.Service.icss.ast;

import java.util.HashMap;

/*
* Added this class as my syntax is more complex and needed extra differentiation to be handled in the checker
*/
public class DimensionDeclaration extends Declaration {

    @Override
    public void validate(HashMap<String, Assignment> symbolTable) {
        super.validate(symbolTable);
        if (this.expression instanceof Operation) {
            this.checkType(expression, symbolTable);
        }
    }

    /**
     * Helper function to determine if given expression is Dimensional value. Sets error if type is not dimensional
     *
     * @param expression to validate expression
     * @param symbolTable checkers Symbol Table
     */
    @Override
    protected void checkType (Expression expression, HashMap <String, Assignment> symbolTable) {
        if (!(expression instanceof PixelLiteral || expression instanceof PercentageLiteral)) {
            if(expression instanceof Operation) {
                this.checkType(((Operation) expression).rhs, symbolTable);
                this.checkType(((Operation) expression).lhs, symbolTable);
            } else if (expression instanceof VariableReference) {
                this.checkType(symbolTable.get(((VariableReference) expression).name).expression, symbolTable);
            } else {
                this.setError(expression.getNodeLabel() + " is not a Dimensional value!");
            }
        }
    }
}
