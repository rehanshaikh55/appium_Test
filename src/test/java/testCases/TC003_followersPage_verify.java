package testCases;

import org.testng.annotations.Test;

import pageObject.homePage;
import testBase.baseClass;

public class TC003_followersPage_verify extends baseClass {
         
	@Test
	public void follower_page_verify() {
		homePage hp = new homePage(driver);
		hp.clickProfile();
	}
	
}
