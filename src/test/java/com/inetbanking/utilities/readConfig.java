package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {

	Properties pro;
	
	public readConfig() {
		
		File src = new File("./configuration/config.properties");
		try {	
			FileInputStream fs = new FileInputStream(src);
			pro = new Properties();
			pro.load(fs);
		}catch(Exception e) {
			System.out.println("Execption is "+e);
		}	
	}
	
	public String getApplicationUrl() {
		String url = pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getChromePath() {
		String chrome = pro.getProperty("chromepath");
		return chrome;
	}
	
	public String getIePath() {
		String ie = pro.getProperty("iepath");
		return ie;
	}
	
	public String getFirefoxPath() {
		String firefox = pro.getProperty("firefoxpath");
		return firefox;
	}
	
}
