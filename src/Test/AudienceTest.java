package Test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utility.GenericMEthods;
import Pages.AudiencePage;

import Pages.AudiencePage.audiencepagelocators;
import utility.ExtentDemo;

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
	}

	@Test(priority=1,enabled=false)
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

	@Test(priority=2)
	public void validateTC_AP_074() throws InterruptedException, IOException {
		extentTest = extent.startTest("validateTC_AP_074");
		gm.navigateToAudiencePage();
		Thread.sleep(5000);

		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);
		
		gm.click("Xpath", audiencepagelocators.clickImportButton);
		
		gm.click("Xpath", audiencepagelocators.clickUploadCSV);
		
		Thread.sleep(5000);
		//gm.wa
		gm.click("LinkText", audiencepagelocators.clickdownload);
		
		Thread.sleep(5000);
		
		String home = System.getProperty("user.home");
		File file = new File(home+"/Downloads/" + "Alumni" + ".csv"); 
		
		Boolean isfileDeleted=gm.deleteFile(file);
		
		File LatestFile=gm.getLastModifiedFile(file.getParentFile());
		
		System.out.println(LatestFile.getName());
		
		Assert.assertTrue(LatestFile.getName().contains("alumni"),"Alumni template is downloaded");
		


	}
	
	@Test(priority=3)
	public void validateTC_AP_064() throws InterruptedException, IOException {
		extentTest = extent.startTest("64");
		gm.navigateToAudiencePage();
		Thread.sleep(5000);

		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);
		
		gm.click("Xpath", audiencepagelocators.selectStaffUserType);
		
		gm.click("Xpath", audiencepagelocators.clickCustomAttributeBuuton);
		
		gm.click("Xpath", audiencepagelocators.selectGroupDDL);
		
		gm.click("Xpath", audiencepagelocators.selectGroupName);
		
		gm.SendKeys("Xpath", audiencepagelocators.enterFieldName, "");
		
		gm.SendKeys("Xpath", audiencepagelocators.enterFieldType, "");
		
		gm.SendKeys("Xpath", audiencepagelocators.enterFieldDesc, "");
		
		gm.click("Xpath", audiencepagelocators.selectValidateAsText);
		
		gm.SendKeys("Xpath", audiencepagelocators.enterCharacterLimit, "");
		
		gm.click("Xpath", audiencepagelocators.clickAddAttributeButton);
		
		
		
		//gm.click("Xpath", audiencepagelocators.se);
	}
	
	
	@Test(priority=4)
	public void validateTC_AI_073() throws InterruptedException, IOException {
		extentTest = extent.startTest("validateTC_AP_073");
		gm.navigateToAudiencePage();
		Thread.sleep(5000);

		gm.click("Xpath", audiencepagelocators.clickIndividualsTab);
		
		gm.click("Xpath", audiencepagelocators.selectStaffUserType);
		
		gm.click("Xpath", audiencepagelocators.createnewbutton);
		
		
		
			}
}
