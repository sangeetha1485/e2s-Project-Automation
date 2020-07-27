package Test;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.PollsPage;

public class PollsTest extends FunctionalTest{
	

	PollsPage polls = new PollsPage();
	
	@Test
	public void executePollsTestCases() throws InterruptedException
	{
		//polls.testLaterDisabeled();
		
		//polls.validate2Response();
		
		//polls.validateMissingPredifinedTemplates();
		
		
		polls.validatePollPublishPage();
		
	}
	
	

}
