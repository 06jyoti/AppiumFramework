package apk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class AddAccountPage extends BaseMethod{
	
	public AddAccountPage(AndroidDriver driver) {
		super(driver);  
	    this.driver = driver;  
	    PageFactory.initElements(driver, this);
	}	

		 @FindBy(xpath="//android.widget.ImageView[@content-desc='ADD ACCOUNT']") private WebElement  addAccount;	  
		 @FindBy(xpath="//android.widget.EditText[@index='2']") private WebElement  accountHolderName; 	
		 @FindBy(xpath="//android.widget.EditText[@index='5']") private WebElement  accountNumber;
		 @FindBy(xpath="//android.widget.EditText[@index='8']") private WebElement  IFSC;	
		 @FindBy(xpath="//android.widget.Button[@index='11']") private WebElement  bank;	
		 @FindBy(xpath="//android.view.View[@content-desc='UNION BANK']") private WebElement  bankName; 	
		 @FindBy(xpath="//android.view.View[@index='13']") private WebElement  defaultAccount;
		 @FindBy(xpath="//android.view.View[@content-desc='Your Work Account 0']") private WebElement  yourWorkAccount;	  
		 @FindBy(xpath="//android.widget.ImageView[@content-desc='View All Accounts']") private WebElement  viewAllAccount; 	
		
		
		  public void addUserAccount(String accountOwnerName, String accNo, String IFSCCode) throws InterruptedException {
			    clickElement(addAccount);
				enterData(accountHolderName, accountOwnerName);
				enterData(accountNumber, accNo);
				enterData(IFSC, IFSCCode);
				clickElement(bank);
				clickElement(bankName);
				clickElement(defaultAccount);
				tapAtCoordinates(739, 2813);
				tapAtCoordinates(715, 1604);
				clickElement(yourWorkAccount);
				clickElement(viewAllAccount);
			
			}


		

}
