package com.ensakh.sonarqualitygate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable("id") String id) {
        if (id.equals("123")) {
            return "User found";
        } else if (id.equals("456")) {
            return "User not found .";
        } else if (id.equals("789")) {
            return "Invalid user";
        } else {
            return "Error";
        }
    }
}
