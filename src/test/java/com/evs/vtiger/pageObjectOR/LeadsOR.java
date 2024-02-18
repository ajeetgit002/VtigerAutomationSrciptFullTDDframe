package com.evs.vtiger.pageObjectOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
@Getter
public class LeadsOR {

	public LeadsOR(WebDriver driver) {
		 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createNewLeadiconBT;
	@FindBy(xpath = "//span[text()='Creating New Lead']")
	private WebElement createleadsPageHeaderINT;
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement nametitleDD;
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstnameTB;
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastnameTB;
	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyTB;
	@FindBy(xpath = "//input[@name='designation']")
	private WebElement roletitleTB;
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadssourceDD;
	
	@FindBy(xpath = "//select[@name='leadstatus']")
	private WebElement leadstatusDD;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phoneTB;
	
	@FindBy(xpath = "//input[@name='fax']")
	private WebElement faxTB;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailTB;
	@FindBy(xpath = "//textarea[@name='lane']")
	private WebElement streetTB;
	@FindBy(xpath = "//input[@name='pobox']")
	private WebElement poboxTB;
	
	@FindBy(xpath = "//input[@name='code']")
	private WebElement postelcodeTB;
	@FindBy(xpath = "//input[@name='city']")
	private WebElement cityTB;
	@FindBy(xpath = "//input[@name='country']")
	private WebElement countryTB;
	@FindBy(xpath = "//input[@name='state']")
	private WebElement stateTB;
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement descriptionTB;
	
	
}
