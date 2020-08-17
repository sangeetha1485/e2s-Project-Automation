package Test;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AudiencePage;
import Pages.CampusNews;
import Pages.CampusNews.CampusNewslocators;
import utility.GenericMEthods;

public class CampusNewsTest extends FunctionalTest{

	
	CampusNews cn = new CampusNews();
	GenericMEthods gm = new GenericMEthods();
	
	
	

	
	@Test(priority = 1, enabled = true)
	public void validateTC_CN_005() throws Exception {
		
		extentTest = extent.startTest("validateTC_CN_005");
		gm.Wait("//*[@id='top_navigation_heading']");
		gm.navigateToCampusNews();
		
		gm.click("Xpath", CampusNewslocators.createnewsbutton);	
		
		Thread.sleep(5000);
		
		gm.click("Xpath", CampusNewslocators.selectcategoryddl);
		
		gm.SendKeys("Xpath", CampusNewslocators.searchcategory, "Alumni Activities");
		
		driver.findElement(By.xpath(CampusNewslocators.searchcategory)).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		String categoryname=driver.findElement(By.xpath("//span[contains(text(),'Alumni Activities')]")).getText();
		
		Assert.assertEquals(categoryname, "Alumni Activities","entered category name is not displayed in select category field");
		
		
	}
	}
	

