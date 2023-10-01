package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input")
	WebElement  emailIDfield;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")
	WebElement passwordField;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/input")
	WebElement loginButton;

	public WebElement getEmailIDfield() {
		return emailIDfield;
	}
	public WebElement getPasswordField() {
		return passwordField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
