package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RagisterPage 
{
	WebDriver driver;
	
	public RagisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='gender-male']")
	WebElement gender;
	
	@FindBy(how=How.XPATH, using="//input[@id='FirstName']")
	WebElement fname;
	
	@FindBy(how=How.XPATH, using="//input[@id='LastName']")
	WebElement lname;
	
	@FindBy(how=How.XPATH, using="//input[@id='Email']")
	WebElement email;
	
	@FindBy(how=How.XPATH, using="//input[@id=\"Password\"]")
	WebElement pwd;
	
	@FindBy(how=How.XPATH, using="//input[@id=\"ConfirmPassword\"]")
	WebElement cpwd;
	
	@FindBy(how=How.XPATH, using ="//input[@id='register-button']")
	@CacheLookup
	WebElement register;
	
	public void ragister(String first, String last, String mail, String pass, String cpass)
	{
		gender.click();
		fname.sendKeys(first);
		lname.sendKeys(last);
		email.sendKeys(mail);
		pwd.sendKeys(pass);
		cpwd.sendKeys(cpass);
		register.click();
	}
}
