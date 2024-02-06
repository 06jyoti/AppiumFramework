package apk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class WithdrawPage extends BaseMethod{
	
	public WithdrawPage(AndroidDriver driver) {
		super(driver);  
	    this.driver = driver;  
	    PageFactory.initElements(driver, this);
	}	

		 @FindBy(xpath="//android.widget.ImageView[@content-desc='WITHDRAW']") private WebElement  withdrawButton;	  
		 @FindBy(className="android.widget.EditText") private WebElement  withdrawAmount; 	
		 @FindBy(xpath="//android.widget.Button[@content-desc='Select']") private WebElement  selectAccountButton;
		 @FindBy(xpath="//android.view.View[@content-desc='test | 123456']") private WebElement  selectAccount;	
		 @FindBy(xpath="//android.widget.ImageView[@content-desc='CONFIRM']") private WebElement  confirm;	
		
		  public void withdraw(String amount) throws InterruptedException {
			    clickElement(withdrawButton);
				enterData(withdrawAmount, amount);
				clickElement(selectAccountButton);
				clickElement(selectAccount);
				clickElement(confirm);
				tapAtCoordinates(713, 1689);
	
			
			}


		

}
