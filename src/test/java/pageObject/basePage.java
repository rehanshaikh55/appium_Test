package pageObject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class basePage {
    AppiumDriver driver;

    public basePage(AppiumDriver driver) {
        this.driver = driver;

    }
}
