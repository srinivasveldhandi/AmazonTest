package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	private By header = By.xpath("//a[@id='nav-logo-sprites']");

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getHeader() {
		return getElement(header);
	}

	

}
