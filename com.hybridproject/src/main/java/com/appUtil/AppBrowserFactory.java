package com.appUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppBrowserFactory extends AppTest {
	public static WebDriver driver;
	
	
	public static void InvokeBrowser(String Browsername, String BrowserURL) {
		
		System.setProperty(AppTest.setup(), AppTest.chromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BrowserURL);
	}
	
	public static void closeBrowser() {
		driver.close();
	}

}
