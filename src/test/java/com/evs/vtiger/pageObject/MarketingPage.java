package com.evs.vtiger.pageObject;

import org.openqa.selenium.WebDriver;

import com.evs.vtiger.pageObjectOR.MarketingPageOR;
import com.evs.vtiger.utilities.Utils;

public class MarketingPage extends MarketingPageOR {
	Utils ut;

	public MarketingPage(WebDriver rdriver, Utils ut) {
		super(rdriver);
		this.ut = ut;

	}

	public String verifyHeaderOfLandinPage() {
		String header = ut.getText(getHeaderINT());
		return header;
	}

	public void clickOn_CampaignSLK() {
		ut.click(getMarkcampaLK());
	}

	public void clickOn_LeadsSLK() {
		ut.click(getMrktleadsLK());
	}

	public void clickOn_CreateNewCampBT() {
		ut.click(getCreatecampBT());
	}

}
