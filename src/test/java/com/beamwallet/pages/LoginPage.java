package com.beamwallet.pages;

import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginPage extends BasePage {
    By btnTermsAndCondition = By.id("terms");
    By nextButton = By.className("android.widget.Button");
    By txtEmailField =  By.id("entry");
    By keyBoard = By.id("keyboard");

    public void iAmOnTheLoginPage() {
        waitForVisibilityOf(btnTermsAndCondition,10);
        assertThat("Login with email page is not opened!", isElementPresent(driver.findElement(btnTermsAndCondition),5));
    }

    public void iTypeMyEmailAs(String email) {
        driver.findElement(txtEmailField).sendKeys(email);
        driver.findElement(nextButton).click();
    }

    public void iTypeMyPasswordAs(String pass) {
       String[] digits = pass.split("");

       for (int i=0; i < digits.length; i++) {
        String var = digits[i];
        String path = String.format("//android.widget.Button[@text='%s']", var);
        driver.findElement(keyBoard).findElement(By.xpath(path)).click();
        }
    }

}
