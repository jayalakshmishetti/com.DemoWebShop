package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBooksPage {
	public AddBooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//a[text()='Computing and Internet']/../../..//input[@value='Add to cart']")
	private WebElement addBookToCart;
	
	
	public WebElement getAddBookToCart() {
		return addBookToCart;
	}
	
}
