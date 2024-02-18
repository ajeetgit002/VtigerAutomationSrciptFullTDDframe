package com.evs.vtiger.testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.evs.vtiger.pageObject.AccountPage;
import com.evs.vtiger.pageObject.CommonPage;
import com.evs.vtiger.utilities.ReadConfig;
import com.evs.vtiger.utilities.Utils;



public class SupportsAccVerify {
	Utils ut;
	WebDriver driver;

	CommonPage compage;
	AccountPage accpage;

	public SupportsAccVerify(Utils ut, WebDriver driver) {
		this.ut = ut;

		this.driver = driver;
		compage = new CommonPage(driver, ut);
		accpage = new AccountPage(driver, ut);
	}

	public void supportsAccountVerify() {

		compage.Login();
		compage.clickOn_SupportLK();
		compage.clickOn_AccountsSLK();
		compage.enterValue_SearchTB("Ajeet Yadav");
		compage.selectUniqueField("Account Name");
		compage.click_SearchNowBT();
		String status = ut.verifyTableDataByHeaderName("//table[@class='lvt small']", "Account Name", "Ajeet Yadav");
		ut.verifyText(status, "Ajeet Yadav");
	}

	
}
