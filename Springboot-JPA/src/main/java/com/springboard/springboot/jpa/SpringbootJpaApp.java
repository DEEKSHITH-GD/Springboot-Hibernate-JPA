package com.springboard.springboot.jpa;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootJpaApp implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	PersonJpaRepository personRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Ïnserting 10050 -> {}", personRepository.insert(new Person("Joyce", "Berlin", new Date())));
		//logger.info("Ïnserting 10012 -> {}", personRepository.update(new Person("Rose", "Berlin", new Date())));
		//logger.info("User id 10010 -> {}", personRepository.findById(10010));
		logger.info("All User -> {}", personRepository.findAll());
		//personRepository.deletebyId(10012);
	}


}
