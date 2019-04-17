package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.LogStatus;



//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;


public class TestNgTestCases extends ReuseMet {

	// ReuseMet reuse=new ReuseMet();

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
		enterText(un, "username", "sanka.teluk-g5ib@force.com");
		WebElement passw = findElement(By.xpath("//input[@id='password']"), "passWord");
passw.clear();
		System.out.println("password should be empty");
		// Logger.log(LogStatus.PASS, passw + "password should be empty");
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		login.click();
		Thread.sleep(2000);
		String actual_message = driver.findElement(By.xpath(" //div[@id='error']")).getText();
		String expected_error = "Please enter your password.";

		Assert.assertEquals(actual_message, expected_error);

		System.out.println("pass:" + actual_message);
		// Logger.log(LogStatus.PASS, actual_message);
		//throw new SkipException("connection issue");
		// System.out.println("LoginIntoAccount to make the payment");
	}
	@Test(priority = 2)
	// @Parameters{"unameVal"}
	public void TestCase2() throws InterruptedException {
		WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
		enterText(un, "username", "sanka.teluk-g5ib@force.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "passWord");
		enterText(pass, "password", "Reddy@143");
	//findElement(By.xpath(" //div[@id='error']"), "password");
		// enterTest(enterPassword,"please enter password");
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		login.click();
		
		Thread.sleep(2000);
	}
	@Test(priority = 3)
	public void TestCase3() throws InterruptedException {
	WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
	enterText(un, "username", "sanka.teluk-g5ib@force.com");
	WebElement pass = findElement(By.xpath("//input[@id='password']"), "passWord");
	enterText(pass, "password", "Reddy@143");

	WebElement remember = driver.findElement(By.cssSelector("#rememberUn"));
	clickCheckBox(remember, "Remember Me");
	WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

	login.click();
	
	//Logger.log(LogStatus.PASS, login + "Sales force home page is displayed");
WebElement userMenu = driver.findElement(By.id("userNav-arrow"));
	userMenu.click();
	
	
	WebElement logOut = driver.findElement(By.linkText("Logout"));
	logOut.click();
	//Logger.log(LogStatus.PASS, logOut + "logout is selected");
	Thread.sleep(2000);
	WebElement usernametest = driver.findElement(By.xpath("//input[@id='username']"));
	String usertest1 = usernametest.getText();
	Assert.assertEquals(usertest1, un);
	//Logger.log(LogStatus.PASS, usernametest + "username is dispalyed in login page");
	Thread.sleep(2000);
}
	@Test(priority = 4)
	// @Parameters{"unameVal"}
	public void TestCase4a() throws InterruptedException {

	WebElement forgotpw = driver.findElement(By.xpath("//a[@class='fl small']"));
	forgotpw.click();
	System.out.println("Salesforce forgot password page is displayed");
	//Logger.log(LogStatus.PASS, forgotpw + "Salesforce forgot password page is displayed ");

	WebElement un = findElement(By.name("un"), "user name");
	enterText(un, "username", "sanka.teluk-g5ib@force.com");
	//un.click();
	WebElement conti = driver.findElement(By.xpath("//input[@id='continue']"));
	conti.click();
	System.out.println("Password reset message page is displayed.");
	//Logger.log(LogStatus.PASS, conti + " Password reset message page is displayed");

	WebElement returntologin = driver.findElement(By.linkText("Return to Login"));
	returntologin.click();
	System.out.println("return to login  page is displayed.");
	//Logger.log(LogStatus.PASS, returntologin + " Password reset message page is displayed");
	Thread.sleep(2000);
	
	}
	@Test(priority = 5)
	public void TestCase4B() throws InterruptedException {
		WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
		enterText(un, "username", "123@gmail.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "passWord");
		enterText(pass, "password", "Dummy");

		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		login.click();
		System.out.println("Pass:Error message should be displayed");
		//Logger.log(LogStatus.PASS, login + "error message should be displayed");

		Thread.sleep(2000);
	}
	@Test(priority = 6)
	public void TestCase10() throws InterruptedException {

		WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
		enterText(un, "username", "sanka.teluk-g5ib@force.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "passWord");
		enterText(pass, "password", "Reddy@143");
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		login.click();
		Thread.sleep(4000);
		WebElement accounts = driver.findElement(By.linkText("Accounts"));
		accounts.click();
		System.out.println("Pass:Accounts page is displayed with correct <username>");
		WebElement newbutton = driver.findElement(By.name("new"));
		newbutton.click();
		System.out.println("Pass:New account page is displayed with account details");
		WebElement accName=driver.findElement(By.id("acc2"));
		accName.sendKeys("Sanjana");
		WebElement save=driver.findElement(By.name("save"));
		save.click();
		System.out.println("New account created");
		Thread.sleep(2000);
	}
	@Test(priority = 7)
	public void TestCase9() throws InterruptedException {
	WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
	enterText(un, "username", "sanka.teluk-g5ib@force.com");
	WebElement pass = findElement(By.xpath("//input[@id='password']"), "passWord");
	enterText(pass, "password", "Reddy@143");

	WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

	login.click();
	System.out.println("Pass:Saleforce application home page is logged with correct username.");

	Thread.sleep(4000);
	// driver.quit();
	WebElement usermenu = driver
			.findElement(By.xpath("//div[@id='userNav-arrow']"));
	//Actions actions = new Actions(driver);
	//actions.moveToElement(usermenu).perform();
	//System.out.println("Pass:User menu drop dwon should be available");
	usermenu.click();
	System.out.println("Pass:Drop down list is dislpayed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Pass:Logout of current salesforce page is displayed and  salesforce login page is displayed");
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
