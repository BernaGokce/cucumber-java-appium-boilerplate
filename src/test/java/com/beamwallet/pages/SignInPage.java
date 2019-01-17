package com.beamwallet.pages;

import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;

public class SignInPage extends BasePage {
    By btnSignIn = By.id("alternatives");

    public void iAmOnTheSignInPage() {
        waitForVisibilityOf(btnSignIn,10);
        assertThat("Sign in page is not opened!", isElementPresent(driver.findElement(btnSignIn),5));
    }

    public void iClickOnLoginWithEmailButton() {
        driver.findElement(btnSignIn).click();
    }
}
