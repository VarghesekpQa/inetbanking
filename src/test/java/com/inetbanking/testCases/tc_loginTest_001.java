package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.loginPage;

public class tc_loginTest_001 extends baseClass {

	@Test
	public void loginTest() throws IOException {
		
		driver.get(baseUrl);
		logger.info("url opened");
		
		loginPage lp = new loginPage(driver);
		
		lp.setUsername(username);
		logger.info("username entered");
		
		lp.setPassword(password);
		logger.info("password entered");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test passed");
		}else{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
	}
}
