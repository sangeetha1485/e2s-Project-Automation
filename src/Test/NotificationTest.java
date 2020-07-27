package Test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.NotificationsCreationPage;
import Pages.NotificationsHomePage;


public class NotificationTest extends FunctionalTest{
	
	LoginPage lp = new LoginPage();

	NotificationsHomePage nhp= new NotificationsHomePage();
	
	NotificationsCreationPage ncp= new NotificationsCreationPage();

	
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
	
	@Test
	public void testHelpIconHoldsNotification() throws InterruptedException
	{
		Thread.sleep(5000);
		
		lp.clickNotificationsOption();
		
		ncp.validateHelpIconHoldsNotification();
		
	}
	
	
}
