package com.tutorial.ecommercerestapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping
    private String index(){
        return "index.html";
    }
}
