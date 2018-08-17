package com.example.fertilizers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ravindra.nuggu on 17/08/18.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String welcome(Model model) {
        model.addAttribute("welcome","Welcome TO fertilizers site");
        return "login";
    }
}
