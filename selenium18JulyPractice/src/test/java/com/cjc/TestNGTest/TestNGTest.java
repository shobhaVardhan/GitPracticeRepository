package com.cjc.TestNGTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTest {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void m1()
	{
		System.out.println("Inside TestNG BeforeSuite ");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@BeforeTest
	public void m2()
	{
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	}
	
	
	@BeforeClass
	public void m3()
	{
		
	}
	
	@Parameters({"username"})
	@Test
	public void m3(String username) throws InterruptedException
	{
		System.out.println("Username :: "+username);
		driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();	
        //Alert alert = driver.s  bwitchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        
        driver.switchTo().alert().accept();
        //driver.close();		
        // Accepting alert		
        //alert.accept();	
	}
	
	@Parameters({"username"})
	@Test
	public void m4(String username)
	{
		System.out.println("Username from m4 method :: "+username);
	}
	
}
