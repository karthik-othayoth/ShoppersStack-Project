package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
	
	// ----------_ WebElements _---------- 
	
			
			
			@FindBy(xpath = "//button[@id='buynow_fl']")
			private WebElement CartBuyNowButton;
			
			@FindBy(xpath = "//span[text()='Continue Shopping']")
			private WebElement CartContinueShoppingButton;

			

			public CartPage(WebDriver driver) {
				super(driver);
			}
			
			// ----------_ Getters Methods _----------
			
			

			public WebElement getCartBuyNowButton() {
				return CartBuyNowButton;
			}

			public WebElement getCartContinueShoppingButton() {
				return CartContinueShoppingButton;
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
