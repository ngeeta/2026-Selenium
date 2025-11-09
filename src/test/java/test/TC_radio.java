package test;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.*;
import base.BaseClass;
import pages.rahulShetty.raRadio;

@Listeners(PListeners.class)
public class TC_radio extends BaseClass  {
	raRadio rd;
	@Test
	public void radioMeth(Method name) {
		//System.out.println("radioMeth start");
        extentTest=extentReports.createTest(name.getName());
		 rd= new raRadio(driver);
		rd.clickRadio1();
		Assert.assertEquals(false, false);

		//Thread.sleep(2000);
		System.out.println("radioMeth end");
		extentTest.info("radioMeth");
		
	}
	@Test
	public void radioMeth1(Method name) {
		//System.out.println("radioMeth start");
        extentTest=extentReports.createTest(name.getName());
		 rd= new raRadio(driver);
		rd.clickRadio1();
		Assert.assertEquals(false, true);
		//Thread.sleep(2000);
		System.out.println("radioMeth1 end");
		extentTest.info("radioMeth1");

		
		
	}
}
