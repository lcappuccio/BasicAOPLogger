/**
 * $Id$
 *
 * @author lcappuccio
 * @date 19/03/2015 17:11
 *
 * Copyright (C) 2015 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package org.systemexception.basicaoplogger.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBuilder {

	private Date date;
	private SimpleDateFormat dateFormat;
	private String formattedDate;

	/**
	 *
	 * @return
	 */
	public String getDateYYYYMMDD() {
		date = new Date();
		dateFormat = new SimpleDateFormat("yyyyMMdd");
		formattedDate = dateFormat.format(date);
		return formattedDate;
	}

	/**
	 *
	 * @return
	 */
	public String getDateYYYYMMDD_HHmmssSSS() {
		date = new Date();
		dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS");
		formattedDate = dateFormat.format(date);
		return formattedDate;
	}
}
