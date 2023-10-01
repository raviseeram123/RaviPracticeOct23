package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	public Properties prop=new Properties();
	
	//@BeforeMethod
	@BeforeClass
	public WebDriver  initializeDriver() throws IOException
	{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\data.properties");
		prop.load(fis);
		String browser =prop.getProperty("browser");
		
		if (browser.equals("chrome")) {
						driver=new ChromeDriver();
		}
		if(browser.equals("firefox")){
			driver=new FirefoxDriver();
		}
			
		if(browser.equals("edge")){
				driver = new EdgeDriver();
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;		
	}
}