package testscript.mens;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic_Library.BaseTest;

public class SS_Mens_001 extends BaseTest {

	@Test()
	public void verify_Mens_Page_Is_Displayed() throws InterruptedException {

		base_Page.getMensLinks().click();
		
		Assert.assertEquals(driver.getTitle(), "ShoppersStack | Men");
		Reporter.log("ShoppersStack | Men Page Displayed",true);
		test.log(Status.PASS, "SSID_Mens_001 Pass");
		test.addScreenCaptureFromPath(utility_Methods.takeScreenshot(driver), "SSID_Mens_001 Pass");		
	}
}
