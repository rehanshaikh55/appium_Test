package pageObject;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class sevaPage extends basePage{

	public sevaPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void go_to_createSeva() {
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Done\")")).click();
	    
	}
	
	public void check_thumbnail_dis() {
		
		
		List<WebElement> labels = driver.findElements(By.className("android.view.View"));
		for(WebElement lb : labels){
			String desc= lb.getAttribute("content-desc");
			System.out.println(desc);
			if(desc == "Add Location") {
			assertEquals(desc, "Add Location");
		
			}}
		
	}
 
}
