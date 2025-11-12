package utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import base.BaseClass;
import config.ConfigReader;

public class PISuiteListener extends BaseClass implements ISuiteListener  {
	ConfigReader readConfig = new ConfigReader();
@Override
public void onStart(ISuite suite) {
	System.out.println("------ISuiteListener -Start----------");

       browser = readConfig.get("browser");
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
      driver.get(readConfig.get("raUrl"));
}

@Override
	public void onFinish(ISuite suite) {
	  driver.quit();
	System.out.println("------ISuiteListener - Finish----------");

	}
}
