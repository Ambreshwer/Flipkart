package ekart.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ekart.pageObject.loginPage;


public class Basetest {
	
	WebDriver driver;
	loginPage lp;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//Flipkart//src//main//java//ekart//Resources//globaldata.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.contains("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
		}
		return driver;
	}
	
	@BeforeMethod
	public void launchApplication() throws IOException
	{
		driver =initializeDriver();
		
	}

}


	
