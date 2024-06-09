package testscripts.forgotpassword;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import element_Repository.ForgotPasswordPage;
import generic_Library.BaseTest;

public class SSID_Forgot_004 extends BaseTest{
	
	@Test
	
	public void Verify_That_Reset_Link_Sent_To_User_Email_After_Clicking_Send_Reset_Link() throws InterruptedException, IOException {
		
		//Navigating to Account Settings
		base_Page.getAccountSetting().click();
		Reporter.log("Clicking on Account Setting",true);
		
		//Clicking on Logout Button		
		base_Page.getLogoutButton().click();
		Reporter.log("Clicking on Log out",true);
		
		//Clicking on Login Button from Homepage
		base_Page.getLoginButton().click();
		Reporter.log("Clicking on Login from Homepage",true);
		test.log(Status.INFO,"Login Page is Displayed");
		
		//Clicking on Forgot Password from Login Page
		login_Page.getForgotPassword().click();
		Reporter.log("Clicking on Forgot Password from Login Page",true);
		test.log(Status.INFO,"Forgot Password Page is Displayed");
		
		//Entering the valid Email to reset password
		ForgotPasswordPage forgotpassword_Page = new ForgotPasswordPage(driver);
		forgotpassword_Page.getEmailFieldForgotPassword().sendKeys("testautomater2024@gmail.com");
		Reporter.log("Entering the Email to Reset Password",true);
		test.log(Status.INFO,"Valid Email is entered");
		
		//Clicking on the Proceed button from Forgot Password
		forgotpassword_Page.getProceedForgotPassword().click();
		Reporter.log("Clicking on Proceed Button",true);
		test.log(Status.INFO,"Forgot Password Page with Send Reset Link is Displayed");
		
		//Clicking on the Send Reset Link
		forgotpassword_Page.getSendResetLinkForgotPassword().click();
		Reporter.log("Clicking on Send Reset Link for Shopper",true);
		test.log(Status.INFO,"Send Reset Link for Shopper is submitted");
		
		Thread.sleep(5000);
		
		//Validating the Test Case Pass or Fail
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.shoppersstack.com/"));
		Reporter.log("Verify that Password Reset Link is Sent to User Email after clicking on Send Reset Link || PASS",true);
		
		//Logging message to the Extent Report//
		test.log(Status.PASS,"Verify that Password Reset Link is Sent to User Email after clicking on Send Reset Link || PASS");
				
		//Adding the screenshot to the Extent Report//
		test.addScreenCaptureFromPath(utility_Methods.takeScreenshot(driver));
		
		
		
		
		//---------------Successful closure of driver--------------//
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
				
		base_Page.getLoginButton().click();
				
		login_Page.performLogin(data_Utility.getDataFromProperties(email_Key),data_Utility.getDataFromProperties(password_Key));
				
				
		
		
		
		
	}
}
