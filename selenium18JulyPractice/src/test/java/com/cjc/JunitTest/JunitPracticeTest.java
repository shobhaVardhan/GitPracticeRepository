package com.cjc.JunitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitPracticeTest {
	
	@BeforeClass
	public static void m1()
	{
		System.out.println("--BeforeClass--");
	}
		
	@Test
	public void m5()
	{
		Calculator c=new Calculator();
		c.add();
		System.out.println("Test");
	}
	
	@Test
	public void m6()
	{
		System.out.println("Test2");
	}
	
	@Before
	public void m3()
	{
		System.out.println("--Before--");
	}
	
	@After
	public void m4()
	{
		System.out.println("--After--");
	}
	
	@AfterClass
	public static void m2()
	{
		System.out.println("--AtfterClass--");
	}

}
