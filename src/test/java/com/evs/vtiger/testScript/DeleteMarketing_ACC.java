package com.evs.vtiger.testScript;

import org.openqa.selenium.WebDriver;

import com.evs.vtiger.pageObject.AccountPage;
import com.evs.vtiger.pageObject.CommonPage;
import com.evs.vtiger.pageObject.MarketingPage;
import com.evs.vtiger.utilities.Utils;

public class DeleteMarketing_ACC {

	Utils ut;
	CommonPage compage;
	AccountPage accpage;
	MarketingPage markpage;

	public DeleteMarketing_ACC(Utils ut, WebDriver driver) {
		this.ut = ut;
		accpage = new AccountPage(driver, ut);
		compage = new CommonPage(driver, ut);
		markpage = new MarketingPage(driver, ut);
	}

	public void deleteMarketingACC() {
		compage.Login();
		compage.click_MarketingLK();
		compage.clickOn_AccountsSLK();
		compage.enterValue_SearchTB("Ajeet Yadav");

		compage.selectUniqueField("Account Name");
		compage.click_SearchNowBT();

		compage.checkedHeaderCheckBox();
		compage.clickOnDeleteBT();

		ut.alertAcceptPop();
	}
}
