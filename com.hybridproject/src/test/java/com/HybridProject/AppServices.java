package com.HybridProject;

import org.openqa.selenium.WebDriver;

import com.appUtil.AppBrowserFactory;
import com.appUtil.AppTest;
import com.appUtil.CommonUtilitise;
public class AppServices extends AppBrowserFactory {
	
	public static AppTest test;

public static CommonUtilitise cmnutilities;
public static  WebDriver driver;
	
	public AppServices lanchbrowser() {
		
		
		cmnutilities=new CommonUtilitise();
		
		AppBrowserFactory.InvokeBrowser(test.browserName(), test.browserURL());
		return this;
	}
	
	public AppServices clickHomeButton() {
		
		cmnutilities.clickHomelink("xpath", test.homeButton(),AppBrowserFactory.driver);
		return this;
		
	}
	public AppServices userName(String UserName)  {
		
		cmnutilities.userName("name", test.UserName(),UserName,AppBrowserFactory.driver);
		
		return this;
	}
public AppServices invalidUserName()  {
		
		cmnutilities.userName("name", test.UserName(),test.invalidUserValue(),AppBrowserFactory.driver);
		
		return this;
	}
	public AppServices passWord(String pwd) {
		cmnutilities.userName("name", test.password(),pwd,AppBrowserFactory.driver);
		
		return this;
	}
	public AppServices closebrowser() {
		AppBrowserFactory.closeBrowser();
		return this;
	}

	

}
