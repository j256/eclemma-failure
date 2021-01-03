package com.j256.test;

import static org.easymock.EasyMock.createMock;

import org.junit.Test;

public class EclEmmaJunitEasymockCommonsLoggingTest {

	// if the timeout is removed here then coverage works
	@Test(timeout = 100000)
	public void testStuff() {

		// this line should cover Foo by 100%
		new Foo().method();

		// if this is commented out then coverage works
		createMock(Bar.class);
	}
}
