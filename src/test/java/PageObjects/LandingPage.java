package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")
	
	//@FindBy(xpath="//a[@title='My Account']")
	WebElement myaccField;
     
    @FindBy(xpath="/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")
     WebElement loginOptionField;

	

	public WebElement getMyaccField() {
		return myaccField;
	}

	public WebElement getLoginOptionField() {
		return loginOptionField;
	}
     

}


