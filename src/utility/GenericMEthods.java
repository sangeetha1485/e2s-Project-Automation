package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Test.FunctionalTest;

public class GenericMEthods extends FunctionalTest{
	
	
	public void navigateToHomePage() throws InterruptedException
	{
	
	WebElement options=driver.findElement(By.xpath("//div[@class='sidebar-collapse']"));

    Actions act= new Actions(driver);
	
	act.moveToElement(options).perform();
	
	//driver.findElement(By.xpath("//span[contains(text(),'Content Library')]")).click();

	Thread.sleep(3000);

	//driver.findElement(By.xpath("//span[contains(text(),'Notifications')]")).click();

    driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
	}

	
	
	public void navigateToNotificationsHomePage() throws InterruptedException
	{
	
	WebElement options=driver.findElement(By.xpath("//div[@class='sidebar-collapse']"));
//
    Actions act= new Actions(driver);
//	
	act.moveToElement(options).perform();
		Thread.sleep(10000);

	
	driver.findElement(By.xpath("//span[contains(text(),'Content Library')]")).click();

	Thread.sleep(3000);

	Boolean notoption=driver.findElement(By.xpath("//span[contains(text(),'Notifications')]")).isDisplayed();
	
	if((notoption))
	{
	driver.findElement(By.xpath("//span[contains(text(),'Notifications')]")).click();
	}

	}

	
	public void navigateToAudiencePage() throws InterruptedException
	{
		Thread.sleep(10000);

	
	WebElement options=driver.findElement(By.xpath("//div[@class='sidebar-collapse']"));
//
    Actions act= new Actions(driver);
//	
	act.moveToElement(options).perform();
		Thread.sleep(10000);

	
	driver.findElement(By.xpath("//span[contains(text(),'Audience')]")).click();

	
	}
	
	
	public void navigateToCampusNews() throws InterruptedException
	{
		Thread.sleep(4000);

		WebElement options=driver.findElement(By.xpath("//div[@class='sidebar-collapse']"));
		//
		    Actions act= new Actions(driver);
		//	
			act.moveToElement(options).perform();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//span[contains(text(),'Content Library')]")).click();

				Thread.sleep(3000);

			
			driver.findElement(By.xpath("//span[contains(text(),'Campus News')]")).click();

	}

}
