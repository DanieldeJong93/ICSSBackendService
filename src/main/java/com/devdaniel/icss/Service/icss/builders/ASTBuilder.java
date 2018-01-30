package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.ASTNode;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class ASTBuilder {
    protected ASTBuilder builder;

    /**
     * Abstract builder to setup visit functionality
     * @param node parent node
     * @param context current context
     */
    public abstract void make (ASTNode node, ParserRuleContext context);
}
