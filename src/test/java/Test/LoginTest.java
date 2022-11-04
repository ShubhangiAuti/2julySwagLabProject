package Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Pojo.Browser;
import Pom.Loginpage;
import utility.Baseclass;
import utility.Report;
import utility.parameterzation;

@Test
@Listeners(utility.Listener.class)

public class LoginTest extends Baseclass {
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void configureReports() {
		reports=Report.addReports();
	}
	@BeforeMethod
	public void lunchBrowser() {
		 driver = Browser.OpenBrowser();
	}
	@DataProvider(name = "LoginData")
	public Object[][]data()throws EncryptedDocumentException,IOException{
	String password=parameterzation.getData("Credentials",1,1);
	return new Object[][] {{parameterzation.getData("Credentials",1,0),password},{parameterzation.getData("Credentials",2,0),password}};

}
	@Test(dataProvider="LoginData")
	public void LoginTestWithValidCredentials(String user,String pass) {
		test =reports.createTest("LoginTestWithValidCredentials");
		Loginpage Loginpage=new Loginpage(driver);
		Loginpage.enterUsername(user);
		Loginpage.enterPassword(pass);
		Loginpage.ClickOnLogin();
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	}
	@AfterMethod
	public void getTestResults(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}else
		{
			test.log(Status.SKIP,result.getName());
		}
			
		}
	@AfterTest
	public void publicisResult() {
		reports.flush();
	}
	
	}
	
