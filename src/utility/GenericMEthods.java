package utility;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Test.FunctionalTest;

public class GenericMEthods extends FunctionalTest{
	
	//initializing locators
	
	
//	public enum LocatorType {
//		
//		Xpath, Name
//		
//		}
//	
//	public static class CharacterDirection {
//		LocatorType locatortype;
//
//	    public CharacterDirection(LocatorType locatortype) {
//	        this.locatortype = locatortype;
//	    }
	    
	   

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
	
	public void scrollDown( String locator) throws InterruptedException
	{
	 JavascriptExecutor js = (JavascriptExecutor) driver;
		//Find element by link text and store in variable "Element"        		
	 WebElement createpersonabutton =driver.findElement(By.xpath(locator));

     //This will scroll the page till the element is found		
     js.executeScript("arguments[0].scrollIntoView();", createpersonabutton);
     
     Thread.sleep(3000);
	
	}
	
	
	public boolean assertTrue(boolean condition,String message)
	{
		
		Assert.assertTrue(driver.getPageSource().contains("testpersona4"),"persona created successfully");
		
		return true;
		
		

	}

	public static void Wait(String locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		
		
	}
	
	
	public void click(String locatortype,String locator)
	{
		
		switch(locatortype)
		{
		
		case "Xpath":
		
			driver.findElement(By.xpath(locator)).click();
		
		break;
		
		case "Name":
		
			driver.findElement(By.name(locator)).click();
		
		break;
			
		
		
		case "LinkText":
		
		driver.findElement(By.linkText(locator)).click();
		break;
		
		}
	}
	
	public void SendKeys(String locatortype,String locator,String value)
	{
		switch(locatortype)
		{
		case "Xpath":
			
			driver.findElement(By.xpath(locator)).sendKeys(value);
		
			break;
	
		
		case "Name":
			
			driver.findElement(By.name(locator)).sendKeys(value);
			break;
		}
		
	}
	
	public static Boolean isFileDownloaded(String fileName) {
        boolean flag = false;
        //paste your directory path below
        //eg: C:\\Users\\username\\Downloads
        String dirPath = ""; 
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files.length == 0 || files == null) {
            System.out.println("The directory is empty");
            flag = false;
        } else {
            for (File listFile : files) {
                if (listFile.getName().contains(fileName)) {
                    System.out.println(fileName + " is present");
                    break;
                }
                flag = true;
            }
        }
        return flag;
    }
	
	
	public File getLastModifiedFile(File directory) {
	    File[] files = directory.listFiles();
	   if (files.length == 0) return null;
	    Arrays.sort(files, new Comparator<File>() {
	        public int compare(File o1, File o2) {
	            return new Long(o2.lastModified()).compareTo(o1.lastModified()); 
	        }});
	    return files[0];
	}
	
	 public boolean deleteFile(File pFile) {
	        boolean bResult = false;

	        if(pFile.exists()) {
	            if(pFile.isDirectory()) {
	                if(pFile.list().length == 0) {
	                    pFile.delete();
	                } else {
	                    String[] strFiles = pFile.list();

	                    for(String strFilename: strFiles) {
	                    	
	                    	if(strFilename.contains((CharSequence) pFile))
	                    	{
	                        File fileToDelete = new File(pFile, strFilename);

	                        deleteFile(fileToDelete);
	                    	}
	                    }
	                }
	            } else {
	                pFile.delete();
	            }
	        }

	        return bResult;
	    }
	 
	 
	public static void assertEquals(Object actualResult, Object expectedResult)
    {
        if (!expectedResult.equals(actualResult))
        {
            // take screenshot
            
        }
    }



	
}
