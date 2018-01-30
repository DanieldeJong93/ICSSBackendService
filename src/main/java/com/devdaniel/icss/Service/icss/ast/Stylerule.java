package com.devdaniel.icss.Service.icss.ast;

import com.devdaniel.icss.Service.icss.checker.Checkable;

import java.util.ArrayList;
import java.util.HashMap;

public class Stylerule extends ASTNode implements Checkable{
	
	public Selector selector;
	public Expression condition;
	public ArrayList<ASTNode> body;

	public Stylerule() {
		selector = null;
		condition = null;
		body = new ArrayList<>();
	}

	@Override
	public String getNodeLabel() {

        if(condition != null)
            return "Conditional stylerule";
        else
            return "Stylerule";
	}
	@Override
	public ArrayList<ASTNode> getChildren() {
		ArrayList<ASTNode> children = new ArrayList<>();
		if(selector != null)
			children.add(selector);
		if(condition != null)
			children.add(condition);
		children.addAll(body);

		return children;
	}

    @Override
    public void addChild(ASTNode child) {
		if(child instanceof Selector)
			selector = (Selector) selector;
		if(child instanceof Expression)
		    condition = (Expression) child;
		else
        	body.add(child);
    }
    @Override
    public void removeChild(ASTNode child) {
        if(selector == child)
            selector = null;
        else if(condition == child)
            condition = null;
        else
            body.remove(child);
    }

	@Override
	public String toCss() {
		StringBuilder builder = new StringBuilder();
		for (ASTNode child : this.getChildren()) {
			builder.append(child.toCss());
			builder.append("\n");
		}
		builder.append("}");
		builder.append("\n");

		return builder.toString();
	}

	/**
	 * Validation to check if given statement is a boolean expression. Only need to check for VariableReferences rest
	 * is handled by syntax.
	 *
	 * @param symbolTable checkers Symbol Table
	 */
	public void validate(HashMap<String, Assignment> symbolTable) {
		if (this.condition != null && this.condition instanceof VariableReference) {
			Assignment assignment = symbolTable.get(((VariableReference) this.condition).name);
			if(assignment != null && !(assignment.expression instanceof BoolLiteral)) {
				this.condition.setError(assignment.getNodeLabel() + " is not a valid boolean expression");
			}
		} else if(this.condition != null && this.condition instanceof BooleanOperation) {

		}
	}
}
