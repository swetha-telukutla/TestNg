package pack1;

//import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.seleniumhq.jetty9.util.log.Logger;
import org.testng.annotations.BeforeSuite;

//import com.relevantcodes.extentreports.LogStatus;

//import com.relevantcodes.extentreports.LogStatus;

public class ReuseMet {
	
	
	 static WebDriver driver;
	public static void initializeDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SankarA\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		driver = new ChromeDriver();

	}

	public static void launch(String url) {

		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Pass:Salesforce application page is displayed");
		//Logger.log(LogStatus.PASS, url + "Salesforce application is displayed");
	}

	/*
	 * Name:enterText Description:Enter the text value in to the text object on
	 * the page. Arguments:ObjectName:Name of the object Textvalue:Value to be
	 * entered Created by:Swetha Creation date:14 Feb 2019 Last modified date:14
	 * Feb 2019
	 */

	public static void enterText(WebElement obj, String objName, String textValue) {
		if (obj == null)

			return;
		if (obj.isDisplayed()) {
			obj.sendKeys(textValue);
			;
			System.out.println("Pass: " + objName + " is displyed in the User Name field ");
			//Logger.log(LogStatus.PASS, objName + " is displayed in User name field");

		} else {
		//	Logger.log(LogStatus.FAIL, objName + " could not be found");
			System.out.println("Fail:" + objName + "Plese enter password value");
		}
	}

	/*
	 * find element Description:finding the element in the application
	 * Arguments:ObjectName:name of the object Created by:Swetha Creation
	 * date:14 Feb 2019 Last modified date:14 Feb 2019
	 * 
	 */
	public static WebElement findElement(By location, String objName) {

		WebElement obj = null;
		try {
			obj = driver.findElement(location);
			System.out.println("pass:" + objName+" " + "found on the page");
		//	Logger.log(LogStatus.PASS, objName + " found on the page");

		} catch (NoSuchElementException errMessage) {
			System.out.println("Fail:" + objName + "not found on the page");
			// Logger.log(LogStatus.FAIL, objName);

		}
		return obj;
	}


public static void clickCheckBox(WebElement obj, String objName) {
	if (obj == null)
		return;
	if (obj.isDisplayed()) {
		if (!obj.isSelected()) {
			obj.click();
		}
		//Logger.log(LogStatus.PASS, objName);
		 System.out.println("pass: " + objName + "found on the page");
	} else {
		//Logger.log(LogStatus.FAIL, objName);
		 System.out.println("Fail:" + objName + "could not be found on the page");

	}

}}


