package com.j256.test;

public class Bar {
	// if this is commented out or made an instance field, the problem goes away
	@SuppressWarnings("unused")
	private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Bar.class);
}
