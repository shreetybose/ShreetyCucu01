package com.vtiger.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
	
	public WebDriver driver;
//	public ExtentHtmlReporter htmlReporter;
//	public ExtentReports extent;
//	public ExtentTest logger;

	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", "C:/SELENIUM/Selenium_software/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://localhost:100");
	    driver.manage().window().maximize();
	}
	
	
	
}
