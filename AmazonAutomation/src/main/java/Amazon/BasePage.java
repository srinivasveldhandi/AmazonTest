/**
 * 
 */
package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author ADMIN
 *
 */
public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);

	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		}
		catch(Exception e) {
			System.out.println("Some Error Occured while creating element " + locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e) {
			System.out.println("Some Error occured while waiting for an element " + locator.toString() );
		}
		
	}

	@Override
	public void waitForPageTitle(String strTitle) {
		try {
//			wait.until(ExpectedConditions.titleContains(strTitle));
			
		}
		catch (Exception e) {
			System.out.println("Some error occured while waiting for page tile "+ strTitle);
		}
		
		
	}
	

}
