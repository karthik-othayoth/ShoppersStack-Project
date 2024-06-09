package testscripts.login;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic_Library.BaseTest;

public class SSID_Login_005 extends BaseTest {
	
	@Test

	public void Verify_That_User_Can_Successfully_Login_With_Valid_Existing_Credentials() throws InterruptedException {
		
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
		
		//Entering the valid Email
		login_Page.getEmailTextField().sendKeys("testershopperstack999@gmail.com");
		Reporter.log("Entering valid existing Email",true);
		test.log(Status.INFO,"Valid Email is Entered");
		
		//Entering the valid Password
		login_Page.getPasswordTextField().sendKeys("Tester@99");
		Reporter.log("Entering valid existing Password",true);
		test.log(Status.INFO,"Valid Password is Entered");
		
		//Clicking on the Login Button in Login Page
		login_Page.getLoginButton().click();
		Reporter.log("Clicking on the Login Button in Login Page",true);
		test.log(Status.INFO,"Login button from Login Page is Clicked");
		
		Thread.sleep(5000);
		
		//Validating user can submit valid credentials and verifying Test case is Pass or Fail
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.shoppersstack.com/"));
		Reporter.log("Verify that user can successfully login with valid existing credentials || PASS",true);
		
		//Logging message to the Extent Report//
		test.log(Status.PASS,"Verify that user can successfully login with valid existing credentials || PASS");
				
		//Adding the screenshot to the Extent Report//
		test.addScreenCaptureFromPath(utility_Methods.takeScreenshot(driver));
		
		
		
		
		
	}
}
