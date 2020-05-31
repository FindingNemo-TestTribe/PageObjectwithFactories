package com.w2a.pages.locators;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class TravellerInformationLocators {

	@FindBy(css = "#txtSelect")
	public WebElement select;
		
	@FindBy(css = "#title")
	public WebElement title;
	

	@FindBy(css = "#fName")
	public WebElement firstName;

	@FindBy(css = "#lName")
	public WebElement lastName;

	@FindBy(css = "#email")
	public WebElement emailID;

	@FindBy(css = "#mNo")
	public WebElement contactInfo;

	@FindBy(css = "#gstopen")
	public WebElement gSTnumbercheckbox;

	@FindBy(css = "#donation")
	public WebElement donationcheckbox;
	
	@FindBy(css = "#primaryBtn btnPayNow")
	public WebElement payNow;

	@FindBy(css = "#agree")
	public WebElement iagreecheckbox;
	
	@FindBy(css = "input[id^='101']")
	public WebElement specialRequest1;
	
	@FindBy(css = "input[id^='104']")
	public WebElement specialRequest2;
		
}
