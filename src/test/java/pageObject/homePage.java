package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class homePage extends basePage {

	public homePage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// By notification =
	// AppiumBy.xpath("//android.widget.ScrollView/android.widget.ImageView[3]");

	public void clickNoti() {
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.ImageView[3]")).click();
	}

	public void clickSeva() {
		driver.findElement(
				AppiumBy.accessibilityId("Seva"))
				.click();
		
	}
	public void clickProfile() {
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click();
		driver.findElement(AppiumBy.accessibilityId("Welcome,\nKedarnath Temple")).click();
		driver.findElement(AppiumBy.accessibilityId("24\nPosts\n2500\nFollowers")).click();
	   List<WebElement> followerPage=driver.findElements(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View"));
	   System.out.println(followerPage.size());
	   if(followerPage.size() <= 2) {
		   Assert.fail();
	   }
	}
}
