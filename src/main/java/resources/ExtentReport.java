package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	static ExtentReports extent;  //made this static so we don't have to create an object in Listener class
	
	public static ExtentReports getExtentReport()
	{
	
	String path = System.getProperty("user.dir")+"\\extent-report\\index.html";
	
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setDocumentTitle("CleanBee Tests");
	reporter.config().setReportName("CleanBee Automation Results");
	
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Harmilap Sandhu");
	return extent;
	}
}
