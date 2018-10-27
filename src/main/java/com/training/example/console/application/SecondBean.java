package com.training.example.console.application;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class SecondBean {

    //Spring will take care of reading this property from application.properties file
    @Value("${second.bean.s3.bucket.url}")
    String s3BucketURL;
    public void display(){
        System.out.println("=====> It is a second.");
        System.out.println("S3 bucket url: "+s3BucketURL);

    }
}
