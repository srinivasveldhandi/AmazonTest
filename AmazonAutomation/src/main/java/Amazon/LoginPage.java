package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	private By email = By.xpath("//input[@id='ap_email']");
	
	private By btnContinue = By.xpath("//input[@id='continue']");

	private By password = By.xpath("//input[@id='ap_password']");
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public WebElement getEmail() {
		return getElement(email);
	}


	
	public WebElement getBtnContinue() {
		return getElement(btnContinue);
	}



	public WebElement getPassword() {
		return getElement(password);
	}

	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public HomePage doLogin(String strEmail, String strPassword) {
		getEmail().sendKeys(strEmail);
		getBtnContinue().click();
		getPassword().sendKeys(strPassword);
		
		return getInstance(HomePage.class);
	}

	
	

}
