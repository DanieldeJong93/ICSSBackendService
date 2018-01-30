package com.devdaniel.icss.Service.icss.checker;

import com.devdaniel.icss.Service.icss.ast.*;

import java.util.HashMap;

import static com.devdaniel.icss.Service.icss.ast.Operation.Operator.*;

public class Checker {

    private HashMap<String,Assignment> symbolTable;

	public void check(AST ast) {
	    //Clear symbol table
        symbolTable = new HashMap<>();

        this.checkHelper(ast.root);
		//Save the symbol table.
        ast.symboltable = symbolTable;
        //Save the verdict
		if(ast.getErrors().isEmpty()) {
            ast.checked = true;
        }
	}

	private void checkHelper (ASTNode node) {
	    if (node instanceof Checkable) {
            ((Checkable)node).validate(this.symbolTable);
        }

        for(ASTNode child : node.getChildren()) {
            this.checkHelper(child);
        }

    }
}
