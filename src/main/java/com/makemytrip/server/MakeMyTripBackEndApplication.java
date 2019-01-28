package com.makemytrip.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication

@RestController
public class MakeMyTripBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakeMyTripBackEndApplication.class, args);
	}
   @RequestMapping("/")
	public String message() {
		return "hello";
		
	}
}

