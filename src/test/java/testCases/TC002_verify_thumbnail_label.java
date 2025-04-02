package testCases;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import pageObject.basePage;
import pageObject.homePage;
import pageObject.sevaPage;
import testBase.baseClass;

public class TC002_verify_thumbnail_label extends baseClass {

	@Test
	void verify_thumbnail_label() {
		homePage hp = new homePage(driver);
		hp.clickSeva();
		sevaPage sp = new sevaPage(driver);
		sp.go_to_createSeva();
		sp.check_thumbnail_dis();
	}

}
