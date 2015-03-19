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
	
	public String getDateYYYYMMDD() {
		date = new Date();
		dateFormat = new SimpleDateFormat("yyyyMMdd");
		formattedDate = dateFormat.format(date);
		return formattedDate;
	}
	
	public String getDateYYYYMMDD_HHmmss() {
		date = new Date();
		dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		formattedDate = dateFormat.format(date);
		return formattedDate;
	}
}
