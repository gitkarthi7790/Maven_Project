package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	public WebDriver driver;
	
	
	public loginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}


	public WebElement getLogin() {
		return login;
	}


	@FindBy(id="username")
	private WebElement login;
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement click;


	public WebElement getClick() {
		return click;
	}


	public WebElement getPass() {
		return pass;
	}
	
	

	

}
