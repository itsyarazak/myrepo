package com.facebookApps.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties properties;

	public ReadConfig() {

		try {
			File src = new File("./configuration/config.properties");

			FileInputStream fis = new FileInputStream(src);

			properties = new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getApplicationURL() {
		String url = properties.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username = properties.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = properties.getProperty("password");
		return password;
	}

}
