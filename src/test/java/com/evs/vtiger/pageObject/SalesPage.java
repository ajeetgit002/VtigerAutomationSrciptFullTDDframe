package com.evs.vtiger.pageObject;

import org.openqa.selenium.WebDriver;

import com.evs.vtiger.pageObjectOR.SalesPageOR;
import com.evs.vtiger.utilities.Utils;

public class SalesPage extends SalesPageOR{
	Utils ut;
	
	public SalesPage(WebDriver driver,Utils ut) {
		super(driver);
		this.ut=ut;
	}
	
	public void clickOnSales_Leads() {
		ut.click(getSlleadsSLK());
	}

	public String verifyHeaderOfPage() {
		String header=ut.getText(getHeaderINT());
		return header;
	}
	
}
