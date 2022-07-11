/**
 * 
 */
package AmazonTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon.LoginPage;

/**
 * @author ADMIN
 *
 */
public class LoginTest extends BaseTest {
	
	@Test
	public void verifyPageLoginTitle() {
		String strTitle = page.getInstance(LoginPage.class).getPageTitle();
		
		Assert.assertEquals(strTitle, "Amazon");
		
	}

}
