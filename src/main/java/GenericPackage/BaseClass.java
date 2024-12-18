package GenericPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver=null;
	PropertyFile p = new PropertyFile();
	WebDriverUtility w=new WebDriverUtility();
	public static WebDriver sdriver;
	
	@BeforeSuite
	public void beforeSuiteConfig() {
		Reporter.log("Database connection is started", true);
	}	
	
	@BeforeClass
	public void toLaunchBrowser() throws IOException {		
		String BROWSER = p.toReadDataFromPropertyFile("browser");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();			
		}
		sdriver=driver;
		Reporter.log("Browser is launched",true);
		w.toMaximize(driver);
		Reporter.log("Browser is maximized",true);
		w.wait_tillpageloads(driver);
	}
	
	@BeforeMethod
	public void navigateToURL() throws IOException {
		String URL = p.toReadDataFromPropertyFile("URL");
		driver.get(URL);
		Reporter.log("Browser is navigated to application",true);
	}
	
	@AfterMethod
	public void logoutFromApplication() {
		
	}
	
	@AfterClass
	public void toCloseBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void afterSuiteConfig() {
		Reporter.log("Database connection flushed out or removed", true);
	}
}
