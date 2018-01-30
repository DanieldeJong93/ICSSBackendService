package com.devdaniel.icss.Service.icss.ast;

import com.devdaniel.icss.Service.icss.transforms.Transformable;

/**
 * Extension of Operation which is only used for Calculation operations
 */
public class CalculateOperation extends Operation implements Transformable {

    public void transform(ASTNode node) {
        if (this.lhs instanceof CalculateOperation) {
            this.lhs = this.doCalculation((CalculateOperation) this.lhs);
        }
        node.removeChild(this);
        node.addChild(this.doCalculation(this));
    }

    private Literal doCalculation(CalculateOperation operation) {
        Literal literal = null;

        if (operation.rhs instanceof PercentageLiteral) {
            float calcValue = operation.operator == Operation.Operator.PLUS ?
                    (1 + (float) ((PercentageLiteral) operation.rhs).value / 100) :
                    (1 - (float) ((PercentageLiteral) operation.rhs).value / 100);

            literal = new PixelLiteral((int) (((PixelLiteral) operation.lhs).value * calcValue));
        } else if (operation.rhs instanceof PixelLiteral) {
            float calcValue = operation.operator == Operation.Operator.PLUS ?
                    ((PixelLiteral) operation.rhs).value :
                    ((PixelLiteral) operation.rhs).value * -1;
            literal = new PixelLiteral((int) (((PixelLiteral) operation.lhs).value + calcValue));
        }

        return literal;
    }
}
