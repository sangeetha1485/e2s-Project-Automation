package Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AudiencePage;
import Pages.AudiencePage.audiencepagelocators;
import utility.Constants;
import utility.ExcelUtils;
import utility.GenericMEthods;

public class AudienceTest extends FunctionalTest {

	private static final String Xpath = "";
	private static final String Name = "";

	AudiencePage ap = new AudiencePage();
	// public ExtentReports extent;

	GenericMEthods gm = new GenericMEthods();

	public void executePollsTestCases() throws InterruptedException {

		// ap.test2729();

		// ap.vaidateCreatePersona();

		// ap.vaidateCreateGroups();

		// ap.validateAlertMsgInvalidMobile();
		// ap.validateCreateAttributeSuccessmsg();

		// ap.vaidateTC_AP_006();

		// ap.vaidateTC_AP_007();

		// ap.vaidateTC_AP_010();

		// ap.vaidateTC_AP_012();
		// ap.vaidateTC_AP_013();

		// ap.vaidateTC_AP_014();

		// ap.vaidateTC_AP_018();

		// ap.vaidateTC_AP_027();

		// ap.vaidateTC_AP_032();
		// ap.vaidateTC_AP_033();

		// ap.vaidateTC_AP_034();
		// ap.vaidateTC_AP_036();

		// ap.vaidateTC_AI_005();

		// ap.vaidateTC_AI_020();

		// ap.validateTC_AI_033();

		// ap.validateTC_AI_030();

		// ap.validateTC_AI_066();
	}

	@Test(priority = 1, enabled = false)
	public void validateTC_AP_029() throws InterruptedException {

		extentTest = extent.startTest("validateTC_AP_029");
		gm.navigateToAudiencePage();
		Thread.sleep(5000);
		gm.click("Xpath", audiencepagelocators.createnewbutton);
		Thread.sleep(10000);

		gm.SendKeys("Name", audiencepagelocators.personaname, "10");

		gm.SendKeys("Xpath", audiencepagelocators.enterDescription, "test");

		gm.click("Xpath", audiencepagelocators.selectAttribute);

		Thread.sleep(3000);

		// write code for seat number

		gm.click("Xpath", audiencepagelocators.selectSeatNumber);

		gm.click("Xpath", audiencepagelocators.selectOperator);

		// write code for operator

		gm.click("Xpath", audiencepagelocators.selectGreaterThanOrEqual);

		gm.SendKeys("Xpath", audiencepagelocators.selectValue, "5");

		gm.click("Xpath", audiencepagelocators.clickAddButton);

		Thread.sleep(3000);

		gm.click("Xpath", audiencepagelocators.clickApplyButton);
		// ap.checkingUserCounts();

		gm.scrollDown(audiencepagelocators.createpersonaButton);

		gm.click("Xpath", audiencepagelocators.createpersonaButton);

		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("testpersona4"), "persona created successfully");

	}

	@Test(priority = 2, enabled = false)
	public void validateTC_AP_074() throws InterruptedException, IOException {
		extentTest = extent.startTest("validateTC_AP_074");
		gm.navigateToAudiencePage();
		Thread.sleep(5000);

		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);

		gm.click("Xpath", audiencepagelocators.clickImportButton);

		gm.click("Xpath", audiencepagelocators.clickUploadCSV);

		Thread.sleep(5000);
		// gm.wa
		gm.click("LinkText", audiencepagelocators.clickdownload);

		Thread.sleep(5000);

		String home = System.getProperty("user.home");
		File file = new File(home + "/Downloads/" + "Alumni" + ".csv");

		Boolean isfileDeleted = gm.deleteFile(file);

		File LatestFile = gm.getLastModifiedFile(file.getParentFile());

		System.out.println(LatestFile.getName());

		Assert.assertTrue(LatestFile.getName().contains("alumni"), "Alumni template is downloaded");

	}

	@Test(priority = 3, enabled = false)
	public void validateTC_AP_064() throws InterruptedException, IOException {
		extentTest = extent.startTest("validateTC_AP_064");
		gm.navigateToAudiencePage();
		Thread.sleep(5000);

		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);
		Thread.sleep(10000);

		gm.click("Xpath", audiencepagelocators.clickStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.selectStaffUserTypeOption);

		Thread.sleep(3000);
		gm.click("Xpath", audiencepagelocators.clickCustomAttributeBuuton);

		gm.click("Xpath", audiencepagelocators.selectGroupDDL);
		Thread.sleep(3000);
		gm.click("Xpath", audiencepagelocators.selectGroupName);

		gm.SendKeys("Xpath", audiencepagelocators.enterFieldName, "Music");

		gm.click("Xpath", audiencepagelocators.enterFieldType);

		gm.click("Xpath", audiencepagelocators.selectTextFieldType);

		Thread.sleep(3000);
		gm.click("Xpath", audiencepagelocators.clickValidateAsOption);
		gm.click("Xpath", audiencepagelocators.selectValidateAsText);

		gm.SendKeys("Xpath", audiencepagelocators.enterCharacterLimit, "12");

		gm.scrollToElement(audiencepagelocators.clickAddAttributeButton);

		gm.click("Xpath", audiencepagelocators.clickAddAttributeButton);

		Boolean verifyattributeadded = gm.verifyElementCustomAttributeTable(audiencepagelocators.attributeTable,
				"Music");

		Assert.assertTrue(verifyattributeadded, "attribute is added to attribute table");

		gm.click("Xpath", audiencepagelocators.clickCreateAndContinue);

		Thread.sleep(5000);
		Boolean attributesadded = driver.findElement(By.xpath(audiencepagelocators.attributeCreatedSuccessMsg))
				.isDisplayed();

		Assert.assertTrue(attributesadded, "attributes are added successfully");

	}

	@Test(priority = 4, enabled = false)
	public void validateTC_AI_073() throws InterruptedException, IOException {
		extentTest = extent.startTest("validateTC_AP_073");
		gm.navigateToAudiencePage();
		Thread.sleep(5000);

		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);

		gm.click("Xpath", audiencepagelocators.clickStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.selectStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.createnewbutton);

		String[] expected = { "Individuals", "Staff", "Create New" };

		List<WebElement> createnewstaff = driver
				.findElements(By.xpath("//div[@class='audience-breadcrumbs ng-scope']"));

		for (int i = 0; i < expected.length; i++) {

			String breadcrumb = createnewstaff.get(0).getText();

			if (breadcrumb.contains(expected[i])) {

				System.out.println("passed on: " + breadcrumb);
			} else {
				System.out.println("failed on: " + breadcrumb);
			}
		}
	}

	@Test(priority = 5, enabled = false)
	public void validateTC_AI_086() throws InterruptedException, IOException {
		extentTest = extent.startTest("validateTC_AI_086");
		gm.navigateToAudiencePage();
		Thread.sleep(5000);

		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);

		gm.click("Xpath", audiencepagelocators.clickStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.selectStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.createnewbutton);

		gm.click("Xpath", audiencepagelocators.clickCancel);

		Boolean individualspagedisplayed = driver.findElement(By.xpath(audiencepagelocators.clickIndividualsTab))
				.isDisplayed();

		Assert.assertTrue(individualspagedisplayed, "On clicking cancel,Individuals home page is displayed");
	}

	@Test(priority = 6, enabled = false)
	public void validateTC_AI_087() throws Exception {
		extentTest = extent.startTest("validateTC_AI_086");
		gm.navigateToAudiencePage();
		Thread.sleep(5000);

		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);

		gm.click("Xpath", audiencepagelocators.clickStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.selectStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.createnewbutton);

		Thread.sleep(5000);

		ExcelUtils.setExcelFile(Constants.Path_TestData, Constants.File_TestData);

		gm.SendKeys("Xpath", audiencepagelocators.enterStaffID, ExcelUtils.getCellData(1, 0));

		gm.SendKeys("Xpath", audiencepagelocators.enterFirstName, ExcelUtils.getCellData(1, 1));

		gm.SendKeys("Xpath", audiencepagelocators.enterLastName, ExcelUtils.getCellData(1, 2));

		gm.SendKeys("Xpath", audiencepagelocators.enterEmail, ExcelUtils.getCellData(1, 3));

		gm.SendKeys("Xpath", audiencepagelocators.clickCampusDDL, ExcelUtils.getCellData(1, 4));

		driver.findElement(By.xpath(audiencepagelocators.clickCampusDDL)).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		Thread.sleep(5000);
		gm.click("Xpath", audiencepagelocators.clickDeptDDL);

		gm.SendKeys("Xpath", audiencepagelocators.enterDeptValue, "Finance Department");
		driver.findElement(By.xpath(audiencepagelocators.enterDeptValue)).sendKeys(Keys.ENTER);

		gm.click("Xpath", audiencepagelocators.clickrolesDDL);

		gm.click("Xpath", audiencepagelocators.selectAdmin);

		gm.click("Xpath", audiencepagelocators.clickAdd);

		Thread.sleep(3000);

		gm.scrollDown(audiencepagelocators.clickCreate);

		gm.click("Xpath", audiencepagelocators.clickCreate);
		Thread.sleep(5000);

		Assert.assertTrue(gm.isDisplayed("Xpath", audiencepagelocators.staffCreationSuccessMsg),
				"Success message is displayed after staff creation");

		Boolean individualshomepagedisplayed = driver.findElement(By.xpath(audiencepagelocators.clickIndividualsTab))
				.isDisplayed();

		Assert.assertTrue(individualshomepagedisplayed, "Individuals home page is displayed");

	}

	@Test(priority = 7, enabled = false)
	public void validateTC_AI_066() throws InterruptedException {
		extentTest = extent.startTest("validateTC_AI_066");

		gm.navigateToAudiencePage();

		Thread.sleep(5000);

		// driver.findElement(By.xpath(audiencepagelocators.clickIndividualsTab)).click();
		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);

		gm.click("Xpath", audiencepagelocators.clickStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.selectStaffUserTypeOption);

		Thread.sleep(5000);
		// clicking on custom attributes button
		driver.findElement(By.xpath("//button[@class='btn btn-white btn-sm ng-scope'][2]")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='poll-type-create-new-btn']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Group name']")).sendKeys("Academics Group");

		// clicking on create group button
		List<WebElement> buttons = driver
				.findElements(By.xpath("//button[@class='ladda-button btn btn-primary ng-binding ng-scope']"));
		buttons.get(2).click();

		Thread.sleep(5000);

		Boolean groupcreatedsuccessmsg = driver
				.findElement(By.xpath("//div[contains(text(),'Group created successfully')]")).isDisplayed();

		Assert.assertTrue(groupcreatedsuccessmsg, "Success message is displayed after creating group");

		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Select or search group name')]"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

		Boolean groupcreated = driver.findElement(By.xpath("//span[contains(text(),'Academics Group')]")).isDisplayed();

		Assert.assertTrue(groupcreated, "Created group is displayed in dropdown");
	}

	@Test(priority = 8, enabled = false)
	public void vaidateTC_AI_051() throws InterruptedException {
		extentTest = extent.startTest("validateTC_AI_051");
		gm.navigateToAudiencePage();

		Thread.sleep(5000);

		// driver.findElement(By.xpath("//button[contains(text(),'Individuals')]")).click();
		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);

		gm.click("Xpath", audiencepagelocators.clickStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.selectStaffUserTypeOption);

		Thread.sleep(3000);

		gm.click("Xpath", audiencepagelocators.clickSelectAllOption);

		gm.click("Xpath", audiencepagelocators.clickActionsButton);

		Thread.sleep(3000);

		gm.click("Xpath", audiencepagelocators.selectEmailOption);

		Thread.sleep(3000);

		gm.SendKeys("Xpath", audiencepagelocators.enterMailSubject, "Test Email");

		gm.SendKeys("Xpath", audiencepagelocators.enterMailContent, "Test Email Content");

		// gm.click("Xpath", audiencepagelocators.clickSend);

	}

	@Test(priority = 9, enabled = false)
	public void vaidateTC_AI_089() throws Exception {
		extentTest = extent.startTest("validateTC_AI_089");
		gm.navigateToAudiencePage();

		Thread.sleep(5000);

		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);

		gm.click("Xpath", audiencepagelocators.clickStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.selectStaffUserTypeOption);

		Thread.sleep(5000);
		// clicking on filter button
		driver.findElement(By.xpath(
				"//*[@id='page-wrapper']/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[2]/button[1]/i"))
				.click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Email ID')]//following::input[1]"))
				.sendKeys("john.henry@yopmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();

		Thread.sleep(3000);
		Boolean StudentPresent = driver.findElement(By.xpath("//span[contains(text(),'john.henry@yopmail.com')]"))
				.isDisplayed();

		Assert.assertTrue(StudentPresent, "Staff details related to entered email id is displayed");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='audience-contact-box-detail-name ng-binding ng-scope']")).click();

		// comparing excel input and added staff details
		Thread.sleep(5000);
		Assert.assertEquals(ExcelUtils.getCellData(1, 0), gm.getText("Xpath", audiencepagelocators.enterStaffID),
				"entered staff id is displayed");

		Assert.assertEquals(ExcelUtils.getCellData(1, 1), gm.getText("Xpath", audiencepagelocators.enterFirstName),
				"entered staff first name is displayed");
		Assert.assertEquals(ExcelUtils.getCellData(1, 2), gm.getText("Xpath", audiencepagelocators.enterLastName),
				"entered staff last name is displayed");
		Assert.assertEquals(ExcelUtils.getCellData(1, 3), gm.getText("Xpath", audiencepagelocators.enterEmail),
				"entered staff email id is displayed");

	}

	@Test(priority = 10, enabled = false)
	public void vaidateTC_AI_091() throws Exception {
		extentTest = extent.startTest("validateTC_AI_089");
		gm.navigateToAudiencePage();

		Thread.sleep(5000);

		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);

		gm.click("Xpath", audiencepagelocators.clickStaffUserTypeOption);

		gm.click("Xpath", audiencepagelocators.selectStaffUserTypeOption);

		Thread.sleep(5000);
		// clicking on filter button
		driver.findElement(By.xpath(
				"//*[@id='page-wrapper']/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[2]/button[1]/i"))
				.click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Email ID')]//following::input[1]"))
				.sendKeys("john.henry@yopmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();

		Thread.sleep(3000);
		Boolean StaffPresent = driver.findElement(By.xpath("//span[contains(text(),'john.henry@yopmail.com')]"))
				.isDisplayed();

		Assert.assertTrue(StaffPresent, "Staff details related to entered email id is displayed");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='audience-contact-box-detail-name ng-binding ng-scope']")).click();

		ExcelUtils.setExcelFile(Constants.Path_TestData, Constants.File_TestData);
		Thread.sleep(5000);

		driver.findElement(By.xpath(audiencepagelocators.enterStaffID)).clear();

		driver.findElement(By.xpath(audiencepagelocators.enterFirstName)).clear();

		gm.SendKeys("Xpath", audiencepagelocators.enterStaffID, ExcelUtils.getCellData(1, 0));

		gm.SendKeys("Xpath", audiencepagelocators.enterFirstName, ExcelUtils.getCellData(1, 1));

		gm.click("Xpath", audiencepagelocators.clickUpdateBuuton);
		Thread.sleep(3000);

		String updatesuccessmsg = gm.getText("Xpath", "//div[contains(text(),'Staff account updated successfully.')]");

		Assert.assertEquals(updatesuccessmsg, "Staff account updated successfully.");

	}

	@Test(priority = 11, enabled = false)
	public void vaidateTC_AI_020() throws InterruptedException {
		gm.navigateToAudiencePage();

		Thread.sleep(5000);

		driver.findElement(By.xpath(audiencepagelocators.clickIndividualsTab)).click();

		Thread.sleep(5000);
		// clicking on filter button
		driver.findElement(By.xpath(
				"//*[@id='page-wrapper']/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[2]/button[1]/i"))
				.click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Email ID')]//following::input[1]"))
				.sendKeys("aarathimanokaran@yopmail.com");

		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();

		Thread.sleep(3000);
		Boolean StudentPresent = driver.findElement(By.xpath("//span[contains(text(),'aarathimanokaran@yopmail.com')]"))
				.isDisplayed();

		Assert.assertTrue(StudentPresent, "Student details related to entered email id is displayed");
	}

	@Test(priority = 12, enabled = false)
	public void vaidateTC_AG_008() throws InterruptedException {
		extentTest = extent.startTest("vaidateTC_AG_008");
		gm.navigateToAudiencePage();

		Thread.sleep(5000);
	

		driver.findElement(By.xpath(audiencepagelocators.clickGroupsTab)).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div[2]/button[1]"))
				.click();

		driver.findElement(By.xpath("//span[contains(text(),'Select or search status')]")).click();

		// selecting active records
		driver.findElement(By.xpath("//div[contains(text(),'Active')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);

		List<WebElement> activepersonas = driver.findElements(By.xpath("//span[@id='switchery_id']"));

		System.out.println(activepersonas.size());

		Thread.sleep(5000);

		if (activepersonas.size() != 0) {
			for (int i = 0; i < activepersonas.size(); i++) {

				String bordercolor = driver.findElements(By.xpath("//span[@id='switchery_id']")).get(i)
						.getCssValue("border-color");

				System.out.println(bordercolor);

				Assert.assertEquals(bordercolor, "rgb(26, 179, 148)", "Active groups are displayed in green");
			}
		}

		// selecting inactive records
		driver.findElement(By.xpath("//span[contains(text(),'Active')]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Inactive')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);

		List<WebElement> inactivepersonas = driver.findElements(By.xpath("//span[@id='switchery_id']"));

		System.out.println(inactivepersonas.size());

		Thread.sleep(5000);

		if (inactivepersonas.size() != 0) {
			for (int i = 0; i < inactivepersonas.size(); i++) {

				String bordercolor = driver.findElements(By.xpath("//span[@id='switchery_id']")).get(i)
						.getCssValue("border-color");

				System.out.println(bordercolor);

				Assert.assertEquals(bordercolor, "rgb(223, 223, 223)", "Inactive groups are displayed in grey");
			}
		}

	}

	@Test(priority = 13)
	public void validateTC_AG_021() throws InterruptedException
	{
		extentTest = extent.startTest("vaidateTC_AG_008");
		gm.navigateToAudiencePage();

		Thread.sleep(5000);
	

		driver.findElement(By.xpath(audiencepagelocators.clickGroupsTab)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testgroup4");
		
		//driver.findElement(By.xpath("//a[@class='select2-choice ui-select-match']//following::span[@class='select2-chosen ng-binding ng-hide']")).click();
		
		//driver.findElement(By.xpath("//div[contains(text(),'Staff')]")).click();
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Graduation Year')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Equals')]")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search value')]")).click();
		
		driver.findElement(By.xpath("//input[@id='ui_select_search_input_value']")).sendKeys("2009");
		
		driver.findElement(By.xpath("//input[@id='ui_select_search_input_value']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(3000);
		
		
		Boolean attributePresent=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[1]")).isDisplayed();
		
		Boolean attributeOperator=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[2]")).isDisplayed();
		
		Boolean attributeValue=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[3]")).isDisplayed();
		
		
		
		if(attributePresent && attributeOperator && attributeValue)
		{
			System.out.println("created rule is displayed");
		}
		
		
		
		
		
		
		
	}
	
	

}
