package com.j256.test;

import static org.easymock.EasyMock.createMock;

import org.junit.Test;

public class EmmaJunitEasymockTest {

	@Test(timeout = 100000)
	public void testStuff() {
		createMock(com.amazonaws.AmazonWebServiceClient.class);
	}
}
