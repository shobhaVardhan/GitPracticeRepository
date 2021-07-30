package com.cjc.assertDemo;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	@Test
	public void test1()
	{
		System.out.println("1");
		//assert.assertEquals(10, 15);
		Assert.assertEquals(10,15);
		System.out.println("2");
		Assert.assertEquals(10, 10);
	}
	
	@Test
	public void test2()
	{
		SoftAssert sa=new SoftAssert();
		System.out.println("1");
		//assert.assertEquals(10, 15);
		sa.assertEquals(10,15);
		System.out.println("2");
		sa.assertEquals(10, 10);
	}

}
