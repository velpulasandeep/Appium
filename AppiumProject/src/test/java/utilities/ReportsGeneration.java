package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportsGeneration {

	public static ExtentReports reports1( ) {
	String path="./reports/index.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("Appium results");
	reporter.config().setDocumentTitle("Appium Project");
	
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("tester", "sandeep");
	return extent;
}
}
