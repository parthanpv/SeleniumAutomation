package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Click_Utility;

public class Login_object {

	WebDriver driver;

	@CacheLookup
    @FindBy(xpath="//input[@placeholder='Email Address']")
	WebElement emailaddress;
	@CacheLookup
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[text()=\"Sign In\"]")
	WebElement login;

	public Login_object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	public void loginWithCredantials(String uname, String pswd) {
		emailaddress.sendKeys(uname);
		password.sendKeys(pswd);
		login.click();
	}
}

