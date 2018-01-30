package com.devdaniel.icss;

public class ICSSModel {
    private String icss;
    private String css;

    public ICSSModel(String icss) {
        this.icss = icss;
    }

    public ICSSModel() {
    }

    public String getIcss() {
        return icss;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }
}
