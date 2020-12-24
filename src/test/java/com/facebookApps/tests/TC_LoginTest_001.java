package com.facebookApps.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebookApps.pageobjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	
	public void LoginTest()
	{
		try {
			driver.get(baseURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			LoginPage lp = new LoginPage(driver);
			
			lp.setUserName(userName);
			lp.setPassword(password);
			lp.clickSubmit();
			
			Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
			System.out.println("Title Matched Successfully");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
