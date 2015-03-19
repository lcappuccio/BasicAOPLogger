/**
 *
 * @author leo
 * @date 19/03/2015 21:58
 *
 */
package org.systemexception.basicaoplogger.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.systemexception.basicaoplogger.api.AOPLogger;

@Aspect
public class AOPLoggerListener {

	private AOPLogger aopLogger;

	@Before("execution(* org.systemexception.basicaoplogger.pojo.Message.getMessage())")
	public void logBefore(JoinPoint joinPoint) {
		aopLogger = AOPLoggerImpl.getFor(joinPoint.getTarget().getClass());
		aopLogger.info("Before: " + joinPoint.getClass().getCanonicalName());
	}

	@After("execution(* org.systemexception.basicaoplogger.pojo.Message.getMessage())")
	public void logAfter(JoinPoint joinPoint) {
		aopLogger = AOPLoggerImpl.getFor(joinPoint.getClass());
		aopLogger.info("After: " + joinPoint.getClass().getCanonicalName());
	}

}
