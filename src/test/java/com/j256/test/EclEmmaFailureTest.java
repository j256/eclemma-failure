package com.j256.test;

import org.junit.Test;

public class EclEmmaFailureTest {

	// if the timeout is removed here then coverage works
	@Test(timeout = 100000)
	public void testStuff() {

		// this line should cover Foo by 100%
		new Foo().method();

		org.apache.commons.logging.LogFactory.getLog(getClass());
	}
}
