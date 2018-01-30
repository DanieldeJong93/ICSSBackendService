package com.devdaniel.icss.Service.icss.checker;

import com.devdaniel.icss.Service.icss.ast.Assignment;

import java.util.HashMap;

public interface Checkable {

    /**
     * Implementable method which validates the Checkable Object. Has no side effects if Object is valid, if Object
     * is invalid the Object will set a an SymanticError.
     *
     * @param hashMap symbolTable of checker
     */
    void validate(HashMap<String, Assignment> hashMap);

}
