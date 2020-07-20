package com.Legato.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver rdriver;

	public LoginPage(WebDriver ldriver) {
		rdriver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//input[@id='LoginUser_UserName']")
	@CacheLookup
	WebElement Username;

	@FindBy(xpath = "//input[@id='LoginUser_Password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement loginBtn;
	
	
	

	public void setUsername(String uname) {
		Username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		Password.sendKeys(pwd);
	}

	public void Loginbtn() {
		loginBtn.click();
	}

}
