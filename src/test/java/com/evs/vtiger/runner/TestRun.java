package com.evs.vtiger.runner;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.evs.vtiger.testScript.CreateNew_Account;
import com.evs.vtiger.testScript.CreateNew_SalesLeadsScript;
import com.evs.vtiger.testScript.DeleteMarketing_ACC;
import com.evs.vtiger.testScript.DeleteSalesLeads;
import com.evs.vtiger.testScript.Login_Logout;
import com.evs.vtiger.testScript.SupportsAccVerify;

import com.evs.vtiger.utilities.Utils;

public class TestRun {
	Utils ut = Utils.getInstance();

	@BeforeClass
	public void cretereport() {
		ut.createExtentReport();
	}

	@Test(groups = { "@Login", "@Smoke" }, priority = 0)
	public void VT001CredentialVerification() {
		ut.createTestReport("VT001CredentialVerification");
		WebDriver drievr = ut.getDriver("chrome");
		Login_Logout loginout = new Login_Logout(ut, drievr);
		loginout.userLogin_Logout();
	}

	@Test(groups = "@sanity", priority = 3,dependsOnMethods = "VT003CreateMarketingAccount")
	public void VT004supportsAccountVerify() {
		ut.createTestReport("VT004supportsAccountVerify");
		WebDriver drievr = ut.getDriver("chrome");
		SupportsAccVerify s = new SupportsAccVerify(ut, drievr);
		s.supportsAccountVerify();

	}

	@Test(groups = "@sanity", priority = 2)
	public void VT002CreateNewSalesLeads() {
		ut.createTestReport("VT002CreateNewSalesLeads");
		WebDriver drievr = ut.getDriver("chrome");
		CreateNew_SalesLeadsScript crnsalesleads = new CreateNew_SalesLeadsScript(ut, drievr);
		crnsalesleads.createNewLeads();
	}

	@Test(groups = "@regression", priority = 1)
	public void VT003CreateMarketingAccount() {
		ut.createTestReport("VT003CreateMarketingAccount");
		WebDriver driver = ut.getDriver("chrome");

		CreateNew_Account cretnewacc = new CreateNew_Account(ut, driver);
		cretnewacc.createNewACC();

		ut.verifyText(ut.getTitle("save accountpage"),
				"admin - Marketing - Accounts - vtiger CRM 5 - Commercial Open Source CRM");
	}

	@Test(groups = "@regression", priority = 5,dependsOnMethods = "VT003CreateMarketingAccount")
	public void VT005DeleteMarketingACC() {
		ut.createTestReport("VT005DeleteMarketingACC");
		WebDriver drievr = ut.getDriver("chrome");
		DeleteMarketing_ACC deltemrkacc = new DeleteMarketing_ACC(ut, drievr);
		deltemrkacc.deleteMarketingACC();
	}

	@Test(groups = "@sanity", priority = 4,dependsOnMethods  = "VT002CreateNewSalesLeads")
	public void VT006DeleteSalesLead() {
		ut.createTestReport("VT006DeleteSalesLead");
		WebDriver drievr = ut.getDriver("chrome");
		DeleteSalesLeads deltemrkacc = new DeleteSalesLeads(ut, drievr);
		deltemrkacc.deleteSalesLeads();
	}

	@AfterMethod
	public void teardown(ITestResult result) {
		String[] groups = result.getMethod().getGroups();

		for (String group : groups) {
			ut.addtags(group);

		}

		ut.tearDown_Quit();
		ut.flushReport();

	}
}
