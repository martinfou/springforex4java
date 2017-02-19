package com.compica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jfx.net.JFXServer;

@SpringBootApplication
public class Springforex4javaApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Springforex4javaApplication.class, args);
		JFXServer.getInstance();
		System.out.println("Waiting for incomming connection" + JFXServer.getInstance().getBindHost() + " " + JFXServer.getInstance().getBindPort());
		Thread.sleep(Integer.MAX_VALUE);
	}
}
