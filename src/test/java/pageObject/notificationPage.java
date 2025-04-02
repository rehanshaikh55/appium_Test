package pageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class notificationPage extends basePage {

	public notificationPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// By notiHeader =
	// AppiumBy.xpath("//android.view.View[@content-desc=\"Notifications\"]");

	public void checkNotiHeader() {
		WebElement header = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Notifications\")"));
		String headerText = header.getAttribute("content-desc");
		Assert.assertEquals(headerText, "NOTIFICATIONS");
	}
}
