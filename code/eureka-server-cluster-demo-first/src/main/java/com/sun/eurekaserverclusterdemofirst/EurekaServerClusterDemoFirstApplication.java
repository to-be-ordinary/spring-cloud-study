package com.sun.eurekaserverclusterdemofirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerClusterDemoFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerClusterDemoFirstApplication.class, args);
    }
}
