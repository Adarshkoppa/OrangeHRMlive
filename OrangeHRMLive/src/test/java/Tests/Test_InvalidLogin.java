package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Page.LoginPage;

public class Test_InvalidLogin extends BaseTest {
	
	@DataProvider(name="loginData")
	public Object[][]getData(){
		return new Object[][] {
			{"Adarsha","Admin123"}};
		}
@Test(dataProvider = "loginData")
public void testcase2(String un,String pwd)
{
	test = ext.createTest("testcase2");
	/*open the browser enter the url,
	 * enter invalid username and valid password
	 * click on login button
	 * check whether proper error message is displayed
	 */
	
	LoginPage page=new LoginPage(driver);
	
	page.enterUsername(un);
	try {
	Thread.sleep(2000);}catch(Exception e){}
	
	page.enterPassword(pwd);
	try {
		Thread.sleep(2000);}catch(Exception e){}
	
	page.clickLogin();
	
	try {
		Thread.sleep(2000);}catch(Exception e){}
	WebElement errorMessage = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
	
	boolean displayed = errorMessage.isDisplayed();
	if(displayed)
	{
		System.out.println("proper error message is displayed");
	}
	else
	{
		System.out.println("Proper error message is not displayed");
	}

}
}
