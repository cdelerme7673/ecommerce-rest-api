package com.tutorial.ecommercerestapi.controllers;

import com.tutorial.ecommercerestapi.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageContrioller {
    @RequestMapping("/welcome")
    public Message welcome() {
        return new Message("welcome");
    }
}
