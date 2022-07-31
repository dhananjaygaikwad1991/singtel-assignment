package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog implements Animal{
	Logger logger = LoggerFactory.getLogger(Dog.class);
	@Override
	public boolean fly() {
		 logger.info("I cannot fly");
		return false;
		
	}

	@Override
	public boolean sing() {
		 logger.info("Woof, woof");
		return true;
		
	}

	@Override
	public boolean walk() {
		 logger.info("I can walk");
		return true;
		
	}

	@Override
	public boolean swim() {
		 logger.info("I can swim");
		return true;
	}

}
