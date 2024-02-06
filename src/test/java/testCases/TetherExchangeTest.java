package testCases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Server.AndroidServer;
import apk.pages.TetherExchangePage;
import apk.pages.UserLoginPage;
import apk.testdata.UserLogin;
import apk.testdata.Withdraw;


public class TetherExchangeTest extends AndroidServer {
	UserLoginPage login;
	TetherExchangePage exchangeTether;

	@BeforeMethod
	  public void step1() throws InterruptedException, MalformedURLException {
		 login = new UserLoginPage(driver);
		 login.loginPage(UserLogin.USERID,UserLogin.PASSWORD);
		 exchangeTether= new  TetherExchangePage(driver);	  
	  }
	 

	@Test
	public void addBnakAccount() throws InterruptedException  {
		exchangeTether.tetherExchange(Withdraw.TX_ID);		
	}

}
