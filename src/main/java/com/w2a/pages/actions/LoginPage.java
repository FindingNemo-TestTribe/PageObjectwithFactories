package com.w2a.pages.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Constants;
import com.w2a.base.Page;
import com.w2a.pages.locators.LoginPageLocators;

public class LoginPage extends Page {

	public LoginPageLocators login;
	
	public LoginPage() {
	this.login = new LoginPageLocators();
	AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
	PageFactory.initElements(factory, this.login);
}
	
	public boolean loginPageCheck(){
		boolean elementCheck = isElementPresent(login.makeMyTripLogo);
		return elementCheck;
	}
	
	public LoginPage login(){
		click(login.loginIntoAccount);
		type(login.email,Constants.userName);
		click(login.continueButton);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();",login.continueButton);
		type(login.password,Constants.password);
		click(login.loginButton);
		click(login.closeModalPopup);
		return this;
	}

	
	
}
