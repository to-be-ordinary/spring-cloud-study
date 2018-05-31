package com.sun.eurekaclientuserdemo.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate template;
    @GetMapping("/consumer")
    @HystrixCommand(fallbackMethod="error")
    public String helloConsumer(){

        String clientMsg = template.getForEntity("http://SUN-CLIENT-FIRST/hello",String.class).getBody();
        return "hello consumer and client say:" + clientMsg;
    }
    
    public String error() {
    	
    	return "error";
    }
}
