package com.w2a.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.ReviewPageLocators;
import com.w2a.pages.locators.SigninPageLocators;

public class ReviewPage extends Page{
	
	public ReviewPageLocators review;
	
	public ReviewPage(){
		
		this.review = new ReviewPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.review);
		
	}
	
	
	public void enterdetails(String firstName, String lastName, String email, String countryCode, String contact) {
		
		type(review.firstName,firstName);
		type(review.lastName,lastName);
		type(review.email,email);
		type(review.countryCode,countryCode);
		type(review.contactInfo,contact);
		
		click(review.specialRequest1);
		click(review.specialRequest2);
		
		if(review.donation.isSelected()) {
			
			click(review.donation);
		
		}
		
		if(!review.agree.isSelected()) {
			
			click(review.agree);
		}
		
		click(review.payNow);
	}

}
