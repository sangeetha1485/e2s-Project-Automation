package Test;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.NotificationsCreationPage;
import Pages.NotificationsCreationPage.notificationpagelocators;
import Pages.NotificationsHomePage;
import utility.GenericMEthods;


public class NotificationTest extends FunctionalTest{
	
	LoginPage lp = new LoginPage();

	NotificationsHomePage nhp= new NotificationsHomePage();
	
	NotificationsCreationPage ncp= new NotificationsCreationPage();
	GenericMEthods gm= new GenericMEthods();
	
	
	public void run() throws InterruptedException, IOException, AWTException
	{
		
		Thread.sleep(5000);
		
		lp.clickNotificationsOption();
		
		//nhp.getHeader();
		//nhp.checkDefaults();
		//nhp.clickPlusSymbolCreateNotification();
//
		nhp.clickCreateNotification();
//		
//		
//		
		//ncp.ValidateStep1allFieldsBlank();
		
		
		//ncp.validateStep1FieldsBlank();
		
		//ncp.checkFieldsHighlightStep1();
		
		//ncp.validateMaxLengthDisplayedStep1();
		
		
		//ncp.validateMaxCharactersStep1();
//		
		//nhp.clickPlusSymbolCreateNotification();
		ncp.validateCancelButtonMissingFileUpload();
		//ncp.validateStep1ValidData();
		
		//ncp.createNotificationUsingNewCategory();//creating new category n adding image
		
		//ncp.createNotificationStep2();
		
	

		//ncp.createNotificationExistingCategory();
		
		
		
		//ncp.validateStep3Scenarios();
		
		//ncp.validateStep3Scenariosnow();


	}

	
	public void testCancelButtonMissingFileUpload() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		
		lp.clickNotificationsOption();
		ncp.validateCancelButtonMissingFileUpload();
		
	}
	
	
	public void testHelpIconHoldsNotification() throws InterruptedException
	{
		Thread.sleep(5000);
		
		lp.clickNotificationsOption();
		
		ncp.validateHelpIconHoldsNotification();
		
	}
	
	
	@Test(priority = 1, enabled = false)
	public void validateTC_N_003() throws InterruptedException {
		extentTest = extent.startTest("validateTC_N_003");
		Thread.sleep(5000);
		
		gm.navigateToNotificationsHomePage();
		
		nhp.clickCreateNotification();
		
	
		gm.SendKeys("Xpath", notificationpagelocators.enterTitle, "notif002");
		gm.click("Xpath", notificationpagelocators.clickNextButton);
		Thread.sleep(3000);
		Assert.assertTrue(gm.isDisplayed("Xpath", notificationpagelocators.lockScreenErrorMsg),"Alert message is displayed for mandatory fields");
		
		
	}
	
	@Test(priority = 2, enabled = false)
	public void validateTC_N_004() throws InterruptedException {
		extentTest = extent.startTest("validateTC_N_004");
		Thread.sleep(5000);
		
		gm.navigateToNotificationsHomePage();
		
		nhp.clickCreateNotification();
		
	
		gm.SendKeys("Xpath", notificationpagelocators.enterLockScreenMsg, "test lock screen msg");
		gm.click("Xpath", notificationpagelocators.clickNextButton);
		Thread.sleep(3000);
		Assert.assertTrue(gm.isDisplayed("Xpath", notificationpagelocators.titleErrorMsg),"Alert message is displayed for mandatory fields");
		
		
	}
	
	@Test(priority = 3, enabled = false)
	public void validateTC_N_007() throws InterruptedException, AWTException {
		extentTest = extent.startTest("validateTC_N_007");
		Thread.sleep(5000);
		
		gm.navigateToNotificationsHomePage();
		
		nhp.clickCreateNotification();
		
	
		gm.click("Xpath", notificationpagelocators.createnewcategorybutton);
		
		gm.SendKeys("Xpath", notificationpagelocators.entercategoryname, "Library Notifications");
		
		//gm.click("Xpath", notificationpagelocators.selectimagebutton);
		
		gm.uploadFile(notificationpagelocators.selectimagebutton, "C:\\Users\\HP\\Documents\\Engage2Serve Project Documents\\sample images\\gujrat-university-results-declared.jpg");
		
		
		gm.click("Xpath", notificationpagelocators.savenewcategorybutton);
		
		
		Thread.sleep(5000);
		Assert.assertEquals(gm.getText("Xpath", notificationpagelocators.categoryddl), "Library Notifications");
		
		
		
		
		
		
	}
	@Test(priority = 4, enabled = false)
	public void validateTC_N_013() throws InterruptedException, AWTException {
		extentTest = extent.startTest("validateTC_N_013");
		Thread.sleep(5000);
		
		gm.navigateToNotificationsHomePage();
		
		nhp.clickCreateNotification();
		
	
		
		
		
		gm.SendKeys("Xpath", notificationpagelocators.enterTitle, "notif002");
		
		gm.SendKeys("Xpath", notificationpagelocators.enterLockScreenMsg, "test lock screen msg");

		
		gm.click("Xpath", notificationpagelocators.clickNextButton);
		
		gm.SendKeys("Xpath", notificationpagelocators.entercontent, "test content msg");
		gm.click("Xpath", notificationpagelocators.clickNextButton);
		
		
		Assert.assertTrue(gm.getText("Xpath", notificationpagelocators.clickuserttypeddl).equals("Alumni"));
		
		
		
	}
	
	@Test(priority = 5, enabled = false)
	public void validateTC_N_015() throws InterruptedException, AWTException {
		extentTest = extent.startTest("validateTC_N_015");
		Thread.sleep(5000);
		
		gm.navigateToNotificationsHomePage();
		
		nhp.clickCreateNotification();
		
	
		
		
		
		gm.SendKeys("Xpath", notificationpagelocators.enterTitle, "notif002");
		
		gm.SendKeys("Xpath", notificationpagelocators.enterLockScreenMsg, "test lock screen msg");

		
		gm.click("Xpath", notificationpagelocators.clickNextButton);
		
		gm.SendKeys("Xpath", notificationpagelocators.entercontent, "test content msg");
		gm.click("Xpath", notificationpagelocators.clickNextButton);
		
		gm.click("Xpath", notificationpagelocators.clicklaterradiobutton);
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.findElement(By.xpath(notificationpagelocators.clicklaterradiobutton)).isEnabled(), "Later radio button is selected ");
		
	}
	
	@Test(priority = 6, enabled = true)
	public void validateTC_N_017() throws InterruptedException, AWTException {
		extentTest = extent.startTest("validateTC_N_017");
		Thread.sleep(5000);
		
		gm.navigateToNotificationsHomePage();
		
		nhp.clickCreateNotification();
		
	
		
		
		
		gm.SendKeys("Xpath", notificationpagelocators.enterTitle, "notif002");
		
		gm.SendKeys("Xpath", notificationpagelocators.enterLockScreenMsg, "test lock screen msg");

		
		gm.click("Xpath", notificationpagelocators.clickNextButton);
		
		gm.SendKeys("Xpath", notificationpagelocators.entercontent, "test content msg");
		gm.click("Xpath", notificationpagelocators.clickNextButton);
		
		gm.click("Xpath", notificationpagelocators.clicklaterradiobutton);
		
		//gm.click("Xpath", notificationpagelocators.clickdate);
		
		
				Actions actions = new Actions(driver);
				WebElement elementLocator = driver.findElement(By.xpath(notificationpagelocators.clickdate));
				elementLocator.click();
				
				Thread.sleep(3000);

				
				driver.findElement(By.xpath("//td[@data-date='10' and @data-month='7']/div")).click();
				actions.doubleClick(elementLocator).perform();
		Thread.sleep(5000);
		
		String text=driver.findElement(By.xpath(notificationpagelocators.clickdate)).getText();
		
		System.out.println("text is" +text);
		
		Assert.assertTrue(text.isEmpty(), "past date is not enabeled ");
		
	}
}
