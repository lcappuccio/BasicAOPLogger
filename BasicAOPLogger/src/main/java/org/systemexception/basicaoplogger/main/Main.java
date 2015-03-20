/**
 * $Id$
 *
 * @author lcappuccio
 * @date 19/03/2015 17:10
 *
 * Copyright (C) 2015 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package org.systemexception.basicaoplogger.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.systemexception.basicaoplogger.pojo.DateBuilder;
import org.systemexception.basicaoplogger.pojo.Message;

public class Main {
	
	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		DateBuilder dateBuilder = new DateBuilder();
		Message message = (Message) appContext.getBean("message");
		message.setMessage(dateBuilder.getDateYYYYMMDD());
		message.getMessage();
	}
}
