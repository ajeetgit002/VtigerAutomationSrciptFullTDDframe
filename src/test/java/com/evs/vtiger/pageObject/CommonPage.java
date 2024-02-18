package com.evs.vtiger.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.pageObjectOR.CommonPageOR;
import com.evs.vtiger.utilities.ReadConfig;
import com.evs.vtiger.utilities.ReadTitle;
import com.evs.vtiger.utilities.Utils;

public class CommonPage extends CommonPageOR {
	ReadConfig config;
	Utils ut;
	ReadTitle readtitle;
	public CommonPage(WebDriver rdriver, Utils ut) {
		super(rdriver);
		this.ut = ut;
		config = new ReadConfig();
readtitle =new ReadTitle();
	}

	// Login Mehtod

	public void Login() {
		
		ut.implicityWaitSecond(30);
		ut.openUrl(config.getUrl());
		ut.verifyTitle(readtitle.getLoginPageTitle());
		ut.inputValue(getUsernameTB(), config.getUsername());
		ut.verifyText(ut.getAttribute(getUsernameTB(), "value"), config.getUsername());
		
		ut.inputValue(getUserpassTB(), config.getPassword());
		ut.verifyText(ut.getAttribute(getUserpassTB(), "value"), config.getPassword());
		ut.click(getLoginBT());
	}

	//sign out Link
	
	public void clickOn_LogOutBT() {
		ut.click(getSignOutLK());
	}
	
	//common button
	
		public void clickOnSaveBT() {
			ut.click(getClickOnSaveBT());

		}

		public void clickOnDeleteBT() {
			ut.click(getDeleteBT());
		}

		public void clickOnEditBT() {
			ut.click(getEditBT());
		}
		//common Main module Link
	public void clickOn_HomeLK() {
		ut.click(getHomepageLK());
		
	}

	public void click_MarketingLK() {
		ut.click(getMarketingLK());
	}

	public void clickOn_SalesLK() {
		ut.click(getSalesLK());
	}

	public void clickOn_SupportLK() {
		ut.click(getSupportLK());
	}

	public void clickOn_AnalyticsLK() {
		ut.click(getAnalyticsLK());
	}

	public void clickOn_InventoryLK() {
		ut.click(getInventoryLK());
	}

	public void clickOn_ToolsLK() {
		ut.click(getToolsLK());
	}

	
// After Landing Page Search text Box
	
	
	public void enterValue_SearchTB(String value) {
		ut.inputValue(getSerchTB(), value);
	}
	//After Landing Page Search Now Button
	public void click_SearchNowBT() {
		ut.click(getSearchnowBT());
	}
	//After Landing Page Search by  field  DropDown
	public void selectUniqueField(String HeaderTOsltData) {
		ut.selectByText(getSearchFieldDD(), HeaderTOsltData);
	}
	
	
	//                    Sub Module Or sub Link 
	public void clickOn_AccountsSLK() {
		ut.click(getAccLK());
	}
	
	public void clickOn_ContactsSLK() {
		ut.click(getConctLK());
	}

	public void clickOn_WebmailSLK() {
		ut.click(getWebmailLK());
	}
	public void clickOn_DocumentsSLK() {
		ut.click(getDocumLK());
	}
	
	
	public void clickOn_InvoiceSLK() {
		ut.click(getInvoiceLK());
	}
	
	public void clickOn_SalesOrderSLK() {
		ut.click(getSelesOrderLK());
	}
	
	public void clickOn_QuotesSLK() {
		ut.click(getQuotesLK());
	}
	
	public void clickOn_PriceBookSLK() {
		ut.click(getPricebooksLK());
	}
	// Checked All Checked Boxses
	public void checkedCheckBoxs() {
		ut.ckeckedAllCheckBoxes(getCheckBoxes());
	}
	public void checkedHeaderCheckBox() {
		ut.click(getHeaderCheckBox());
	}
}
