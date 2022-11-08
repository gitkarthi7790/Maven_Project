package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	
	
	public Select_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	
	
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement continu;

	
	public WebElement getContinu() {
		return continu;
	}
	
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	
}
