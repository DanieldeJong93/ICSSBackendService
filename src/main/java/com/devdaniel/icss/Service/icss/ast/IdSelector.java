package com.devdaniel.icss.Service.icss.ast;

public class IdSelector extends Selector {
    public String id;

    public IdSelector(String id) {
        this.id = id;
    }

    public String getNodeLabel() {
        return "IdSelector " + id;
    }
    public String toCss() {
        return id + " {";
    }
}
