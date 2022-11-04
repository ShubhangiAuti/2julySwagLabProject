package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Pojo.Browser;
import Pom.Loginpage;
import Pom.Productpage;
import utility.Baseclass;
import utility.Report;
import utility.parameterzation;

public class VerifyAddToCartButton extends Baseclass {
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
	@Test
	public void VerifyAddToCartButton() throws EncryptedDocumentException, IOException {
		test =reports.createTest("VerifyAddToCartButton");
		Loginpage Loginpage = new Loginpage(driver);
		Loginpage.enterUsername(parameterzation.getData("Credentials", 1, 0));
		Loginpage.enterPassword(parameterzation.getData("Credentials", 1, 1));
		Loginpage.ClickOnLogin();
		Productpage Productpage=new Productpage(driver);
		Productpage.Addproducttocart(0);
		Assert.assertTrue(Productpage.isRemoveButtonDisplayes(0));
		
	}
	@Test
	public void VerifyAddMultipleProductToCart() throws EncryptedDocumentException, IOException {
		test = reports.createTest("VerifyAddMultipleProductToCart");
		Loginpage Loginpage = new Loginpage(driver);
		Loginpage.enterUsername(parameterzation.getData("Credentials", 1, 0));
		Loginpage.enterPassword(parameterzation.getData("Credentials", 1, 1));
		Loginpage.ClickOnLogin();
		Productpage Productpage=new Productpage(driver);
		int addToCart=Productpage.getNumberOfAddToCartButton();
		Productpage.addMultipleProductToCart(addToCart);
		Assert.assertEquals(Productpage.getNumberOfRemoveButton(),addToCart);
		
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


