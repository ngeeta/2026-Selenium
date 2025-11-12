package test;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.*;
import base.BaseClass;
import pages.rahulShetty.SampleTest;

//@Listeners(PListeners.class)
public class TC_sampleTest extends BaseClass {
	SampleTest rd;

SoftAssert soft=new SoftAssert();
	@Test
	public void radioMeth1(Method name) {
		rd = new SampleTest(driver);
		extentTest = extentReports.createTest(name.getName());
		rd.clickRadio1();
		Assert.assertEquals(false, false);
		// Thread.sleep(2000);
		extentTest.info("radioMeth");

	}

	@Test
	public void radioMeth2(Method name) {
		rd = new SampleTest(driver);

		extentTest = extentReports.createTest("Fail wala test");
		rd.clickRadio1();

		
Assert.fail();

	}
	@Test
    public void radioMeth3() {
		rd = new SampleTest(driver);

		extentTest = extentReports.createTest("Skipwala test");
		rd.clickRadio1();

		System.out.println("skip");
		extentTest.info("testSkip");
        throw new SkipException("Skipping this test due to business logic.");
    }

}
