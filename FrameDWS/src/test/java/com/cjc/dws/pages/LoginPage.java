package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@id=\"Email\"]") 
	WebElement user;
	
	@FindBy(how=How.XPATH, using="//input[@id=\"Password\"]")
	WebElement pass;
	
	@FindBy(how=How.XPATH, using="//input[@value=\"Log in\"]")
	WebElement login;
	
	public void login(String user1, String pass1)
	{
		user.sendKeys(user1);
		pass.sendKeys(pass1);
		login.click();
	}
	
	
}
