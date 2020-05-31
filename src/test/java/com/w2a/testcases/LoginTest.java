package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.errorcollectors.ErrorCollector;
import com.w2a.pages.actions.LoginPage;
import com.w2a.utilities.Utilities;

public class LoginTest {

@BeforeTest
public void browserCongfiguration() {
	Page.initConfiguration();
}

@Test(dataProviderClass=Utilities.class,dataProvider="dp")
public void loginTest(Hashtable<String,String> data) {
	LoginPage loginPage = new LoginPage();
	ErrorCollector.assertTrue(loginPage.loginPageCheck(),"We are on the login page");
	loginPage.login(data.get("username"), data.get("password"));
}

@AfterTest
public void tearDown(){
	if(Page.driver!=null){
	Page.quitBrowser();
	}
}

}
