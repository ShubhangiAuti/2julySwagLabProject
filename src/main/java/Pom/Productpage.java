package Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Productpage {
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")private WebElement Openmenu;
	@FindBy(xpath ="a[@id='inventory_sidebar_link']")private WebElement allitem ;
	@FindBy(xpath ="//a[@id='about_sidebar_link']")private WebElement about ;
	@FindBy(xpath ="//a[@id='logout_sidebar_link']")private WebElement logout ;
	@FindBy(xpath ="//a[@id='reset_sidebar_link']")private WebElement reset ;
	@FindBy(xpath ="//a[@class='shopping_cart_link']")private WebElement shoppingcart;
	@FindBy(xpath ="////select[@class='product_sort_container']")private WebElement Filterdropdown;
	@FindBy(xpath ="////button[@name='add-to-cart-sauce-labs-backpack']")private List<WebElement> addtocart;
	@FindBy(xpath ="//button[@name='remove-sauce-labs-backpack']")private List<WebElement> remove ;
	@FindBy(xpath ="//a[@href='https://twitter.com/saucelabs']")private WebElement twitter ;
	@FindBy(xpath ="//a[@href='https://www.facebook.com/saucelabs']")private WebElement facebook ;
	@FindBy(xpath ="//a[@href='https://www.linkedin.com/company/sauce-labs/']")private WebElement linkdin ;
	
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnOpenMenu() {
		Openmenu.click();
	}
	public void clickOnAllItem() {
		allitem.click();
	}
	public void ClickOnAbout() {
		about.click();
	}
	public void ClickOnLogout() {
		logout.click();
	}
	public void ClickOnReset() {
		reset.click();
	}
	public void ClickOnShoppingcart() {
		shoppingcart.click();
	}
	public void ClickOnFilterdropdown(String value) {
		Select select=new Select(Filterdropdown);
		select.selectByValue(value);
	}
	public void Addproducttocart(int product) {
		addtocart.get(product);
	}
	public void RemoveproductFromCart(int product) {
		remove.get(product).click();
	}
	public void ClickOnTwitter() {
		twitter.click();
	}
	public void ClickOnFacebook() {
		facebook.click();
	}
	public void ClickOnLnkdin() {
	linkdin.click();
	}
	public boolean isRemoveButtonDisplayes(int product) {
		return remove.get(product).isDisplayed();
	}
	public int getNumberOfAddToCartButton() {
		// TODO Auto-generated method stub
		return addtocart.size();
	}
	public int getNumberOfRemoveButton() {
		// TODO Auto-generated method stub
		return remove.size();
	}
	public void addMultipleProductToCart(int size) {
		// TODO Auto-generated method stub
		for(int i=addtocart.size()-1;i>=0;i--)
		{
			addtocart.get(i).click();
		}
		
	}
	
	
}


	



