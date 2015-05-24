/**
 * $Id$
 *
 * @author lcappuccio
 * @date 19/03/2015 18:46
 *
 * Copyright (C) 2015 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package org.systemexception.basicaoplogger.api;

public interface AOPLogger {
	
	/**
	 * 
	 * @param message 
	 */
	void debug(String message);

	/**
	 * 
	 * @param message 
	 */
	void info(String message);

	/**
	 * 
	 * @param message
	 * @param exception 
	 */
	void error(String message, Exception exception);
}
