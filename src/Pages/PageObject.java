package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

	public WebDriver driver;
	
	public PageObject()
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
