package com.springboard.springboot.database;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
public class SpringbootJDBCApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	PersonJDBC jdbc;
	
	@Autowired
	PersonJDBC2 jdbc2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJDBCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("\nAll Users -> {}", jdbc.finadAll());
		logger.info("\nUser id 10010 -> {}", jdbc.findByid(10010));
		logger.info("\nNo of rows Deleted - {}", jdbc.deleteById(10012));
		logger.info("\ninserting 10013 -> {}", jdbc.insert(new Person(10013, "Martin", "Goa", new Date())));
		logger.info("\nUpdate 10011 -> {}", jdbc.update(new Person(10011, "Bobby", "Kerala", new Date())));
		logger.info("\n All users -> {}", jdbc2.finadAll());
	}

}
