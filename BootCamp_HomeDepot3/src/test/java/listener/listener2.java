package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener2 implements ITestListener {
	
	public void onStart(ITestContext context)
	{
		System.out.println("Test got start");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test got pass");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test got fail");
	}
	public void onTestStart(ITestResult result) {
		System.out.println("This is on teststart");
	}
}
