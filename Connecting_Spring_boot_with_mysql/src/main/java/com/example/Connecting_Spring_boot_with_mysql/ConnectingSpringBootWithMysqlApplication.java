package com.example.Connecting_Spring_boot_with_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ConnectingSpringBootWithMysqlApplication {
	private final PersonsRepository perrep;

	@Autowired
	public ConnectingSpringBootWithMysqlApplication(PersonsRepository perrep) {
		this.perrep = perrep;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConnectingSpringBootWithMysqlApplication.class, args);
		System.out.println("satyam");
	}

	@GetMapping("/getData")
	public Iterable<Persons> getData() {
		return perrep.findAll();
	}
}
