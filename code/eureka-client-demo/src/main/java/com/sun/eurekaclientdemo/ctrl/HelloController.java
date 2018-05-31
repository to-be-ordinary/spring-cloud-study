package com.sun.eurekaclientdemo.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;
    @RequestMapping("/hello")
    public  String hello(){
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("/hello,host:" + instance.getHost() + ",serviceId:" + instance.getServiceId());
        return "Hello,world";
    }
}
