package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {
	
	// ----------_ WebElements _---------- 
	
			@FindBy(xpath ="//input[@id='email']")
			private WebElement EmailFieldForgotPassword;
			
			@FindBy(xpath ="//button[text()='Proceed']")
			private WebElement ProceedForgotPassword;
			
			@FindBy(xpath ="//button[text()='send Reset link for ']")
			private WebElement SendResetLinkForgotPassword;
			

			

			public ForgotPasswordPage(WebDriver driver) {
				super(driver);
			}
			
			// ----------_ Getters Methods _----------
			
			
			public WebElement getEmailFieldForgotPassword() {
				return EmailFieldForgotPassword;
			}

			public WebElement getProceedForgotPassword() {
				return ProceedForgotPassword;
			}

			public WebElement getSendResetLinkForgotPassword() {
				return SendResetLinkForgotPassword;
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
