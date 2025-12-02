package com.letcode.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties pro = new Properties();

	public ConfigReader() {
		
		try {
			 FileInputStream fis = new FileInputStream("config/config.properties");
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Could Not find Config File Not Found");
		}
		
	}
	
	public String getProperty(String key) {
		return pro.getProperty(key);	
	}
}
