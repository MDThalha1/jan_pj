package com.Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Runner extends Base_Class {
	public static void main(String[] args) throws Throwable {
		browserLaunch("chrome");

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		geturl("http://automationpractice.com/index.php");
		Sign_in si=new Sign_in(driver);
		//WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		elementClick(si.getSignin());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Login_Page l=new Login_Page(driver);
		//WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		input(l.getUsername(), "mmaconstruction@gmail.com");
	
		//WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		input(l.getPassword(), "MdThalha123");
		//WebElement log = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		elementClick(l.getLog());
		Thread.sleep(5000);
		Click c=new Click(driver);
		//WebElement tshirts = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		elementClick(c.getTshirt());
		Actions act=new Actions(driver);
		Faded_Shirt f=new Faded_Shirt(driver);
		//WebElement faded = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		act.moveToElement(f.getFaded()).build().perform();
		//WebElement add = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		elementClick(f.getAdd());
		//WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		elementClick(f.getProceed());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Cart ck=new Cart(driver);
		//WebElement checkout = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
		elementClick(ck.getCheck());
		//WebElement addcheck = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
		elementClick(ck.getAdd());
		//WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
		elementClick(ck.getAgree());
		//WebElement shipping = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
		elementClick(ck.getShop());
		//WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		elementClick(ck.getPay());
		//WebElement confirm = driver.findElement(By.xpath("(//span[normalize-space()='I confirm my order'])[1]"));
		elementClick(ck.getConfirm());
		
		
	}

}
