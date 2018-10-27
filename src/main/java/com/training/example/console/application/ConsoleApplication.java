package com.training.example.console.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * This is a simple non web Spring Application.
 */

@SpringBootApplication
public class ConsoleApplication {

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(ConsoleApplication.class, args);
        FirstBean bean = ctx.getBean(FirstBean.class);
        bean.display();
        ThirdBean thirdBean = ctx.getBean(ThirdBean.class);
        thirdBean.display();
    }

}
