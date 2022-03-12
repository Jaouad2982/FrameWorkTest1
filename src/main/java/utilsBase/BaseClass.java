package utilsBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass extends PropFileInput{
	
	public static WebDriver driver;
	
	public WebDriver returnDriver() {
		String val = PropFileInput.retrunpropVal("browser");
		if(val.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
		}
		if(val.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
		}
		if(val.equalsIgnoreCase("edge")) {
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public void tearDown() {
		if(!(driver == null)) driver.close();
	}
	
	public void getURL() {
		driver.get(PropFileInput.retrunpropVal("url"));
	}
}
