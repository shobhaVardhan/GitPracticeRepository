package com.cjc.dws.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BillingPage {
	
WebDriver driver;
	
	public BillingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(name="//input[@name=\"BillingNewAddress.Company\"]")
	WebElement company;
	
	@FindBy(name="//input[@name=\"BillingNewAddress.City\"]")
	WebElement country;
	
	@FindBy(how=How.XPATH, using="//input[@id=\"BillingNewAddress_City\"]")
	WebElement city;
	
	@FindBy(how=How.XPATH, using="//input[@id=\"BillingNewAddress_Address1\"]")
	WebElement adr1;
	
	@FindBy(how=How.XPATH, using="//input[@id=\"BillingNewAddress_Address2\"]")
	WebElement adr2;
	
	@FindBy(how=How.XPATH, using="//input[@id=\"BillingNewAddress_ZipPostalCode\"]")
	WebElement zip;
	
	@FindBy(how=How.XPATH, using="//input[@id=\"BillingNewAddress_PhoneNumber\"]")
	WebElement phone;
	
	@FindBy(how=How.XPATH, using="//input[@id=\"BillingNewAddress_FaxNumber\"]")
	WebElement fax;
	
	@FindBy(how=How.XPATH, using="//div[@id='billing-buttons-container']/child :: input")
	WebElement continue1;
	
	@FindBy(how=How.XPATH, using="//input[@onclick= \"Shipping.save()\"]")
	WebElement cont2;
	
	@FindBy(how=How.XPATH, using="//input[contains(@onclick, \"ShippingMethod.save()\")]")
	WebElement cont3;
	
	@FindBy(how=How.XPATH, using="//input[contains(@onclick, \"PaymentMethod.save()\")]")
	WebElement cont4;
	
	@FindBy(how=How.XPATH, using="//input[contains(@onclick, \"PaymentInfo.save()\")]")
	WebElement cont5;
	
	@FindBy(how=How.XPATH, using="//input[contains(@onclick, \"ConfirmOrder.save()\")]")
	WebElement cont6;
	
	public void billingAdr(String comp, String country1, String city1, String adr11, String adr21, String zip1, String mob, String fax1)
	{
		//WebElement billing = driver.findElement(By.xpath("//select[@id=\"billing-address-select\"]"));
		
		
			company.sendKeys(comp);
			country.sendKeys(country1);
			city.sendKeys(city1);
			adr1.sendKeys(adr11);
			adr2.sendKeys(adr21);
			zip.sendKeys(zip1);
			phone.sendKeys(mob);
			fax.sendKeys(fax1);
			continue1.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			cont2.click();
			cont3.click();
			cont4.click();
			cont5.click();
			cont6.click();
		}
	

}
