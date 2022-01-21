package com.Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Practice extends Base_P {
	public static void main(String[] args) throws Throwable {
		driver = getBrowser("chrome");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mt\\eclipse-workspace\\Project1\\Driver\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	//driver.get("http://automationpractice.com/index.php");
	getUrl("http://automationpractice.com/index.php");	
	Thread.sleep(5000);
	WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
	ClickonElement(signin);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	InputElement(email,"mmaconstruction@gmail.com");
	WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
	pass.sendKeys("MdThalha123");
	WebElement log = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
	ClickonElement(log);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement tshirts = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
	tshirts.click();
	WebElement shorts = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
	shorts.click();
	WebElement add = driver.findElement(By.xpath("//span[text()='Add to cart']"));
	add.click();
	WebElement proceed = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])"));
	proceed.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement checkout = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
	checkout.click();
	WebElement addcheck = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
	addcheck.click();
	WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
	agree.click();
	WebElement shipping = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
	shipping.click();
	WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
	payment.click();
	WebElement confirm = driver.findElement(By.xpath("(//span[normalize-space()='I confirm my order'])[1]"));
	confirm.click();
	WebElement back = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
	back.click();
	

}
}