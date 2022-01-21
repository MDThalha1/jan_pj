package com.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in {
	private WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;
	public WebElement getSignin() {
		return signin;
	}
	public Sign_in(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
