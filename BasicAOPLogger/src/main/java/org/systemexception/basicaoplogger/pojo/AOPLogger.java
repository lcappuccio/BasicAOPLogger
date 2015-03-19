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
package org.systemexception.basicaoplogger.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public class AOPLogger implements Logger {
	
	private final org.slf4j.Logger logger;
	
	private AOPLogger (org.slf4j.Logger logger) {
		this.logger = logger;
	}
	
	public static AOPLogger getFor (Class clazz) {
		org.slf4j.Logger logger =  LoggerFactory.getLogger (clazz);
		return new AOPLogger (logger);
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
	public void error (String message) {
		this.logger.error (message);
	}
	
	@Override
	public void trace (String message) {
		this.logger.trace(message);
	}

	@Override
	public String getName() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isTraceEnabled() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void trace(String format, Object arg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void trace(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void trace(String format, Object... arguments) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void trace(String msg, Throwable t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void trace(Marker marker, String msg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void trace(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void trace(Marker marker, String format, Object... argArray) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void trace(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isDebugEnabled() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void debug(String format, Object arg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void debug(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void debug(String format, Object... arguments) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void debug(String msg, Throwable t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isDebugEnabled(Marker marker) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void debug(Marker marker, String msg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void debug(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void debug(Marker marker, String format, Object... arguments) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void debug(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isInfoEnabled() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void info(String format, Object arg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void info(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void info(String format, Object... arguments) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void info(String msg, Throwable t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isInfoEnabled(Marker marker) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void info(Marker marker, String msg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void info(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void info(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void info(Marker marker, String format, Object... arguments) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void info(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isWarnEnabled() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void warn(String msg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void warn(String format, Object arg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void warn(String format, Object... arguments) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void warn(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void warn(String msg, Throwable t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isWarnEnabled(Marker marker) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void warn(Marker marker, String msg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void warn(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void warn(Marker marker, String format, Object... arguments) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void warn(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isErrorEnabled() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void error(String format, Object arg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void error(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void error(String format, Object... arguments) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void error(String msg, Throwable t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isErrorEnabled(Marker marker) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void error(Marker marker, String msg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void error(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void error(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void error(Marker marker, String format, Object... arguments) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void error(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
}
