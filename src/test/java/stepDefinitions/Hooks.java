package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import config.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
    ConfigReader config = new ConfigReader();

    @Before
    public void setUp() {
        browser = config.get("browser");
       driver=new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
