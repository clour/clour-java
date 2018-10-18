package org.clour.confis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class StartApp {
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(StartApp.class, args);
    }
}
