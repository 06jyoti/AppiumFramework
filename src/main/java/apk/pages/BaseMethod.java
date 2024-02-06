package apk.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.touch.offset.PointOption;


public class BaseMethod extends RegularLocators{
	
	AndroidDriver driver;
	
	public BaseMethod(AndroidDriver driver) {
	super(driver);
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
}



public void waitForElementVisibility(By locator, int timeout, boolean ignoreException) {
	try {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	} catch (Exception e) {
		if (!ignoreException) {
			Assert.fail(e.getMessage());
		}
	}
}

public void waitForElementClickable(WebElement element, int timeout, boolean ignoreException) {
	try {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
	} catch (Exception e) {
		if (!ignoreException) {

		}
	}
}

public void clickElement(WebElement element) {
	waitForElementClickable(element, 30, false);
	element.click();
}

public void clickElementJavaScript(WebElement element) {
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", element);
}


public void enterData(WebElement element, String value) {
	waitForElementVisibility(element, 30, false);
	waitForElementClickable(element, 30, false);
	element.click();
	element.sendKeys(value);
}

public void tapAtCoordinates(int x, int y) throws InterruptedException {
	Thread.sleep(2000);
	new TouchAction<>(driver).tap(PointOption.point(x, y)).perform();
}

public void enterDataByCoordinates( WebElement tapAtCoordinates, String value) {
	waitForElementVisibility(tapAtCoordinates, 20, false);
	waitForElementClickable(tapAtCoordinates, 20, false);
	tapAtCoordinates.click();
	tapAtCoordinates.sendKeys(value);
}

public void waitForElementVisibility(WebElement element, int timeout, boolean ignoreException) {
	try {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		webDriverWait.until(ExpectedConditions.visibilityOf(element));
	} catch (Exception e) {
		if (!ignoreException) {
			Assert.fail(e.getMessage());
		}
	}
}	  
}

