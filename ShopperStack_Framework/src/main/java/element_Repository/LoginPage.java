package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
*
* @author Rakesh B
*
**/

public class LoginPage extends BasePage {

	// ----------_ WebElements _---------- 
	
	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Create Account']")
	private WebElement createAccountButton;
	
	@FindBy(id="Forgot Password?")
	private WebElement forgotPassword;

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	// ----------_ Getters Methods _----------
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	// ----------_ Business Logics _----------
	/**
	 * 
	 * @param email
	 * @param password
	 * 
	 * This method is used to perform logic.
	 * 
	 */

	public void performLogin(String email, String password) {
		getEmailTextField().sendKeys(email);
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
	}
}