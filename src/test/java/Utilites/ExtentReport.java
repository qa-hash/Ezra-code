package Utilites;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Testbase.BaseClass;

public class ExtentReport extends BaseClass implements ITestListener{

	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
		 extent = new ExtentReports();
		sparkreporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/MyExtentReport.html");
		sparkreporter.config().setDocumentTitle("Automation test report");
		sparkreporter.config().setReportName("Asmit Report");
		sparkreporter.config().setTheme(Theme.DARK);
		
	
		extent.attachReporter(sparkreporter);
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS,"Test Case Pass"+ result.getName());
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,"Test Case Failed is:"+result.getName());
		test.log(Status.FAIL,"Test Case Failed :"+result.getThrowable());
		
		try {
			ScreenShot.takescreenshot(driver, "Test Failed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP,"Test Case Skipped is:"+result.getName());
	}


	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
			}

}
