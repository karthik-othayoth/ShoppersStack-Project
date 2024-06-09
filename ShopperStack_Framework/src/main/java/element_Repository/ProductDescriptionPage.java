package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends BasePage{

	// ----------_ WebElements _---------- 
	
			
			@FindBy(xpath="//div[@class='ProductDisplay_productBrand__Hnnuq']/h2[1]")
			private WebElement BrandName;
			
			@FindBy(xpath="//div[@class='ProductDisplay_productTitle__YEh+F']/h4[1]")
			private WebElement ProuductName;
	
			@FindBy(xpath="//p[@class='CalculateOffer_wrapper__2XD4R']/span[1]")
			private WebElement Price;
			
			@FindBy(xpath="//p[@class='CalculateOffer_wrapper__2XD4R']/span[2]")
			private WebElement PriceWithoutDiscount;
			
			@FindBy(xpath="//p[@class='CalculateOffer_wrapper__2XD4R']/span[3]")
			private WebElement Discount;
			
			@FindBy(xpath="//button[@id='Buy Now']")
			private WebElement BuyNowButton;
			
			@FindBy(xpath="//button[@id='Add To Cart']")
			private WebElement AddToCartButton;
			
			@FindBy(xpath="//input[@id='Check Delivery']")
			private WebElement CheckDeliveryField;
			
			@FindBy(xpath="//button[@id='Check']")
			private WebElement CheckDeliveryButton;
			
			@FindBy(xpath="//button[@aria-label='find my pincode']")
			private WebElement FindMyPincodeButton;
			
			

			

			public ProductDescriptionPage(WebDriver driver) {
				super(driver);
			}
			
			// ----------_ Getters Methods _----------
			
		

			public WebElement getBrandName() {
				return BrandName;
			}

			public WebElement getProuductName() {
				return ProuductName;
			}

			public WebElement getPrice() {
				return Price;
			}

			public WebElement getPriceWithoutDiscount() {
				return PriceWithoutDiscount;
			}

			public WebElement getDiscount() {
				return Discount;
			}

			public WebElement getBuyNowButton() {
				return BuyNowButton;
			}

			public WebElement getAddToCartButton() {
				return AddToCartButton;
			}

			public WebElement getCheckDeliveryField() {
				return CheckDeliveryField;
			}

			public WebElement getCheckDeliveryButton() {
				return CheckDeliveryButton;
			}

			public WebElement getFindMyPincodeButton() {
				return FindMyPincodeButton;
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


