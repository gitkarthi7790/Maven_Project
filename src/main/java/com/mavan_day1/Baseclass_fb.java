package com.mavan_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass_fb {

	
		
		public static  WebDriver driver;			
		
	public static WebDriver browser_launch() {
		System.setProperty(" .chrome.driver", 
				System.getProperty("user.dir")    +	"\\driver1\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
		
	}

	public static void fblaunch(String fb) {
		
		driver.get(fb);
		
	}
	
	public static void user(WebElement box,String name) {
		
		box.sendKeys(name);
	}
	public static void click(WebElement click) {
		click.click();
		
		
	}
}
 
