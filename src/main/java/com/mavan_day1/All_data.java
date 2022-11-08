package com.mavan_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_data{
	
	
	
	
	
	
	
public static WebDriver driver;
	
public  static void open_chrome() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\DELL\\eclipse-workspace\\mavan_day1\\driver1\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	public static void open_url(String hotelbook) {
		
		driver.get(hotelbook);
		
	}  
		
public static void	send_key(WebElement name,String karthik) {
	name.sendKeys(karthik);
	
}
		
	public static void click(WebElement c)  {
		c.click();
		
		
	}	
	}
	

