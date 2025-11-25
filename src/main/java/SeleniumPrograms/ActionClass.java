package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class ActionClass {
	WebDriver driver;
	Actions act ;
	@BeforeMethod
	public void launch() {
		 driver = new ChromeDriver();

	}
	
	@AfterMethod
	public void quitB() {
		driver.quit();
	}
	@Test
	public void mouseEvent() {
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 act = new Actions(driver);

		WebElement src = driver.findElement(By.xpath("//*[@id='box4' and @class='dragableBox']"));
		WebElement desc = driver.findElement(By.xpath("//*[text()='United States']"));
		act.dragAndDrop(src, desc).perform();
	}
	
	@Test
	public void keyBoardEvent() {
		
	}
}
