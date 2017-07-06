package com.TaurusSolution.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jose R Henriquez on 7/5/2017.
 */
@Controller
public class MainController {

    @RequestMapping("/Hola")
    public @ResponseBody String Hola()
    {
        return "Hola Mundo";
    }


}
