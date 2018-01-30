package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.ASTNode;
import com.devdaniel.icss.Service.icss.ast.Stylerule;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class StyleruleBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ASTNode currentNode = new Stylerule();

        ICSSParser.StyleruleContext styleruleContext = (ICSSParser.StyleruleContext) context;

        if(styleruleContext.selector() != null) {
            this.builder = new SelectorBuilder();
            builder.make(currentNode, styleruleContext.selector());
        }

        if(styleruleContext.statement() != null) {
            this.builder = new StatementBuilder();
            builder.make(currentNode, styleruleContext.statement());
        }

        for(ICSSParser.DeclarationContext declarationContext : styleruleContext.declaration()) {
            this.builder = new DeclarationBuilder();
            builder.make(currentNode, declarationContext);
        }

        node.addChild(currentNode);
    }
}
