package pages.rahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class SampleTest{
   
  //Identify Element
  	@FindBy(xpath = "//*[@value='radio1']")
  	WebElement radio1;
  	//Identify Action
    public SampleTest(WebDriver driver) {
		System.out.println("raRadio constructor start");

        PageFactory.initElements(driver, this);
		System.out.println("raRadio constructor end");

    }

    public void clickRadio1() {
		System.out.println("clickRadio1 start");

    	radio1.click();
		System.out.println("clickRadio1 start");

    }

	
	
	
	
}
