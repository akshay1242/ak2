package Seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {
	
	public static void main(String args[]) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "D:/akshay/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
}
