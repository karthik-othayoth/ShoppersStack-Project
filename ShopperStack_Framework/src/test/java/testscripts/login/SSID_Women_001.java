package testscripts.login;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic_Library.BaseTest;

public class SSID_Women_001 extends BaseTest {
	
	@Test
	public void verify_Women_Page_Is_Displayed() throws InterruptedException{
		
		base_Page.getWomenLink().click();
		
		Assert.assertEquals(driver.getTitle(), "ShoppersStack | Women");
		Reporter.log("ShoppersStack | Women Page Displayed",true);
		test.log(Status.PASS, "SSID_Women_001 Pass");
		test.addScreenCaptureFromPath(utility_Methods.takeScreenshot(driver), "SSID_Women_001 Pass");		
		
	}
}
