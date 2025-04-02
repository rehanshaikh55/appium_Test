package testBase;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class baseClass {
	public static AppiumDriver driver;

	@BeforeClass
	public void setup() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium:deviceName", "Galaxy note 8");
		cap.setCapability("appium:udid", "ce0717179aca141f017e");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:automationName", "uiAutomator2");
		cap.setCapability("appium:platformVersion", "13");
		cap.setCapability("appium:appPackage", "com.dotpitch.sanatanam.sanatanam");
		cap.setCapability("appium:appActivity", "com.dotpitch.sanatanam.sanatanam.MainActivity");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("application started");

	}

	@AfterClass
	public void teardown() {
		System.out.println("application closed");
		driver.quit();
	}

}
