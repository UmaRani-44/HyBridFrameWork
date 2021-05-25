package com.HybridProject;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.appUtil.ExcelProviderHyBrid;


public class AppLoginTest
{
	public AppServices service;
	public ExcelProviderHyBrid exceldata;
	public static HSSFSheet ws;
	@BeforeSuite
	public void setup() {
		service=new AppServices();
		exceldata=new ExcelProviderHyBrid();
	}
	
@Test(priority=1)

public void browserlanch()  {
	
	ws=exceldata.wb.getSheetAt(0);
	
	service.lanchbrowser();
	
	for(int i=0;i<ws.getLastRowNum();i++) {
		String Username=exceldata.excelcelldata(0, i, 0);
		String Password=exceldata.excelcelldata(0, i, 1);
	
	service.clickHomeButton().userName(Username).passWord(Password);
	}
}

@Test(priority=2)
public void browserlanchInvalid()  {
	
	service.invalidUserName().passWord("test");
}

@AfterTest
public void closebrowser() {
	service.closebrowser();
	
}
}
