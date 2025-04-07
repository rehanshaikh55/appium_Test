package testBase;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumBy;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println("application started");
		
		
		
		driver.findElement(AppiumBy.xpath("//android.widget.EditText")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("1111111111");
		driver.findElement(AppiumBy.accessibilityId("Login")).click();
		 
	
		String otpText = driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getText();
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(otpText);

		String otp = ""; // initialize otp
		if (matcher.find()) {
		    otp = matcher.group(); // extract first number match
		    System.out.println("OTP: " + otp);
		} else {
		    System.out.println("No OTP found in the toast message.");
		}

		// Send OTP to the input field
		driver.findElement(AppiumBy.androidUIAutomator(
		    "new UiSelector().className(\"android.widget.EditText\").instance(1)")
		).click();

		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiSelector().className(\"android.widget.EditText\").instance(1)")
			).sendKeys(otp);
		
		driver.findElement(AppiumBy.accessibilityId("Login")).click();
	}

	@AfterClass
	public void teardown() {
		System.out.println("application closed");
		driver.quit();
	}

}
