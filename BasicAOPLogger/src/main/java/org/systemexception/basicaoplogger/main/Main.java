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

import java.util.UUID;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.systemexception.basicaoplogger.pojo.Message;

public class Main {
	
	private static Message message;

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		message = (Message) appContext.getBean("message");
		generateLogs(1000);
	}

	private static void generateLogs(int totalLogsToGenerate) {
		for (int i = 0; i < totalLogsToGenerate; i++) {
		String randomUUID = UUID.randomUUID().toString();
		message.setMessage(randomUUID);
		message.getMessage();
		}
	}
}
