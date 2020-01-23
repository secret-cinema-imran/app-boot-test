package com.test.appboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AppBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppBootTestApplication.class, args);
	}

}
