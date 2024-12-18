package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddJewelryPage {
	public AddJewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='product-item' and @data-productid='14']")
	private WebElement goToJewelryDetailPage;

	public WebElement getGoToJewelryDetailPage() {
		return goToJewelryDetailPage;
	}
	
}
