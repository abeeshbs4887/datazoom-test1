package com.xminds.base;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public void launchBrowser() {
		try {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void loadUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void getTitle() {
		try {
			String title = driver.getTitle();
			System.out.println(title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void maximize() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShot(Scenario s) {
		TakesScreenshot tk=(TakesScreenshot)driver;
		byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
		
		

	}
	public void deleteCookies() {
		try {
			driver.manage().deleteAllCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void sendValue(WebElement element,String user) {
		try {
			element.sendKeys(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public void button(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void implicitWait() {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void getText(WebElement element) {
		try {
			String text = element.getText();
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static WebElement waitForElementToBeVisible(WebDriver driver,int seconds,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
        element=wait.until(ExpectedConditions.visibilityOf(element));
        return element;
		
	}
		
	}







