package com.evs.vtiger.pageObjectOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
@Getter

public class AccountOR {

	public AccountOR(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Create New Accounts WebElement 
	@FindBy(xpath = "//img[@alt='Create Account...']")
	private WebElement clickNewBT;
	@FindBy(xpath = "//span[text()='Creating New Account']")
	private WebElement newaccpageheaderINT;
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement acnameTB;
	@FindBy(xpath = "//input[@name='website']")
	private WebElement websiteTB;
	@FindBy(xpath = "//input[@name='tickersymbol']")
	private WebElement tickerTB;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phoneTB;
	@FindBy(xpath = "//input[@name='fax']")
	private WebElement faxTB;
	@FindBy(xpath = "//input[@name='email1']")
	private WebElement emailTB;
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement addrssTB;
	@FindBy(xpath = "//input[@name='bill_pobox']")
	private WebElement poboxTB;
	@FindBy(xpath = "//input[@name='bill_city']")
	private WebElement cityTB;
	@FindBy(xpath = "//input[@name='bill_state']")
	private WebElement stateTB;
	@FindBy(xpath = "//input[@name='bill_code']")
	private WebElement piccodeTB;
	@FindBy(xpath = "//input[@name='bill_country']")
	private WebElement contTB;
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement decripTB;
	
	// Delete Accounts WebElement 
	
	
	
	
}
