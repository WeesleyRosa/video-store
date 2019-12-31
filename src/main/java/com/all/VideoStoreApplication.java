package com.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class VideoStoreApplication {
	
	@RequestMapping("/")
    String hello() {
        return "hello world";
    }

	public static void main(String[] args) {
		SpringApplication.run(VideoStoreApplication.class, args);
	}

}
