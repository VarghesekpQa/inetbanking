package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.addCustomerPage;
import com.inetbanking.pageObjects.loginPage;

public class tc_addCustomer_003 extends baseClass {

	@Test
	public void addCustomer() throws InterruptedException, IOException {
		
		loginPage lp = new loginPage(driver);
		lp.setUsername(username);
		logger.info("username provided");
		lp.setPassword(password);
		logger.info("password provided");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		
		addCustomerPage acp = new addCustomerPage(driver);
		acp.addNewCustomerLink();
		acp.setCustomerName("john");
		logger.info("customer name provided");
		acp.setCustomerGender("male");
		logger.info("customer gender provided");
		acp.setCustomerDob("10", "22", "1994");
		logger.info("customer dob provided");
		Thread.sleep(3000);
		
		acp.setCustomerAddress("INDIA");
		logger.info("customer address provided");
		acp.setCustomerCity("BAN");
		logger.info("customer city provided");
		acp.setCustomerState("KAR");
		logger.info("customer state provided");
		acp.setCustomerPin(400500);
		logger.info("customer pin provided");
		acp.setCustomerMobNum("8899770066");
		logger.info("customer mobnumber provided");
		
		String email = randomString()+"@gmail.com";
		
		acp.setCustomerEmail(email);
		logger.info("customer email provided");
		acp.setCustomerPassword("123456");
		logger.info("customer password provided");
		acp.submitButtonClick();
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res == true) {
			logger.info("testcase passed");
			Assert.assertTrue(true);
		}else {
			logger.info("testcase failed");
			captureScreen(driver,"addCustomer");
			Assert.assertTrue(false);
			
		}
			
	}
	
	public String randomString() {
		String str = RandomStringUtils.randomAlphabetic(8);
		return(str);
	}
	
	public String randomNumber() {
		String num = RandomStringUtils.randomNumeric(8);
		return(num);
	}
	
}
