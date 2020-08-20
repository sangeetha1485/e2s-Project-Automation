package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ServiceDesk;
import Pages.ServiceDesk.ServiceDesklocators;
import utility.GenericMEthods;

public class ServiceDeskTest  extends FunctionalTest{

	ServiceDesk sd= new ServiceDesk();
	
	GenericMEthods gm = new GenericMEthods();

	
	@Test(priority = 1, enabled = false,description="Verify user not able to create template without selecting Ticket category & template")
	public void vaidateTC_SD_020() throws InterruptedException
	{
		
		extentTest = extent.startTest("vaidateTC_SD_020");
		Thread.sleep(5000);
		gm.Wait("//*[@id='top_navigation_heading']");
		//gm.scrollDown("//li[@title='Configuration']/a/i");
		gm.scrollToElement("//li[@title='Configuration']/a/i");
		
		
		gm.navigateToServiceDeskConfigPage();
		Thread.sleep(5000);
		gm.click("Xpath", ServiceDesklocators.clickfeaturesetup);
		
		gm.click("Xpath", ServiceDesklocators.featureticketoption);
		gm.click("Xpath", ServiceDesklocators.clicktickettemplateoption);
		gm.click("Xpath", ServiceDesklocators.createnewtemplate);
		
		Thread.sleep(5000);
		gm.SendKeys("Xpath", ServiceDesklocators.templatename, "testtemplate1");
		
		gm.click("Xpath", ServiceDesklocators.selectpriority);
		gm.click("Xpath", ServiceDesklocators.selectnormalpriority);
		
		gm.SendKeys("Xpath", ServiceDesklocators.entersubject, "test");
		gm.SendKeys("Xpath", ServiceDesklocators.enterdescvalue, "test");
		
		gm.scrollDown(ServiceDesklocators.cliccreate);
		gm.click("Xpath", ServiceDesklocators.cliccreate);

		Thread.sleep(3000);
		Boolean errormsg=gm.isDisplayed("Xpath", "//div[contains(text(),'Please select ticket category')]");
		
		
		
		Assert.assertTrue(errormsg);
	}
	
	@Test(priority = 2, enabled = false,description="Verify category is selected if template is selected for the ticket in create page")
	public void vaidateTC_SD_023() throws InterruptedException
	{
		
		extentTest = extent.startTest("vaidateTC_SD_023");
		Thread.sleep(5000);
		gm.Wait("//*[@id='top_navigation_heading']");
		//gm.scrollDown("//li[@title='Configuration']/a/i");
		gm.scrollToElement("//li[@title='Configuration']/a/i");
		
		gm.navigateToServiceDeskPage();
		
		Thread.sleep(5000);
		
		
		gm.click("Xpath", ServiceDesklocators.clickcreatenew);
		Thread.sleep(3000);
		gm.click("Xpath", ServiceDesklocators.selectemplate);
		
		driver.findElement(By.xpath("//div[contains(text(),'Demo Ticket Template')]")).click();
		Thread.sleep(3000);
		Boolean categorydisplayed=gm.isDisplayed("Xpath", ServiceDesklocators.selectedcategory);
		Assert.assertTrue(categorydisplayed);
		
	}
	
	
	@Test(priority = 3, enabled = false,description="Verify user not able to create ticket without selecting Priority")
	public void vaidateTC_SD_028() throws InterruptedException
	{
		
		extentTest = extent.startTest("vaidateTC_SD_023");
		Thread.sleep(5000);
		gm.Wait("//*[@id='top_navigation_heading']");
		//gm.scrollDown("//li[@title='Configuration']/a/i");
		gm.scrollToElement("//li[@title='Configuration']/a/i");
		
		gm.navigateToServiceDeskPage();
		
		Thread.sleep(5000);
		
		
		gm.click("Xpath", ServiceDesklocators.clickcreatenew);
		Thread.sleep(5000);
		gm.click("Xpath", ServiceDesklocators.selectemplate);
		
		driver.findElement(By.xpath("//div[contains(text(),'Demo Ticket Template')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='selPriority']/a/abbr")).click();
		gm.click("Xpath", ServiceDesklocators.cliccreatandcontinue);
		Thread.sleep(3000);
		
		Boolean alertdisplayed=gm.isDisplayed("Xpath", "//div[contains(text(),'Please select priority')]");
		Assert.assertTrue(alertdisplayed);
		
	}
	
	@Test(priority = 4, enabled = true,description="Verify user not able to create ticket without fill subject & description")
	public void vaidateTC_SD_029() throws InterruptedException
	{
		
		extentTest = extent.startTest("vaidateTC_SD_029");
		Thread.sleep(5000);
		gm.Wait("//*[@id='top_navigation_heading']");
		//gm.scrollDown("//li[@title='Configuration']/a/i");
		gm.scrollToElement("//li[@title='Configuration']/a/i");
		
		gm.navigateToServiceDeskPage();
		
		Thread.sleep(5000);
		
		
		gm.click("Xpath", ServiceDesklocators.clickcreatenew);
		Thread.sleep(5000);
		gm.click("Xpath", ServiceDesklocators.selectemplate);
		
		driver.findElement(By.xpath("//div[contains(text(),'Demo Ticket Template')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(ServiceDesklocators.entersubjectvalue)).clear();
		
	
		gm.click("Xpath", ServiceDesklocators.cliccreatandcontinue);
		Thread.sleep(3000);
		
		Boolean alertdisplayed=gm.isDisplayed("Xpath", "//div[contains(text(),'Please enter subject')]");
		Assert.assertTrue(alertdisplayed);
		
		driver.findElement(By.xpath(ServiceDesklocators.entersubjectvalue)).sendKeys("test");
		
		driver.findElement(By.xpath(ServiceDesklocators.enterdesc)).clear();
		//gm.click("Xpath", ServiceDesklocators.clickaddnotes);
		Thread.sleep(5000);
		gm.click("Xpath", ServiceDesklocators.clearaction);
		
		Thread.sleep(5000);
		gm.click("Xpath", ServiceDesklocators.cliccreatandcontinue);
		Thread.sleep(5000);
		
		alertdisplayed=gm.isDisplayed("Xpath", "//div[contains(text(),'Please enter description')]");
		Assert.assertTrue(alertdisplayed);
	}
}
