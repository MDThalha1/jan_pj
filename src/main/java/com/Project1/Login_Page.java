package com.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	private WebDriver driver;
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	public WebElement getUsername() {
		return email;
}
	public Login_Page(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement pass;
public WebElement getPassword() {
	return pass;
}
   @FindBy(xpath="//i[@class='icon-lock left']")
   private WebElement log;
    public WebElement getLog() {
	return log;
}
}