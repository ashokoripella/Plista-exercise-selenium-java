package task.plista.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tas.plists.pageElements.LoginPageElements;
import task.plista.selenium.functions.SeleniumFunctions;

public class LoginPageUtils extends SeleniumFunctions {
	LoginPageElements loginPageElements = PageFactory.initElements(webDriver, LoginPageElements.class);

	public LoginPageUtils(WebDriver driver) {
		this.webDriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectCountry(String pCountry) {
		Select dropdown = new Select(loginPageElements.selectCountry);
		dropdown.selectByVisibleText(pCountry);
		try {
			takeScreenshotAndSave("select_country.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void changeLanguage() {
		loginPageElements.changeLanguage.click();
		try {
			takeScreenshotAndSave("change_language.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectAdvertiser() {
		loginPageElements.advertiser.click();
		try {
			takeScreenshotAndSave("select_Advertiser.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectPublisher() {
		loginPageElements.publisher.click();
		try {
			takeScreenshotAndSave("select_Publisher.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String setEmail(String pEmail) {
		loginPageElements.emailInput.sendKeys(pEmail);
		try {
			takeScreenshotAndSave("enter_Email.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pEmail;
	}

	public String setPassword(String pPassword) {
		loginPageElements.passwordInput.sendKeys(pPassword);
		try {
			takeScreenshotAndSave("enter_password.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pPassword;
	}

	public void loginButton() {
		loginPageElements.loginButton.click();
		try {
			takeScreenshotAndSave("login_Button_result.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
