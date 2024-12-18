package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Computing and Internet']/../../..//input[@value='Add to cart']")
	private WebElement addBookToCart;

	public WebElement getAddBookToCart() {
		return addBookToCart;
	}
	
	/**
	 * 	@FindBy(xpath="//input[@value='4747239']")
	private WebElement bookCheckBox;	
	@FindBy(xpath="//input[@value='4747262']")
	private WebElement laptopCheckBox;
	@FindBy(id="checkout")
	private WebElement checkoutButton;
	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	public WebElement getBookCheckBox() {
		return bookCheckBox;
	}
	public WebElement getLaptopCheckBox() {
		return laptopCheckBox;
	}
	 */
}
