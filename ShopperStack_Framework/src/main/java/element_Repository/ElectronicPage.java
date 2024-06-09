package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicPage extends BasePage{
	
	
	// ----------_ WebElements _---------- 
	
	
		@FindBy(xpath="//span[text()='APPLE iPhone 14 Pro']")
		private WebElement Apple_APPLEiPhone14Pro;
		
		@FindBy(xpath="//span[text()='HP Envy x360 Ryzen 5 Hexa Core 5600U']")
		private WebElement Hp_HPEnvyx360Ryzen5HexaCore5600U;
		
		@FindBy(xpath="//span[text()='APPLE 2021 Macbook Pro M1 Max']")
		private WebElement Apple_APPLE2021MacbookProM1Max;
		


		public ElectronicPage(WebDriver driver) {
			super(driver);
		}
		
		// ----------_ Getters Methods _----------
		
		

		public WebElement getApple_APPLEiPhone14Pro() {
			return Apple_APPLEiPhone14Pro;
		}

		public WebElement getHp_HPEnvyx360Ryzen5HexaCore5600U() {
			return Hp_HPEnvyx360Ryzen5HexaCore5600U;
		}

		public WebElement getApple_APPLE2021MacbookProM1Max() {
			return Apple_APPLE2021MacbookProM1Max;
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
