/**
 * 
 */
package AmazonTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Amazon.BasePage;
import Amazon.Page;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author ADMIN
 *
 */
public class BaseTest {
	WebDriver driver;
	public Page page;
	
	@BeforeMethod
	@Parameters(value="browser")
	public void setUpTest(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver(); 
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("No browser defined in the class");
	
		}
		driver.get("amazon.com");
		page = new BasePage(driver);	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
