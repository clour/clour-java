package org.clour.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(basePackages = {"org.clour.auth", "org.clour.common.bean"})
public class StartApp {
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(StartApp.class, args);
    }
}
