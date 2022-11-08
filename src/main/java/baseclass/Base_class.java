package baseclass;

import org.apache.poi.xwpf.usermodel.BreakClear;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	
	
	
	
	public static WebDriver driver;
	
	
	
	
	//browser launch
	public static WebDriver open_browser(String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver", 
		System.getProperty("user.dir")    +	"\\driver1\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		}
		
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")    +	"\\driver1\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
			
		}
		
		return driver;
		
		
	}
	
	//get url
	public static void open_url(String url ) {
		driver.get(url);
		
	}
	
	
	public static void enter_user(WebElement namebox,String name ) {
	namebox.sendKeys(name);	
		
		
	}
	public static void clickbtn(WebElement click) {
		click.click();
		
	}
	
	public static void dropdown(WebElement element,int select) {
		Select s=new Select(element);
		s.selectByIndex(select);
		
	}
public static void cleardate(WebElement clear) {
	clear.clear();
}

	
	}


