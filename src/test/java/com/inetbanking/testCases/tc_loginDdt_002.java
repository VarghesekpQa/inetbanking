package com.inetbanking.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.loginPage;
import com.inetbanking.utilities.xlUtils;

public class tc_loginDdt_002 extends baseClass {
	
	
	@Test(dataProvider="loginData")
	public void loginDdt(String username,String password) throws InterruptedException, IOException {
		
		logger.info("url opened");
		
		loginPage lp = new loginPage(driver);
		
		lp.setUsername(username);
		logger.info("username provided");
		lp.setPassword(password);
		logger.info("password provided");
		lp.clickSubmit();
		logger.info("submit buttom clicked");
		Thread.sleep(3000);
		if(isAlertPresent()==true) {
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			captureScreen(driver,"loginDdt");
			Assert.assertTrue(false);
			logger.warn("login failed");
			
			
		}else{
			
			lp.clickLogout();
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);
			logger.warn("login passed");
			
		}	
	}
	public boolean isAlertPresent() {
		
		try {
			driver.switchTo().alert();
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	@DataProvider(name="loginData")
	String[][] getData() throws IOException{
		
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testDatas/loginData.xlsx";
		
		int rowcount = xlUtils.getRowCount(path, "Sheet1");
		int colcount = xlUtils.getCellCount(path, "Sheet1",1);
		
		String logindata[][] = new String [rowcount][colcount];
		
		for(int r=1;r<=rowcount;r++) {
			
			for(int c=0;c<colcount;c++) {
				logindata[r-1][c] = xlUtils.getCellData(path,"Sheet1", r, c);
			}
		}
		return logindata;	
	}	
}
