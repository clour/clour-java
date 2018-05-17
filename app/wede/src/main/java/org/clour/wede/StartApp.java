package org.clour.wede;

import org.clour.mode.Demodule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
// @RestController
@SpringBootApplication
@ComponentScan(basePackages = {"org.clour.wede",
		"org.clour.config",
	    "org.clour.mode"})
public class StartApp {
	
	@Autowired
	Demodule demodule;
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(StartApp.class, args);
    }

    @RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String index() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/demo")
    public String demo() {
    	demodule.info();
        return "demo";
    }
    
    @RequestMapping("/demod")
    public String demod() {
    	log.debug("debug out...");
    	log.info("info out...");
    	log.warn("warn out...");
    	log.error("error out...");
    	demodule.info();
        return "mode/demo";
    }
}
