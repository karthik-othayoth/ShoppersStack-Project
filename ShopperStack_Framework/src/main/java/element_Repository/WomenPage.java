package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends BasePage{
	
	
	// ----------_ WebElements _---------- 
	
	
	@FindBy(xpath="//span[text()='FOREVER 21  Casual Regular Sleeves ...']")
	private WebElement Forever21_FOREVER21CasualRegularSleeves;
	
	@FindBy(xpath="//span[text()='Fashion2wear ']")
	private WebElement Fashion2wear_Fashion2wear;
	
	@FindBy(xpath="//span[text()='Women Printed Cotton Blend Anarkali...']")
	private WebElement Skyasia_WomenPrintedCottonBlendAnarkali;
	


	public WomenPage(WebDriver driver) {
		super(driver);
	}
	
	// ----------_ Getters Methods _----------
	
	
	public WebElement getForever21_FOREVER21CasualRegularSleeves() {
		return Forever21_FOREVER21CasualRegularSleeves;
	}

	public WebElement getFashion2wear_Fashion2wear() {
		return Fashion2wear_Fashion2wear;
	}

	public WebElement getSkyasia_WomenPrintedCottonBlendAnarkali() {
		return Skyasia_WomenPrintedCottonBlendAnarkali;
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
