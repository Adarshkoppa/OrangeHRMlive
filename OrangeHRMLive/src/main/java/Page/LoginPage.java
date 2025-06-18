package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
@FindBy(name = "username")
WebElement Username;

@FindBy(xpath = "//input[@name='username']")
WebElement UserName;

@FindBy(name = "password")
WebElement Password;

@FindBy(xpath = "//button[@type='submit']")
WebElement Login;


@FindBy(xpath = "//p[text()='Forgot your password? ']")
WebElement ForgotPassword;

@FindBy(xpath = "//input[@name='username']")
WebElement resetPasswordUsername;

@FindBy(xpath = "//button[text()=' Reset Password ']")
WebElement resetButton;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterUsername(String un)
{
	UserName.sendKeys(un);
}

public void enterPassword(String pwd)
{
	Password.sendKeys(pwd);
}

public void clickLogin()
{
	Login.click();
}

public void clickForgotPassword()
{
	ForgotPassword.click();
}

public void resetUN(String newun)
{
	resetPasswordUsername.sendKeys(newun);
}

public void resetPasswordButton()
{
	resetButton.click();
}



}
