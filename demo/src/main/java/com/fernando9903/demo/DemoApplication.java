package com.fernando9903.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fernando9903.demo.beans.Vehicle;
import com.fernando9903.demo.config.projectConfig;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Nissan");
		System.out.println("Out of spring context: " + vehicle.getName());
		
		/**
		 * We dont need to do any explicit casting while fetching a bean from context.
		 * Spring is smart enough to look for a bean of the type you requested in its context.
		 * If such a bean dosent exist Spring will throw and exception.
		 */
		
		var context = new AnnotationConfigApplicationContext(projectConfig.class);
		var veh = context.getBean(Vehicle.class);
		System.out.println("From of spring context: " + veh.getName());
	}

}
