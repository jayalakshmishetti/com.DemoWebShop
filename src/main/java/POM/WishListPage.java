package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(id="add-to-wishlist-button-14")
	private WebElement addJewelryToWishList;

	public WebElement getAddJewelryToWishList() {
		return addJewelryToWishList;
	}
	
	
}
