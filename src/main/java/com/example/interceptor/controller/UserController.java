package com.example.interceptor.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class UserController {

    @GetMapping("/message")
    public String test(){
        log.info("UserController");
        return "Hello";
    }
}
