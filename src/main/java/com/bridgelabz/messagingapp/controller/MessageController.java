package com.bridgelabz.messagingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MessageController {

    //http://localhost:8080/hello
    @GetMapping ("")
    public String helloMessage() {
        return "Hello from BridgeLabz";
    }

    //localhost:8080/hello/query?name=Sourav
    @GetMapping(value = "/query")
    public String sayHelloMessage(@RequestParam(value = "name") String name) {
        return "Hello "+name+" from BridgeLabz";
    }
}
