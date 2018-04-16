package org.clour.mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Demodule {
	
	@Autowired
	@Qualifier("serverPort")
	private String serverPort;
	
    public void info()
    {
        System.out.println("Demodule info out!");
        System.out.println("server.port = " + serverPort);
    }
}
