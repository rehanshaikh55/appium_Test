package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;


public class homePage extends basePage {

	public homePage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
     //By notification = AppiumBy.xpath("//android.widget.ScrollView/android.widget.ImageView[3]");

	
	 public void clickNoti() {
		 driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.ImageView[3]")).click();
	 }
	 public void clickSeva() {
		 driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Seva\"]")).click();;
	 }
}
