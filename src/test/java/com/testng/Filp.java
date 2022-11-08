package com.testng;


	

	import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;


	public class Filp {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\eclipse-workspace\\mavan_day1\\driver1\\chromedriver.exe");
			
			
			
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			
		
			WebElement xmark = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		xmark.click();
		
		
		Actions ac=new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("(//div[@class=\"xtXmba\"])[5]"));
		ac.moveToElement(electronics).build().perform();
		driver.findElement(By.xpath("(//a[@class=\"_6WOcW9 _3YpNQe\"])[2]")).click();
	Thread.sleep(2000);
		WebElement el = driver.findElement(By.xpath(("//span[text()='Electronics']")));
		ac.moveToElement(el).build().perform();
		Thread.sleep(2000);
		WebElement mi = driver.findElement(By.xpath("//a[@title=\"Mi\"]"));
	mi.click();
	
//	TakesScreenshot tk=(TakesScreenshot) driver;
//	File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
//	File file = new File("C:\\Users\\DELL\\eclipse-workspace\\mavan_day1\\screenshot\\karthi.png");
//FileUtils.copyFile(screenshotAs,file);

		}
		

	}



