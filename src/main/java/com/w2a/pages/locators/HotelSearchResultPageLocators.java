package com.w2a.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelSearchResultPageLocators {
	
	

	@FindBy(xpath = "(//div[@class='input-range__slider'])[1]")
	public WebElement priceSliderLeftButton;
	
	//locators for flight booking
	@FindBy(xpath = "//label[text()='4 & above (Very Good)']")
	public WebElement userRatingCheckbox;
	
	@FindBy(xpath = "//div[@id='Listing_hotel_4']/a/div/div/div[2]//div[2]/div/p/span")
	public WebElement fifthHotelSearchResultName;
	
	
}
