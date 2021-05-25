package com.appUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtilitise {

	
	public static WebElement homelink;
	public void clickHomelink(String IdentifiedBy,String Locator,WebDriver driver) {
		if(IdentifiedBy.equalsIgnoreCase("id"))
		{
		driver.findElement(By.id(Locator)).click();
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			driver.findElement(By.name(Locator)).click();
			
		}
		else if (IdentifiedBy.equalsIgnoreCase("xpath"))
		{
		 homelink=driver.findElement(By.xpath(Locator));
		 if(homelink.isEnabled()) {
			 homelink.click();
			 System.out.println("performed");
		 }
		 else{
			 System.out.println("doesn't perform");
		 }
			
		}
		else if (IdentifiedBy.equalsIgnoreCase("cssSelector"))
		{
			driver.findElement(By.cssSelector(Locator)).click();
		}
	}
	public void userName(String IdentifiedBy,String Locator,String UserName,WebDriver driver) {
		if(IdentifiedBy.equalsIgnoreCase("id"))
		{
		driver.findElement(By.id(Locator)).sendKeys(UserName);
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			driver.findElement(By.name(Locator)).sendKeys(UserName);
		}
		else if (IdentifiedBy.equalsIgnoreCase("xpath"))
		{
		 homelink=driver.findElement(By.xpath(Locator));
		 if(homelink.isEnabled()) {
			 homelink.sendKeys(UserName);
			 System.out.println("performed");
		 }
		 else{
			 System.out.println("doesn't perform");
		 }
			
		}
		else if (IdentifiedBy.equalsIgnoreCase("cssSelector"))
		{
			driver.findElement(By.cssSelector(Locator)).sendKeys(UserName);
		}
	}
}
