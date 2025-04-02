package appiumtest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class myntraapp {

	  static AppiumDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		openMyntra();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
	   System.out.println(e.getCause());	
	   System.out.println(e.getMessage());
		
		
		e.printStackTrace();
	}
	}
	
	public static void openMyntra() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("appium:deviceName", "Galaxy Note8");
		cap.setCapability("appium:udid", "ce0717179aca141f017e");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:automationName", "uiAutomator2");
		cap.setCapability("appium:platformVersion", "9.0.0");
		cap.setCapability("appium:appPackage", "com.amazon.mShop.android.shopping");
		cap.setCapability("appium:appActivity", "com.amazon.mShop.splashscreen.StartupActivity");

		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
		
		
		
		System.out.println("application started");
	}
	
	
	

	
	
}
