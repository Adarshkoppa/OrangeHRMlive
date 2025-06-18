package Utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ScreenShotUtils {
	
	    public static String takeScreenshot(WebDriver driver, String testName) {
	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String path = "test-output/screenshots/" + testName + "_" + timestamp + ".png";

	        try {
	            FileHandler.copy(src,new File(path));
	        	} 
	        catch (IOException e) 
	        	{
	            e.printStackTrace();
	        	}
	        return path;
	    }
	}

