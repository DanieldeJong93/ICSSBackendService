package com.devdaniel.icss.Service.icss.ast;

import com.devdaniel.icss.Service.icss.checker.Checkable;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Declaration extends ASTNode implements Checkable {
	public String property;
	public Expression expression;

	@Override
	public String getNodeLabel() {
	    return "Declaration (" + property + ")";
	}

	@Override
	public ArrayList<ASTNode> getChildren() {

		ArrayList<ASTNode> children = new ArrayList<>();
		children.add(expression);
		return children;
	}
	@Override
	public void addChild(ASTNode child) {
		expression = (Expression) child;
	}

	@Override
	public String toCss() {
		return "  " + property + ": " + expression.toCss() + ";";
	}

	/**
	 * Starts validate process by checking if the given value is a VariableReference or Operator
	 * else there is no false scenario possible cause of syntax.
	 *
	 * @param symbolTable checkers Symbol Table
	 */
	@Override
	public void validate(HashMap<String, Assignment> symbolTable) {
		if ( this.expression instanceof VariableReference) {
			Assignment assignment = symbolTable.get(((VariableReference) this.expression).name);
			if(assignment != null) {
				this.checkType(assignment.expression, symbolTable);
			}
		}
	}

	/**
	 * Checks if type is valid for Declaration implementation
	 * @param expression to check expression
	 * @param symbolTable checkers Symbol Table
	 */
	protected abstract void checkType (Expression expression, HashMap <String, Assignment> symbolTable);
}
