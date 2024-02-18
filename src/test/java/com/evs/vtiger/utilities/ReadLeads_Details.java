package com.evs.vtiger.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadLeads_Details {
	Properties properties;

	public ReadLeads_Details() {

		properties = new Properties();

		try {
			FileInputStream file = new FileInputStream("src\\test\\resources\\leads.properties");
			properties.load(file);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public String getNameTitle() {

		String value = properties.getProperty("nametitle");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("nametitle is not specified in config file");
		}
	}

	public String getFirstName() {

		String value = properties.getProperty("firstname");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("firstname is not specified in config file");
		}
	}

	public String getLastName() {

		String value = properties.getProperty("lastname");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("lastname is not specified in config file");
		}
	}

	public String getCompany() {

		String value = properties.getProperty("company");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("company is not specified in config file");
		}
	}

	public String getTitle() {

		String value = properties.getProperty("title");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("title is not specified in config file");
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

	public String getStreet() {

		String value = properties.getProperty("street");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("street is not specified in config file");
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
