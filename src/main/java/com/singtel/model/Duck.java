package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Duck extends Bird{
	Logger logger = LoggerFactory.getLogger(Duck.class);
	public boolean fly() {
		 logger.info("I am flying");
		return true;
		}

	  public boolean sing() {

		 logger.info("Quack, quack");
		return true;
	}
	  @Override
		public boolean swim() {
			 logger.info("I can swim");
			return true;
		}
	  @Override
		public boolean walk() {
			
				 logger.info("I am walking");
			return true;
			
		}
}
