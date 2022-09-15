package com.xminds.steps;


import com.xminds.base.BaseClass;
import com.xminds.pages.DashBoard;
import com.xminds.pages.LoginPage;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass{

	@Given("User open the chrome browser")
	public void userOpenTheChromeBrowser() {
	}

	@When("User launch the datazoom application")
	public void userLaunchTheDatazoomApplication() {
	}

	@Then("User verify the datazoom page")
	public void userVerifyTheDatazoomPage() {
		LoginPage login=new LoginPage();
		login.TC01();
	}

	@When("User Enter Valid {string} and {string}")
	public void userEnterValidAnd(String username, String password) {
		LoginPage login=new LoginPage();
		login.TC02(username, password);
	}

	@When("User Click Login Button")
	public void userClickLoginButton() {
		LoginPage login=new LoginPage();
		login.TC03();
	}

	@When("User click DataPipes")
	public void userClickDataPipes() throws InterruptedException {
		DashBoard board=new DashBoard();
		board.TC01();
		
	}

	@When("User Redirect DashBoard page")
	public void userRedirectDashBoardPage() {
		DashBoard board=new DashBoard();
		board.TC02();
	}

	@Then("User verify The DashBoard page")
	public void userVerifyTheDashBoardPage() {
		DashBoard board=new DashBoard();
		board.TC03();
	}
	@When("User Enter Invalid {string} and {string}")
	public void userEnterInvalidAnd(String Username, String Password) {
		LoginPage login=new LoginPage();
		login.TC04(Username, Password);
	}
	@Then("User verify the error message")
	public void userVerifyTheErrorMessage() {
		LoginPage login=new LoginPage();
		login.TC05();
	}


}
