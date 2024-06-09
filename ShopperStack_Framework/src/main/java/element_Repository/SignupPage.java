package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {
	// ----------_ WebElements _---------- 
	

		@FindBy(xpath ="//a[@id='signIn']")
		private WebElement SigninLink;
		
		@FindBy(xpath ="//input[@id='First Name']")
		private WebElement FirstnameField;
		
		@FindBy(xpath ="//input[@id='Last Name']")
		private WebElement LastnameField;
		
		@FindBy(xpath ="//input[@id='Female']")
		private WebElement FemaleradioButton;
		
		@FindBy(xpath ="//input[@id='Male']")
		private WebElement MaleradioButton;
		
		@FindBy(xpath ="//input[@id='Other']")
		private WebElement OtherradioButton;
		
		
		@FindBy(xpath ="//input[@id='Phone Number']")
		private WebElement PhonenumberField;
		
		@FindBy(xpath ="//input[@id='Email Address']")
		private WebElement EmailaddressField;
		
		@FindBy(xpath ="//input[@id='Password']")
		private WebElement PasswordField;
		
		@FindBy(xpath ="//p[@id='password-error']")
		private WebElement PasswordError;
		
		@FindBy(xpath ="//input[@id='Confirm Password']")
		private WebElement ConfirmpasswordField;
		
		@FindBy(xpath ="//input[@id='Terms and Conditions']")
		private WebElement TermsandconditionsCheckbox;
		
		@FindBy(xpath ="//a[@id='T&C']")
		private WebElement TermsandconditionsLink;
		
		@FindBy(xpath ="//button[@id='Register']")
		private WebElement RegisterButton;
		
			             

		public SignupPage(WebDriver driver) {
			super(driver);
		}
		
		// ----------_ Getters Methods _----------
		

		
		public WebElement getSigninLink() {
			return SigninLink;
		}

		public WebElement getFirstnameField() {
			return FirstnameField;
		}

		public WebElement getLastnameField() {
			return LastnameField;
		}

		public WebElement getFemaleradioButton() {
			return FemaleradioButton;
		}

		public WebElement getMaleradioButton() {
			return MaleradioButton;
		}

		public WebElement getOtherradioButton() {
			return OtherradioButton;
		}

		public WebElement getPhonenumberField() {
			return PhonenumberField;
		}

		public WebElement getEmailaddressField() {
			return EmailaddressField;
		}

		public WebElement getPasswordField() {
			return PasswordField;
		}

		public WebElement getPasswordError() {
			return PasswordError;
		}

		public WebElement getConfirmpasswordField() {
			return ConfirmpasswordField;
		}

		public WebElement getTermsandconditionsCheckbox() {
			return TermsandconditionsCheckbox;
		}

		public WebElement getTermsandconditionsLink() {
			return TermsandconditionsLink;
		}

		


		public WebElement getRegisterButton() {
			return RegisterButton;
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

	
		}

