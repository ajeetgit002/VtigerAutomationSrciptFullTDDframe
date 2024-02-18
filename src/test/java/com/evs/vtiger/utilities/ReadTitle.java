package com.evs.vtiger.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadTitle {
	Properties properties;

	public ReadTitle() {

		properties = new Properties();

		try {
			FileInputStream file = new FileInputStream("src\\test\\resources\\PageTitle.properties");
			properties.load(file);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public String getLoginPageTitle() {

		String value = properties.getProperty("loginPageTitle");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("loginPageTitle is not specified in config file");
		}
	}

	public String getHomePageTitle() {

		String value = properties.getProperty("homePageTitle");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("homePageTitle is not specified in config file");
		}
	}

	public String getMarketingPageTitle() {

		String value = properties.getProperty("marketingPageTitle");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("marketingPageTitle is not specified in config file");
		}
	}

	public String getSalesPageTitle() {

		String value = properties.getProperty("salesPageTitle");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("salesPageTitle is not specified in config file");
		}
	}

	public String getSupportPageTitle() {

		String value = properties.getProperty("supportPageTitle");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("supportPageTitle is not specified in config file");
		}
	}

	public String getAnalyticsPageTitle() {

		String value = properties.getProperty("analyticsPageTitle");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("analyticsPageTitle is not specified in config file");
		}
	}

	public String getInventoryPageTilte() {

		String value = properties.getProperty("inventoryPageTilte");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("inventoryPageTilte is not specified in config file");
		}
	}

	public String getTolsPageTitle() {

		String value = properties.getProperty("toolsPageTitle");
		if (value != null) {
			return value;
		} else {
			throw new RuntimeException("toolsPageTitle is not specified in config file");
		}
	}

}
