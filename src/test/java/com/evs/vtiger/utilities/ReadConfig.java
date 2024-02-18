package com.evs.vtiger.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties properties;

	public ReadConfig() {

		properties = new Properties();

		try {
			FileInputStream file = new FileInputStream("src\\test\\resources\\Config.properties");
			properties.load(file);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public String getBrowser() {

		String value = properties.getProperty("browser");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("Browser is not specified in config file");
		}
	}

	public String getUsername() {

		String value = properties.getProperty("username");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("username is not specified in config file");
		}
	}

	public String getPassword() {

		String value = properties.getProperty("password");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("password is not specified in config file");
		}
	}

	public String getUrl() {

		String value = properties.getProperty("url");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("url is not specified in config file");
		}
	}
}
