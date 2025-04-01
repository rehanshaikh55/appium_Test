package testCases;

import org.testng.annotations.Test;

import pageObject.homePage;
import pageObject.notificationPage;
import testBase.baseClass;

public class TC001_notif_header_check extends baseClass {
 
	
	@Test
	public void verfiy_notification_header_in_capital() {
			homePage hp = new homePage(driver);
			hp.clickNoti();
			notificationPage np= new notificationPage(driver);
			np.checkNotiHeader();
	}
}
