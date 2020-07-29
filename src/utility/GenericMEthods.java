package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
		Thread.sleep(6000);

	
	WebElement options=driver.findElement(By.xpath("//div[@class='sidebar-collapse']"));
//
    Actions act= new Actions(driver);
//	
	act.moveToElement(options).perform();
		Thread.sleep(5000);

	
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
	
	public WebElement scrollDown( WebElement element1) throws InterruptedException
	{
	 JavascriptExecutor js = (JavascriptExecutor) driver;
		//Find element by link text and store in variable "Element"        		
	 element1 = driver.findElement(By.xpath("//div[2]/button[2]/span[1]"));

     //This will scroll the page till the element is found		
     js.executeScript("arguments[0].scrollIntoView();", element1);
     
     Thread.sleep(3000);
	return element1;
	}
	
	
	public boolean assertTrue(boolean condition,String message)
	{
		
		Assert.assertTrue(driver.getPageSource().contains("testpersona4"),"persona created successfully");
		
		return true;
		
		

	}

	public static void Wait(String locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Select Image')]")));
		
		
	}
	
	public static void assertEquals(Object actualResult, Object expectedResult)
    {
        if (!expectedResult.equals(actualResult))
        {
            // take screenshot
            
        }
    }
}
