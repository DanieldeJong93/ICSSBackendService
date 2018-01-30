package com.devdaniel.icss.Service.icss.transforms;

import com.devdaniel.icss.Service.icss.ast.*;

import java.util.ArrayList;
import java.util.List;

public class EliminateOptionals implements Transform {

    private List<ASTNode> toRemoveStyleRules;

    @Override
    public void apply(AST ast) {
        toRemoveStyleRules = new ArrayList<>();
        for (ASTNode child : ast.root.getChildren()) {
            if (child instanceof Stylerule) {
                this.setInvalidStatements((Stylerule) child);
            }
        }

        for (ASTNode child : toRemoveStyleRules) {
            ast.root.removeChild(child);
        }
    }

    /**
     * Checks if statement is invalid, if statement is invalid it adds the stylerule to the toRemoveStyleRules List,
     * if the statement is valid is removes the statement so it's not being show.
     *
     * @param stylerule to check StyleRule
     */
    private void setInvalidStatements (Stylerule stylerule) {
        if (stylerule.condition instanceof BoolLiteral) {
            if (!((BoolLiteral) stylerule.condition).value) {
                toRemoveStyleRules.add(stylerule);
            } else {
                stylerule.condition = null;
            }
        }
    }
}
