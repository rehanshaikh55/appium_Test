package pageObject;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class sevaPage extends basePage {

	public sevaPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void go_to_createSeva() {
		driver.findElement(
				AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"))
				.click();
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Done\"]")).click();

	}

	public void check_thumbnail_dis() {

		List<WebElement> labels = driver.findElements(By.className("android.view.View"));
		
		// boolean isLabelPresent = labels.stream().anyMatch(label -> label.getAttribute("content-desc").equalsIgnoreCase("Upload thumbnail"));

		//    Assert.assertTrue(isLabelPresent, "Upload thumbnail label is not present on the screen!");
		
		boolean isLabelPresent = false;
		for (WebElement lb : labels) {
			String desc = lb.getAttribute("content-desc");
			System.out.println(desc);
			if ("Upload thumbnail".equals(desc)) {
               isLabelPresent = true;
               System.out.println("yesssss");
               break;
               
           }
		}
		Assert.assertTrue(isLabelPresent, "Upload thumbnail label is not present on the screen!");

	}

}
