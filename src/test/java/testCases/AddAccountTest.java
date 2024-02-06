package testCases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Server.AndroidServer;
import apk.pages.AddAccountPage;
import apk.pages.UserLoginPage;
import apk.testdata.AddAccount;
import apk.testdata.UserLogin;

public class AddAccountTest extends AndroidServer {
	UserLoginPage login;
	AddAccountPage bankAccount;

	@BeforeMethod
	  public void step1() throws InterruptedException, MalformedURLException {
		 login = new UserLoginPage(driver);
		 login.loginPage(UserLogin.USERID,UserLogin.PASSWORD);
	  bankAccount= new  AddAccountPage(driver);

	  
	  }
	 

	@Test
	public void addBnakAccount() throws InterruptedException  {
	//	bankAccount = new AddAccountPage(driver);
		bankAccount.addUserAccount(AddAccount.USERBANKNAME,AddAccount.ACCOUNT_NO,AddAccount.IFSC_CODE);

	}

}
