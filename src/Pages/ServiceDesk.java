package Pages;

import Test.FunctionalTest;
import utility.GenericMEthods;

public class ServiceDesk extends FunctionalTest{
	
	GenericMEthods gm = new GenericMEthods(); 
	
	public class ServiceDesklocators extends ServiceDesk
	{
		//inbox locators
		public static final String selectpriority="//span[contains(text(),'Select or search priority')]";
		
		public static final String selectsource="//span[contains(text(),'Select or search source')]";
		public static final String enterdesc="//div[@class='note-editable panel-body']";
		public static final String clickaddnotes="//button[contains(text(),'Add Notes')]";
		public static final String selectemplate="//span[contains(text(),'Select or search template')]";
		public static final String selectedcategory="//label[contains(text(),'Ticket wellbeing')]";
		public static final String entersubjectvalue="//label[contains(text(),'Subject*')]//following::input";
		public static final String clearaction="//button[contains(text(),'Clear Action')]";
		
		public static final String clickclose="//button[contains(text(),'Close')]";
		public static final String clicktransfer="//button[contains(text(),'Transfer')]";
		public static final String clickaddreminder="//button[contains(text(),'Add Reminder')]";
		
		public static final String clickaddtask="//button[contains(text(),'Add Task')]";
		public static final String clickhold="//button[contains(text(),'Hold')]";
		public static final String clickcreatenew="//button[contains(text(),' Create New')]";
		
         
		public static final String cliccreatandcontinue="//span[contains(text(),'Create and Continue')]";
		public static final String cliccreate="//span[contains(text(),'Create')]";
		
		public static final String clickMyticketstab="//*[@id='page-wrapper']/div[2]/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[1]/a";
		
		public static final String clickunassignedtab="//*[@id='page-wrapper']/div[2]/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[2]/a";
		
		public static final String clickonholdtab="//*[@id='page-wrapper']/div[2]/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[3]/a";
		public static final String clickmyteamtab="//*[@id='page-wrapper']/div[2]/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[4]/a";
		
		public static final String clickmyactiontab="//span[contains(text(),'My Actions')]";
		
		//configuration locators
		
		public static final String clickfeaturesetup="//*[@id='feature']/a/span";
		public static final String featureticketoption="//*[@id='ticket']/a/span";
		public static final String clicktickettemplateoption="//*[@id='feature']/ul/div[1]/li[3]/a/span";
		public static final String createnewtemplate="//*[@id='page-wrapper']/div/div/div/div[1]/div/div[2]/div[1]/button";
		public static final String templatename="//label[contains(text(),'Name*')]//following::input[1]";
		public static final String selecctticketwellbeingcategory="//*[@id='ng-app']/body/div[7]/div/div/div/div/div[2]/div[3]/div[1]/div/div[1]/div[1]/div[2]/div/span/h5";
		public static final String selecttemplatepriority="//*[@id='select_placeholder_priority']";
		public static final String selectnormalpriority="//div[contains(text(),'Normal')]";
		
		
		public static final String selectsourcevalue="//*[@id='select_placeholder_source']";
		public static final String selectrequesttype="//*[@id='select_placeholder_call']";
		public static final String selectpreferredmode="//*[@id='select_placeholder_pmode']";
		public static final String entersubject="//label[contains(text(),'Subject*')]//following::input[1]";
		
		public static final String enterdescvalue="//div[@class='note-editable panel-body']";
		public static final String enterresolution="//textarea[@class='note-codable']//following::div[13]";
		public static final String createtemplate="//span[contains(text(),'Create')]";
	}

}
