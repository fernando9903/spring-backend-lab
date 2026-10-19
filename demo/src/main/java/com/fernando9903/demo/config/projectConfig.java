package com.fernando9903.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fernando9903.demo.beans.Vehicle;


/**
 * Spring @Configuration annotation is part of the spring core framework.
 * Spring Configuration annotation indicates that the class has @Bean definition
 * methods. So spring container can process the class and generate Spring Beans
 * to be used in the application.
 */
@Configuration
public class projectConfig {

	@Bean
	Vehicle vehicle() {
		var veh = new Vehicle();
		veh.setName("Carro");
		return veh;
	}
	
	@Bean
	String hello() {
		return "Hello world"; 
	}
	
	@Bean
	Integer luckyNumber() {
		return 16;
	}
	
}
