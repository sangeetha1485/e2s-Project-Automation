package Pages;

import Test.FunctionalTest;
import utility.GenericMEthods;

public class ServiceDesk extends FunctionalTest{
	
	GenericMEthods gm = new GenericMEthods(); 
	
	public class ServiceDesklocators extends ServiceDesk
	{
		public static final String selectpriority="//span[contains(text(),'Select or search priority')]";
		
		public static final String selectsource="//span[contains(text(),'Select or search source')]";
		public static final String enterdesc="//div[@class='note-editable panel-body']";
		public static final String clickaddnotes="//button[contains(text(),'Add Notes')]";
		
		public static final String clickclose="//button[contains(text(),'Close')]";
		public static final String clicktransfer="//button[contains(text(),'Transfer')]";
		public static final String clickaddreminder="//button[contains(text(),'Add Reminder')]";
		
		public static final String clickaddtask="//button[contains(text(),'Add Task')]";
		public static final String clickhold="//button[contains(text(),'Hold')]";
		
		public static final String cliccreatandcontinue="//button[contains(text(),'Create and Continue')]";
		public static final String cliccreate="//button[contains(text(),'Create')]";
		
		public static final String clickMyticketstab="//*[@id='page-wrapper']/div[2]/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[1]/a";
		
		public static final String clickunassignedtab="//*[@id='page-wrapper']/div[2]/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[2]/a";
		
		public static final String clickonholdtab="//*[@id='page-wrapper']/div[2]/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[3]/a";
		public static final String clickmyteamtab="//*[@id='page-wrapper']/div[2]/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[4]/a";
		
		public static final String clickmyactiontab="//span[contains(text(),'My Actions')]";
		
		
		
				
	}

}
