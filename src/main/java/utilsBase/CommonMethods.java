package utilsBase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	public static void getScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("path");
        FileUtils.copyFile(file, DestFile);
	}

}
