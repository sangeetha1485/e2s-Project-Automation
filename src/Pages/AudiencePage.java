package Pages;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Test.FunctionalTest;
import utility.GenericMEthods;

public class AudiencePage extends FunctionalTest{
	
	GenericMEthods gm= new GenericMEthods();
	
	public void test2729() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Groups')]")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();

		
		String groupname=driver.findElement(By.xpath("//label[contains(text(),'Group Name*')]")).getText();
		
		
		Assert.assertTrue(groupname.contains("*"), "Group name contains asterisk");
		
	}
	
	public  void validateCreateAttributeSuccessmsg() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Individuals')]")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-white btn-sm ng-scope'][2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Select or search group name')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Roll Number')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.name("name")).sendKeys("testname1");
		
		driver.findElement(By.xpath("//span[contains(text(),'Select field type')]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),'Dropdown')]")).click();
		
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@placeholder='Description']")).sendKeys("testing");
		
		driver.findElement(By.xpath("//input[@name='Single']//following::ins[1]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(text(),'Add data against this field to be listed for selection*')]//following::input")).sendKeys("testdata1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Create and Continue')]")).click();
		
		Thread.sleep(4000);
		
		Boolean successmsg=driver.findElement(By.xpath("//div[contains(text(),'Attribute(s) created successfully')]")).isDisplayed();
		
		Assert.assertTrue(successmsg, "Attribute(s) created successfully  message is displayed");
		
	}
	
	public void vaidateTC_AP_029() throws InterruptedException
	{
       gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		
		
		
		//adding rule
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'seat number')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Greater than Or Equal')]")).click();
		
		Thread.sleep(3000);
		
		
	
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Value*')]//following::input")).sendKeys("5");
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(3000);
		
		
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		//Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath("//div[2]/button[2]/span[1]"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        Thread.sleep(3000);
        
      //*[@id="page-wrapper"]/div[2]/div[2]/form/div/div/div/div[7]/div[1]/div/span/a
        
        String userscount=driver.findElement(By.xpath("//span[@class='ng-scope']/a")).getText();
        
        int userscounts = Integer.parseInt(userscount);
        
        if(userscounts>0)
        {
        driver.findElement(By.xpath("//div[2]/button[2]/span[1]")).click();
        }
        
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getPageSource().contains("testpersona4"),"persona created successfully");
		
	}

	public void vaidateTC_AP_006() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		//driver.findElement(By.xpath("//a[@class='select2-choice ui-select-match']//following::span[@class='select2-chosen ng-binding ng-hide']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='selected_user_']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Staff')]")).click();
		
		//.findElement(By.xpath("//label[contains(text(),'Source*')]//following::ins[1]")).click();

		
		String assertInternalOption=driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/form/div/div/div/div[5]/div/div")).getText();
		
		System.out.println("expected text "+assertInternalOption);
		Thread.sleep(5000);
		
		
		
		Assert.assertEquals(assertInternalOption," Internal","Internal option is present for staff user type");
		
	}

	public void vaidateTC_AP_007() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='selected_user_']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Staff')]")).click();
	

		driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/form/div/div/div/div[5]/div/div/div/ins")).click();
		
		Thread.sleep(5000);
		
		Boolean assertInternalOptiondisplayed=driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/form/div/div/div/div[5]/div/div/div")).isDisplayed();
		
		
		Assert.assertTrue(assertInternalOptiondisplayed, "Internal option can be selected");
		
		
		
		
		
	}
	
	
	public void vaidateTC_AP_010() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		//driver.findElement(By.xpath("//a[@class='select2-choice ui-select-match']//following::span[@class='select2-chosen ng-binding ng-hide']")).click();
		
		//driver.findElement(By.xpath("//div[contains(text(),'Staff')]")).click();
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Graduation Year')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Equals')]")).click();
		
		//driver.findElement(By.xpath("//input[@placeholder='Value']")).sendKeys("2009");
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		
		Boolean alertdisplayed=driver.findElement(By.xpath("//div[contains(text(),'Please select value')]")).isDisplayed();
		
		Assert.assertTrue(alertdisplayed, "Alert message is displayed for leaving value field empty");
		
		
		
		
		
	}
	
	
	public void vaidateTC_AP_011() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		//driver.findElement(By.xpath("//a[@class='select2-choice ui-select-match']//following::span[@class='select2-chosen ng-binding ng-hide']")).click();
		
		//driver.findElement(By.xpath("//div[contains(text(),'Staff')]")).click();
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Graduation Year')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Equals')]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Value']")).sendKeys("2009");
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		
		Boolean alertdisplayed=driver.findElement(By.xpath("//div[contains(text(),'Please select value')]")).isDisplayed();
		
		Assert.assertTrue(alertdisplayed, "Alert message is displayed for leaving value field empty");
		
		
		
		
		
	}
	
	
	public void vaidateTC_AP_012() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		//driver.findElement(By.xpath("//a[@class='select2-choice ui-select-match']//following::span[@class='select2-chosen ng-binding ng-hide']")).click();
		
		//driver.findElement(By.xpath("//div[contains(text(),'Staff')]")).click();
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Graduation Year')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Equals')]")).click();
		
		Thread.sleep(3000);
		
		
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
	
	
	public void vaidateTC_AP_013() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		//driver.findElement(By.xpath("//a[@class='select2-choice ui-select-match']//following::span[@class='select2-chosen ng-binding ng-hide']")).click();
		
		//driver.findElement(By.xpath("//div[contains(text(),'Staff')]")).click();
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		//entering first rule
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Graduation Year')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Equals')]")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search value')]")).click();
		
		driver.findElement(By.xpath("//input[@id='ui_select_search_input_value']")).sendKeys("2009");
		
		driver.findElement(By.xpath("//input[@id='ui_select_search_input_value']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(3000);
		
		
		//entering second rule
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'seat number')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Equals')]")).click();
		
		Thread.sleep(3000);
		
		
		//driver.findElement(By.xpath("//span[contains(text(),'Select or search value')]")).click();
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Value*')]//following::input")).sendKeys("12");
		
		//driver.findElement(By.xpath("//input[@id='ui_select_search_input_value']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(3000);
		
		
		Boolean attributePresent=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[1]")).isDisplayed();
		
		Boolean attributeOperator=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[2]")).isDisplayed();
		
		Boolean attributeValue=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[3]")).isDisplayed();
		
		Boolean attributePresent1=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[2]/td[1]")).isDisplayed();
		
		Boolean attributeOperator1=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[2]/td[2]")).isDisplayed();
		
		Boolean attributeValue1=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[2]/td[3]")).isDisplayed();
		
		if(attributePresent && attributeOperator && attributeValue && attributePresent1 && attributeOperator1 && attributeValue1)
		{
			System.out.println("created rule is displayed");
		}
		
		
		
		
		
		
		
	}
	
	
	public void vaidateTC_AP_014() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		
		
		
		//adding rule
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'seat number')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Equals')]")).click();
		
		Thread.sleep(3000);
		
		
	
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Value*')]//following::input")).sendKeys("12");
		
		
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(3000);
		
		//*[@id="page-wrapper"]/div[2]/div[2]/form/div/div/div/div[6]/div[2]/div[2]/div/div/table/tbody/tr/td[4]
		
		//clicking on edit
		driver.findElement(By.xpath("//i[@class='fa fa-pencil']")).click();
		Thread.sleep(3000);
		
	   driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/form/div/div/div/div[6]/div[2]/div[1]/div[2]/div/div/a/span[2]/span")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Not Equals')]")).click();
		
		Thread.sleep(3000);
		
		
	
		
		
		
		
		driver.findElement(By.xpath("//span[@class='audience-create-add-btn ng-scope']//i")).click();
		Thread.sleep(3000);
		
		String newrule=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[2]")).getText();
		
		Assert.assertEquals(newrule, "Not Equals","user is able to edit rule added");
		
		
		
		
	}
	
	public void vaidateTC_AP_018() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		
		
		
		//adding rule
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'seat number')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Equals')]")).click();
		
		Thread.sleep(3000);
		
		
	
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Value*')]//following::input")).sendKeys("12");
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(3000);
		
		
		//clicking on apply
		driver.findElement(By.xpath("//button[@class='ladda-button btn btn-primary btn-sm']")).click();
		Thread.sleep(3000);
		
		//clicking total audience count link
		driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/form/div/div/div/div[7]/div[1]/div/span/a")).click();
		
	
		
		Thread.sleep(3000);
		
		String assertmanageaudience=driver.findElement(By.xpath("//div[@class='col-sm-8 right-side-popup-heading ng-binding']")).getText();
		
		Assert.assertEquals(assertmanageaudience, "Manage Audience","Manage audience page pop is displayed ");
		
		
		
		
		
	}
	
	public void vaidateTC_AP_027() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		
		
	driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div[2]/button[1]")).click();
	
	driver.findElement(By.xpath("//span[contains(text(),'Select or search status')]")).click();
	
	//selecting active records
	driver.findElement(By.xpath("//div[contains(text(),'Active')]")).click();
	
	driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
	Thread.sleep(3000);
	
	List<WebElement> activepersonas=driver.findElements(By.xpath("//span[@id='switchery_id']"));
	
	System.out.println(activepersonas.size());
	
	
	
	Thread.sleep(5000);
	
	if(activepersonas.size()!=0)
	{
	for(int i=0;i<activepersonas.size();i++)
	{
		
		
		String bordercolor=driver.findElements(By.xpath("//span[@id='switchery_id']")).get(i).getCssValue("border-color");
		
		System.out.println(bordercolor);
		
		Assert.assertEquals(bordercolor, "rgb(26, 179, 148)","Active personas are displayed in green");	
	}
	}
	
	//selecting inactive records
		driver.findElement(By.xpath("//span[contains(text(),'Active')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Inactive')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		
		List<WebElement> inactivepersonas=driver.findElements(By.xpath("//span[@id='switchery_id']"));
		
		System.out.println(inactivepersonas.size());
		
		
		
		Thread.sleep(5000);
		
		if(inactivepersonas.size()!=0)
		{
		for(int i=0;i<inactivepersonas.size();i++)
		{
			
			
			String bordercolor=driver.findElements(By.xpath("//span[@id='switchery_id']")).get(i).getCssValue("border-color");
			
			System.out.println(bordercolor);
			
			Assert.assertEquals(bordercolor, "rgb(223, 223, 223)","Inactive personas are displayed in grey");	
		}
		}
		
	
	}
	
	public void vaidateTC_AP_032() throws InterruptedException
	{
        gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		
		
		
		//adding rule
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'seat number')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Equals')]")).click();
		
		Thread.sleep(3000);
		
		
	
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Value*')]//following::input")).sendKeys("12");
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(3000);
		
		
		//clicking on apply
		driver.findElement(By.xpath("//button[@class='ladda-button btn btn-primary btn-sm']")).click();
		Thread.sleep(3000);
		
		//clicking total audience count link
		driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/form/div/div/div/div[7]/div[1]/div/span/a")).click();
		
	
		
		Thread.sleep(3000);
		
		String assertmanageaudience=driver.findElement(By.xpath("//div[@class='col-sm-8 right-side-popup-heading ng-binding']")).getText();
		
		Assert.assertEquals(assertmanageaudience, "Manage Audience","Manage audience page pop is displayed ");
		
		Boolean userpresent=driver.findElement(By.xpath("//*[@id='manulaclick']/table/tbody/tr/td[2]")).isDisplayed();
		
		Assert.assertTrue(userpresent, "users are displayed in manage audience popup");
		
		
	
	}
	public void vaidateTC_AP_033() throws InterruptedException
	{
        gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		
		
		
		//adding rule
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'seat number')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Not Equals')]")).click();
		
		Thread.sleep(3000);
		
		
	
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Value*')]//following::input")).sendKeys("12");
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(3000);
		
		
		//clicking on apply
		driver.findElement(By.xpath("//button[@class='ladda-button btn btn-primary btn-sm']")).click();
		Thread.sleep(3000);
		
		
		Boolean NotEqualsRulePresent=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[2]")).isDisplayed();
		
		//*[@id="page-wrapper"]/div[2]/div[2]/form/div/div/div/div[6]/div[2]/div[2]/div/div/table/tbody/tr/td[2]
		
		Assert.assertTrue(NotEqualsRulePresent, "Not equal option is added");
	
	}
	
	
	public void vaidateTC_AP_034() throws InterruptedException
	{
        gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		
		
		
		//adding rule
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'seat number')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Greater than Or Equal')]")).click();
		
		Thread.sleep(3000);
		
		
	
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Value*')]//following::input")).sendKeys("5");
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(3000);
		
		
		//clicking on apply
		driver.findElement(By.xpath("//button[@class='ladda-button btn btn-primary btn-sm']")).click();
		Thread.sleep(3000);
		
		
		Boolean GreaterthanorequalRulePresent=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[2]")).isDisplayed();
		

		
		Assert.assertTrue(GreaterthanorequalRulePresent, "Greater than or equal option is added");
	
	}
	
	public void vaidateTC_AP_036() throws InterruptedException
	{
        gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("testpersona4");
		
		
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		
		
		
		//adding rule
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'seat number')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Greater than')]")).click();
		
		Thread.sleep(3000);
		
		
	
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Value*')]//following::input")).sendKeys("5");
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		Thread.sleep(3000);
		
		
		//clicking on apply
		driver.findElement(By.xpath("//button[@class='ladda-button btn btn-primary btn-sm']")).click();
		Thread.sleep(3000);
		
		
		Boolean GreaterthanRulePresent=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[2]")).isDisplayed();
		

		
		Assert.assertTrue(GreaterthanRulePresent, "Greater than option is added");
	
	}
	
	
	
	public void vaidateCreateGroups() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Groups')]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		driver.findElement(By.name("personaname")).sendKeys("samplegroup4");
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("test");
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search attribute')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Chat group')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Select or search operator')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Equals')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='select_placeholder_aud']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'2009 batch')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='audience-create-add-btn ng-scope']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		//Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath("//div[2]/button[2]/span[1]"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
     
        
        driver.findElement(By.xpath("//div[2]/button[2]/span[1]")).click();
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getPageSource().contains("samplegroup4"),"group created successfully");
		
	}
	
	
	public void validateAlertMsgInvalidMobile() throws InterruptedException
	{
		gm.navigateToAudiencePage();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Individuals')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Create New')]")).click();
		
		
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@placeholder='Univeristy Roll Number']")).sendKeys("testunvi123");
//		
//		driver.findElement(By.xpath("//input[@id='new_firstName']")).sendKeys("testname1");
//		
//		
//		driver.findElement(By.xpath("//input[@placeholder='Univeristy Name']")).sendKeys("vit");
//		
//		
//		driver.findElement(By.xpath("//input[@placeholder='Chat group']")).sendKeys("vitgrp1");
//		
//		
//		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("name1");
//		
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Graduation year')]")).sendKeys("2009");
		
		
		driver.findElement(By.xpath("//input[@id='new_mobile_number']")).sendKeys("1221221");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Create and Continue')]")).click();
		Thread.sleep(4000);
		
		Boolean invalidmobilenomsg=driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid mobile number')]")).isDisplayed();
		
		Assert.assertTrue(invalidmobilenomsg, "alert message is displayed to enter valid mobile number");
		
		
	}
}
