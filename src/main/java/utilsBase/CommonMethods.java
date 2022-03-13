package utilsBase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	
	public static WebDriver driver = BaseClass.returnDriver();
	
	public static void enterValue(WebElement element,String val) {
		element.sendKeys(val);
	}
	public static void click(WebElement element) {
		element.click();
	}
	
	public static JavascriptExecutor jsExecute() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js;
	}
	
	public static WebDriverWait returnWait() {
		WebDriverWait wait = new WebDriverWait(driver,Constants.implicitWait);
		return wait;
	}
	

}
