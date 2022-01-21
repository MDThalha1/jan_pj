package com.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Faded_Shirt {
	private WebDriver driver;
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement faded;
	public WebElement getFaded() {
		return faded;
	}
	public Faded_Shirt(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement add;
	public WebElement getAdd() {
		return add;
	}
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	public WebElement getProceed(){
		return proceed;
	}

}
