package com.facebookApps.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(id = "email")
	WebElement txtUserName;
	@FindBy(id = "pass")
	WebElement txtPassword;
	@FindBy(id = "loginbutton")
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit()
	{
		btnLogin.submit();
	}
}
