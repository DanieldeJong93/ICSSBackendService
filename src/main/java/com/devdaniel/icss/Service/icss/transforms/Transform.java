package com.devdaniel.icss.Service.icss.transforms;

import com.devdaniel.icss.Service.icss.ast.AST;

public interface Transform {
    void apply(AST ast);
}
