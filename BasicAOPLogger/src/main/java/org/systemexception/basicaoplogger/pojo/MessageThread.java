/**
 * $Id$
 *
 * @author lcappuccio
 * @date 20/03/2015 11:58
 *
 * Copyright (C) 2015 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package org.systemexception.basicaoplogger.pojo;

import java.util.Random;
import java.util.UUID;
import org.systemexception.basicaoplogger.impl.AOPLoggerImpl;
import org.systemexception.basicaoplogger.main.Main;

public class MessageThread extends Thread {

	private Message message;
	private final int minRandom = 10;

	@Override
	public void run() {
		message = (Message) Main.appContext.getBean("message");
		generateLogs(randomMessagesToGenerate());

	}

	private void generateLogs(int totalLogsToGenerate) {
		for (int i = 0; i < totalLogsToGenerate; i++) {
			String randomUUID = UUID.randomUUID().toString();
			message.setMessage(randomUUID);
			Random rnd = new Random();
			try {
				Thread.sleep(rnd.nextInt((1000 - minRandom) + minRandom));
			} catch (InterruptedException ex) {
				AOPLoggerImpl.getFor(MessageThread.class).error("ERROR", ex);
			}
			message.getMessage();
		}
	}

	private int randomMessagesToGenerate() {
		Random rnd = new Random();
		return rnd.nextInt(100);
	}
}
