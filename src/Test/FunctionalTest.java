package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FunctionalTest {

	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\selenium\\chromedriver_win32_old\\chromedriver.exe");

		 driver= new ChromeDriver();
		 
		driver.get("https://qa-platform.engage2serve.com/");


		driver.manage().window().maximize();
	
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='usrnm']")));

		driver.findElement(By.xpath("//input[@name='usrnm']")).sendKeys("imu-qa@yopmail.com ");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}
	
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}

}
