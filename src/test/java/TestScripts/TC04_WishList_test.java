package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import POM.AddJewelryPage;
//import POM.ShoppingCartPage;
import POM.WelcomePage;
import POM.WishListPage;

public class TC04_WishList_test extends BaseClass{
	@Test
	public void wishList() throws EncryptedDocumentException, IOException, InterruptedException {
		WelcomePage w=new WelcomePage(driver);
		AddJewelryPage a=new AddJewelryPage(driver);
		WishListPage ws=new WishListPage(driver);
		
		w.getAddJewelryLink().click();
		Thread.sleep(2000);
		a.getGoToJewelryDetailPage().click();		
		Thread.sleep(2000);
		ws.getAddJewelryToWishList().click();
		Thread.sleep(2000);
		w.getWishListCartlink().click();
		Thread.sleep(5000);
	}
}
