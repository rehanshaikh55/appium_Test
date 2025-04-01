package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class calculatorTest {

	  static AppiumDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		openRapido();
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
	   System.out.println(e.getCause());	
	   System.out.println(e.getMessage());
		
		
		e.printStackTrace();
	}
	}
	
	public static void openRapido() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("appium:deviceName", "Galaxy Note8");
		cap.setCapability("appium:udid", "ce0717179aca141f017e");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:automationName", "uiAutomator2");
		cap.setCapability("appium:platformVersion", "9.0.0");
		cap.setCapability("appium:appPackage", "com.rapido.passenger");
		cap.setCapability("appium:appActivity", "com.rapido.passenger.DefaultAlias");

		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
		
		
		Thread.sleep(3000);
		driver.findElement( AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.gms:id/credential_primary_label\" and @text=\"091734 88443\"]")).click();
		Thread.sleep(6000);
		driver.findElement(AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"search_field\"]/android.view.View[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"address_list_item0\"]/android.view.View")).click();
		System.out.println("application started");
	}
	
	
	public static void loginRapido() throws InterruptedException {
		
		
	}

	
	
}
