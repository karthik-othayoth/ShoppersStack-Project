package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BeautyPage extends BasePage{

	// ----------_ WebElements _---------- 
	
	
			@FindBy(xpath="//span[text()='Lakme Forever Matte Lipstick']")
			private WebElement Lakme_LakmeForeverMatteLipstick;
			
			@FindBy(xpath="//span[text()='Jaquline USA  Flirty Lips Matty Mat...']")
			private WebElement Jaquilineusa_JaqulineUSAFlirtyLipsMattyMat;
			
			@FindBy(xpath="//span[text()='blushis Liquid Matte Lipsticks Combo']")
			private WebElement Blushis_blushisLiquidMatteLipsticksCombo;
			


			public BeautyPage(WebDriver driver) {
				super(driver);
			}
			
			// ----------_ Getters Methods _----------
			
		

			public WebElement getLakme_LakmeForeverMatteLipstick() {
				return Lakme_LakmeForeverMatteLipstick;
			}

			public WebElement getJaquilineusa_JaqulineUSAFlirtyLipsMattyMat() {
				return Jaquilineusa_JaqulineUSAFlirtyLipsMattyMat;
			}

			public WebElement getBlushis_blushisLiquidMatteLipsticksCombo() {
				return Blushis_blushisLiquidMatteLipsticksCombo;
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
