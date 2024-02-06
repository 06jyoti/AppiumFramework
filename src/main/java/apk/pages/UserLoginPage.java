package apk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class UserLoginPage extends BaseMethod{
	
	public UserLoginPage(AndroidDriver driver) {
		super(driver);  
	    this.driver = driver;  
	    PageFactory.initElements(driver, this);
	}	

		 @FindBy(xpath="//android.widget.EditText[@index='2']") private WebElement  userID;	  
		 @FindBy(xpath="//android.widget.EditText[@index='4']") private WebElement  pass; 	
		 @FindBy(xpath="//android.view.View[@content-desc=\"Login\"]") private WebElement  login;
		
		  public void loginPage(String UserID, String Pass) throws InterruptedException {
				enterData(userID, UserID);
				enterData(pass, Pass);
				tapAtCoordinates(546, 1318);
				clickElement(login);
			
			}

}
