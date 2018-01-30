package com.devdaniel.icss.Service.icss.builders;

import com.devdaniel.icss.Service.icss.ast.ASTNode;
import com.devdaniel.icss.Service.icss.ast.Assignment;
import com.devdaniel.icss.Service.icss.ast.VariableReference;
import com.devdaniel.icss.Service.icss.parser.ICSSParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class ConstantBuilder extends ASTBuilder {

    @Override
    public void make(ASTNode node, ParserRuleContext context) {
        ICSSParser.ConstantContext constantContext = (ICSSParser.ConstantContext) context;

        Assignment assignment = new Assignment();
        assignment.name = new VariableReference(constantContext.CONSTANTNAME().getText());
        this.builder = new TypeBuilder();
        this.builder.make(assignment, constantContext.type());

        node.addChild(assignment);
    }
}
