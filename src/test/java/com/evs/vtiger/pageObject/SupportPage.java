package com.evs.vtiger.pageObject;

import org.openqa.selenium.WebDriver;

import com.evs.vtiger.pageObjectOR.SupportPageOR;
import com.evs.vtiger.utilities.Utils;

public class SupportPage extends SupportPageOR {
	Utils ut;

	public SupportPage(WebDriver driver, Utils ut) {
		super(driver);
		this.ut = ut;
	}

	public void clickOn_TrubelsSLK() {
		ut.click(getTTicketsSLK());
	}

	public void clickOn_FAQSLK() {
		ut.click(getFaqSLK());
	}

	public void clickOn_AccountsSLK() {
		ut.click(getSupportAccSLK());
	}

	public void clickOn_ContactsSLK() {
		ut.click(getSupporContactSLK());
	}

	public void clickOn_DocumentSLK() {
		ut.click(getSupporDocumLK());
	}

	public void clickOn_WebmailSLK() {
		ut.click(getSupporwebmSLK());
	}

	public void clickOn_ServiceContrectSLK() {
		ut.click(getSupportservContractSLK());
	}

	public void clickOn_ProjectMileSLK() {
		ut.click(getSupportProMileSLK());
	}

	public void clickOn_ProjectTaskSLK() {
		ut.click(getSupportProjectTaSLK());
	}

	public void clickOn_ProjectsSLK() {
		ut.click(getSupportProjectsSLK());
	}
}
