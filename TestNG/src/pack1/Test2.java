package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 extends ReuseMet{
	

	@BeforeTest

	public void setUp() {
		// String path = "C:\\Swetha\\JanQaReports\\Report2.html";
		//report = new ExtentReports(path);

		System.out.println("BeforeTest");
	}

	@BeforeMethod
	public void Launch() {
		
		initializeDriver();
		launch("https://login.salesforce.com/");

		System.out.println("BeforeMethod");
	}

	@Test(priority = 1)
	// @Parameters{"unameVal"}
	public void TestCase1() throws InterruptedException {
		WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
		enterText(un, "username", "shankarreddy.t-ibof@force.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "passWord");
		enterText(pass, "password", "Reddy@143");
	//findElement(By.xpath(" //div[@id='error']"), "password");
		// enterTest(enterPassword,"please enter password");
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		login.click();
		WebElement freetrail =driver.findElement(By.id("free trial"));
		freetrail.click();
		
		Thread.sleep(2000);
	}
	@AfterMethod
	public void AfterMethod() {

		System.out.println("AfterMehod");
	}

	@AfterTest
	public void AfterTest() {
		// report.endTest(Logger);
		// report.flush();
		System.out.println("end");
		System.out.println("AfterTestmethod ");
	}
}
