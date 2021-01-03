package com.j256.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bar {
	// if this is commented out or made an instance field, the problem goes away
	private static Log log = LogFactory.getLog(Bar.class);

	public Bar() {
		log.debug("huh");
	}
}
