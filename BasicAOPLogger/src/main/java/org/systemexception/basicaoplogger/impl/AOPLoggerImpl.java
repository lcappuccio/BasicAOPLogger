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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.systemexception.basicaoplogger.api.AOPLogger;

public class AOPLoggerImpl implements AOPLogger {

	private final Logger logger;

	private AOPLoggerImpl(Logger logger) {
		this.logger = logger;
	}

	/**
	 * Factory for logger
	 *
	 * @param clazz
	 * @return
	 */
	public static AOPLogger getFor(Class clazz) {
		Logger logger = LogManager.getLogger(clazz);
		return new AOPLoggerImpl(logger);
	}

	@Override
	public void debug(String message) {
		this.logger.debug(message);
	}

	@Override
	public void info(String message) {
		this.logger.info(message);
	}

	@Override
	public void error(String message, Exception exception) {
		this.logger.error(message, exception);
	}
}
