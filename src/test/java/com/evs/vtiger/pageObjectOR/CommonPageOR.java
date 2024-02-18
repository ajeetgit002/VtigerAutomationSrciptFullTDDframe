package com.evs.vtiger.pageObjectOR;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class CommonPageOR {
	WebDriver ldriver;

	public CommonPageOR(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
// login WebElement
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement usernameTB;

	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement userpassTB;

	@FindBy(xpath = "//input[@name='Login']")
	private WebElement loginBT;
// common for save delete edit WebElement 
	@FindBy(xpath = "//div[@id='basicTab']//table[@class='dvtContentSpace']/descendant-or-self::div[2]//input[@title='Save [Alt+S]']")
	private WebElement clickOnSaveBT;

	@FindBy(xpath = "//table[@class='small']//input[@class='crmbutton small delete']")
	private WebElement deleteBT;

	@FindBy(xpath = "//table[@class='small']//input[@value='Mass Edit']")
	private WebElement editBT;
	
	// Main module Link WebElement 
	@FindBy(xpath = "//a[text()='My Home Page']")
	private WebElement homepageLK;

	@FindBy(xpath = "//a[text()='Marketing']")
	private WebElement marketingLK;

	@FindBy(xpath = "//a[text()='Sales']")
	private WebElement salesLK;

	@FindBy(xpath = "//a[text()='Support']")
	private WebElement supportLK;;

	@FindBy(xpath = "//a[text()='Analytics']")
	private WebElement analyticsLK;

	@FindBy(xpath = "//a[text()='Inventory']")
	private WebElement inventoryLK;
	
	@FindBy(xpath = "//a[text()='Tools']")
	private WebElement toolsLK;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutLK;
	
	// Sub Madule Landing Page Search test box and Search Field Dropdown and search now button
	
	@FindBy(xpath = "//input[@class='txtBox']")
	private WebElement serchTB;
	
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement searchnowBT;
	@FindBy(xpath = "//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']")
	private WebElement searchFieldDD;
	
	
	///   Sub module WebElement 
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Accounts']")
	private WebElement accLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Contacts']")
	private WebElement conctLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Webmail']")
	private WebElement webmailLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Documents']")
	private WebElement documLK;
	
	@FindBy(xpath = "//td[@class='level2SelTab']//a[text()='Invoice']")
	private WebElement invoiceLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Sales Order']")
	private WebElement selesOrderLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Quotes']")
	private WebElement quotesLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Price Books']")
	private WebElement pricebooksLK;
	
	
	
	
	
	
	
	
	
	
	
	// Check Boxes Web Elements
	
	@FindBys(@FindBy(xpath = "//input[@name='selected_id']"))
	private List<WebElement> checkBoxes;
	
	
	// WebElemet Check box
	@FindBy(xpath = "//input[@name='selectall']")
	private WebElement headerCheckBox;
	
	
}
