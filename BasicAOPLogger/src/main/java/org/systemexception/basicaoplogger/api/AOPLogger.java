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
	public abstract void debug (String message);

	/**
	 * 
	 * @param message 
	 */
	public abstract void info (String message);

	/**
	 * 
	 * @param message
	 * @param exception 
	 */
	public abstract void error (String message, Exception exception);
}
