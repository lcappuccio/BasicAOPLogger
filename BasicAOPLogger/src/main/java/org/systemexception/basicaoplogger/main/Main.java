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

import org.systemexception.basicaoplogger.pojo.MessageThread;

public class Main {
	
	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		MessageThread messageThread1 = new MessageThread();
		messageThread1.start();
		MessageThread messageThread2 = new MessageThread();
		messageThread2.start();
		MessageThread messageThread3 = new MessageThread();
		messageThread3.start();
	}
}
