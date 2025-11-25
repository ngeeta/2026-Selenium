package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseClass;

public class PITestListener extends BaseClass implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("---- ITestListener onStart ----");

		// when made public then can see ref of extent
		extentSparkReporter = new ExtentSparkReporter(reportPath);
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentSparkReporter.config().setReportName("Report-Sample");
		extentSparkReporter.config().setDocumentTitle("Document Title Automation Report");

	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("---- ITestListener -onTestStart ----");
		extentTest=extentReports.createTest(result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("---- ITestListener -onTestSuccess ----");
		extentTest.log(Status.PASS,
				MarkupHelper.createLabel("Test is passed : " + result.getName(), ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, MarkupHelper.createLabel("Test is Failed : " + result.getName(), ExtentColor.RED));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshot/" + result.getName() + ".png";
		try {
			FileUtils.copyFile(src, new File(path));
		} catch (Exception e) {
			// TODO: handle exception
		}

		extentTest.addScreenCaptureFromPath(path);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("---- ITestListener-skip ----");
		extentTest.log(Status.SKIP, MarkupHelper.createLabel("Test is Skip : " + result.getName(), ExtentColor.ORANGE));

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("---- ITestListener-onFinish ----");
		extentReports.flush();
	}

}
