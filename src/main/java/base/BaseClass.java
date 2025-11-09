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
	//- Its constructor or static blocks run as soon as the object is created  before 
	ConfigReader readConfig = new ConfigReader();
	//public String raUrl = readConfig.get("raUrl");
	//public String browser = readConfig.get("chrome");
	String browser;
	public String reportPath=System.getProperty("user.dir")+"/reports/reports.html";
	public static ExtentSparkReporter  extentSparkReporter;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;

   @BeforeMethod
   public void setUp() {
	   System.out.println("----BeforeStep setUp start----");
	 //  System.out.println("----raUrl----"+raUrl);

       browser = ConfigReader.get("browser");
       if (browser.equalsIgnoreCase("chrome")) {
           driver = new ChromeDriver();
       }
       else if (browser.equalsIgnoreCase("edge")) {
           driver = new EdgeDriver();
	}
       else if (browser.equalsIgnoreCase("firefox")) {
           driver = new FirefoxDriver();
	}
       
       driver.manage().window().maximize();
      driver.get(ConfigReader.get("raUrl"));
	   System.out.println("----BeforeStep setUp end----");

   }

   @AfterMethod
   public void tearDown() {
       driver.quit();
   }

}
