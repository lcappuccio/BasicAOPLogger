/**
 *
 * @author leo
 * @date 19/03/2015 21:58
 *
 */
package org.systemexception.basicaoplogger.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.systemexception.basicaoplogger.api.AOPLogger;

@Aspect
public class AOPLoggerListener {

	private AOPLogger aopLogger;

	@Around("execution(* org.systemexception.basicaoplogger.pojo.Message.getMessage(..))")
	public void logAround(JoinPoint joinPoint) {
		aopLogger = AOPLoggerImpl.getFor(joinPoint.getTarget().getClass());
		aopLogger.info(joinPoint.getTarget().getClass().getCanonicalName());
	}
}
