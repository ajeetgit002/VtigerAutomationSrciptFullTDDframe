package com.evs.vtiger.pageObject;

import org.openqa.selenium.WebDriver;

import com.evs.vtiger.pageObjectOR.LeadsOR;
import com.evs.vtiger.utilities.ReadLeads_Details;
import com.evs.vtiger.utilities.Utils;

public class LeadsPage extends LeadsOR {
	ReadLeads_Details leadsdata;
	private Utils ut;

	public LeadsPage(WebDriver driver, Utils ut) {
		super(driver);
		this.ut = ut;
		leadsdata = new ReadLeads_Details();
	}

	public void clickOn_CreateNewLeadsBT() {
		ut.click(getCreateNewLeadiconBT());
	}

	public void verifyHeaderOfCreateNewPage() {
		String actheader = ut.getText(getCreateleadsPageHeaderINT());
		ut.verifyText(actheader, "Creating New Lead");

	}

	public void createNewLeadsPage() {

		ut.selectByValue(getNametitleDD(), leadsdata.getNameTitle());

		ut.inputValue(getFirstnameTB(), leadsdata.getFirstName());
		ut.verifyText(ut.getAttribute(getFirstnameTB(), "value"), leadsdata.getFirstName());
		ut.inputValue(getLastnameTB(), leadsdata.getLastName());
		ut.verifyText(ut.getAttribute(getLastnameTB(), "value"), leadsdata.getLastName());
		ut.inputValue(getCompanyTB(), leadsdata.getCompany());
		ut.verifyText(ut.getAttribute(getCompanyTB(), "value"), leadsdata.getCompany());
		ut.inputValue(getRoletitleTB(), leadsdata.getTitle());
		ut.verifyText(ut.getAttribute(getRoletitleTB(), "value"), leadsdata.getTitle());
		ut.selectByValue(getLeadssourceDD(), "Public Relations");

		ut.selectByValue(getLeadstatusDD(), "Pre Qualified");
		ut.inputValue(getPhoneTB(), leadsdata.getPhone());
		ut.verifyText(ut.getAttribute(getPhoneTB(), "value"), leadsdata.getPhone());
		ut.inputValue(getFaxTB(), "5545-854-558");
		ut.verifyText(ut.getAttribute(getFaxTB(), "value"), "5545-854-558");
		ut.inputValue(getEmailTB(), leadsdata.getEamil());
		ut.verifyText(ut.getAttribute(getEmailTB(), "value"), leadsdata.getEamil());
		ut.inputValue(getStreetTB(), leadsdata.getStreet());
		ut.verifyText(ut.getAttribute(getStreetTB(), "value"), leadsdata.getStreet());
		ut.inputValue(getPoboxTB(), leadsdata.getPostBox());
		ut.verifyText(ut.getAttribute(getPoboxTB(), "value"), leadsdata.getPostBox());
		ut.inputValue(getPostelcodeTB(), leadsdata.getPinCode());
		ut.verifyText(ut.getAttribute(getPostelcodeTB(), "value"), leadsdata.getPinCode());
		ut.inputValue(getCityTB(), leadsdata.getCity());
		ut.verifyText(ut.getAttribute(getCityTB(), "value"), leadsdata.getCity());
		ut.inputValue(getCountryTB(), "INDIA");
		ut.verifyText(ut.getAttribute(getCountryTB(), "value"),"INDIA");
		ut.inputValue(getStateTB(), leadsdata.getState());
		ut.verifyText(ut.getAttribute(getStateTB(), "value"),leadsdata.getState());
		ut.inputValue(getDescriptionTB(), leadsdata.getDescription());
		ut.verifyText(ut.getAttribute(getDescriptionTB(), "value"),leadsdata.getDescription());

	}
}
