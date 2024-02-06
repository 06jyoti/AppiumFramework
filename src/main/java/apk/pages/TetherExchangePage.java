package apk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class TetherExchangePage extends BaseMethod{
	
	public TetherExchangePage(AndroidDriver driver) {
		super(driver);  
	    this.driver = driver;  
	    PageFactory.initElements(driver, this);
	}	

		 @FindBy(xpath="//android.widget.ImageView[@content-desc='GoTo Tether Exchange'] ") private WebElement  goToTetherExchange;	  
		 @FindBy(xpath="(//android.view.View[@content-desc='Join Now'])[1]") private WebElement  joinNowButton; 	
		 @FindBy(xpath="//android.widget.EditText[@index='21']") private WebElement  textField;
		 @FindBy(xpath="//android.view.View[@content-desc='Upload*']") private WebElement  upload;	
		 @FindBy(xpath="//android.widget.Button[@content-desc='Camera']") private WebElement  openCamera;	
		 @FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button") private WebElement  permissions; 	
		 @FindBy(xpath="//android.widget.ImageView[@content-desc='Shutter']") private WebElement  shutter;
		 @FindBy(xpath="//android.widget.ImageButton[@content-desc='Done']") private WebElement  captureImage;	  
		 @FindBy(xpath="//android.widget.TextView[@content-desc='Crop']") private WebElement  crop; 	
		 @FindBy(xpath="//android.widget.Button[@content-desc='Select']") private WebElement  image;	  
		 @FindBy(xpath="//android.view.View[@content-desc='OK Exchange'] ") private WebElement  okExchange; 	
		 @FindBy(xpath="//android.widget.ImageView[@content-desc='Confirm']") private WebElement  confirm;
		 @FindBy(xpath=" //android.view.View[@index='3']") private WebElement  checkBox;	
		 @FindBy(xpath="//android.view.View[@content-desc='CONFIRM']") private WebElement  confirmBtn;	
		
		
		  public void tetherExchange(String enterText) throws InterruptedException {
			    clickElement(goToTetherExchange);
			    clickElement(joinNowButton);
				enterData(textField, enterText);
				clickElement(upload);
				clickElement(openCamera);
				clickElement(permissions);
				clickElement(shutter);
				clickElement(captureImage);
				clickElement(crop);
				clickElement(image);
				clickElement(okExchange);
				clickElement(confirm);
				clickElement(checkBox);
				clickElement(confirmBtn);
			
			}


		

}
