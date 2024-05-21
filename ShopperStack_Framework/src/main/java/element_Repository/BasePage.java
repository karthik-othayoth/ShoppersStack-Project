package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Rakesh B
 *
 **/

public class BasePage {

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// ----------_ WebElements _----------

	@FindBy(id = "loginBtn")
	private WebElement loginButton;

	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accountSetting;

	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutButton;

	@FindBy(xpath  = "//a[@id='men']")
	private WebElement mensLinks;

	@FindBy(xpath = "//a[@id='women']")
	private WebElement womenLink;

	// ----------_ Getters Methods _----------

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMensLinks() {
		return mensLinks;
	}

	public WebElement getWomenLink() {
		return womenLink;
	}

	public WebElement getAccountSetting() {
		return accountSetting;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	// ----------_ Business Logics _----------

	public void clickOnLoginButton() {
		getLoginButton().click();
	}

	public void performLogout() {

		getAccountSetting().click();
		getLogoutButton().click();

	}

}
