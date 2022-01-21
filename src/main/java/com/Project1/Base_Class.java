package com.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public static WebDriver driver;
	//Browser launch
	public static  WebDriver browserLaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
					//"C:\\Users\\Mt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(name.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			//driver=new GeckoDriver();
			}
		return driver;
		}
		//get
		public static void geturl(String url) {
			driver.get(url);
		}
		//click
			public static void elementClick(WebElement element) {
				element.click();
			}
			//sendkeys
			public static void input(WebElement element,String value) {
				element.sendKeys(value);
				
			}
		
	}

