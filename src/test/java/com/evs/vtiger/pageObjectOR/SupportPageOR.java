package com.evs.vtiger.pageObjectOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
@Getter
public class SupportPageOR {

	WebDriver driver ;
	
	public SupportPageOR(WebDriver rdriver) {
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//td[@class='level2SelTab']//a[text()='Trouble Tickets']")
	private WebElement tTicketsSLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='FAQ']")
	private WebElement faqSLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Accounts']")
	private WebElement supportAccSLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Contacts']")
	private WebElement supporContactSLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Documents']")
	private WebElement supporDocumLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Webmail']")
	private WebElement supporwebmSLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Service Contracts']")
	private WebElement supportservContractSLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Project Milestones']")
	private WebElement supportProMileSLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Project Tasks']")
	private WebElement supportProjectTaSLK;
	
	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Projects']")
	private WebElement supportProjectsSLK;
}
