package SeleniumPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ExDropDown {
	WebDriver driver = new ChromeDriver();
	@Test
	public void dropDown() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement we=driver.findElement(By.id("dropdown-class-example"));
	Select sel=new Select(we);
	sel.selectByValue("option2");
	Thread.sleep(2000);
	}

	@Test
	public void getSelected() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<String> expectedList=new ArrayList<String>(Arrays.asList("Select","Option1","Option2","Option3"));
		List<String> actualList=new ArrayList<String>();
		WebElement we=driver.findElement(By.id("dropdown-class-example"));
		Select sel=new Select(we);
		List<WebElement> allElements=sel.getOptions();
	for(WebElement x:allElements) {
		actualList.add(x.getText());
	}
	System.out.println(actualList);
	Assert.assertEquals(actualList, expectedList);


	}
}
