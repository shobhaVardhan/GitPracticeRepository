package com.cjc.JunitTest;

import junit.framework.Assert;

public class Calculator
{

	public void add()
	{
		int a=6+3;
		System.out.println("a = "+a);	
		//Assert.assertEquals(10, a);
		Assert.assertEquals(9, a);
	}
	
	public void substraction()
	{
		int b=6-3;
		System.out.println("Substraction :: "+b);
	}


}
