package com.devdaniel.icss.Service;

import com.devdaniel.icss.ICSSModel;
import org.junit.Assert;
import org.junit.Test;

public class IcssServiceTest {
    private static final String ICSS= "LINK_COLOR := #ff0000;\n" +
            "PAR_WIDTH := 100px;\n" +
            "DEBUG := false;\n" +
            "\n" +
            "p {\n" +
            " \tbackground-color: #ffffff;\n" +
            " \twidth: DEBUG && PAR_WIDTH < 110px ? PAR_WIDTH : 200px;\n" +
            " }\n" +
            "a [DEBUG || PAR_WIDTH > 200px] {\n" +
            "\tcolor: PAR_WIDTH > 300px ? LINK_COLOR : #e0e0e0;\n" +
            "}\n" +
            "\n" +
            "#menu {\n" +
            "\twidth: PAR_WIDTH + 20px;\n" +
            "}\n" +
            "\n" +
            ".menu {\n" +
            "\tcolor: #000000;\n" +
            "}\n";
    private static final String CSS="p {\n" +
            "  background-color: #ffffff;\n" +
            "  width: 200px;\n" +
            "}\n" +
            "#menu {\n" +
            "  width: 120px;\n" +
            "}\n" +
            ".menu {\n" +
            "  color: #000000;\n" +
            "}\n";

    @Test
    public void testIcssParsing () throws Exception {
        IcssService service = new IcssService();

        Assert.assertEquals(CSS, service.parse(new ICSSModel(ICSS)).getCss());
    }

}