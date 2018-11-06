package org.clour.confis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class StartApp {
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(StartApp.class, args);
    }
}
