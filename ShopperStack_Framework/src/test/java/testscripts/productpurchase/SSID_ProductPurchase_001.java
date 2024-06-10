package testscripts.productpurchase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import element_Repository.KidsPage;
import element_Repository.ProductDescriptionPage;
import generic_Library.BaseTest;

public class SSID_ProductPurchase_001 extends BaseTest{
	
	@Test
	
	public void Verify_Clicking_Buy_Now_Without_LoggingIn_Leads_To_Loginpage() throws InterruptedException, IOException  {
		
		//Navigating to Account Settings
		base_Page.getAccountSetting().click();
		Reporter.log("Clicking on Account Setting",true);
		
		//Clicking on Logout Button		
		base_Page.getLogoutButton().click();
		Reporter.log("Clicking on Log out",true);
		
		Thread.sleep(3000);
		
		//Clicking on Kids Section link
		base_Page.getKidsLink().click();
		Reporter.log("Clicking on Kids Section",true);
		test.log(Status.INFO,"Kids section is Displayed");
		
		Thread.sleep(3000);
		
		//Selecting a product from Kids Section
		KidsPage kids_Page = new KidsPage(driver);
		kids_Page.getCutiekins_GirlsCasualPolyesterRuffledTop().click();
		Reporter.log("Clicking on a product from Kids Section",true);
		test.log(Status.INFO,"A Product from Kids section is Selected");
		
		//Clicking on Buy Now Button from Product Description page
		ProductDescriptionPage ProductDescription_Page = new ProductDescriptionPage(driver);
		ProductDescription_Page.getBuyNowButton().click();
		Reporter.log("Clicking on Buy Now from Product Description page without logging in",true);
		test.log(Status.INFO,"Buy Now is clicked");
		
		//Validating the Test Case Pass or Fail
		Assert.assertTrue(driver.getCurrentUrl().contains("signin"));
		Reporter.log("Verify Clicking on Buy Now Without Logging In Leads To Loginpage || PASS",true);
		
		//Logging message to the Extent Report//
		test.log(Status.PASS,"Verify Clicking on Buy Now Without Logging In Leads To Loginpage || PASS");
				
		//Adding the screenshot to the Extent Report//
		test.addScreenCaptureFromPath(utility_Methods.takeScreenshot(driver));
		
		
		
		
		//-----------------Successful closure of Driver----------------//
		
		
	
		login_Page.performLogin(data_Utility.getDataFromProperties(email_Key),data_Utility.getDataFromProperties(password_Key));
		
		
		
		
	}
		
	}
