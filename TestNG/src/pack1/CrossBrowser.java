package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		System.out.println(browser);
		if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SankarA\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SankarA\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			throw new Exception("Browser is not correct");
		}
		
		
	}

	@Test
	public void testGoogle() {
		{
			driver.get("http://www.google.com/");
		}

	}

}
