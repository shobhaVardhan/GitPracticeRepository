package com.cjc.dws.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage {
	
WebDriver driver;
	
	public BooksPage(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(linkText = "Books")
	WebElement books;
	
	@FindBy(xpath = "(//input[@value=\"Add to cart\"])[1]")
	WebElement add_to_cart;
	
	@FindBy(linkText="Shopping cart")
	WebElement shopping_cart;
	
	@FindBy(xpath="//input[@name=\"itemquantity1822462\"]")
	WebElement quantity;
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	WebElement termsofServices; 
	
	@FindBy(name="checkout")
	WebElement checkout;
	
	
	
	public void booksCheck()
	{
		System.out.println("Inside books unction");
		books.click();
		add_to_cart.click();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		shopping_cart.click();
		quantity.clear();
		quantity.sendKeys("1");
		System.out.println("Inside shopping cart ");
		termsofServices.click();
		checkout.click();		
	}

	
}
