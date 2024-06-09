package testscripts.registration;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import element_Repository.SignupPage;
import generic_Library.BaseTest;

public class SSID_Regi_001 extends BaseTest {
	
	@Test

	public void Verify_User_Is_Able_To_See_The_Signup_Page() throws InterruptedException, IOException   {
		
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
		
		//Clicking on Create Account Button
		login_Page.getCreateAccountButton().click();
		Reporter.log("Clicking on Create Account",true);
		test.log(Status.INFO,"Signup Page is Displayed");
		
		//Validating the Test Case Pass or Fail
		Assert.assertTrue(driver.getCurrentUrl().contains("signup"));
		Reporter.log("Verify_User_Is_Able_To_See_The_Signup_Page || PASS",true);
		
		//Logging message to the Extent Report//
		test.log(Status.PASS,"Verify_User_Is_Able_To_See_The_Signup_Page || PASS");
		
		//Adding the screenshot to the Extent Report//
		test.addScreenCaptureFromPath(utility_Methods.takeScreenshot(driver));
		
		
		//----------------Successful closure of driver---------------//
		
		
		SignupPage signup_Page = new SignupPage(driver);
		
		signup_Page.getHomeLogo().click();
		
		base_Page.getLoginButton().click();
		
		login_Page.performLogin(data_Utility.getDataFromProperties(email_Key),data_Utility.getDataFromProperties(password_Key));
		
		
		
		
		
	
	}
	
	
}
