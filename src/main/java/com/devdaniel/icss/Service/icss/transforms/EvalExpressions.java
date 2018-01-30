package com.devdaniel.icss.Service.icss.transforms;

import com.devdaniel.icss.Service.icss.ast.*;

import java.util.HashMap;

public class EvalExpressions implements Transform {

    private HashMap<String, Assignment> symboltable; //Another hint...

    @Override
    public void apply(AST ast) {
        symboltable = ast.symboltable;

        this.replaceReferences(ast.root);
        this.doTransformations(ast.root);
    }

    private void replaceReferences(ASTNode node) {
        for (ASTNode child : node.getChildren()) {
            if (!(node instanceof Assignment)) {
                if (child instanceof VariableReference) {
                    node.removeChild(child);
                    node.addChild(this.symboltable.get(((VariableReference) child).name).expression);
                }
            }
            this.replaceReferences(child);
        }
    }

    private void doTransformations(ASTNode node) {
        for (ASTNode child : node.getChildren()) {
            if (child instanceof Transformable) {
                ((Transformable) child).transform(node);
            }
            this.doTransformations(child);
        }
    }
}
