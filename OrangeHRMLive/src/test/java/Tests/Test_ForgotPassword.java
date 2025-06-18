package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Base.BaseTest;
import Page.LoginPage;

public class Test_ForgotPassword extends BaseTest {
	
	@Test
	public void testcase3()
	{
		test = ext.createTest("testcase3");
		/* open the browser enter the url,
		 * click on forgot password, 
		 * enter new username and click on reset button,
		 *  reset password link sent confirmation message should display
		 */
		LoginPage page = new LoginPage(driver);
		
		page.clickForgotPassword();
		
		page.resetUN("Admin");
		
		page.resetPasswordButton();
		
		WebElement resetMessage = driver.findElement(By.xpath("//h6[text()='Reset Password link sent successfully']"));
		boolean displayed = resetMessage.isDisplayed();
		if(displayed)
		{
			System.out.println("Reset Password link sent successfully");
		}
		else
		{
			System.out.println("Reset Password link not sent");
		}
		}
}
