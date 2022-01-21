package com.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click {
	private WebDriver driver;
	@FindBy(xpath="(//a[@title='T-shirts'])[1]")
	private WebElement tshirts;
	public WebElement getTshirt() {
		return tshirts;
	}
public  Click(WebDriver driver) {
 this.driver=driver;
 PageFactory.initElements(driver, this);
}
}

