package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	//@FindBy(css="#mmtLogo makeFlex")
	@FindBy(xpath="//a[@class='mmtLogo makeFlex']")
	public WebElement makeMyTripLogo;
	
	@FindBy(xpath="(//ul//child::li)[6]//following-sibling::div")
	public WebElement loginIntoAccount;
	
	@FindBy(css="#username")
	public WebElement email;
	
	//@FindBy(xpath="//button[@data-cy='continueBtn']")
	@FindBy(css="#Continue")
	public WebElement continueButton;
	
	@FindBy(css="#password")
	public WebElement password;
	
	@FindBy(css="#login")
	public WebElement loginButton;
	
	@FindBy(xpath="//span[@class='crossIcon popupSprite popupCrossIcon']")
	public WebElement closeModalPopup;
			
}
