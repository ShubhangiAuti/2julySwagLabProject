package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	@FindBy (xpath ="//input[@id='first-name']")private WebElement firstname;
	@FindBy (xpath ="//input[@id='last-name']")private WebElement lastname;
	@FindBy (xpath ="//input[@id='postal-code']")private WebElement postalcoad;
	@FindBy (xpath ="//input[@id='continue']")private WebElement Continue;
	@FindBy (xpath ="//button[@id='cancel']")private WebElement cancle;
	public Checkout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterfirstname(String name) {
		firstname.sendKeys(name);
		
	}
	public void enterlastname(String name) {
		lastname.sendKeys(name);
		
	}
	public void enterpostalcoad() {
		postalcoad.sendKeys();
		
	}
	public void ClickOnContinue() {
		Continue.click();
	}
	public void ClickOncancle() {
		cancle.click();
	}
	
}
