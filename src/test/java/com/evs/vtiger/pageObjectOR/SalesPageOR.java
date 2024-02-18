package com.evs.vtiger.pageObjectOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class SalesPageOR {
	WebDriver driver;

	public SalesPageOR(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[@class='level2SelTab']//a")
	private WebElement slleadsSLK;

	@FindBy(xpath = "//td[text()='Sales > ']")
	private WebElement headerINT;

}
