package com.cjc.listner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.cjc.listner.SuitListner.class)
public class ListnerTest {
	
	public WebDriver driver;
	@BeforeSuite
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void m2()
	{
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	
	@Test
	public void m3()
	{
		System.out.println("Username :: ");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("QQQQQ");					
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qqqqq");	
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
}
