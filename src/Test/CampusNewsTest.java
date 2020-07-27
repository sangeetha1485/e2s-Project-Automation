package Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.AudiencePage;
import Pages.CampusNews;

public class CampusNewsTest extends FunctionalTest{

	
	CampusNews cn = new CampusNews();
	
	@Test
	public void executeCampusNewsTestCases() throws InterruptedException, AWTException
	{
		//cn.validateEQ2658();
		
		//cn.validateAlertStep3ExpiryDate();
		
		//cn.validateStatusExpiredDateCrossed();
		//cn.validateLoadingIssueAlumni();
		//cn.validateEQ2666();
		//cn.validateEQ2652();
		
		//cn.validateWrongBreadCrumbMiscPlus();
		
		cn.validateMiscDisplayedInCategoryDdl();
	}

	
}
