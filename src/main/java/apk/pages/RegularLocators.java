package apk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Server.AndroidServer;
import io.appium.java_client.android.AndroidDriver;

public class RegularLocators extends AndroidServer{
	
	public RegularLocators(AndroidDriver driver) {  
	    this.driver = driver;  
	    PageFactory.initElements(driver, this);
	}
	


}
