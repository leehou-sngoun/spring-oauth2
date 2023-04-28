package com.kshrd.resourceserver;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/user")
    public String getUser(){
        return "User";
    }
}
