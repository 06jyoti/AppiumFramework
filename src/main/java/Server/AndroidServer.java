package Server;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AndroidServer {
	
	public  AndroidDriver driver; 
	public  AppiumDriverLocalService service;
		  
	 @BeforeClass 
	  public void Config() throws MalformedURLException, InterruptedException {
	           service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\dell\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
					.withIPAddress("127.0.0.1").usingPort(4723).build();
					service.start();	
					
					Thread.sleep(5000);
					
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("Pixel 7 Pro API 31");
		options.setApp("C:\\Users\\dell\\Downloads\\tether-release.apk");
		
		 driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	  }
		
		  @AfterClass 
		  public void tearDown(){ 
			  driver.quit(); 
			  service.stop();
			  }
		 

}
