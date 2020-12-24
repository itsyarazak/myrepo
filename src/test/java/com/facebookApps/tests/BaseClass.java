package com.facebookApps.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.facebookApps.utilities.ReadConfig;

public class BaseClass {

	/*
	 * public String baseURL = "https://www.facebook.com/"; 
	 * public String userName =  "Abdul"; 
	 *  public String password = "12345";
	 */

	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String userName = readconfig.getUsername();
	public String password = readconfig.getPassword();

	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass

	public void setup(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "//Drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

	}

	@AfterClass

	public void Close() {
		driver.quit();
	}

}
