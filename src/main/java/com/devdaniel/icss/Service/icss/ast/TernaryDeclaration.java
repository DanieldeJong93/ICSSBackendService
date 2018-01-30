package com.devdaniel.icss.Service.icss.ast;

import com.devdaniel.icss.Service.icss.checker.Checkable;
import com.devdaniel.icss.Service.icss.transforms.Transformable;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class TernaryDeclaration extends Expression implements Checkable, Transformable{

    private Expression statement;
    private Expression trueValue;
    private Expression falseValue;

    @Override
    public void addChild(ASTNode child) {
        if(statement == null) {
            this.statement = (Expression) child;
        } else if(trueValue == null) {
            this.trueValue = (Expression) child;
        } else if (falseValue == null) {
            this.falseValue = (Expression) child;
        }
    }

    public ArrayList<ASTNode> getChildren() {
        ArrayList<ASTNode> children = new ArrayList<>();
        children.add(this.statement);
        children.add(this.trueValue);
        children.add(this.falseValue);
        return children;
    }

    @Override
    public void removeChild(ASTNode child) {
        if (this.statement == child) {
            this.statement = null;
        } else if (this.falseValue == child) {
            this.falseValue = null;
        } else if (this.trueValue == child) {
            this.trueValue = null;
        }
    }

    public String getNodeLabel() {
        return "TernaryDeclaration";
    }

    @Override
    public void validate(HashMap<String, Assignment> symbolTable) {
        if(!(this.statement instanceof BooleanOperation )){
            if (this.statement instanceof VariableReference) {
                Assignment assignment = symbolTable.get(((VariableReference) this.statement).name);
                if(assignment != null) {
                    if (!(assignment.expression instanceof BoolLiteral)) {
                        if (!(assignment.expression instanceof BooleanOperation)) {
                            this.setError(this.statement.getNodeLabel() + " is not of a boolean type");
                        }
                    }
                }
            }
        }

        this.checkExpression(this.trueValue, symbolTable);
        this.checkExpression(this.falseValue, symbolTable);
    }

    protected abstract void checkExpression (Expression expression, HashMap<String, Assignment> symbolTable);

    public void transform(ASTNode node) {
        if (this.statement instanceof BoolLiteral) {
            node.removeChild(this);
            if(((BoolLiteral) this.statement).value) {
                node.addChild(this.trueValue);
            } else {
                node.addChild(this.falseValue);
            }
        } else if (this.statement instanceof BooleanOperation) {
            ((BooleanOperation) this.statement).transform(this);
            this.transform(node);
        }
    }
}
