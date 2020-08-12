package Test;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
	
	
//	public void validateTC_N_017() throws InterruptedException, AWTException {
//		extentTest = extent.startTest("validateTC_N_017");
//		Thread.sleep(5000);
//		
//		gm.navigateToNotificationsHomePage();
//		
//		nhp.clickCreateNotification();
//		
//	
//		
//		
//		
//		gm.SendKeys("Xpath", notificationpagelocators.enterTitle, "notif002");
//		
//		gm.SendKeys("Xpath", notificationpagelocators.enterLockScreenMsg, "test lock screen msg");
//
//		
//		gm.click("Xpath", notificationpagelocators.clickNextButton);
//		
//		gm.SendKeys("Xpath", notificationpagelocators.entercontent, "test content msg");
//		gm.click("Xpath", notificationpagelocators.clickNextButton);
//		
//		gm.click("Xpath", notificationpagelocators.clicklaterradiobutton);
//		
//		//gm.click("Xpath", notificationpagelocators.clickdate);
//		
//		
//				Actions actions = new Actions(driver);
//				WebElement elementLocator = driver.findElement(By.xpath(notificationpagelocators.clickdate));
//				elementLocator.click();
//				
//				Thread.sleep(3000);
//				
//				Date date=new Date();
//				
//				DateFormat sdf=new SimpleDateFormat("dd");
//				
//				String todaydate=sdf.format(date);
//				
//				
//				
//				driver.findElement(By.xpath("//td[@data-date='11' and @data-month='7']/div")).click();
//				
//				
//				
//				actions.doubleClick(elementLocator).perform();
//				DateFormat dateFormat = new SimpleDateFormat("dd");
//			    Calendar cal = Calendar.getInstance();
//			    cal.setTime(new Date());
//			    cal.add(Calendar.DATE, -2);
//			    
//			    
//			    String newDate = dateFormat.format(cal.getTime());
//			    
//			    //System.out.println(newDate);
//			    
//				//driver.findElement(By.xpath("//td[@data-date='11' and @data-month='7']/div")).click();
//
//			Boolean dateselected=driver.findElement(By.xpath("//td[@data-date='11' and @data-month='7']/div")).isSelected();
//				//Boolean dateisEnabled=driver.findElement(By.xpath("//td[@data-date='10' and @data-month='7']/div")).
//				
//			
//			String entereddate=driver.findElement(By.xpath("//div[@id='sDate']")).getText();
//			
//			String entereddate1=driver.findElement(By.xpath("//a[@id='startDate123']")).getText();
//			
//			
//				System.out.println(entereddate);
//				
//				System.out.println(entereddate1);
//				
//				//System.out.println(dateisEnabled);
//				
//		Thread.sleep(5000);
//	
//		
//		Assert.assertFalse(dateselected, "failed");
//		
//		//Assert.assertFalse(dateselected, "failed");
//		//Assert.assertTrue(text.isEmpty(), "past date is not enabeled ");
//		
//	}

	@Test(priority = 6, enabled = false)
	public void validateTC_N_017() throws InterruptedException, AWTException
	{
	
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
		Thread.sleep(5000);
		
		
		gm.click("Xpath", notificationpagelocators.specificrecepientsoption);
		
		gm.click("Xpath", notificationpagelocators.recepientsbutton);
		Thread.sleep(5000);
		gm.click("Xpath", notificationpagelocators.selectrecepients);
		
		gm.click("Xpath", notificationpagelocators.clickinvitebutton);
		Thread.sleep(5000);
		
		String totalrecepientscount=gm.getText("Xpath", notificationpagelocators.totalrecepientscount);
		String mobileuserscount=gm.getText("Xpath", notificationpagelocators.mobileuserscount);
		String nonmobileuserscount=gm.getText("Xpath", notificationpagelocators.nonmobileuserscount);
		
		
		
		

		Integer i=Integer.parseInt(totalrecepientscount);
		Integer j=Integer.parseInt(mobileuserscount);
		Integer k=Integer.parseInt(nonmobileuserscount);
		
		
		Assert.assertTrue(i>0, "total recepient count is displayed");
		
		
		Assert.assertTrue(j>0, "mobile users count is displayed");
				
		Assert.assertTrue(k>0, "non mobile users count is displayed");
         
		
	}
	
	@Test(priority = 7, enabled = false)
	public void validateTC_N_020() throws InterruptedException, AWTException
	{
	
		extentTest = extent.startTest("validateTC_N_020");
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
		
		
		gm.click("Xpath", notificationpagelocators.specificrecepientsoption);
		
		gm.click("Xpath", notificationpagelocators.recepientsbutton);
		Thread.sleep(5000);
		gm.click("Xpath", notificationpagelocators.selectrecepients);
		
		gm.click("Xpath", notificationpagelocators.clickinvitebutton);
		Thread.sleep(5000);
		
		String totalrecepientscount=gm.getText("Xpath", notificationpagelocators.totalrecepientscount);
	
		gm.click("Xpath", notificationpagelocators.totalrecepientscount);

		Thread.sleep(5000);
		Integer i=Integer.parseInt(totalrecepientscount);
		List<String> list=new ArrayList<String>();  
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped  margin-bottom-0']/tbody/tr"));
		
		if(i>0) {
			
			
			
			

			for(int l=1;l<=rows.size();l++)
			{
				//assert.assertEquals(actual, expected);
				list.add(gm.getText("Xpath", "//table[@class='table table-striped  margin-bottom-0']/tbody/tr["+l+"]/td[1]")); 
				
				
				
			}
		}
		
		Assert.assertTrue((list.size()==i), "users list is displayed after clicking on total recpeients count");
         
		
	}
	
	@Test(priority = 8, enabled = false)
	public void validateTC_N_028() throws InterruptedException, AWTException
	{
	
		extentTest = extent.startTest("validateTC_N_028");
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
		
		
		gm.click("Xpath", notificationpagelocators.specificrecepientsoption);
		
		gm.click("Xpath", notificationpagelocators.recepientsbutton);
		
		Thread.sleep(5000);
		
		Assert.assertTrue((gm.isDisplayed("Xpath", notificationpagelocators.personastab)), "personas tab is displayed");
		Assert.assertTrue((gm.isDisplayed("Xpath", notificationpagelocators.groupsstab)), "groups tab is displayed");
		Assert.assertTrue((gm.isDisplayed("Xpath", notificationpagelocators.individualsstab)), "individuals tab is displayed");
		
	}
	
	@Test(priority = 9, enabled = true)
	public void validateTC_N_029() throws InterruptedException, AWTException
	{
	
		extentTest = extent.startTest("validateTC_N_029");
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
		
		
		gm.click("Xpath", notificationpagelocators.specificrecepientsoption);
		
		gm.click("Xpath", notificationpagelocators.recepientsbutton);
		
		Thread.sleep(5000);
		
		List<String> list=new ArrayList<String>();  
		
		List<WebElement> countcolumnelements = driver.findElements(By.xpath("//table[@class='table margin-bottom-0 table-striped ng-scope']/tbody/tr/td[3]"));
		
	
			
		
			System.out.println(countcolumnelements.size());
			

			for(int l=1;l<=countcolumnelements.size();l++)
			{
				//assert.assertEquals(actual, expected);
				list.add(gm.getText("Xpath", "//table[@class='table margin-bottom-0 table-striped ng-scope']/tbody/tr["+l+"]/td[3]")); 
				
				
				
			}
			
			System.out.println(list.size());
			//Assert.assertTrue((list.size()==i), "users list is displayed after clicking on total recpeients count");
		}
		
	
}
