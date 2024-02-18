package com.evs.vtiger.testScript;

import org.openqa.selenium.WebDriver;

import com.evs.vtiger.pageObject.AccountPage;
import com.evs.vtiger.pageObject.CommonPage;
import com.evs.vtiger.pageObject.LeadsPage;
import com.evs.vtiger.pageObject.MarketingPage;
import com.evs.vtiger.pageObject.SalesPage;
import com.evs.vtiger.utilities.Utils;

public class DeleteSalesLeads {

	

	Utils ut;
	CommonPage compage;
	LeadsPage leadspage;
	SalesPage salesLead;

	public DeleteSalesLeads(Utils ut, WebDriver driver) {
		this.ut = ut;
		leadspage=new LeadsPage(driver, ut);
		compage = new CommonPage(driver, ut);
		salesLead = new SalesPage(driver, ut);
	}
	
	public void deleteSalesLeads() {
		compage.Login();
		compage.clickOn_SalesLK();
		salesLead.clickOnSales_Leads();
		compage.enterValue_SearchTB("Ram");
		compage.selectUniqueField("First Name");
		compage.click_SearchNowBT();
		compage.checkedHeaderCheckBox();
		compage.clickOnDeleteBT();
		
		ut.alertAcceptPop();
	}
}
