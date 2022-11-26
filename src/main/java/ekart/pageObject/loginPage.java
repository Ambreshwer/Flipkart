package ekart.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ekart.AbstractComponents.AbstractComponents;

public class loginPage extends AbstractComponents {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div/input[@class='_2IX_2- VJZDxU']")
	WebElement id;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password1; 
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement button; 
	
	
	public void loginApplication(String num, String password)
	{
		id.sendKeys(num);
		password1.sendKeys(password);
		button.click();
	}
	
	public void goTo()
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	public  void waitForMinutes() throws InterruptedException {
		Thread.sleep(3000);
	}

	

	
}
