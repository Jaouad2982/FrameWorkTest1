package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	@FindBy(id="txtUsername")
	WebElement userName;
	@FindBy(id="txtPassword")
	WebElement password;
	
	LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserName() {
		return this.userName;
	}
	
	public WebElement getPassword() {
		return this.password;
	}
}
