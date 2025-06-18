package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import Utils.ExtentReportManager;
import Utils.ScreenShotUtils;

import com.aventstack.extentreports.*;

public class BaseTest {
public WebDriver driver;
public static ExtentReports ext;
public static ExtentTest test;

@BeforeSuite
public void setUpReport() {
    ext = ExtentReportManager.getReportInstance();
}


@BeforeMethod
public void openApplication()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://opensource-demo.orangehrmlive.com/");
}


@AfterMethod
public void tearDown(ITestResult result) 
{
    if (result.getStatus() == ITestResult.FAILURE) 
    {
        String screenshotPath = ScreenShotUtils.takeScreenshot(driver,result.getName());
        test.fail(result.getThrowable());
        try {
            test.addScreenCaptureFromPath(screenshotPath);
        	} 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    } 
    else if (result.getStatus() == ITestResult.SUCCESS) 
    {
        test.pass("Test passed");
    }
    else if (result.getStatus() == ITestResult.SKIP) 
    {
        test.skip("Test skipped");
    }
    driver.quit();
}

@AfterSuite
public void tearDownSuite() 
{
    if (ext != null) 
    {
        ext.flush(); 
    }
}}
