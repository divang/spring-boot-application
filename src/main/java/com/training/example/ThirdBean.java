package com.training.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ThirdBean {
    @Autowired
    SecondBean secondBean;
    public void display(){
        System.out.println("====> It is a third bean. It usages the Spring autowired for SecondBean");
        secondBean.display();
    }
}
