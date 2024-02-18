package com.evs.vtiger.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadsACC_Details {
	Properties properties;

	public ReadsACC_Details() {

		properties = new Properties();

		try {
			FileInputStream file = new FileInputStream("src\\test\\resources\\CreateACC.properties");
			properties.load(file);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public String getAccountName() {

		String value = properties.getProperty("accountName");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("accountName is not specified in config file");
		}
	}

	public String getWebsite() {

		String value = properties.getProperty("Website");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("Website is not specified in config file");
		}
	}

	public String getTickerSysmbol() {

		String value = properties.getProperty("tickerSysmbol");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("tickerSysmbol is not specified in config file");
		}
	}

	public String getPhone() {

		String value = properties.getProperty("phone");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("mobile is not specified in config file");
		}
	}

	public String getFax() {

		String value = properties.getProperty("fax");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("fax is not specified in config file");
		}
	}

	public String getEamil() {

		String value = properties.getProperty("email");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("email is not specified in config file");
		}
	}

	public String getAddress() {

		String value = properties.getProperty("address");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("address is not specified in config file");
		}
	}

	public String getPostBox() {

		String value = properties.getProperty("postbox");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("postbox is not specified in config file");
		}
	}

	public String getPinCode() {

		String value = properties.getProperty("pincode");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("pincode is not specified in config file");
		}
	}

	public String getCity() {

		String value = properties.getProperty("city");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("city is not specified in config file");
		}
	}

	public String getState() {

		String value = properties.getProperty("state");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("state is not specified in config file");
		}
	}

	public String getDescription() {

		String value = properties.getProperty("description");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("description is not specified in config file");
		}
	}
}
