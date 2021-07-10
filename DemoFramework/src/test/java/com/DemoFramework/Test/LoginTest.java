package com.DemoFramework.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DemoFramework.PomPages.LoginPom;
import com.DemoFramework.Utility.BaseClass;
import com.DemoFramework.Utility.Library;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseClass {

@Test
public void verifyLoginTestTC_001() {
	LoginPom login=PageFactory.initElements(driver, LoginPom.class);
//	login.getEmailId().sendKeys("abc@gmail.com");
//	login.getPassword().sendKeys("12345678");
//	login.getLoginButton().click();
	Library.SendValuestoElement(login.getEmailId(),config.getemail(), "Email Id");
	Library.SendValuestoElement(login.getPassword(),config.getpassword(), "Password");
	
	//Library.SendValuestoElement(login.getEmailId(), Excel.getStringData("Sheet1", 1, 0));
    //Library.SendValuestoElement(login.getPassword(), Excel.getStringData("Sheet1", 1, 1));

	
	Library.ClickOnElement(login.getLoginButton(), "Login");	
	String Expectedtitle="nmcmcmc";
    String actualtiltle=driver.getTitle();
    
    Assert.assertEquals(actualtiltle, Expectedtitle);
}

}
