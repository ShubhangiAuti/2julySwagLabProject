package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath = "//input[@id='user-name']")private WebElement username;
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	@FindBy(xpath = "//input[@id='login-button']")private WebElement login;
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String name) {
		username.sendKeys(name);
		
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
		
	}
	public void ClickOnLogin() {
		login.click();
		
	}



	

}
