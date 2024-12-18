package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import GenericPackage.ExcelFile;
import POM.RegisterPage;
import POM.WelcomePage;
@Listeners(GenericPackage.ITestListenerClass.class) //to print register--start & register--failure in console

public class TC01_Reg_test extends BaseClass {
	@Test
	public void register() throws EncryptedDocumentException, IOException {
		WelcomePage w=new WelcomePage(driver);
		RegisterPage r=new RegisterPage(driver);
		ExcelFile e=new ExcelFile();
		
		w.getRegisterlink().click();
		r.getFirstNameTextField().sendKeys(e.toReadDataFromExcelFile("Register", 0, 1));
		r.getLastNameTextField().sendKeys(e.toReadDataFromExcelFile("Register", 1, 1));
		r.getEmailTextField().sendKeys(e.toReadDataFromExcelFile("Register", 2, 1));
		r.getPasswordTextField().sendKeys(e.toReadDataFromExcelFile("Register", 3, 1));
		r.getConfirmPasswordTextField().sendKeys(e.toReadDataFromExcelFile("Register",4, 1));
		Assert.fail(); //to take screenshots
		r.getRegisterButton().click();
	}
}
