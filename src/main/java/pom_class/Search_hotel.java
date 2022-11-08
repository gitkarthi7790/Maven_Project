package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	
	
	
	
	public WebDriver driver;
	
	
	public Search_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getNumber() {
		return number;
	}
	public WebElement getDatein() {
		return datein;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSumit() {
		return sumit;
	}
	
	@FindBy(name="location")
	private WebElement select;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement type;
	@FindBy(id="room_nos")
	private WebElement number;
	@FindBy(id="datepick_in")
	private WebElement datein;
	@FindBy(id="datepick_out")
	private WebElement dateout;
	@FindBy(id="adult_room")
	private WebElement roomtype;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement sumit;
	
	
	

}
