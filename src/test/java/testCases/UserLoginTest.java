package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Server.AndroidServer;
import apk.pages.UserLoginPage;
import apk.testdata.UserLogin;

public class UserLoginTest extends AndroidServer{
	UserLoginPage login;
	
 
	
	@Test
	public void Login() throws InterruptedException {	
    	 login = new UserLoginPage(driver);
		 login.loginPage(UserLogin.USERID,UserLogin.PASSWORD);

}

}
