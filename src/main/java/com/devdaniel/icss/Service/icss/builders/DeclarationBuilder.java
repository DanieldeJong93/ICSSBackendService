package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.*;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class DeclarationBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.DeclarationContext declarationContext = (ICSSParser.DeclarationContext)context;

        Declaration declaration = null;

        if(declarationContext.colorline() != null) {
            declaration = new ColorDeclaration();
            declaration.property = declarationContext.colorline().COLOR_PROPERTY().getText();
            this.builder = new ColorExpressionBuilder();
            this.builder.make(declaration, declarationContext.colorline());

        } else if (declarationContext.dimensionline() != null) {
            declaration = new DimensionDeclaration();
            declaration.property = declarationContext.dimensionline().DIMENSIONPROPERTY().getText();
            this.builder = new DimensionExpressionBuilder();
            this.builder.make(declaration, declarationContext.dimensionline());
        }

        node.addChild(declaration);
    }
}
