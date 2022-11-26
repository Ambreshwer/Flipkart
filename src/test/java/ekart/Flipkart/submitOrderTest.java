package ekart.Flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ekart.Test.Basetest;
import ekart.pageObject.homePage;
import ekart.pageObject.loginPage;
import ekart.pageObject.orderPage;

public class submitOrderTest extends Basetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver;
		String num="8050133037";
		String password="Ambresh226@";
		String companyName="mi mobiles";
		String mobileName="REDMI 10A (CHARCOAL BLACK, 128 GB)";

		//System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		loginPage lp = new loginPage(driver);
		lp.goTo();
		lp.loginApplication(num, password);
		lp.waitForMinutes();
		homePage hp =new homePage(driver);
		hp.searchWithCompanyName(companyName);
		hp.waitForMinutes();
		orderPage op =new orderPage(driver);
		op.searchWithMobileName(mobileName);
		op.waitForMinutes();
		
	}

}
