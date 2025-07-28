package com.tutorial.ecommercerestapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping("/")
    private String index(Model model) {
        model.addAttribute("username", "CDelerme");
        return "index";
    }
}
