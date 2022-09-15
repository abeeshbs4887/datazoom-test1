package com.xminds.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xminds.base.BaseClass;

public class DashBoard extends BaseClass {
	public DashBoard() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='header-menu'][@href='/datapipe-list']")
	private WebElement datapipes;


	public WebElement getDatapipes() {
		return datapipes;

	}

	public void TC01() {
		button(getDatapipes());

	}
	public void TC02() {
		navigateBack();
	}
	public void TC03() {
		String currentUrl = driver.getCurrentUrl();
		String actualUrl ="https://stagingapp.datazoom.io/dashboard";
		if (actualUrl.equals(currentUrl)) {
			System.out.println("You are in DashBoard Page");
		} else {
			System.out.println("You are not in DashBoard Page");
		}
	}
}
