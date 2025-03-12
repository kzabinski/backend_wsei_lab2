package com.kzabinski.bakcend_wsei_lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BakcendWseiLab1Application {

	@RequestMapping("/hello")
	String home() {
		return "Hello World!";
	}

	@PutMapping("/put")
	public void setVariable(@RequestParam("parameter") String value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		SpringApplication.run(BakcendWseiLab1Application.class, args);
	}

}
