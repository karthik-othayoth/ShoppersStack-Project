package element_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchasePaymentMethodsPage extends BasePage {

	// ----------_ WebElements _---------- 
	
			

			@FindBy(xpath = "//button[text()='Clear Selection']")
			private WebElement ClearSelectionButton;
			
			//.....DEBIT CARD.......//
			
			@FindBy(xpath = "//h4[text()='Your saved debit cards']/..//input[@name='radio-buttons-group']")
			private List<WebElement> SelectDebitCardButton;
			
			@FindBy(xpath = "//h4[text()='Your saved debit cards']/..//button[text()='Remove Card']")
			private List<WebElement> RemoveDebitCardButton;
			
			//.....CREDIT CARD.......//
			
			@FindBy(xpath = "//h4[text()='Your saved credit cards']/..//input[@name='radio-buttons-group']")
			private List<WebElement> SelectCreditCardButton;
			
			@FindBy(xpath = "//h4[text()='Your saved credit cards']/..//button[text()='Remove Card']")
			private List<WebElement> RemoveCreditCardButton;
			
			
			//.....NET BANKING.......//
			
			@FindBy(xpath = "//input[@value='Net Banking']")
			private WebElement NetBankingButton;
			
			//.....CASH ON DELIVERY.......//
			
			@FindBy(xpath = "//input[@value='COD']")
			private WebElement CashOnDeliveryButton;
			
			
			@FindBy(xpath = "//button[text()='Add Card']")
			private WebElement AddCardButton;
			
			
			//...Add Card Popup...//
			
			@FindBy(xpath = "//div/label[text()='Card  Holder Name']")
			private WebElement CardHolderNameField;
			
			@FindBy(xpath = "//div/label[text()='Card Number']")
			private WebElement CardNumberField;
			
			@FindBy(xpath = "//div/label[text()='PIN']")
			private WebElement PINField;
			
			@FindBy(xpath = "//div/label[text()='Expiry Month']")
			private WebElement ExpiryMonthField;
			
			@FindBy(xpath = "//div/label[text()='Expiry Year']")
			private WebElement ExpiryYearField;
			
			@FindBy(xpath = "//div/label[text()='CVV']")
			private WebElement CVVField;
			
			
			@FindBy(xpath = "//input[@value='DEBIT']")
			private WebElement DebitButton;
			
			@FindBy(xpath = "//input[@value='CREDIT']")
			private WebElement CreditButton;
			
			
			
			@FindBy(xpath = "//button[text()='Proceed']")
			private WebElement PaymentProceedButton;
			
			
			

			public PurchasePaymentMethodsPage(WebDriver driver) {
				super(driver);
			}
			
			// ----------_ Getters Methods _----------
			
			
			public WebElement getClearSelectionButton() {
				return ClearSelectionButton;
			}

			public List<WebElement> getSelectDebitCardButton() {
				return SelectDebitCardButton;
			}

			public List<WebElement> getRemoveDebitCardButton() {
				return RemoveDebitCardButton;
			}

			public List<WebElement> getSelectCreditCardButton() {
				return SelectCreditCardButton;
			}

			public List<WebElement> getRemoveCreditCardButton() {
				return RemoveCreditCardButton;
			}

			public WebElement getNetBankingButton() {
				return NetBankingButton;
			}

			public WebElement getCashOnDeliveryButton() {
				return CashOnDeliveryButton;
			}

			public WebElement getAddCardButton() {
				return AddCardButton;
			}

			public WebElement getCardHolderNameField() {
				return CardHolderNameField;
			}

			public WebElement getCardNumberField() {
				return CardNumberField;
			}

			public WebElement getPINField() {
				return PINField;
			}

			public WebElement getExpiryMonthField() {
				return ExpiryMonthField;
			}

			public WebElement getExpiryYearField() {
				return ExpiryYearField;
			}

			public WebElement getCVVField() {
				return CVVField;
			}

			public WebElement getDebitButton() {
				return DebitButton;
			}

			public WebElement getCreditButton() {
				return CreditButton;
			}

			public WebElement getPaymentProceedButton() {
				return PaymentProceedButton;
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


