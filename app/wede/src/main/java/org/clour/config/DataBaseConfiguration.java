package org.clour.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfiguration {
	
	@Bean
	public String serverPort(@Value("${server.port}") String port)
	{
		System.out.println("port = " + port);
		return port;
	}
	
}
