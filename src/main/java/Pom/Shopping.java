package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping {
	@FindBy(xpath ="//button[@class='btn btn_secondary back btn_medium']")private WebElement continueshopping;
	@FindBy(xpath ="//button[@id='checkout']")private WebElement checkout;
	@FindBy(xpath="//div[@class='inventory_item_name']")WebElement itemname;
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")WebElement remove;
	public Shopping(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOncontinueshopping() {
		continueshopping.click();
	}
	public void ClickOncheckout() {
		checkout.click();
	}
	public void ClickOnItemname() {
		itemname.click();
	}
	public void ClickOnRemove() {
		remove.click();
	}

}
