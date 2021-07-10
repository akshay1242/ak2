package com.DemoFramework.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrater {
	public static ExtentReports extent;
	
	public static ExtentReports Reports() {
		String ReportPath=System.getProperty("user.dir")+"\\TestReports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("FaceBook Test Report");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("System", "DemoFramework");
		extent.setSystemInfo("ModuleName", "DemoModule");
		extent.setSystemInfo("version", "1.3.2");
		extent.setSystemInfo("QA", "Govind");
		return extent;
	}

}
