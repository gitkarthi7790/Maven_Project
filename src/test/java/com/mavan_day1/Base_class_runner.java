package com.mavan_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import baseclass.Base_class;

public class Base_class_runner extends Base_class {

	public static void main(String[] args) {
		

		
		
		
		
		open_browser("chrome");
		open_url("https://adactinhotelapp.com/index.php");
		
		WebElement userbox= driver.findElement(By.id("username"));
		enter_user(userbox, "Karthickvijay779");
		
		WebElement pass= driver.findElement(By.id("password"));
		enter_user(pass, "karthickvijay");
		
		WebElement loginbox=driver.findElement(By.id("login"));
		clickbtn(loginbox);
		
		WebElement locationbox=driver.findElement(By.name("location"));
		
		dropdown(locationbox, 6);
		
	WebElement hotels=driver.findElement(By.id("hotels"));
		dropdown(hotels, 2);
		
		WebElement room=driver.findElement(By.id("room_type"));
		dropdown(room, 3);
		
		WebElement selroom=driver.findElement(By.id("room_nos"));
		dropdown(selroom, 5);
		
		WebElement seldate=driver.findElement(By.id("datepick_in"));
		cleardate(seldate);
		
		enter_user(seldate, "12/10/2022");
		 
		WebElement outdate=driver.findElement(By.id("datepick_out"));
	cleardate(outdate);
	enter_user(outdate, "13/10/2022");
		

	WebElement finalroom=driver.findElement(By.id("adult_room"));
dropdown(finalroom, 3);
		WebElement child=driver.findElement(By.id("child_room"));
		dropdown(child, 2);

		
	WebElement submit=driver.findElement(By.id("Submit"));
	clickbtn(submit);
				
				WebElement accept=driver.findElement(By.id("radiobutton_0"));
				clickbtn(accept);
				
				WebElement searchbox=driver.findElement(By.id("continue"));  
				clickbtn(searchbox);
				
				WebElement namebox=driver .findElement(By.id("first_name"));
				enter_user(namebox, "karthik");
				
				WebElement lastnamebox=driver .findElement(By.id("last_name"));
				enter_user(lastnamebox, "vijay");
				
				
			WebElement address=driver .findElement(By.id("address"));
			enter_user(address,"4/55,ramapuram,porur,chennai(600028)" );
				

				WebElement cardno=driver.findElement(By.id("cc_num"));
				enter_user(cardno, "0912345678909876");
				
				WebElement ccno=driver.findElement(By.id("cc_type"));
				dropdown(ccno, 2);
				
				
				WebElement ccmonth=driver.findElement(By.id("cc_exp_month"));
				dropdown(ccmonth, 7);
				
				WebElement ccyr=driver.findElement(By.id("cc_exp_year"));
				dropdown(ccyr, 12);
				
				
			WebElement ccn=driver.findElement(By.id("cc_cvv"));
			enter_user(ccn, "2344");
			
				
				WebElement book=driver.findElement(By.id("book_now"));
				clickbtn(book);
				
				WebElement serch=driver.findElement(By.id("search_hotel"));

				clickbtn(serch);
		
	}

	

}
