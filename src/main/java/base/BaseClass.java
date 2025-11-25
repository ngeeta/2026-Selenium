package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import config.ConfigReader;

public class BaseClass {

	public static WebDriver driver;
	public String browser;

	public String reportPath=System.getProperty("user.dir")+"/reports/reports.html";

	public static ExtentSparkReporter  extentSparkReporter;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
}
