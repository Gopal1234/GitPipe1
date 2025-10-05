package com.pack.TestLAM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * What Is Spring Boot Actuator?

Spring Boot Actuator is a built-in module that adds production-ready features to your Spring Boot application — without you writing extra code.

It exposes operational information about your app through HTTP endpoints (or JMX), so you can monitor and manage it in real time.

Think of it as the "health monitor + metrics dashboard + remote control" of your running Spring Boot app.

⚙️ What Does It Provide?

Actuator automatically collects and exposes information such as:

Category	Example	Description Health	/actuator/health	Tells whether your app and dependencies (DB, disk, mail, etc.) are working
 Metrics	/actuator/metrics	Provides runtime metrics: memory usage, CPU, HTTP requests, GC, threads, etc.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
@SpringBootApplication
public class TestLamApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestLamApplication.class, args);
	}

}
