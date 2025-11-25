package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import config.ConfigReader;
import io.cucumber.java.en.*;
import pages.rahulShetty.SampleTest;

public class SampleSteps extends BaseClass {
    SampleTest sample;
	ConfigReader readConfig = new ConfigReader();

    @Given("I launch the application")
    public void i_launch_the_application() throws InterruptedException {
    	driver=new ChromeDriver();
    	driver.get(readConfig.get("raUrl"));        
    }

    @When("I click on radio button 1")
    public void i_click_on_radio_button_1() throws InterruptedException {
    	if (sample == null) {
            sample = new SampleTest(driver);
        }
        sample.clickRadio1();

    }

    @Then("radio button 1 should be selected")
    public void radio_button_1_should_be_selected() {
        // Add validation logic if needed
    }
}
