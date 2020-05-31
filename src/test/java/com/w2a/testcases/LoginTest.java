package com.w2a.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.errorcollectors.ErrorCollector;
import com.w2a.pages.actions.LoginPage;

public class LoginTest {

@BeforeTest
public void browserCongfiguration() {
	Page.initConfiguration();
}

@Test
public void loginTest() {
	LoginPage loginPage = new LoginPage();
	ErrorCollector.assertTrue(loginPage.loginPageCheck(),"We are on the login page");
	loginPage.login();
}

@AfterTest
public void tearDown(){
	if(Page.driver!=null){
	Page.quitBrowser();
	}
}

}
