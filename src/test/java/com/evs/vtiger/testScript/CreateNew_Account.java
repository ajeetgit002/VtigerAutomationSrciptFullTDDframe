package com.evs.vtiger.testScript;

import org.openqa.selenium.WebDriver;

import com.evs.vtiger.pageObject.AccountPage;
import com.evs.vtiger.pageObject.CommonPage;
import com.evs.vtiger.pageObject.LeadsPage;
import com.evs.vtiger.pageObject.MarketingPage;
import com.evs.vtiger.pageObject.SalesPage;
import com.evs.vtiger.utilities.ReadTitle;
import com.evs.vtiger.utilities.Utils;

public class CreateNew_Account {

	Utils ut;
	CommonPage compage;
	AccountPage accpage;
	MarketingPage markpage;
	ReadTitle readtitle;

	public CreateNew_Account(Utils ut, WebDriver driver) {
		this.ut = ut;
		accpage = new AccountPage(driver, ut);
		compage = new CommonPage(driver, ut);
		markpage = new MarketingPage(driver, ut);
		readtitle=new ReadTitle();
	}

	public void createNewACC() {
		compage.Login();
		compage.click_MarketingLK();
		readtitle.getMarketingPageTitle();
		ut.verifyTitle(readtitle.getMarketingPageTitle());
		compage.clickOn_AccountsSLK();
		String headers = markpage.verifyHeaderOfLandinPage();
		ut.verifyText(headers, "Marketing > Accounts");
		accpage.clickCreateNewAccountBT();
		accpage.verifyCreateNewACCPageHeader();
		accpage.createNewAccounts();
		compage.clickOnSaveBT();
ut.threadWait(5000);
	}

}
