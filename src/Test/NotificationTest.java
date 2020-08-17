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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.NotificationsCreationPage;
import Pages.NotificationsCreationPage.notificationpagelocators;
import Pages.NotificationsHomePage;
import utility.Constants;
import utility.ExcelUtils;
import utility.GenericMEthods;

public class NotificationTest extends FunctionalTest {

	LoginPage lp = new LoginPage();

	NotificationsHomePage nhp = new NotificationsHomePage();

	NotificationsCreationPage ncp = new NotificationsCreationPage();
	GenericMEthods gm = new GenericMEthods();

	public void run() throws InterruptedException, IOException, AWTException {

		Thread.sleep(5000);

		lp.clickNotificationsOption();

		// nhp.getHeader();
		// nhp.checkDefaults();
		// nhp.clickPlusSymbolCreateNotification();
//
		nhp.clickCreateNotification();
//		
//		
//		
		// ncp.ValidateStep1allFieldsBlank();

		// ncp.validateStep1FieldsBlank();

		// ncp.checkFieldsHighlightStep1();

		// ncp.validateMaxLengthDisplayedStep1();

		// ncp.validateMaxCharactersStep1();
//		
		// nhp.clickPlusSymbolCreateNotification();
		ncp.validateCancelButtonMissingFileUpload();
		// ncp.validateStep1ValidData();

		// ncp.createNotificationUsingNewCategory();//creating new category n adding
		// image

		// ncp.createNotificationStep2();

		// ncp.createNotificationExistingCategory();

		// ncp.validateStep3Scenarios();

		// ncp.validateStep3Scenariosnow();

	}

	public void testCancelButtonMissingFileUpload() throws InterruptedException, AWTException {
		Thread.sleep(5000);

		lp.clickNotificationsOption();
		ncp.validateCancelButtonMissingFileUpload();

	}

	public void testHelpIconHoldsNotification() throws InterruptedException {
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
		Assert.assertTrue(gm.isDisplayed("Xpath", notificationpagelocators.lockScreenErrorMsg),
				"Alert message is displayed for mandatory fields");

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
		Assert.assertTrue(gm.isDisplayed("Xpath", notificationpagelocators.titleErrorMsg),
				"Alert message is displayed for mandatory fields");

	}

	@Test(priority = 3, enabled = true)
	public void validateTC_N_007() throws Exception {
		extentTest = extent.startTest("validateTC_N_007");
		Thread.sleep(5000);

		gm.navigateToNotificationsHomePage();

		nhp.clickCreateNotification();

		gm.click("Xpath", notificationpagelocators.createnewcategorybutton);

		ExcelUtils.setExcelFile(Constants.Path_TestData, Constants.File_TestData);
		
		
		gm.SendKeys("Xpath", notificationpagelocators.entercategoryname, ExcelUtils.getCellData(1,8));

		// gm.click("Xpath", notificationpagelocators.selectimagebutton);

		gm.uploadFile(notificationpagelocators.selectimagebutton,
				"C:\\Users\\HP\\Documents\\Engage2Serve Project Documents\\sample images\\gujrat-university-results-declared.jpg");

		gm.click("Xpath", notificationpagelocators.savenewcategorybutton);

		Thread.sleep(5000);
		Assert.assertTrue(gm.getText("Xpath", notificationpagelocators.categoryddl).equalsIgnoreCase(ExcelUtils.getCellData(1,8)));

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

		Assert.assertTrue(driver.findElement(By.xpath(notificationpagelocators.clicklaterradiobutton)).isEnabled(),
				"Later radio button is selected ");

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
		Thread.sleep(5000);

		gm.click("Xpath", notificationpagelocators.specificrecepientsoption);

		gm.click("Xpath", notificationpagelocators.recepientsbutton);
		Thread.sleep(5000);
		gm.click("Xpath", notificationpagelocators.selectrecepients);

		gm.click("Xpath", notificationpagelocators.clickinvitebutton);
		Thread.sleep(5000);

		String totalrecepientscount = gm.getText("Xpath", notificationpagelocators.totalrecepientscount);
		String mobileuserscount = gm.getText("Xpath", notificationpagelocators.mobileuserscount);
		String nonmobileuserscount = gm.getText("Xpath", notificationpagelocators.nonmobileuserscount);

		Integer i = Integer.parseInt(totalrecepientscount);
		Integer j = Integer.parseInt(mobileuserscount);
		Integer k = Integer.parseInt(nonmobileuserscount);

		Assert.assertTrue(i > 0, "total recepient count is displayed");

		Assert.assertTrue(j > 0, "mobile users count is displayed");

		Assert.assertTrue(k > 0, "non mobile users count is displayed");

	}

	@Test(priority = 7, enabled = false)
	public void validateTC_N_020() throws InterruptedException, AWTException {

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

		String totalrecepientscount = gm.getText("Xpath", notificationpagelocators.totalrecepientscount);

		gm.click("Xpath", notificationpagelocators.totalrecepientscount);

		Thread.sleep(5000);
		Integer i = Integer.parseInt(totalrecepientscount);
		List<String> list = new ArrayList<String>();

		List<WebElement> rows = driver
				.findElements(By.xpath("//table[@class='table table-striped  margin-bottom-0']/tbody/tr"));

		if (i > 0) {

			for (int l = 1; l <= rows.size(); l++) {
				// assert.assertEquals(actual, expected);
				list.add(gm.getText("Xpath",
						"//table[@class='table table-striped  margin-bottom-0']/tbody/tr[" + l + "]/td[1]"));

			}
		}

		Assert.assertTrue((list.size() == i), "users list is displayed after clicking on total recpeients count");

	}

	@Test(priority = 8, enabled = false)
	public void validateTC_N_028() throws InterruptedException, AWTException {

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
		Assert.assertTrue((gm.isDisplayed("Xpath", notificationpagelocators.individualsstab)),
				"individuals tab is displayed");

	}

	@Test(priority = 9, enabled = true)
	public void validateTC_N_029() throws InterruptedException, AWTException {

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

		List<String> list = new ArrayList<String>();

		String[] usertype = { "Staff", "Alumni" };

		for (int k = 0; k < usertype.length; k++) {

			gm.click("Xpath", notificationpagelocators.specificrecepientsoption);
			Thread.sleep(3000);

			gm.click("Xpath", notificationpagelocators.clickuserttypeddl);

			driver.findElement(By.xpath(notificationpagelocators.enterusertype)).clear();
			gm.SendKeys("Xpath", notificationpagelocators.enterusertype, usertype[k]);

			driver.findElement(By.xpath(notificationpagelocators.enterusertype)).sendKeys(Keys.ENTER);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='clear_filters_confirm']")).click();
			Thread.sleep(5000);
			gm.click("Xpath", notificationpagelocators.recepientsbutton);

			Thread.sleep(3000);
			gm.click("Xpath", notificationpagelocators.personastab);

			Thread.sleep(5000);
			List<WebElement> countcolumnelements = driver.findElements(
					By.xpath("//table[@class='table margin-bottom-0 table-striped ng-scope']/tbody/tr/td[3]"));

			List<WebElement> rows = driver
					.findElements(By.xpath("//table[@class='table margin-bottom-0 table-striped ng-scope']/tbody/tr"));

			List<WebElement> personaelements = driver.findElements(
					By.xpath("//table[@class='table margin-bottom-0 table-striped ng-scope']/tbody/tr/td[2]"));

			List<WebElement> selectpersonaelements = driver.findElements(
					By.xpath("//table[@class='table margin-bottom-0 table-striped ng-scope']/tbody/tr/td[1]"));

			for (int i = 0; i <= countcolumnelements.size(); i++) {
				System.out.println("inside for loop");

				System.out.println(countcolumnelements.get(i).getText());

				if (!(countcolumnelements.get(i).getText().contains("0"))) {

					System.out.println("inside if loop");
					// driver.findElement(By.xpath("//table[@class='table margin-bottom-0
					// table-striped ng-scope']/tbody/tr["+i+"]/td[3]")).click();
					Thread.sleep(3000);
					selectpersonaelements.get(i).click();

					String j = countcolumnelements.get(i).getText();
					String clickedpersona = personaelements.get(i).getText();
					System.out.println("clicked persona name is " + personaelements.get(i).getText());

					gm.click("Xpath", notificationpagelocators.clickinvitebutton);

					String addedpersona = driver
							.findElement(By.xpath(
									"//span[@class='ui-select-match-item btn btn-default btn-xs ng-scope']//span[2]"))
							.getText();
					System.out.println("addedpersona " + addedpersona);
					Thread.sleep(5000);

					if ((addedpersona.contains(clickedpersona)) && (addedpersona.contains(j))) {
						System.out.println("selected persona is added and counts of users are matching");
						break;
					}

				}
			}

		}

	}

	@Test(priority = 10, enabled = false)
	public void validateTC_N_033() throws Exception {

		extentTest = extent.startTest("validateTC_N_033");
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
		String[] usertype = { "Staff", "Alumni" };
		String[] filepath = { "C:\\Users\\HP\\Desktop\\StaffData.csv", "C:\\Users\\HP\\Desktop\\AlumniData.csv" };

		for (int k = 0; k < usertype.length; k++) {
			gm.click("Xpath", notificationpagelocators.specificrecepientsoption);
			Thread.sleep(3000);

			gm.click("Xpath", notificationpagelocators.clickuserttypeddl);

			driver.findElement(By.xpath(notificationpagelocators.enterusertype)).clear();
			gm.SendKeys("Xpath", notificationpagelocators.enterusertype, usertype[k]);

			driver.findElement(By.xpath(notificationpagelocators.enterusertype)).sendKeys(Keys.ENTER);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='clear_filters_confirm']")).click();
			Thread.sleep(5000);

			gm.click("Xpath", notificationpagelocators.recepientsbutton);

			Thread.sleep(3000);

			gm.click("Xpath", notificationpagelocators.uploadrecepientstab);

			ExcelUtils.setExcelFile(Constants.Path_TestData, Constants.File_TestData);

			gm.uploadFile(notificationpagelocators.uploadcsvfilebutton, filepath[k]);

			Thread.sleep(5000);
			System.out.println("screen value" + gm.getText("Xpath", notificationpagelocators.totalusersuploaded));

			System.out.println("excel input" + ExcelUtils.getCellData(1, 5));

			String usersfoundwithinsystem = gm.getText("Xpath", notificationpagelocators.usersfoundwithinsystem);

			Assert.assertEquals(gm.getText("Xpath", notificationpagelocators.totalusersuploaded),
					ExcelUtils.getCellData(1, 5));
			Assert.assertEquals(gm.getText("Xpath", notificationpagelocators.usersfoundwithinsystem),
					ExcelUtils.getCellData(1, 6));
			Assert.assertEquals(gm.getText("Xpath", notificationpagelocators.usersnotfound),
					ExcelUtils.getCellData(1, 7));
			// click continue button

			gm.click("Xpath", notificationpagelocators.clickcontinuebutton);

			String tabtext = gm.getText("Xpath", notificationpagelocators.individualsstab);

			gm.click("Xpath", notificationpagelocators.clickinvitebutton);

			Thread.sleep(3000);

			String invididualusersuploaded = driver.findElement(By.xpath(
					"//*[@id='page-wrapper']/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/span/div[6]/div/div/div/div/span/span/span[2]"))
					.getText();

			Assert.assertTrue((invididualusersuploaded.contains(usersfoundwithinsystem)),
					"users are uploaded from csv");
		}

	}

	@Test(priority = 11, enabled = true)
	public void validateTC_N_040() throws Exception {

		extentTest = extent.startTest("validateTC_N_040");
		Thread.sleep(5000);
		gm.Wait("//*[@id='top_navigation_heading']");
		gm.navigateToNotificationsHomePage();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='institution_structure_search']")).sendKeys("Library Notifications");

		driver.findElement(By.xpath("//input[@id='institution_structure_search']")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Library Notifications')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='page-wrapper']/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[1]/form/div/div/a"))
				.click();

		Thread.sleep(3000);
		// nhp.clickCreateNotification();

		gm.SendKeys("Xpath", notificationpagelocators.enterTitle, "test notification8");

		gm.SendKeys("Xpath", notificationpagelocators.enterLockScreenMsg, "test lock screen msg");

		gm.click("Xpath", notificationpagelocators.clickNextButton);

		gm.SendKeys("Xpath", notificationpagelocators.entercontent, "test content msg");
		gm.click("Xpath", notificationpagelocators.clickNextButton);

		Thread.sleep(5000);
		gm.click("Xpath", notificationpagelocators.clickuserttypeddl);
		driver.findElement(By.xpath(notificationpagelocators.enterusertype)).clear();
		gm.SendKeys("Xpath", notificationpagelocators.enterusertype, "Staff");

		driver.findElement(By.xpath(notificationpagelocators.enterusertype)).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		gm.click("Xpath", notificationpagelocators.clickPreviousButton);

		driver.findElement(By.xpath(notificationpagelocators.entercontent)).clear();

		gm.SendKeys("Xpath", notificationpagelocators.entercontent,
				"editing content message after clicking previous button");

		String newcontentmsg = gm.getText("Xpath", notificationpagelocators.entercontent);

		Assert.assertEquals(newcontentmsg, "editing content message after clicking previous button",
				"content message is not updated after clicking previous button");

	}

//	@Test(priority = 12, enabled = true)
//	public void validateTC_N_045() throws Exception {
//		extentTest = extent.startTest("validateTC_N_045");
//		Thread.sleep(5000);
//		gm.Wait("//*[@id='top_navigation_heading']");
//		gm.navigateToNotificationsHomePage();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='institution_structure_search']")).sendKeys("Library Notifications");
//
//		driver.findElement(By.xpath("//input[@id='institution_structure_search']")).sendKeys(Keys.ENTER);
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[contains(text(),'Library Notifications')]")).click();
//		
//		
//		gm.click("Xpath", notificationpagelocators.clickfilterbutton);
//		
//		gm.click("Xpath", notificationpagelocators.clickstatusddl);
//		
//		gm.click("Xpath", notificationpagelocators.selectcompletedoption);
//		
//		
//		
//	}
	
	@Test(priority = 13, enabled = false)
	public void validateTC_N_046() throws Exception {
		
		extentTest = extent.startTest("validateTC_N_046");
		Thread.sleep(5000);
		gm.Wait("//*[@id='top_navigation_heading']");
		gm.navigateToNotificationsHomePage();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='institution_structure_search']")).sendKeys("Library Notifications");

		driver.findElement(By.xpath("//input[@id='institution_structure_search']")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Library Notifications')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='page-wrapper']/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[1]/form/div/div/a"))
				.click();
		
		Thread.sleep(3000);
		// nhp.clickCreateNotification();
		ExcelUtils.setExcelFile(Constants.Path_TestData, Constants.File_TestData);

		gm.SendKeys("Xpath", notificationpagelocators.enterTitle, ExcelUtils.getCellData(1, 9));

		gm.SendKeys("Xpath", notificationpagelocators.enterLockScreenMsg, "test lock screen msg");

		gm.click("Xpath", notificationpagelocators.clickNextButton);

		gm.SendKeys("Xpath", notificationpagelocators.entercontent, "test content msg");
		gm.click("Xpath", notificationpagelocators.clickNextButton);
		Thread.sleep(3000);
		gm.click("Xpath", notificationpagelocators.clickpublishbutton);
		Thread.sleep(3000);
		//gm.click("Xpath", notificationpagelocators.clickfilterbutton);
		driver.findElement(By.xpath("//input[@placeholder='Search by title']")).sendKeys("new announcement");
		driver.findElement(By.xpath("//input[@placeholder='Search by title']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String status=gm.getText("Xpath", "//table/tbody/tr/td[2]");
		
		Assert.assertEquals(status, "Completed","notification status is not displayed as completed");
		
		
	
		
	}
	
	
	}


