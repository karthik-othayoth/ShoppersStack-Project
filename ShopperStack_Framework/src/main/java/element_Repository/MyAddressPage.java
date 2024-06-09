package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAddressPage extends BasePage {
	
	// ----------_ WebElements _---------- 
	
			// SideBar //

			@FindBy(xpath ="//a/div[text()='My Profile']")
			private WebElement MyProfileSidebar;
			
			@FindBy(xpath ="//a/div[text()='My Addresses']")
			private WebElement MyAddressesSidebar;

			@FindBy(xpath ="//a/div[text()='My Wallet']")
			private WebElement MyWalletSidebar;
			
			@FindBy(xpath ="//a/div[text()='My Likes']")
			private WebElement MyLikesSidebar;
			
			//ADD - EDIT - DELETE Address //
			
			@FindBy(xpath ="//button[contains(text(),'Add Address')]")
			private WebElement AddAddressButton;
			
			@FindBy(xpath = "//*[name()='svg' and @id='editaddress_fl']")
			private WebElement EditAddressButton;
			
			@FindBy(xpath = "//*[name()='svg' and @data-testid='DeleteIcon']")
			private WebElement DeleteAddressButton;
			
			@FindBy(xpath = "//*[name()='svg' and @data-testid='AddPhotoAlternateOutlinedIcon']")
			private WebElement AddPhotoButton;
			
			

			public MyAddressPage(WebDriver driver) {
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

			public WebElement getAddAddressButton() {
				return AddAddressButton;
			}

			public WebElement getEditAddressButton() {
				return EditAddressButton;
			}

			public WebElement getDeleteAddressButton() {
				return DeleteAddressButton;
			}

			public WebElement getAddPhotoButton() {
				return AddPhotoButton;
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



