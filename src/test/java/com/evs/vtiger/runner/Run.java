package com.evs.vtiger.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.evs.vtiger.pageObject.CommonPage;
import com.evs.vtiger.pageObjectOR.CommonPageOR;
import com.evs.vtiger.testScript.SupportsAccVerify;
import com.evs.vtiger.utilities.DataPrividers;
import com.evs.vtiger.utilities.Utils;

public class Run {
	Utils ut = Utils.getInstance();

	@BeforeClass
	public void cretereport() {
		ut.createExtentReport();
	}

	@Test(dataProvider = "credential", dataProviderClass = DataPrividers.class)
	public void runTest(String username, String password) {
		ut.createTestReport("VT001VerifyDataDrivev");
		WebDriver driver = ut.getDriver("firefox");
		CommonPageOR or = new CommonPageOR(driver);
		ut.openUrl("http://localhost:8888");
		ut.inputValue(or.getUsernameTB(), username);
		ut.inputValue(or.getUserpassTB(), password);
		ut.click(or.getLoginBT());
	}

	@AfterMethod
	public void teardown() {
		ut.tearDown_Quit();
		ut.flushReport();

	}

}
