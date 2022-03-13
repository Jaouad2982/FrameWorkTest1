package pages;

import org.openqa.selenium.WebDriver;

public class Pages extends LoginPage{
		
		public Pages(WebDriver driver) {
		super(driver);
	}

		public Object returnLoginPage() {
			LoginPage loginpage = new LoginPage(driver);
			return loginpage;

		}
}
