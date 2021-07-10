package com.DemoFramework.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 public static  WebDriver driver;
	 public static ConfigDataProvider config;
	// public static ExcelDataFectching Excel;
	 
@BeforeSuite
public void Setup() throws Exception {
	 config=new ConfigDataProvider();
	// Excel=new ExcelDataFectching();
	 
}
@Parameters({"BrowserName","URL"})
@BeforeMethod
	public void LaunchBrowser(String BrowserName,String URL) {
		
		if(BrowserName.equalsIgnoreCase(config.getBrowserName())) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 
		}
		else if(BrowserName.equalsIgnoreCase(config.getBrowserName1())) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(BrowserName.equalsIgnoreCase(config.getBrowserNameFirefox())) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get(config.getBaseUrl());
		driver.manage().window().maximize();
		 
	}
	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
		
		
	}

}
