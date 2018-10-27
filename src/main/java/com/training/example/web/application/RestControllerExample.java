package com.training.example.web.application;

import com.training.example.web.application.entities.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestControllerExample {

    private static final Logger log = LoggerFactory.getLogger(RestControllerExample.class);
    @RequestMapping("/home")
    public String home(){
        return "It is Spring REST Controller";
    }

    @RequestMapping("/restapi")
    public String restAPICall() {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info("REST API response:"+quote);
        return quote.toString();
    }
}
