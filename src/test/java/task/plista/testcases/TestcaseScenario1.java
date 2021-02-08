package task.plista.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tas.plists.pageElements.LoginPageElements;
import task.plista.selenium.functions.SeleniumFunctions;
import task.plista.utils.LoginPageUtils;


public class TestcaseScenario1 extends SeleniumFunctions {
	@BeforeClass
	public void testSetUp() {
		openBrowser("chrome");
		readDataFromCSV();
	}
	@Test
	public void automationTask() throws Exception {

		webDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		LoginPageElements loginPagelements = PageFactory.initElements(webDriver, LoginPageElements.class);
		LoginPageUtils loginPage = new LoginPageUtils(webDriver);
		//change country
		loginPage.selectCountry(expectedDataMap.get("Country1"));
		Thread.sleep(6000);
		loginPage.selectAdvertiser();
		//Send email
		loginPage.setEmail(expectedDataMap.get("Email"));
		loginPage.setPassword(expectedDataMap.get("Password"));
		//click Login Button 
		loginPage.loginButton();
	
	}
	@AfterClass
	public void tearDown() {
		if (webDriver != null) {
			webDriver.quit();
		}
		System.out.println("screenshots location is " + System.getProperty("user.dir"));
	}
}