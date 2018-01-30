package com.devdaniel.icss.Service.icss.ast;

import com.devdaniel.icss.Service.icss.checker.Checkable;

import java.util.HashMap;

public class VariableReference extends Expression implements Checkable {

	public String name;
	
	public VariableReference(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getNodeLabel() {
		return "VariableReference (" + name + ")";
	}

	public void validate (HashMap<String, Assignment> symbolTable) {
		for(String key : symbolTable.keySet()) {
			if (name.equals(key)) {
				return;
			}
		}

		this.setError("Variable " + name + " is not defined yet.");
	}
}
