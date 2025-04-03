package testCases;

import org.testng.annotations.Test;

import pageObject.homePage;
import testBase.baseClass;

public class TC004_navigate_homepage extends baseClass {

	@Test
	public void navigation_to_homepage() {
		homePage hp = new homePage(driver);
		hp.clickSevaandback();
		hp.verify_navigation_home();
	}
	
}
