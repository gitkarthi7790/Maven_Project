package pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Base_class;

public class Pom_runner extends Base_class {
	public static void main(String[] args) {
		
		
		
	
	open_browser("chrome");
	open_url("https://adactinhotelapp.com/index.php");
	
	loginPage lo=new loginPage(driver);
	
	//WebElement userbox= driver.findElement(By.id("username"));
	enter_user(lo.getLogin(), "Karthickvijay779");
	
	//WebElement pass= driver.findElement(By.id("password"));
	enter_user(lo.getPass(), "karthickvijay");
	
	//WebElement loginbox=driver.findElement(By.id("login"));
	clickbtn(lo.getClick());
	

	Search_hotel sr=new Search_hotel(driver);
	//WebElement locationbox=driver.findElement(By.name("location"));
	
	dropdown(sr.getSelect(), 6);
	
//WebElement hotels=driver.findElement(By.id("hotels"));
	dropdown(sr.getHotel(), 2);
	
	//WebElement room=driver.findElement(By.id("room_type"));
	dropdown(sr.getType(), 3);
	
	//WebElement selroom=driver.findElement(By.id("room_nos"));
	dropdown(sr.getNumber(), 5);
	
	//WebElement seldate=driver.findElement(By.id("datepick_in"));
	//cleardate(seldate);
	
	enter_user(sr.getDatein(), "12/10/2022");
	 
	//WebElement outdate=driver.findElement(By.id("datepick_out"));
//cleardate(.outdate);
enter_user(sr.getDateout(), "13/10/2022");
	

//WebElement finalroom=driver.findElement(By.id("adult_room"));




dropdown(sr.getRoomtype(), 3);
	//WebElement child=driver.findElement(By.id("child_room"));
	dropdown(sr.getChild(), 2);

	
//WebElement submit=driver.findElement(By.id("Submit"));
clickbtn(sr.getSumit());
	
Select_hotel ht=new Select_hotel(driver);

//WebElement accept=driver.findElement(By.id("radiobutton_0"));
clickbtn(ht.getRadiobtn());

//WebElement searchbox=driver.findElement(By.id("continue"));  
clickbtn(ht.getContinu());
 
Book_hotel bk=new Book_hotel(driver);

//WebElement namebox=driver .findElement(By.id("first_name"));
enter_user(bk.getFname(), "karthik");

//WebElement lastnamebox=driver .findElement(By.id("last_name"));
enter_user(bk.getLname(), "vijay");


//WebElement address=driver .findElement(By.id("address"));
enter_user(bk.getAddre(),"4/55,ramapuram,porur,chennai(600028)" );


//WebElement cardno=driver.findElement(By.id("cc_num"));
enter_user(bk.getCcnum(), "0912345678909876");

//WebElement ccno=driver.findElement(By.id("cc_type"));
dropdown(bk.getCctype(), 2);


//WebElement ccmonth=driver.findElement(By.id("cc_exp_month"));
dropdown(bk.getExpmonth(), 7);

//WebElement ccyr=driver.findElement(By.id("cc_exp_year"));
dropdown(bk.getExpyear(), 12);


//WebElement ccn=driver.findElement(By.id("cc_cvv"));
enter_user(bk.getCvv(), "2344");


//WebElement book=driver.findElement(By.id("book_now"));
clickbtn(bk.getBook());

Confirm_book cn=new Confirm_book(driver);

//WebElement serch=driver.findElement(By.id("search_hotel"));

clickbtn(cn.getHotel());

System.out.println("your room booked sucessfully");

	}
}
