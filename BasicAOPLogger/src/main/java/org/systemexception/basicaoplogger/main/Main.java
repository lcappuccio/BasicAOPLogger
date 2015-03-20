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

import java.util.Random;
import org.systemexception.basicaoplogger.pojo.MessageThread;

public class Main {
	
	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int randomThreads = rnd.nextInt(50);
		for (int i = 0; i < randomThreads; i++) {
			new MessageThread().start();
		}
	}
}
