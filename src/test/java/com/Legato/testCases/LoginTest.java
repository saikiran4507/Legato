package com.Legato.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Legato.pageObjects.LoginPage;

public class LoginTest extends BaseClass {

	@Test

	public void loginTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		driver.get(baseURL);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.Loginbtn();
		logger.info("Clicked on the login button");

		if (driver.getTitle().equals("Main Map")) {

			Assert.assertTrue(true);
			logger.info("Have been into correct page and test is passed");

		} else {
			captureScreen(driver, "loginTest");
			Assert.assertFalse(false);
			logger.info("Test failed");
		}

	}

}
