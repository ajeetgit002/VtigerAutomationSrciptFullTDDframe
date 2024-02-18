package com.evs.vtiger.pageObject;

import org.openqa.selenium.WebDriver;

import com.evs.vtiger.pageObjectOR.AccountOR;
import com.evs.vtiger.utilities.ReadsACC_Details;
import com.evs.vtiger.utilities.Utils;

public class AccountPage extends AccountOR {

	private Utils ut;
	private ReadsACC_Details accdata;

	public AccountPage(WebDriver driver, Utils ut) {
		super(driver);
		this.ut = ut;
		accdata = new ReadsACC_Details();

	}

	public void clickCreateNewAccountBT() {
		ut.click(getClickNewBT());
	}

	public void verifyCreateNewACCPageHeader() {
		String ecpectedh = ut.getText(getNewaccpageheaderINT());
		ut.verifyText(ecpectedh, "Creating New Account");

	}

	public void createNewAccounts() {

		ut.inputValue(getAcnameTB(), accdata.getAccountName());
		ut.verifyText(ut.getAttribute(getAcnameTB(), "value"), accdata.getAccountName());
		ut.inputValue(getWebsiteTB(), accdata.getWebsite());
		ut.verifyText(ut.getAttribute(getWebsiteTB(), "value"), accdata.getWebsite());
		ut.inputValue(getTickerTB(), accdata.getTickerSysmbol());
		ut.verifyText(ut.getAttribute(getTickerTB(), "value"), accdata.getTickerSysmbol());
		ut.inputValue(getPhoneTB(), accdata.getPhone());
		ut.verifyText(ut.getAttribute(getPhoneTB(), "value"), accdata.getPhone());
		ut.inputValue(getFaxTB(), accdata.getFax());
		ut.verifyText(ut.getAttribute(getFaxTB(), "value"), accdata.getFax());
		ut.inputValue(getEmailTB(), accdata.getEamil());
		ut.verifyText(ut.getAttribute(getEmailTB(), "value"), accdata.getEamil());
		ut.inputValue(getAddrssTB(), accdata.getAddress());
		ut.verifyText(ut.getAttribute(getAddrssTB(), "value"), accdata.getAddress());
		ut.inputValue(getPoboxTB(), accdata.getPostBox());
		ut.verifyText(ut.getAttribute(getPoboxTB(), "value"), accdata.getPostBox());
		ut.inputValue(getCityTB(), accdata.getCity());
		ut.verifyText(ut.getAttribute(getCityTB(), "value"), accdata.getCity());
		ut.inputValue(getStateTB(), accdata.getState());
		ut.verifyText(ut.getAttribute(getStateTB(), "value"), accdata.getState());
		ut.inputValue(getPiccodeTB(), accdata.getPinCode());
		ut.verifyText(ut.getAttribute(getPiccodeTB(), "value"), accdata.getPinCode());
		ut.inputValue(getContTB(), "INDIA");
		ut.verifyText(ut.getAttribute(getContTB(), "value"), "INDIA");
		ut.inputValue(getDecripTB(), accdata.getDescription());
		ut.verifyText(ut.getAttribute(getDecripTB(), "value"), accdata.getDescription());

	}

}
