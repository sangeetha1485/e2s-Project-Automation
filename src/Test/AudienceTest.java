package Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GenericMEthods;
import Pages.AudiencePage;


public class AudienceTest extends FunctionalTest{
	
	AudiencePage ap = new AudiencePage();
	
	GenericMEthods gm = new GenericMEthods();
	public void executePollsTestCases() throws InterruptedException
	{
		//ap.test2729();
		
		
		//ap.vaidateCreatePersona();
		
		//ap.vaidateCreateGroups();
		
		//ap.validateAlertMsgInvalidMobile();
		//ap.validateCreateAttributeSuccessmsg();
		
		//ap.vaidateTC_AP_006();
		
		//ap.vaidateTC_AP_007();
		
		//ap.vaidateTC_AP_010();
		
		//ap.vaidateTC_AP_012();
		//ap.vaidateTC_AP_013();
		
		//ap.vaidateTC_AP_014();
		
		//ap.vaidateTC_AP_018();
		
		//ap.vaidateTC_AP_027();
		
		//ap.vaidateTC_AP_032();
		//ap.vaidateTC_AP_033();
		
		//ap.vaidateTC_AP_034();
		//ap.vaidateTC_AP_036();
		
		
		
		//ap.vaidateTC_AI_005();
		
		//ap.vaidateTC_AI_020();
		
		//ap.validateTC_AI_033();
		
		//ap.validateTC_AI_030();
	}

	
	@Test	
	public void validateTC_AP_029() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		
		ap.clickcreatenewbutton(driver).click();
		ap.enterPersonaName(driver).sendKeys("testpersona5");
		
		ap.enterDescription(driver).sendKeys("test");
		
		ap.selectAttribute(driver).click();
		
	    Thread.sleep(3000);
		
		//write code for seat number
		ap.selectSeatNumber(driver).click();
		
		ap.selectOperator(driver).click();
		
		//write code for operator
		ap.selectGreaterThanOrEqual(driver).click();
		
		ap.selectValue(driver).sendKeys("5");
		
		ap.clickAddButton(driver).click();
		
		Thread.sleep(3000);
		
		ap.clickApplyButton(driver).click();
		
		ap.checkingUserCounts();
		
		gm.scrollDown(ap.createpersonaButton(driver));
		
		
		ap.createpersonaButton(driver).click();
		
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("testpersona4"),"persona created successfully");
		
	}

	
}
