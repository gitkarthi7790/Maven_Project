package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_book {
	public WebDriver driver;
	
	@FindBy(id="search_hotel")
	private WebElement hotel;

	public Confirm_book(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getHotel() {
		return hotel;
	}

}
