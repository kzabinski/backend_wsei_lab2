package com.kzabinski.bakcend_wsei_lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class BakcendWseiLab1Application {

	@GetMapping("/hello")
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
