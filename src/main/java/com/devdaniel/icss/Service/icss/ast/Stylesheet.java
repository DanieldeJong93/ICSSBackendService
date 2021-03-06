package com.devdaniel.icss.Service.icss.ast;

import java.util.ArrayList;

/**
 * A stylesheet is the root node of the AST, it consists of one or more statements
 *
 */
public class Stylesheet extends ASTNode {


	public ArrayList<ASTNode> body;
	
	public Stylesheet() {
		this.body = new ArrayList<>();
	}
	public Stylesheet(ArrayList<ASTNode> body) {
		this.body = body;
	}
	@Override
	public String getNodeLabel() {
		return "Stylesheet";
	}
	@Override
	public ArrayList<ASTNode> getChildren() {
		return this.body;
	}
	@Override
	public void addChild(ASTNode child) {
	    	body.add(child);
	}
	@Override
	public void removeChild(ASTNode child) {
		body.remove(child);
	}

	@Override
	public String toCss() {
		StringBuilder builder = new StringBuilder();
		for (ASTNode child : this.getChildren()) {
			if (child instanceof Stylerule) {
				builder.append(child.toCss());
			}
		}

		return builder.toString();
	}
}
