package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubDemo2Application {

	int x=10;
	int y=10000;
	String name = "bijay";
	public static void main(String[] args) {
		SpringApplication.run(GithubDemo2Application.class, args);
	}

}
