package com.appUtil;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class AppTest {
	public static Properties prop;
	
	public AppTest() {
	try {
		
		File file=new File("./appFiles/Login.Properties");
		FileInputStream fios=new FileInputStream(file);
		prop=new Properties();
		prop.load(fios);
		
		
	}
	catch(Exception ex){
		System.out.println(ex.getMessage());
		
	}
	}
 public static String setup() {
	 return prop.getProperty("chromesetup");
 }
 public static String chromePath() {
	 return prop.getProperty("chromepath");
 }
 public static String browserName() {
	 return prop.getProperty("browsername");
 }
 public static String browserURL() {
	 return prop.getProperty("weburl");
 }
 public static String homeButton() {
	 return prop.getProperty("homexpath");
 }
 public static String UserName() {
	 return prop.getProperty("user");
 }
 public static String password() {
	 return prop.getProperty("pass");
 }  
 public static String userValue() {
	 return prop.getProperty("username");
 }  
 public static String pwdValue() {
	 return prop.getProperty("password");
 }  
 public static String invalidUserValue() {
	 return prop.getProperty("invalidusername");
 }
 
}
