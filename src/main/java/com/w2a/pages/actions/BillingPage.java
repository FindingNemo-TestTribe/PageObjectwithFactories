package com.w2a.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.BillingPageLocators;
import com.w2a.pages.locators.HomePageLocators;

public class BillingPage extends Page{
	
	public BillingPageLocators billing;
	
	
	public BillingPage(){
		
		this.billing = new BillingPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.billing);
		
	}
	
	public void goToReviewPage() {
		click(billing.selectRoom);
	}

}