package com.bridgelabz.messagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    //http://localhost:8080/hello
    @GetMapping("/hello")
    public String helloMessage() {
        return "Hello from BridgeLabz";
    }
}
