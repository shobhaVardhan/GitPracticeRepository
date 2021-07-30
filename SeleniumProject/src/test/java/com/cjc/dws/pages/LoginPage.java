package com.cjc.dws.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath = "//input[@value=\"Log in\"]")
	WebElement loginButton;
	
	@FindBy(linkText = "Log in")
	WebElement loginLinkText;
	
	@FindBy(name="Email")
	WebElement email;	
	
	@FindBy(name="Password")
	WebElement password;

	public void loginCred()
	{
		loginLinkText.click();
		System.out.println("Inside login Cred function");
		email.sendKeys("shobhagg07@gmail.com");
		password.sendKeys("shobhavardhan");
		loginButton.click();
	}


}
