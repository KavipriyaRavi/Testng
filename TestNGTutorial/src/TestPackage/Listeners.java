package TestPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		
	}
public void onTestSuccess(ITestResult result) {
		
	}
public void onTestFailure(ITestResult result) {
	System.out.println("SKIPPED" +result.getName());
}
public void onTestSkipped(ITestResult result) {
	
}
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
}
public void onStart(ITestResult result) {
	
}
public void onFinish(ITestResult result) {
	
}

}
