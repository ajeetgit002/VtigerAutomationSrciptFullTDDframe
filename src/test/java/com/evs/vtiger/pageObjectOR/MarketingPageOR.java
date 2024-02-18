package com.evs.vtiger.pageObjectOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class MarketingPageOR {
	WebDriver driver;

	public MarketingPageOR(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[@class='level2SelTab']//a[text()='Campaigns']")
	private WebElement markcampaLK;

	@FindBy(xpath = "//td[@class='level2UnSelTab']//a[text()='Leads']")
	private WebElement mrktleadsLK;

	@FindBy(xpath = "//td[text()='Marketing > ']")
	private WebElement headerINT;

	@FindBy(xpath = "//img[@alt='Create Campaign...']")
	private WebElement createcampBT;

}
