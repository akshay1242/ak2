package com.DemoFramework.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.DemoFramework.Utility.BaseClass;

public class LoginPom {
    public WebDriver driver;
    
  @FindBy(how=How.XPATH,using="//input[@name='email']")
  private WebElement EmailId;
  @FindBy(how=How.XPATH,using="//input[@name='pass']")
  private WebElement Password;
  @FindBy(how=How.XPATH,using="//button[@name='login']")
  private WebElement LoginButton;
  
 public LoginPom(WebDriver driver) {
	  this.driver=driver;
  }
  
public WebElement getEmailId() {
	return EmailId;
}
public WebElement getPassword() {
	return Password;
}

public WebElement getLoginButton() {
	return LoginButton;
} 
}
