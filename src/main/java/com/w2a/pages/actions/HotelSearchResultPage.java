package com.w2a.pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.HotelSearchResultPageLocators;

public class HotelSearchResultPage extends Page {
	
	public HotelSearchResultPageLocators srchReult;
	

	public HotelSearchResultPage(){
		
		this.srchReult = new HotelSearchResultPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.srchReult);
		
	}
	
	
	
	

	public void movePriceSlider(){
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(srchReult.priceSliderLeftButton, 96, 896).release().build().perform();
		
	}
	
	public void setUserRating(){
		
		click(srchReult.userRatingCheckbox);
	}
	
	public void selectHotel(){
		
		click(srchReult.fifthHotelSearchResultName);
	}
	

}
