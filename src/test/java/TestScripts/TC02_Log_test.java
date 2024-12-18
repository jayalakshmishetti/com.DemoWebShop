package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import GenericPackage.ExcelFile;
import POM.LoginPage;
import POM.WelcomePage;

public class TC02_Log_test extends BaseClass{
	@Test
	public void login() throws EncryptedDocumentException, IOException {
		WelcomePage w=new WelcomePage(driver);
		LoginPage l=new LoginPage(driver);
		ExcelFile e=new ExcelFile();
		
		w.getLoginlink().click();
		//l.getEmailTextField().sendKeys(e.toReadDataFromExcelFile("Register", 2, 1));
		//l.getPasswordTextField().sendKeys(e.toReadDataFromExcelFile("Register", 3, 1));
		l.getEmailTextField().sendKeys(e.toReadDataFromExcelFile("Log in", 0, 1));
		l.getPasswordTextField().sendKeys(e.toReadDataFromExcelFile("Log in", 1, 1));
		l.getLoginButton().click();
	}
}
