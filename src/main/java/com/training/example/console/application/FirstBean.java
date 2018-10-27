package com.training.example.console.application;

import org.springframework.stereotype.Component;

@Component
public class FirstBean {
    public void display(){
        System.out.println("========> It is Spring bean ==========");
    }
}
