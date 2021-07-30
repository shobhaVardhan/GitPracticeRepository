package com.cjc.dws.tests;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cjc.dws.pages.BillingPage;
import com.cjc.dws.pages.CartPage;
import com.cjc.dws.pages.LoginPage;
import com.cjc.dws.pages.ProductSelectPage;
import com.cjc.dws.pages.RagisterPage;
import com.cjc.dws.utility.DriverDemo;

public class DWSTest 
{
		public WebDriver driver; 
		static Logger log = Logger.getLogger(DWSTest.class.getName());
		
		
		 	@BeforeSuite
		 	public void browser()
		 	{
		 		log.info("Using DriverDemo Class Open Chrome Browser");
		 		DriverDemo demo = new DriverDemo();
		 		demo.getDriver();
		 		driver = new ChromeDriver();
		 			 		
		 	}
		 
		 
			@BeforeTest
			public void enterUrl()
			{
				
				driver.get("http://demowebshop.tricentis.com/");
				log.info("This is Demo Web Shop Home Page");
			}
			
			@BeforeClass
			public void maximize()
			{
				driver.manage().window().maximize();
			}

			@BeforeMethod
			public void getCookies()
			{
				log.info("Demo Web Shop Cookies are as follows :");
				
				Set<Cookie> cookies = driver.manage().getCookies();
				for(Cookie coo : cookies)
				{
					log.warn("Cookies Name :"+coo.getName());
				}
			}

			@Test
			public void registration()
			{
				driver.findElement(By.linkText("Register")).click();
				
				log.info("This is Registration Page");
				
				RagisterPage reg = PageFactory.initElements(driver, RagisterPage.class);
				reg.ragister("abcd","wxyz", "abb12@gmail.com", "123456", "123456");
							
				log.warn("Registration Successfully Completed");				
				
				ProductSelectPage prd = PageFactory.initElements(driver, ProductSelectPage.class);
				prd.select();
				
				CartPage cart = PageFactory.initElements(driver, CartPage.class);
				cart.add();
			   	log.warn("Product Checkout for Billing Procedure");
				
				 LoginPage log1 = PageFactory.initElements(driver, LoginPage.class);
				 log1.login("abb5@gmail.com", "123456");				 
				 log.warn("Login Successfully");
				 
				 CartPage cart1 = PageFactory.initElements(driver, CartPage.class);
				 cart1.checkout();
			   	log.warn("Product Checkout for Billing Procedure");
				
				 
				 BillingPage bill = PageFactory.initElements(driver, BillingPage.class);
				 bill.billingAdr("pqr", "India", "Pune", "Balewadi", "Pune", "441100", "9123456789", "123456");			 
				 log.warn("Product Dispatch Successfully");
				
				 driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
				 
			}
			
			@AfterMethod
			public void screenshot() throws IOException
			{
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("F:\\Testing Software\\dws.png"));
				log.warn("Screenshot Capture Successfully");
				
			}
			
			@AfterClass
			public void close()
			{
				driver.close();
			}
			
			@AfterSuite
			public void quit()
			{
				driver.quit();
			}

}
