package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
    private static ExtentReports ext;

    public static ExtentReports getReportInstance() {
        if (ext == null) {
            ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport1.html");
            spark.config().setDocumentTitle("Automation Report");
            spark.config().setReportName("Testing");
            spark.config().setTheme(Theme.STANDARD);

            ext = new ExtentReports();
            ext.attachReporter(spark);
            ext.setSystemInfo("Tester", "Adarsha");
            ext.setSystemInfo("Environment", "QA");
        }
        return ext;
    }
}
