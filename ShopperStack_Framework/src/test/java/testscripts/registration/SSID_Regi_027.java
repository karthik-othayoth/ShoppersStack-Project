package testscripts.registration;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import element_Repository.SignupPage;
import generic_Library.BaseTest;

public class SSID_Regi_027 extends BaseTest{

	@Test
	public void Verify_That_User_Is_Able_To_Enter_Valid_Password() throws IOException, InterruptedException {
		
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
		
		//Clicking on the Password Field
		SignupPage signup_Page = new SignupPage(driver);
		signup_Page.getPasswordField().click();
		Reporter.log("Clicking on Password field",true);
		test.log(Status.INFO,"Password Field is Activated");
		
		//Entering the Password in Password Field
		signup_Page.getPasswordField().sendKeys("Tester@99");
		Reporter.log("Entering the Password",true);
		test.log(Status.INFO,"Password is entered");
		
		//Validating the Password Field and Verifying Test Case is Pass or Fail
		boolean PasswordValidation = signup_Page.getPasswordError().isDisplayed();
		Assert.assertEquals(false, PasswordValidation);
		Reporter.log("Verify that there is no validation error for Password field",true);
		Reporter.log("User is able to enter valid password || PASS",true);
		
		
		//Logging Pass/Fail message to the Extent Report//
		test.log(Status.PASS,"Verify that user is able to enter a valid password || PASS");
				
		//Adding the screenshot to the Extent Report//
		test.addScreenCaptureFromPath(utility_Methods.takeScreenshot(driver));
				
		
	
		
		
		//----------------Successful closure of driver----------------//
		
		
				
				
				signup_Page.getHomeLogo().click();
				
				base_Page.getLoginButton().click();
				
				login_Page.performLogin(data_Utility.getDataFromProperties(email_Key),data_Utility.getDataFromProperties(password_Key));
				
				
				
		
	}
}
