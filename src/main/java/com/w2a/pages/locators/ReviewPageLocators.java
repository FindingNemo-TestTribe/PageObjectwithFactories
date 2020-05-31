package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPageLocators {
	
	@FindBy(css = "#txtSelect")
	public WebElement salutation;
	
	@FindBy(css = "input[id^='fName']")
	public WebElement firstName;
	
	@FindBy(css = "input[id^='lName']")
	public WebElement lastName;

	@FindBy(css = "input[id^='email']")
	public WebElement email;
	
	@FindBy(css = "#countryCode")
	public WebElement countryCode;
	
	@FindBy(css = "input[id^='txtInputContactInfo']")
	public WebElement contactInfo;
	
	@FindBy(css = "input[id^='donation']")
	public WebElement donation;
	
	@FindBy(css = "input[id^='agree']")
	public WebElement agree;
	
	@FindBy(css = "#primaryBtn btnPayNow")
	public WebElement payNow;
	
	@FindBy(css = "input[id^='101']")
	public WebElement specialRequest1;
	
	@FindBy(css = "input[id^='104']")
	public WebElement specialRequest2;
	
}

