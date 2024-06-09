package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends BasePage {

	// ----------_ WebElements _---------- 
	
		
		@FindBy(xpath ="//a/div[text()='My Profile']")
		private WebElement MyProfileSidebar;
		
		@FindBy(xpath ="//a/div[text()='My Addresses']")
		private WebElement MyAddressesSidebar;

		@FindBy(xpath ="//a/div[text()='My Wallet']")
		private WebElement MyWalletSidebar;
		
		@FindBy(xpath ="//a/div[text()='My Likes']")
		private WebElement MyLikesSidebar;
		
		
		//-----------Edit Profile Popup----------------//
		
		@FindBy(xpath ="//input[@id='First Name']")
		private WebElement EditProfileFirstName;
		
		@FindBy(xpath ="//input[@id='Last Name']")
		private WebElement EditProfileLastName;
		
		@FindBy(xpath ="//input[@placeholder='mm/dd/yyyy']")
		private WebElement EditProfileDateofBirth;
		
		@FindBy(xpath ="//input[@id='Phone Number']")
		private WebElement EditProfilePhoneNumber;
		
		
		@FindBy(xpath ="//select[@id='Country']")
		private WebElement EditProfileCountry;
		
		@FindBy(xpath ="//select[@id='State']")
		private WebElement EditProfileState;
		
		@FindBy(xpath ="//select[@id='City']")
		private WebElement EditProfileCity;

		@FindBy(xpath ="//button[@id='submit']")
		private WebElement EditProfileSubmitButton;
		
		@FindBy(xpath ="//*[name()='svg' and @data-testid='CloseIcon']")
		private WebElement EditProfileCloseButton;
		
		public MyProfilePage(WebDriver driver) {
			super(driver);
		}



		
		// ----------_ Getters Methods _----------
		
		
		public WebElement getMyProfileSidebar() {
			return MyProfileSidebar;
		}



		public WebElement getMyAddressesSidebar() {
			return MyAddressesSidebar;
		}



		public WebElement getMyWalletSidebar() {
			return MyWalletSidebar;
		}



		public WebElement getMyLikesSidebar() {
			return MyLikesSidebar;
		}




		public WebElement getEditProfileFirstName() {
			return EditProfileFirstName;
		}




		public WebElement getEditProfileLastName() {
			return EditProfileLastName;
		}




		public WebElement getEditProfileDateofBirth() {
			return EditProfileDateofBirth;
		}




		public WebElement getEditProfilePhoneNumber() {
			return EditProfilePhoneNumber;
		}




		public WebElement getEditProfileCountry() {
			return EditProfileCountry;
		}




		public WebElement getEditProfileState() {
			return EditProfileState;
		}




		public WebElement getEditProfileCity() {
			return EditProfileCity;
		}




		public WebElement getEditProfileSubmitButton() {
			return EditProfileSubmitButton;
		}




		public WebElement getEditProfileCloseButton() {
			return EditProfileCloseButton;
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
