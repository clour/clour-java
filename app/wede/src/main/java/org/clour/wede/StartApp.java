package org.clour.wede;

import org.clour.mode.Demodule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// @RestController
@SpringBootApplication
public class StartApp {

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
		Demodule.info();
		return "demo";
	}
}
