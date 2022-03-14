package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.Pages;
import utilsBase.BaseClass;
import utilsBase.CommonMethods;

public class LoginTest extends BaseClass{
	// to be con
	public static WebDriver driver = BaseClass.returnDriver();
	LoginPage login = new LoginPage(driver);
	CommonMethods comMethods = new CommonMethods();
	
	
	@Test(dataProvider="getData")
	public void login(String name,String password) {	
		driver = BaseClass.returnDriver();
		BaseClass.getURL();
		driver.manage().window().maximize();
		CommonMethods.enterValue(login.getUserName(), name);
		CommonMethods.enterValue(login.getPassword(), password);
	}
	
	@DataProvider(name="getData")
	public void getData() {
		Object [][] data = new Object[1][2];
		data[0][0] = "Random name";
		data[0][1] ="random pas";
		data[1][0]="random name two";
		data[1][1]="random pass2";
	}
	
	
	
}
