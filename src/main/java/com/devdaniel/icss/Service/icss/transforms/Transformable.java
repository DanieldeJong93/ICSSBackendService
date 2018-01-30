package com.devdaniel.icss.Service.icss.transforms;

import com.devdaniel.icss.Service.icss.ast.ASTNode;

public interface Transformable {

    /**
     * Implementable method that will transform the values of the Transformable Object. The transform action will remove
     * the Transformable Object from the node and add a transformed Literal to the node.
     *
     * @param node parent of the Transformable Object
     */
    void transform(ASTNode node);
}
