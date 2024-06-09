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
	
	@FindBy(xpath = "//a[@id='home']")
	private WebElement HomeLogo;
	
	@FindBy(xpath="//input[@id='search']")
	private WebElement SearchField;
	
	@FindBy(xpath = "//*[name()='svg' and @id='searchBtn']")
	private WebElement SearchButton;
	
	@FindBy(xpath = "//*[name()='svg' and @id='cartIcon']")
	private WebElement CartIcon;


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
	
	@FindBy(xpath = "//a[@id='kids']")
	private WebElement kidsLink;
	
	@FindBy(xpath = "//a[@id='electronics']")
	private WebElement electronicsLink;
	
	@FindBy(xpath = "//a[@id='beautyProducts']")
	private WebElement beautyLink;
	
	
	@FindBy(xpath = "//a[@id='kidsProd']")
	private WebElement kidsCircle;
	
	@FindBy(xpath = "//a[@id='mensProd']")
	private WebElement mensCircle;
	
	@FindBy(xpath = "//a[@id='womensProd']")
	private WebElement womensCircle;
	
	@FindBy(xpath = "//a[@id='elecronicsProd']")
	private WebElement electronicsCircle;
	
	@FindBy(xpath = "//a[@id='beautyProd']")
	private WebElement beautyCircle;
	
	

	
	
	
	
	

	// ----------_ Getters Methods _----------

	public WebElement getHomeLogo() {
		return HomeLogo;
	}

	public WebElement getSearchField() {
		return SearchField;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getCartIcon() {
		return CartIcon;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMensLinks() {
		return mensLinks;
	}

	public WebElement getWomenLink() {
		return womenLink;
	}

	public WebElement getKidsLink() {
		return kidsLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getBeautyLink() {
		return beautyLink;
	}

	public WebElement getKidsCircle() {
		return kidsCircle;
	}

	public WebElement getMensCircle() {
		return mensCircle;
	}

	public WebElement getWomensCircle() {
		return womensCircle;
	}

	public WebElement getElectronicsCircle() {
		return electronicsCircle;
	}

	public WebElement getBeautyCircle() {
		return beautyCircle;
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
