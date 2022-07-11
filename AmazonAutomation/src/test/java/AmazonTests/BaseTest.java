/**
 * 
 */
package AmazonTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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
	Properties prop;	
	FileInputStream objfile; 
	
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
		
		prop = new Properties();		
		try {
			objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Config\\Config.properties");
		} catch (FileNotFoundException e1) {		
			e1.printStackTrace();
		}
		try {
			prop.load(objfile);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
