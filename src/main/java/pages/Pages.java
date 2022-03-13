package pages;

import org.openqa.selenium.WebDriver;

public class Pages extends LoginPage{
	
	LoginPage loginpage = new LoginPage(driver);
	Pages(WebDriver driver) {
		super(driver);
	}

}
