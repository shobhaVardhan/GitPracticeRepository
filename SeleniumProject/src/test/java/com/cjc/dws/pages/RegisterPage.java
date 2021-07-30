package com.cjc.dws.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="gender-female")
	WebElement gender;	
	
	@FindBy(name="FirstName")
	WebElement firstName;	

	@FindBy(name="LastName")
	WebElement lastName;	
	
	@FindBy(name="Email")
	WebElement email;	
	
	@FindBy(name="Password")
	WebElement password;	
	
	@FindBy(name="ConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name="register-button")
	WebElement register;
	
	@FindBy(linkText = "Register")
	WebElement regiterLink;
	
	
	
		
	public void registerPage()
	{
		regiterLink.click();
		gender.click();
		firstName.sendKeys("shobha");
		lastName.sendKeys("vardhan");
		email.sendKeys("shobhagg0i7@gmail.com");
		password.sendKeys("shobhavardhan");
		confirmPassword.sendKeys("shobhavardhan");		
		register.click();
	}
	
		
	
	


}
