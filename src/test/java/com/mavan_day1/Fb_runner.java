package com.mavan_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Fb_runner extends Baseclass_fb {

	public static void main(String[] args) {
		
		browser_launch();
		
		
		fblaunch("https://www.facebook.com/login.php/");
		WebElement findElement = driver.findElement(By.name("email"));
	user(findElement, "sdfghjk");
	WebElement findElement2 = driver.findElement(By.name("pass"));
	user(findElement2, "123456789");
		
WebElement findElement3 = driver.findElement(By.name("login"));

findElement3.click();
	}

	

}
