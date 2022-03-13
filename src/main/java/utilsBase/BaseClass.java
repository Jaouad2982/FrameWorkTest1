package utilsBase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass extends PropFileInput{
	
	public static WebDriver driver;
	
	public static WebDriver returnDriver() {
		FileInputStream file = PropFileInput.fileReturn();
		Properties prop = PropFileInput.returnProp();
		String val = BaseClass.returnpropVal("browser");
		if(val.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();;
			driver = new ChromeDriver();
		}
		if(val.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		if(val.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	}
	
	public static void tearDown() {
		if(!(driver == null)) driver.close();
	}
	
	public static void getURL() {
		driver.get(PropFileInput.returnpropVal("url"));
	}
}
