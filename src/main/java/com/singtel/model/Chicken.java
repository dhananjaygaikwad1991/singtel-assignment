package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chicken extends Bird{
	Logger logger = LoggerFactory.getLogger(Chicken.class);
	public boolean fly() {
		 logger.info("I cannot fly");
		return false;
		}

	  public boolean sing() {

		 logger.info("Cluck, cluck");
		return true;
	}

}
