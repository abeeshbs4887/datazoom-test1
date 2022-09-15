package com.xminds.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xminds.base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtUsername;

	@FindBy(id="password")
	private WebElement txtPassword;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//p[@class='text-danger text-center']")
	private WebElement txtMessage;

	public WebElement getTxtMessage() {
		return txtMessage;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLogin() {
		return login;
	}
	

	public void TC01() {
		String currentUrl = driver.getCurrentUrl();
		String actualUrl ="https://stagingapp.datazoom.io/login";
		if (actualUrl.equals(currentUrl)) {
			System.out.println("User Login Successfully");
		} else {
			System.out.println("User Not Login Successfully");
		}
	}
	public void TC02(String username, String password) {
		sendValue(getTxtUsername(), username);
		sendValue(getTxtPassword(), password);
	}
	public void TC03() {
		button(getLogin());
	}
	public void TC04(String Username, String Password) {
		sendValue(getTxtUsername(),Username);
		sendValue(getTxtPassword(), Password);

	}
	public void TC05() {
		getText(getTxtMessage());

	}
	
}
