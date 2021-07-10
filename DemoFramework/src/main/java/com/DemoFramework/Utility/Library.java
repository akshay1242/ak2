package com.DemoFramework.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

public class Library {
	
public static void ClickOnElement(WebElement element,String fildName) {
	try {
		element.click();
		ObjectRepo.test.log(Status.PASS,"Click on ="+fildName);
	}catch(Exception e) {
		ObjectRepo.test.log(Status.FAIL,"Unble to Click on ="+fildName);
	}
	  }
public static void SendValuestoElement(WebElement element,String value,String fildName){
	try {
	     element.sendKeys(value);
	     ObjectRepo.test.log(Status.PASS, fildName+" send to==> "+value);
    }catch(Exception e) {
    	ObjectRepo.test.log(Status.PASS, fildName+" Unable to Send to==> "+value);
    }
}
public static void HandleDropDown(WebElement element,String text) {
	Select select=new Select(element);
	select.selectByVisibleText(text);
}
}
