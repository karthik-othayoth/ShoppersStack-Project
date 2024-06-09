package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenPage extends BasePage{
	
	// ----------_ WebElements _---------- 
	
		@FindBy(xpath="//span[text()='Skinny Men Blue Jeans']")
		private WebElement Levis_SkinnyMenBlueJeans;
		
		@FindBy(xpath="//span[text()='Men Regular Fit Solid Cut Away Coll...']")
		private WebElement Roadster_MenRegularFitSolidCutAwayColl;
		
		@FindBy(xpath="//span[text()='Men Woven Design Silk Blend Straigh...']")
		private WebElement Jompers_MenWovenDesignSilkBlendStraigh;
		
	

		public MenPage(WebDriver driver) {
			super(driver);
		}
		
		// ----------_ Getters Methods _----------
		

		public WebElement getLevis_SkinnyMenBlueJeans() {
			return Levis_SkinnyMenBlueJeans;
		}

		public WebElement getRoadster_MenRegularFitSolidCutAwayColl() {
			return Roadster_MenRegularFitSolidCutAwayColl;
		}

		public WebElement getJompers_MenWovenDesignSilkBlendStraigh() {
			return Jompers_MenWovenDesignSilkBlendStraigh;
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
