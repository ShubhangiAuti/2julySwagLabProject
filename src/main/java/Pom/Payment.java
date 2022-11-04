package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	@FindBy(xpath = "//div[@class='summary_info_label'][1]")WebElement payment;
	@FindBy(xpath = "//div[@class='summary_info_label'][2]")WebElement Shipping;
	@FindBy(xpath = "//button[@id='cancel']")WebElement cancle;
	@FindBy(xpath = "//button[@id='finish']")private WebElement finish;
	public Payment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnPayment() {
		payment.click();
	}
	public void ClickOnShipping() {
		Shipping.click();
	}
	public void ClickOnCancle() {
		cancle.click();
	}
	public void ClickOnfinish() {
		finish.click();
	}

}
