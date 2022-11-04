package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.ScreenShot;

public class Listener extends Baseclass implements ITestListener{
	public void onTestStart(ITestResult result) {
		System.out.println("Test is started"+result.getName());
		
	}
	public void onTestFailure(ITestResult result) {
		try {
			WebDriver driver = null;
			ScreenShot.takeScreenshot(result.getName(),driver);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is Skipped"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is passed"+result.getName());
	}
	
	
	
		
	

}
