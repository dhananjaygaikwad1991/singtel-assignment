package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shark implements Fish{
	Logger logger = LoggerFactory.getLogger(Shark.class);
	@Override
	public void size() {
		 logger.info("I am large in Size");
		
	}

	@Override
	public void colour() {
		 logger.info("Grey in colour");
	}

	@Override
	public boolean eat() {
		 logger.info("I eat other fish");
		return true;
		
	}

	@Override
	public boolean makeJokes() {
		 logger.info("I don't make Jokes");
		return false;
	}

	@Override
	public boolean fly() {
		 logger.info("I cannot fly");
		return false;
	}

	@Override
	public boolean sing() {
		 logger.info("I cannot sing");
		return false;
	}

	@Override
	public boolean walk() {
		 logger.info("I cannot walk");
		return false;
	}

	@Override
	public boolean swim() {
		 logger.info("I can swim");
		return true;
	}

}
