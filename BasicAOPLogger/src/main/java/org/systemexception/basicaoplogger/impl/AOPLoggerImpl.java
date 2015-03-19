/**
 * $Id$
 *
 * @author lcappuccio
 * @date 19/03/2015 18:27
 *
 * Copyright (C) 2015 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package org.systemexception.basicaoplogger.impl;

import org.slf4j.LoggerFactory;
import org.systemexception.basicaoplogger.api.AOPLogger;

public class AOPLoggerImpl implements AOPLogger {
	
	private final org.slf4j.Logger logger;
	
	private AOPLoggerImpl (org.slf4j.Logger logger) {
		this.logger = logger;
	}
	
	public static AOPLogger getFor (Class clazz) {
		org.slf4j.Logger logger =  LoggerFactory.getLogger (clazz);
		return new AOPLoggerImpl (logger);
	}

	@Override
	public void debug (String message) {
		this.logger.debug (message);
	}

	@Override
	public void info (String message) {
		this.logger.info (message);
	}

	@Override
	public void error(String message, Exception exception) {
		this.logger.error (message, exception);
	}
}
