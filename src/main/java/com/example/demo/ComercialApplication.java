package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComercialApplication {

	public static void main(String[] args) {
		
		Comercial comercial1 = new Comercial();
		Comercial comercial2 = new Comercial(1, "Mario","Ramirez",10000);
		
		System.out.println(comercial2.getApellido());
		
		comercial2.setVentas(10000);
		
		System.out.println(comercial2.getVentas());
		
		SpringApplication.run(ComercialApplication.class, args);
	}
}
