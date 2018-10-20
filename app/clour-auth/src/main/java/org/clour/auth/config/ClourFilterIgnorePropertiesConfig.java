package org.clour.auth.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConditionalOnExpression("!'${clour.security.ignore}'.isEmpty()")
@ConfigurationProperties(prefix = "clour.security.ignore")
public class ClourFilterIgnorePropertiesConfig {
	
	private List<String> urls = new ArrayList<>();

    private List<String> clients = new ArrayList<>();

}