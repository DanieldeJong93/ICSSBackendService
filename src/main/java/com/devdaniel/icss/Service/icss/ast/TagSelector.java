package com.devdaniel.icss.Service.icss.ast;

public class TagSelector extends Selector {
    public String tag;

    public TagSelector(String tag) {
        this.tag = tag;
    }

    public String getNodeLabel() {
        return "TagSelector " + tag;
    }
    public String toCss() {
        return tag + " {";
    }
}
