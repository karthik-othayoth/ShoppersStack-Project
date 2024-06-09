package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsPage extends BasePage{


	// ----------_ WebElements _---------- 
	
	
	@FindBy(xpath="//span[text()='Santoor']")
	private WebElement Santoor_Santoor;
	
	@FindBy(xpath="//span[text()='Girls Casual Polyester Ruffled Top ']")
	private WebElement Cutiekins_GirlsCasualPolyesterRuffledTop;
	
	@FindBy(xpath="//span[text()='Girls Party Rayon Ruffeld Top']")
	private WebElement Niya_GirlsPartyRayonRuffeldTop;
	


	public KidsPage(WebDriver driver) {
		super(driver);
	}
	
	// ----------_ Getters Methods _----------
	
	
	public WebElement getSantoor_Santoor() {
		return Santoor_Santoor;
	}

	public WebElement getCutiekins_GirlsCasualPolyesterRuffledTop() {
		return Cutiekins_GirlsCasualPolyesterRuffledTop;
	}

	public WebElement getNiya_GirlsPartyRayonRuffeldTop() {
		return Niya_GirlsPartyRayonRuffeldTop;
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
