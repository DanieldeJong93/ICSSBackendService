package com.devdaniel.icss.Service.icss.ast;

import com.devdaniel.icss.Service.icss.checker.Checkable;
import com.devdaniel.icss.Service.icss.transforms.Transformable;

import java.util.HashMap;

/**
 * Extension of Operation which is used only for boolean operations
 */
public class BooleanOperation extends Operation implements Transformable, Checkable {

    public void validate(HashMap<String, Assignment> symbolTable) {
        this.checkType(this.lhs, symbolTable);
        this.checkType(this.rhs, symbolTable);
    }

    private void checkType(Expression expression, HashMap<String, Assignment> symbolTable) {
        if (!(expression instanceof BooleanOperation)) {
            if (this.operator != Operator.LT && this.operator != Operator.GT) {
                if (expression instanceof VariableReference) {
                    Assignment assignment = symbolTable.get(((VariableReference) expression).name);
                    if (assignment != null) {
                        if (!(assignment.expression instanceof BoolLiteral)) {
                            if (!(assignment.expression instanceof BooleanOperation)) {
                                this.setError(expression.getNodeLabel() + " is not of a boolean type");
                            }
                        }
                    }
                }
            } else {
                if (expression instanceof VariableReference) {
                    Assignment assignment = symbolTable.get(((VariableReference) expression).name);
                    if (assignment != null) {
                        if (!(assignment.expression instanceof PixelLiteral) && !(assignment.expression instanceof PercentageLiteral)) {
                            if (!(assignment.expression instanceof CalculateOperation)) {
                                this.setError(expression.getNodeLabel() + " is not of a Dimensional type");
                            }
                        }
                    }
                }
            }
        }
    }

    public void transform(ASTNode node) {
        for (ASTNode child : this.getChildren()) {
            if (child instanceof BooleanOperation) {
                this.removeChild(child);
                this.addChild(this.doBooleanExpression((BooleanOperation) child));
            }
        }

        node.removeChild(this);
        node.addChild(doBooleanExpression(this));
    }

    private Literal doBooleanExpression(BooleanOperation operation) {
        Literal literal = null;
        if (operation.lhs instanceof BooleanOperation) {
            operation.lhs = this.doBooleanExpression((BooleanOperation) operation.lhs);
        }
        if (operation.rhs instanceof BooleanOperation) {
            operation.rhs = this.doBooleanExpression((BooleanOperation) operation.rhs);
        }

        if (operation.operator == Operator.GT) {
            literal = new BoolLiteral(((PixelLiteral) operation.lhs).value > ((PixelLiteral) operation.rhs).value);
        } else if (operation.operator == Operator.LT) {
            literal = new BoolLiteral(((PixelLiteral) operation.lhs).value < ((PixelLiteral) operation.rhs).value);
        } else if (operation.operator == Operator.OR) {
            literal = new BoolLiteral(((BoolLiteral) operation.lhs).value || ((BoolLiteral) operation.rhs).value);
        } else if (operation.operator == Operator.AND) {
            literal = new BoolLiteral(((BoolLiteral) operation.lhs).value && ((BoolLiteral) operation.rhs).value);
        }

        return literal;
    }
}
