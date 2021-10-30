package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class addCustomerPage {
	
	WebDriver ldriver;
	
	public addCustomerPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement linkAddCustomer;
	
	@FindBy(how=How.NAME,using="name")
	@CacheLookup
	WebElement customerName;
	
	@FindBy(how=How.NAME,using="rad1")
	@CacheLookup
	WebElement gender;
	
	@FindBy(how=How.ID_OR_NAME,using="dob")
	@CacheLookup
	WebElement dob;
	
	@FindBy(how=How.NAME,using="addr")
	@CacheLookup
	WebElement address;
	
	@FindBy(how=How.NAME,using="city")
	@CacheLookup
	WebElement city;
	
	@FindBy(how=How.NAME,using="state")
	@CacheLookup
	WebElement state;
	
	@FindBy(how=How.NAME,using="pinno")
	@CacheLookup
	WebElement pin;
	
	@FindBy(how=How.NAME,using="telephoneno")
	@CacheLookup
	WebElement mobnumber;
	
	@FindBy(how=How.NAME,using="emailid")
	@CacheLookup
	WebElement email;
	
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.NAME,using="sub")
	@CacheLookup
	WebElement btnsubmit;
	
	@FindBy(how=How.NAME,using="res")
	@CacheLookup
	WebElement resbutton;
	
	public void addNewCustomerLink() {
		linkAddCustomer.click();
	}
	
	public void setCustomerName(String cname){
		customerName.sendKeys(cname);
	}
	
	public void setCustomerGender(String cgender) {
		gender.click();
	}
	
	public void setCustomerDob(String mm,String dd,String yy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}
	
	public void setCustomerAddress(String caddress) {
		address.sendKeys(caddress);
	}
	
	public void setCustomerCity(String ccity) {
		city.sendKeys(ccity);
	}
	
	public void setCustomerState(String cstate) {
		state.sendKeys(cstate);
	}
	
	public void setCustomerPin(int cpin) {
		pin.sendKeys(String.valueOf(cpin));
	}
	
	public void setCustomerMobNum(String cmobnum) {
		mobnumber.sendKeys(cmobnum);
	}
	
	public void setCustomerEmail(String cemail) {
		email.sendKeys(cemail);
	}
	
	public void setCustomerPassword(String cpassword) {
		password.sendKeys(cpassword);
	}
	
	public void submitButtonClick() {
		btnsubmit.click();
	}
	
	public void resetButtonClick() {
		resbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
