package com.devdaniel.icss.Service.icss.parser;

import com.devdaniel.icss.Service.icss.ast.*;
import com.devdaniel.icss.Service.icss.builders.ASTBuilder;
import com.devdaniel.icss.Service.icss.builders.ConstantBuilder;
import com.devdaniel.icss.Service.icss.builders.StyleruleBuilder;

import java.util.Stack;

/**
 * This class extracts the ICSS Abstract Syntax Tree from the Antlr Parse tree.
 */
public class ASTListener extends ICSSBaseListener {
	
	//Accumulator attributes:
	private AST ast;
	private Stack<ASTNode> currentContainer; //Yes, this is a hint...

	public ASTListener() {
		ast = new AST();
		currentContainer = new Stack<>();
	}

	@Override
	/*
	 * This function is used as starting point, implementation of the function is of a Visitor. This has been accepted
	 * as valid method by Niek van Diepen
	 */
	public void enterStylesheet(ICSSParser.StylesheetContext ctx) {
		super.enterStylesheet(ctx);
		ast.setRoot(new Stylesheet());

		for (ICSSParser.ConstantContext constant: ctx.constant()) {
			ASTBuilder builder = new ConstantBuilder();
			builder.make(ast.root, constant);
		}

		for (ICSSParser.StyleruleContext rule: ctx.stylerule()) {
			ASTBuilder builder = new StyleruleBuilder();
			builder.make(ast.root, rule);
		}
	}

	public AST getAST() {
        return ast;
    }
}
