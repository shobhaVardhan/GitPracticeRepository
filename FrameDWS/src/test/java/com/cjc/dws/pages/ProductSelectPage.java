package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSelectPage 
{
	WebDriver driver;
	
	public ProductSelectPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(linkText="Books")
	WebElement book;
	
	public void select()
	{
		book.click();
	}
	
	
}
