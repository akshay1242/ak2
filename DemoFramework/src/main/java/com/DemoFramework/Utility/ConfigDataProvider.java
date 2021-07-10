package com.DemoFramework.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider() throws IOException {
		String path=System.getProperty("user.dir")+"\\Config.Properties\\Config.Properties";
		File file=new File(path);
		FileInputStream src=new FileInputStream(file);
		pro=new Properties();
		pro.load(src);
	}
	
public String getBrowserName() {
	return pro.getProperty("BrowserName");
}
public String getBrowserName1() {
	return pro.getProperty("BrowserName1");
}
public String getBrowserNameFirefox() {
	return pro.getProperty("BrowserNameFirefox");
}
public String getBaseUrl() {
	return pro.getProperty("URL");
}
public String getemail() {
	return pro.getProperty("email");
}
public String getpassword() {
	return pro.getProperty("password");
}
}
