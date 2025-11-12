package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class PIRetryAnalyzer implements IRetryAnalyzer {

	int count=0;
	int retryCount=2;
	@Override
	public boolean retry(ITestResult result) {
		System.out.println("retried");
		while(count<retryCount) {
			count++;
			return true;

		}
				return false;
			
	}
	



	

}
