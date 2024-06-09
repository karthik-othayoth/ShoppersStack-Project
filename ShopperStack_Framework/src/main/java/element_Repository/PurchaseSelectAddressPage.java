package element_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PurchaseSelectAddressPage extends BasePage {

	// ----------_ WebElements _---------- 
	

			
			@FindBy(xpath = "//span[text()='Add New Address']")
			private WebElement PurchaseAddNewAddressButton;
			
			@FindBy(xpath = "//input[@name='address']")
			private List<WebElement> AddressRadioButton;
			
			@FindBy(xpath = "//button[@class='selectaddress_proceed__qiGsK']")
			private WebElement AddressProceedButton;
			

			public PurchaseSelectAddressPage(WebDriver driver) {
				super(driver);
			}
			
			// ----------_ Getters Methods _----------
			


			public WebElement getPurchaseAddNewAddressButton() {
				return PurchaseAddNewAddressButton;
			}

			public List<WebElement> getAddressRadioButton() {
				return AddressRadioButton;
			}

			public WebElement getAddressProceedButton() {
				return AddressProceedButton;
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


