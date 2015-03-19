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

import org.systemexception.basicaoplogger.pojo.DateBuilder;
import org.systemexception.basicaoplogger.pojo.Message;

public class Main {
	private static Object appContext;
	
	public static void main(String[] args) {
		DateBuilder dateBuilder = new DateBuilder();
		Message message = new Message(dateBuilder.getDateYYYYMMDD());
//		Message message = (Message) appContext.getBean("message");
		System.out.println(message.getMessage());
	}
}
