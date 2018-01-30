package com.devdaniel.icss.Service.icss.ast;

import com.devdaniel.icss.Service.icss.checker.Checkable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * An assignment binds a expression to an identifier.
 *
 */
public class Assignment extends ASTNode implements Checkable {
	
	public VariableReference name;
	public Expression expression;

	@Override
	public String getNodeLabel() {
		return "Assignment (" + name.name + ")";
	}

	@Override
	public void addChild(ASTNode child) {
		expression = (Expression) child;
	}

	@Override
	public ArrayList<ASTNode> getChildren() {

		ArrayList<ASTNode> children = new ArrayList<>();
		children.add(name);
		children.add(expression);
		return children;
	}

	public void validate (HashMap<String, Assignment> symbolTable) {
		symbolTable.put(this.name.name, this);
	}
}
