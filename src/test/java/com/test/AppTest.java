package com.test;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

/*	@Test
	public void testLogin1() {
		App myapp= new App();
		Assert.assertEquals(0,myapp.userLogin("ad", "ad"));
 	}
	*/
	@Test
	public void testLogin2() {
		App myapp= new App();
		Assert.assertEquals(1,myapp.userLogin("admin", "admin"));
	}

}
