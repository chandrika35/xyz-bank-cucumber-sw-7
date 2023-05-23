package com.bank.steps;

import com.bank.pages.CustomerLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerLoginAndLogoutStepsPage {
    @When("^I Click On Customer Login Button$")
    public void iClickOnCustomerLoginButton() {
        new CustomerLoginPage().clickingOnCustomerLoginButton();
    }

    @And("^I Select \"([^\"]*)\" From Customer Drop Down$")
    public void iSelectFromCustomerDropDown(String customer) {
        new CustomerLoginPage().selectingCustomerNameFromYourNameDropDown(customer);
    }

    @And("^I Click On Login Button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickingOnTheLoginButton();
    }

    @And("^I Verify That The Logout Tab Is Displayed$")
    public void iVerifyThatTheLogoutTabIsDisplayed() {
        new CustomerLoginPage().verifyingTheLogoutTabIsDisplayedOrNot();
    }

    @And("^I Click On The Logout Tab$")
    public void iClickOnTheLogoutTab() {
        new CustomerLoginPage().clickingOnTheLogoutTab();
    }

    @Then("^I Can Verify That Your Name Text Is Displayed$")
    public void iCanVerifyThatYourNameTextIsDisplayed() {
        new CustomerLoginPage().verifyThatYourNameTextIsDisplayed();
    }
}
