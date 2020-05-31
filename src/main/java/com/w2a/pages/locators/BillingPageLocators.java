package com.w2a.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPageLocators {
	
	@FindBy(xpath="//a[contains(text(),'BOOK THIS NOW')]")
	public WebElement bookingButton;
	
	@FindBy(css="#latoBlack font16 blackText appendBottom5 emiTooltipCont")
	public WebElement price;
	
	@FindBy(css="#txtHeading font22 latoBlack blackText")
	public WebElement hotelName;
	
	@FindBy(xpath="//div[@id=\"GENR^^^XMMA\"]//a")
	public WebElement selectRoom;


}