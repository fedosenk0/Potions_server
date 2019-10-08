package ru.maveri.potions.controller.admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {



    @Value("${spring.dev}")
    private String devMode;

    @RequestMapping
    public String mainUs(Model model){



        model.addAttribute("isDevMode", "dev".equals(devMode));

        return "index";
    }


}
