package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage { 
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Register")
	private WebElement registerlink;
	public WebElement getRegisterlink() {
		return registerlink;
	}

	@FindBy(linkText="Log in")
	private WebElement loginlink;
	public WebElement getLoginlink() {
		return loginlink;
	}
	
	@FindBy(linkText="Shopping cart")
	private WebElement shoppingCartLink;	
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	
	@FindBy(partialLinkText="BOOKS")
	private WebElement addBooksLink;
	public WebElement getAddBooksLink() {
		return addBooksLink;
	}
	
	@FindBy(partialLinkText="Jewelry")
	private WebElement addJewelryLink;
	public WebElement getAddJewelryLink() {
		return addJewelryLink;
	}
	
	@FindBy(linkText="Wishlist")
	private WebElement wishListCartlink;
	public WebElement getWishListCartlink() {
		return wishListCartlink;
	}
}
