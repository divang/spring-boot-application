package com.training.example.web.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

    @RequestMapping("/")
    public String home(){
        return "It is Spring REST Controller";
    }
}
