package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.*;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class ComparableBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.ComparableContext comparableContext = (ICSSParser.ComparableContext) context;

        if (comparableContext.CONSTANTNAME() != null) {
            node.addChild(new VariableReference(comparableContext.CONSTANTNAME().getText()));
        } else if(comparableContext.type() != null ) {
            this.builder = new TypeBuilder();
            this.builder.make(node, comparableContext.type());
        }else if (comparableContext.operation() != null) {
            this.builder = new CalculationOperationBuilder();
            this.builder.make(node, comparableContext.operation());
        }
    }
}
