package ekart.Flipkart;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class StandAloneTest {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ambresh226@");
		driver.findElement(By.xpath("//div/input[@class='_2IX_2- VJZDxU']")).sendKeys("8050133037");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mi mobiles");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> mobiles=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(WebElement mobile : mobiles )
		{
			if (mobile.getText().trim().equalsIgnoreCase("REDMI 10A (CHARCOAL BLACK, 128 GB)"))
			{
				mobile.click();
				break;	
			}
		}
		Thread.sleep(2000);
		
		
		
		/*    
		 
		 ********* below code is not locating the element,not clicking on the add to cart button ***********
		 
		
		 
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		driver.findElement(By.xpath("//div[@class='_3dsJAO'][1]")).click();
		*/
	}
}
