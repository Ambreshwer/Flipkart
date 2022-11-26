package ekart.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ekart.AbstractComponents.AbstractComponents;

public class homePage extends AbstractComponents {

WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	WebElement searchBar;
	
	public void searchWithCompanyName(String companyName)
	{
		searchBar.click();
		searchBar.sendKeys(companyName);
		searchBar.sendKeys(Keys.ENTER);
	}

	public  void waitForMinutes() throws InterruptedException {
		Thread.sleep(3000);
	}



	
}
