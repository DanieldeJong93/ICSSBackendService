package com.devdaniel.icss.Controller;

import com.devdaniel.icss.ICSSModel;
import com.devdaniel.icss.Service.IcssService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/icss")
@RestController
public class IcssController {

    @CrossOrigin
    @RequestMapping(
            value = "/parse",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ResponseBody
    public ICSSModel parse (@RequestBody ICSSModel icss) throws Exception {
        return new IcssService().parse(icss);
    }

}
