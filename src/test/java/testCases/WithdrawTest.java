package testCases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Server.AndroidServer;
import apk.pages.UserLoginPage;
import apk.pages.WithdrawPage;
import apk.testdata.UserLogin;
import apk.testdata.Withdraw;

public class WithdrawTest extends AndroidServer {
	UserLoginPage login;
	WithdrawPage withdrawPage;

	@BeforeMethod
	  public void step1() throws InterruptedException, MalformedURLException {
		 login = new UserLoginPage(driver);
		 login.loginPage(UserLogin.USERID,UserLogin.PASSWORD);
		 withdrawPage= new  WithdrawPage(driver);

	  
	  }
	 

	@Test
	public void addBnakAccount() throws InterruptedException  {
		withdrawPage.withdraw(Withdraw.WITHDRAW_AMOUNT);

	}

}
