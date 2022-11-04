package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	public static ExtentReports addReports() {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("extentrport.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlReport);
		reports.setSystemInfo("Type", "Regression");
		return reports;
	}

		

}
