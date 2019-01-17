package com.beamwallet.steps;

import com.beamwallet.pages.LoginPage;
import com.beamwallet.pages.SignInPage;
import com.beamwallet.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BeamTestSteps {
    @Given("^I am on the sign in page$")
    public void iAmOnTheSignInPage() {
        new SignInPage().iAmOnTheSignInPage();
    }

    @And("^I click on login with email button$")
    public void iClickOnLoginWithEmailButton()  {
       new SignInPage().iClickOnLoginWithEmailButton();
    }

    @Then("^I am on the login page$")
    public void iAmOnTheLoginPage()  {
        new LoginPage().iAmOnTheLoginPage();
    }

    @When("^I type my email as \"([^\"]*)\"$")
    public void iTypeMyEmailAs(String email) {
        new LoginPage().iTypeMyEmailAs(email);
    }

    @And("^I type my password as \"([^\"]*)\"$")
    public void iTypeMyPasswordAs(String pass) {
        new LoginPage().iTypeMyPasswordAs(pass);
    }

    @Then("^I am on the my account page$")
    public void iAmOnTheMyAccountPage() {
        new HomePage().iAmOnTheMyAccountPage();
    }
}
