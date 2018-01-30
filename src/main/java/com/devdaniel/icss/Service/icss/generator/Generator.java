package com.devdaniel.icss.Service.icss.generator;

import com.devdaniel.icss.Service.icss.ast.*;

public class Generator {

	public String generate(AST ast) {
		return ast.root.toCss();
	}
}
