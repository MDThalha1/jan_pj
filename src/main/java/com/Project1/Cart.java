package com.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	private WebDriver driver;
	@FindBy(xpath="(//span[normalize-space()='Proceed to checkout'])[2]")
	private WebElement checkout;
	public WebElement getCheck() {
		return checkout;
	}
	public Cart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[normalize-space()='Proceed to checkout'])[2]")
	private WebElement addcheck;
	public WebElement getAdd() {
		return addcheck;
	}
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement agree;
	public WebElement getAgree() {
		return agree;
	}
	@FindBy(xpath="(//span[normalize-space()='Proceed to checkout'])[2]")
	private WebElement shipping;
	public WebElement getShop() {
		return shipping;
	}
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement payment;
	public WebElement getPay() {
		return payment;
	}
	@FindBy(xpath="(//span[normalize-space()='I confirm my order'])[1]")
	private WebElement confirm;
	public WebElement getConfirm() {
		return confirm;
	}
}
