package com.beamwallet.pages;

import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomePage extends BasePage {
    By titleRewardsBalance = By.id("rewards");

    public void iAmOnTheMyAccountPage() {
        waitForVisibilityOf(titleRewardsBalance,10);
        assertThat("Home page is not opened!", isElementPresent(driver.findElement(titleRewardsBalance),5));
    }
}
