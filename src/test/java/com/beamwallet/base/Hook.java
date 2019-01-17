package com.beamwallet.base;

import com.beamwallet.pages.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hook {
    @Before
    public void initializeTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("avd", "Nexus_5_API_26");

        capabilities.setCapability("appPackage", "");
        capabilities.setCapability("appActivity", "");
        BasePage.driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDownTest(Scenario scenario) {
        if (scenario.isFailed()) try {
            byte[] screenshot =
                    ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (ClassCastException cce) {
            cce.printStackTrace();
        }
        BasePage.driver.quit();
    }
}
