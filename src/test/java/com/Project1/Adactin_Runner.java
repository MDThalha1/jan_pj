package com.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Adactin_Runner {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mt\\eclipse-workspace\\Project1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("mohamedthalha");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("MdThalha@123");
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		location.sendKeys("New York");
		WebElement hotel = driver.findElement(By.xpath("//select[@name='location']"));
		hotel.sendKeys("Hotel Sunshine");
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		room.sendKeys("Super Deluxe");
		WebElement nos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		nos.sendKeys("2-Two");
		WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkin.sendKeys("17/01/2022");
		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.sendKeys("18/01/2022");
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		adult.sendKeys("2-Two");
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		child.sendKeys("1-One");
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		WebElement button = driver.findElement(By.xpath("//input[@type='radio']"));
		button.click();
		WebElement contiue = driver.findElement(By.xpath("//input[@type='submit']"));
		contiue.click();
		WebElement FN = driver.findElement(By.xpath("//input[@name='first_name']"));
		FN.sendKeys("Youth");
		WebElement LN = driver.findElement(By.xpath("//input[@name='last_name']"));
		LN.sendKeys("Mass");
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("1234");
		WebElement ccnum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnum.sendKeys("1234567890123456");
		WebElement ccType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		ccType.sendKeys("VISA");
		WebElement expDate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		expDate.sendKeys("September");
		WebElement expYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		expYear.sendKeys("2024");
		WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		ccv.sendKeys("456");
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		book.click();
		Actions act=new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//input[@value='My Itinerary']"));
	    act.moveToElement(move).build().perform();
		Thread.sleep(3000);
		WebElement iter = driver.findElement(By.xpath("//input[@value='My Itinerary']"));
		iter.click();
		
		
		
	}

}
