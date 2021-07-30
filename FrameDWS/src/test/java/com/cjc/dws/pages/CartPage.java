package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage 
{
	WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(linkText="Books")
	WebElement book;
	
	@FindBy(how=How.XPATH, using="//input[@value=\"Add to cart\"]")
	WebElement add;
	
	@FindBy(linkText="Shopping cart")
	WebElement cart;
	
	@FindBy(how=How.XPATH, using="//input[@id='termsofservice']")
	WebElement terms;
	
	@FindBy(how=How.XPATH, using="//button[@id='checkout']")
	WebElement checkout;
	
			
	public void add()
	{
		book.click();
		add.click();
		cart.click();
		terms.click();
		checkout.click();		
	}
	
	
	public void checkout()
	{
		terms.click();
		checkout.click();
	}
	
}
