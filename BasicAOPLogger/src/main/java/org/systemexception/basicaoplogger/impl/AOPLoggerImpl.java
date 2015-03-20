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
import org.apache.logging.log4j.ThreadContext;
import org.systemexception.basicaoplogger.api.AOPLogger;
import org.systemexception.basicaoplogger.pojo.DateBuilder;

public class AOPLoggerImpl implements AOPLogger {

	private final Logger logger;
	private final DateBuilder dateBuilder;

	private AOPLoggerImpl(Logger logger) {
		dateBuilder = new DateBuilder();
		this.logger = logger;
	}

	/**
	 * Factory for logger
	 *
	 * @param clazz
	 * @return
	 */
	public static AOPLogger getFor(Class clazz) {
		ThreadContext.put("thread_id", String.valueOf(Thread.currentThread().getId()));
		ThreadContext.put("thread_name", Thread.currentThread().getName());
		Logger logger = LogManager.getLogger(clazz);
		return new AOPLoggerImpl(logger);
	}

	@Override
	public void debug(String message) {
		String logMessage = getLogMessage();
		this.logger.debug(logMessage);
	}

	@Override
	public void info(String message) {
		String logMessage = getLogMessage();
		this.logger.info(logMessage);
	}

	@Override
	public void error(String message, Exception exception) {
		String logMessage = getLogMessage();
		this.logger.error(logMessage, exception);
	}

	private String getLogMessage() {
		String logDate = dateBuilder.getDateYYYYMMDD_HHmmssSSS();
		String logMessage = logDate + "|" + ThreadContext.get("thread_id") + "|" + ThreadContext.get("thread_name") + "|" + ThreadContext.get("message");
		return logMessage;
	}

}
