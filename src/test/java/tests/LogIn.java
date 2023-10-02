package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

//import PageObjects.AccountPage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;

public class LogIn  extends Base{
	//WebDriver driver;

	@Test
	public void login() {
		
	//WebDriver driver=initializeDriver();
        driver.get(prop.getProperty("url"));
        LandingPage landing=new LandingPage(driver);
        landing.getMyaccField().click();
        landing.getLoginOptionField().click();
        
        LoginPage lp=new LoginPage(driver);
        lp.getEmailIDfield().sendKeys(prop.getProperty("email"));
        lp.getPasswordField().sendKeys(prop.getProperty("password"));
        lp.getLoginButton().click();     
        System.out.println("Kumar updated code in his repo");
        System.out.println("kumar updated code into abranch");
                  		
        	
		
	}
	
	@AfterMethod
	public void closure()
	{
		
		driver.quit();
	}
}
