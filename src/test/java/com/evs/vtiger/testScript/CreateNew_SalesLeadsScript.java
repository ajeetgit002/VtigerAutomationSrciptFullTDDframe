package com.evs.vtiger.testScript;

import org.openqa.selenium.WebDriver;

import com.evs.vtiger.pageObject.CommonPage;
import com.evs.vtiger.pageObject.LeadsPage;
import com.evs.vtiger.pageObject.SalesPage;
import com.evs.vtiger.utilities.Utils;

public class CreateNew_SalesLeadsScript {
	Utils ut;
	CommonPage compage;
	LeadsPage leadspg;
	SalesPage salespage;

	public CreateNew_SalesLeadsScript(Utils ut, WebDriver driver) {
		this.ut = ut;
		leadspg = new LeadsPage(driver, ut);
		compage = new CommonPage(driver, ut);
		salespage = new SalesPage(driver, ut);
	}

	public void createNewLeads() {
		compage.Login();
		compage.clickOn_SalesLK();
		salespage.clickOnSales_Leads();
		String actheader=salespage.verifyHeaderOfPage();
		ut.verifyText(actheader, "Sales > Leads");
		leadspg.clickOn_CreateNewLeadsBT();
		leadspg.verifyHeaderOfCreateNewPage();
		leadspg.createNewLeadsPage();
		compage.clickOnSaveBT();
		ut.threadWait(5000);
	}

}
