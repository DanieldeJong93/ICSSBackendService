package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.*;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class SelectorBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.SelectorContext selectorContext = (ICSSParser.SelectorContext) context;

        ASTNode currentNode = null;
        if(selectorContext.classselector() != null) {
            currentNode = new ClassSelector(selectorContext.classselector().getText());
        } else if (selectorContext.tagselector() != null){
            currentNode = new TagSelector(selectorContext.tagselector().getText());
        } else if (selectorContext.idselector() != null) {
            currentNode = new IdSelector(selectorContext.idselector().getText());
        }

        node.addChild(currentNode);
    }
}
