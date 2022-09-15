package com.xminds.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.xminds.base.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void beforeScenario() {
		launchBrowser();
		maximize();
		implicitWait();
		loadUrl("https://stagingapp.datazoom.io/login");
		deleteCookies();
		
	}
	
	@After
	public void afterScenario(Scenario s) {
		TakesScreenshot screen=(TakesScreenshot)driver;
		byte[] screenshotAs = screen.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshotAs, "img/png");
		
	}

}
