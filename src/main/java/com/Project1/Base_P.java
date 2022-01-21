package com.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_P {
	public static WebDriver driver;
	public static void ClickonElement(WebElement element) {
		element.click();
	}
	public static void InputElement(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static WebDriver getBrowser(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"\\Driver\\geckoo.exe");
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	public static void getUrl(String name) {
		driver.get(name);

	}
	

}
