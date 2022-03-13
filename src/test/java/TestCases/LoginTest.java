package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.Pages;
import utilsBase.BaseClass;

public class LoginTest extends BaseClass{
	// to be con
	public static WebDriver driver = BaseClass.returnDriver();
	LoginPage login = new LoginPage(driver);
	@Test
	public void login() {	
		driver = BaseClass.returnDriver();
		BaseClass.getURL();
		driver.manage().window().maximize();
		login.getUserName().sendKeys("ddd");;
		login.getPassword().sendKeys("dddd");
		
		
		
	}
	
}
