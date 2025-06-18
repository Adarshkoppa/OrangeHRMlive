package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Base.BaseTest;
import Page.LoginPage;

public class Test_ValidLogin extends BaseTest{
	
	@DataProvider(name = "loginData")
	public Object[][]getData(){
		return new Object[][] {
			{"Admin","admin123"}
		};
	}
	
	@Test(dataProvider = "loginData")
	public void testcase1(String un,String pwd)
	{
		test = ext.createTest("testcase1");
		/*open the browser,
		 * enter the url
		 * enter valid username and valid password
		 * click on login button
		 * check whether dashboard page is displayed
		 */
		
		LoginPage page = new LoginPage(driver);
		
		page.enterUsername(un);
		try {
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		page.enterPassword(pwd);
		try {
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		Assert.fail();
		page.clickLogin();
		
		/*String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title,"OrangeHRM");
		System.out.println("Dashboard page is displayed");*/
		}
	
		
	}
