package com.orangehrm.hybidframe.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider{
	public Properties prop;
	public ConfigDataProvider() {
		
		//to read the data from configdataprovider we use FileInputStream
		try {
			File fs =new File("./Config/config.properties");
			FileInputStream fis =new FileInputStream(fs);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
		}
	}
	public String getKeyValue(String searchKey) {
		return prop.getProperty(searchKey);
		
	}
	public String getUserName() {
		return prop.getProperty("username");
	}
	public String getUserPassword() {
		return prop.getProperty("password");
	}
	public String getAppUrl() {
		return prop.getProperty("url");
	}
}

