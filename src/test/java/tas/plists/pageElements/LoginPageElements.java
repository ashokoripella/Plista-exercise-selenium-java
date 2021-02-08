package tas.plists.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {

	//**Language options
		@FindBy(xpath = "//input[@type='checkbox']")
		public WebElement changeLanguage;
	//**drop-down box to select country	
		@FindBy(xpath = "//select[@id='login_select-country']")
		public WebElement selectCountry;
	//**Advertiser	account type
		@FindBy(xpath = "//label[contains(text(),'Advertiser')]")
		public WebElement advertiser;
	//**Publisher Account type
		@FindBy(xpath = "//label[contains(text(),'Publisher')]")
		public WebElement publisher;
	//**Email Input	
		@FindBy(xpath = "//input[@id='login_input-email']")
		public WebElement emailInput;
	//**Password Input	
		@FindBy(xpath = "//input[@id='login_input-password']")
		public WebElement passwordInput;
	//** Login Button submission
		@FindBy(xpath = "//button[@id='login_button-login']")
		public WebElement loginButton;
		
		
}
