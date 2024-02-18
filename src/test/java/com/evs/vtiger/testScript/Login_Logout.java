package com.evs.vtiger.testScript;

import org.openqa.selenium.WebDriver;

import com.evs.vtiger.pageObject.CommonPage;
import com.evs.vtiger.utilities.ReadTitle;
import com.evs.vtiger.utilities.Utils;

public class Login_Logout {

	Utils ut;
	CommonPage compage;
	ReadTitle readtitle;
	public Login_Logout(Utils ut, WebDriver driver) {
		this.ut = ut;

		compage = new CommonPage(driver, ut);
     readtitle=new ReadTitle();
	}

	public void userLogin_Logout() {
		compage.Login();
		ut.verifyTitle(readtitle.getHomePageTitle());
		ut.verifyText(ut.getText(compage.getMarketingLK()), "Marketing");
		compage.clickOn_LogOutBT();
		ut.verifyTitle(readtitle.getLoginPageTitle());

	}

}
