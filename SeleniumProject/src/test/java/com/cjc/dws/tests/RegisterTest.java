package com.cjc.dws.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cjc.dws.pages.BillingPage;
import com.cjc.dws.pages.BooksPage;
import com.cjc.dws.pages.LoginPage;
import com.cjc.dws.pages.RegisterPage;
import com.cjc.dws.utility.Utility;


public class RegisterTest {
	
	public WebDriver driver;
	  
	@BeforeSuite
	  public void getBrowser() {
		  System.err.println("this is before suite annotation ");
		  //Utility u=new Utility();
		  //u.getDriver();
		  System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		  driver = new ChromeDriver();	  
	  }


	 @BeforeTest
	  public void getUrl() {
		  driver.get("http://demowebshop.tricentis.com");
	  }
	
	
	/*
	 * @Test public void registerData1() {
	 * 
	 * RegisterPage lp = PageFactory.initElements(driver, RegisterPage.class);
	 * lp.loginCheck(); }
	 */
	  
	  @Test
	  public void booksCheck() {
		
		  System.out.println("Hello");
		  //RegisterPage rp = PageFactory.initElements(driver, RegisterPage.class);
		  //rp.registerPage();
		  
	  }

	

}
