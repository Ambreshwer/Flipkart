package ekart.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ekart.AbstractComponents.AbstractComponents;

public class orderPage extends AbstractComponents{
	
	WebDriver driver;
	
	public orderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='_4rR01T']")
	List<WebElement>mobiles;
	
	
	public void searchWithMobileName(String mobileName)
	{
		List<WebElement> mobiles=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(WebElement mobile : mobiles )
		{
			if (mobile.getText().trim().equalsIgnoreCase(mobileName))
			{
				mobile.click();
				break;	
			}
		}
	}
	
	public void waitForMinutes() throws InterruptedException {
		Thread.sleep(3000);
	}
	
}
