package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import POM.AddBooksPage;
//import POM.ShoppingCartPage;
import POM.WelcomePage;

public class TC03_ShopCart_test extends BaseClass{
	@Test
	public void shoppingCart() throws EncryptedDocumentException, IOException, InterruptedException {
		WelcomePage w=new WelcomePage(driver);
		AddBooksPage ab=new AddBooksPage(driver);
		//ShoppingCartPage s=new ShoppingCartPage(driver);
		
		w.getAddBooksLink().click();
		ab.getAddBookToCart().click();
		Thread.sleep(2000);
		w.getShoppingCartLink().click();
		/*
		 * s.getBookCheckBox().click(); s.getLaptopCheckBox().click();
		 * s.getCheckoutButton().click();
		 */
	}
}
