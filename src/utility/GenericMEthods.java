package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Test.FunctionalTest;

public class GenericMEthods extends FunctionalTest {

	// initializing locators

//	public enum LocatorType {
//		
//		Xpath, Name
//		
//		}
//	
//	public static class CharacterDirection {
//		LocatorType locatortype;
//
//	    public CharacterDirection(LocatorType locatortype) {
//	        this.locatortype = locatortype;
//	    }

	private String text;

	public void navigateToHomePage() throws InterruptedException {

		WebElement options = driver.findElement(By.xpath("//div[@class='sidebar-collapse']"));

		Actions act = new Actions(driver);

		act.moveToElement(options).perform();

		// driver.findElement(By.xpath("//span[contains(text(),'Content
		// Library')]")).click();

		Thread.sleep(3000);

		// driver.findElement(By.xpath("//span[contains(text(),'Notifications')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
	}

	public void navigateToNotificationsHomePage() throws InterruptedException {

		WebElement options = driver.findElement(By.xpath("//div[@class='sidebar-collapse']"));
//
		Actions act = new Actions(driver);
//	
		act.moveToElement(options).perform();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[contains(text(),'Content Library')]")).click();

		Thread.sleep(3000);

		Boolean notoption = driver.findElement(By.xpath("//span[contains(text(),'Notifications')]")).isDisplayed();

		if ((notoption)) {
			driver.findElement(By.xpath("//span[contains(text(),'Notifications')]")).click();
		}

	}

	public void navigateToAudiencePage() throws InterruptedException {
		Thread.sleep(10000);

		WebElement options = driver.findElement(By.xpath("//div[@class='sidebar-collapse']"));
//
		Actions act = new Actions(driver);
//	
		act.moveToElement(options).perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[contains(text(),'Audience')]")).click();

	}

	public void navigateToCampusNews() throws InterruptedException {
		Thread.sleep(4000);

		WebElement options = driver.findElement(By.xpath("//div[@class='sidebar-collapse']"));
		//
		Actions act = new Actions(driver);
		//
		act.moveToElement(options).perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Content Library')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'Campus News')]")).click();

	}

	public void scrollDown(String locator) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Find element by link text and store in variable "Element"
		WebElement createpersonabutton = driver.findElement(By.xpath(locator));

		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", createpersonabutton);

		Thread.sleep(3000);

	}

	public void scrollToElement(String locator) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath(locator));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

	}

	public boolean assertTrue(boolean condition, String message) {

		Assert.assertTrue(driver.getPageSource().contains("testpersona4"), "persona created successfully");

		return true;

	}

	public boolean verifyElementCustomAttributeTable(String locator, String attribute) {

		List<WebElement> tableLinks = driver.findElements(By.xpath(locator));

		for (int i = 0; i < tableLinks.size(); i++) {
			if (tableLinks.get(i).getText().contains(attribute))
				;
			{
				System.out.println("added attribute is displayed in grid");
				return true;

			}

		}
		return false;

	}

	public static void Wait(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));

	}

	public void click(String locatortype, String locator) {

		switch (locatortype) {

		case "Xpath":

			driver.findElement(By.xpath(locator)).click();

			break;

		case "Name":

			driver.findElement(By.name(locator)).click();

			break;

		case "LinkText":

			driver.findElement(By.linkText(locator)).click();
			break;

		}
	}

	public String getText(String locatortype, String locator) {
		String text = null;
		switch (locatortype) {

		case "Xpath":

			text = driver.findElement(By.xpath(locator)).getText();

			break;

		case "Name":

			driver.findElement(By.name(locator)).click();

			break;

		case "LinkText":

			driver.findElement(By.linkText(locator)).click();
			break;

		}

		return text;
	}

	public boolean isDisplayed(String locatortype, String locator) {
		boolean text = false;
		switch (locatortype) {

		case "Xpath":

			text = driver.findElement(By.xpath(locator)).isDisplayed();

			break;

		case "Name":

			driver.findElement(By.name(locator)).click();

			break;

		case "LinkText":

			driver.findElement(By.linkText(locator)).click();
			break;

		}
		return text;

	}

	public void SendKeys(String locatortype, String locator, String value) {
		switch (locatortype) {
		case "Xpath":

			driver.findElement(By.xpath(locator)).sendKeys(value);

			break;

		case "Name":

			driver.findElement(By.name(locator)).sendKeys(value);
			break;
		}

	}

	public static Boolean isFileDownloaded(String fileName) {
		boolean flag = false;
		// paste your directory path below
		// eg: C:\\Users\\username\\Downloads
		String dirPath = "";
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files.length == 0 || files == null) {
			System.out.println("The directory is empty");
			flag = false;
		} else {
			for (File listFile : files) {
				if (listFile.getName().contains(fileName)) {
					System.out.println(fileName + " is present");
					break;
				}
				flag = true;
			}
		}
		return flag;
	}

	public File getLastModifiedFile(File directory) {
		File[] files = directory.listFiles();
		if (files.length == 0)
			return null;
		Arrays.sort(files, new Comparator<File>() {
			public int compare(File o1, File o2) {
				return new Long(o2.lastModified()).compareTo(o1.lastModified());
			}
		});
		return files[0];
	}

	public boolean deleteFile(File pFile) {
		boolean bResult = false;

		if (pFile.exists()) {
			if (pFile.isDirectory()) {
				if (pFile.list().length == 0) {
					pFile.delete();
				} else {
					String[] strFiles = pFile.list();

					for (String strFilename : strFiles) {

						if (strFilename.contains((CharSequence) pFile)) {
							File fileToDelete = new File(pFile, strFilename);

							deleteFile(fileToDelete);
						}
					}
				}
			} else {
				pFile.delete();
			}
		}

		return bResult;
	}

	public static void assertEquals(Object actualResult, Object expectedResult) {
		if (!expectedResult.equals(actualResult)) {
			// take screenshot

		}
	}
	public int getRecordsCountInCSV(String downloadPath, String csvFileName) {
		int lineNumberCount = 0;
		try {
			if (!csvFileName.isEmpty() || csvFileName != null) {
				String filePath =	downloadPath + System.getProperty("file.separator") + csvFileName;
				System.out.println(filePath);
				File file = new File(filePath);
				if (file.exists()) {
					System.out.println("File found :" +csvFileName);
					FileReader fr = new FileReader(file);
					LineNumberReader linenumberreader = new LineNumberReader(fr);
					while (linenumberreader.readLine() != null) {
						lineNumberCount++;
					}
					//To remove the header
					lineNumberCount=lineNumberCount-1;
					System.out.println("Total number of lines found in csv : " + (lineNumberCount));
					linenumberreader.close();
				} else {
					System.out.println("File does not exists");
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return lineNumberCount;
	}
	
	
	public static void uploadFile(String locator,String filepath) throws AWTException, InterruptedException {
		WebElement upload_btn = driver.findElement(By.xpath(locator));

		setClipboardData(
				filepath);

		Actions builder1 = new Actions(driver);

		org.openqa.selenium.interactions.Action myAction = builder1.click(upload_btn).release().build();

		myAction.perform();

		Robot rbt = new Robot();
		rbt.delay(4000);
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_ENTER);

		rbt.keyRelease(KeyEvent.VK_ENTER);
		rbt.delay(4000);

		Thread.sleep(3000);
	}

	public static void setClipboardData(String string) {

		StringSelection stringSelection = new StringSelection(string);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

	}
}
