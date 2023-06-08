package com.bridgelabz.messagingapp.controller;

import com.bridgelabz.messagingapp.entity.User;
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

    //localhost:8080/hello/param/Mark
    @GetMapping("/param/{name}")
    public String helloMessage(@PathVariable String name) {
        return "Hello "+name+" from BridgeLabz";
    }

    //http://localhost:8080/hello/post
    @PostMapping("/post")
    public String helloUser(@RequestBody User user) {
        return "Hello "+user.getFirstName()+" "+user.getLastName()+" from BridgeLabz";
    }

    //localhost:8080/hello/put/Sourav/?lastName=Prasanna
    @PutMapping("/put/{firstName}")
    public String helloUser(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello "+firstName+" "+lastName+" from BridgeLabz";
    }
}
