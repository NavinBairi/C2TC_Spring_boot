package com.tns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan
	public class Client {

		public static void main(String[] args) {
			SpringApplication.run(Client.class, args);
		}

	}



/*Create database Shopping_Management_System;
use Shopping_Management_System;

*/