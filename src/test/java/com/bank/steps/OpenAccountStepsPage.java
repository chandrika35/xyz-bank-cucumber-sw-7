package com.bank.steps;

import com.bank.pages.OpenAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OpenAccountStepsPage {
    @And("^I Click On Open Account Button$")
    public void iClickOnOpenAccountButton() {
        new OpenAccountPage().clickingOnTheOpenAccountButton();
    }

    @And("^I Select The \"([^\"]*)\" From Customer Drop Down$")
    public void iSelectTheFromCustomerDropDown(String customer) {
        new OpenAccountPage().selectingCreatedCustomerFromTheCustomerNameDropDown(customer);
    }

    @And("^I Select The \"([^\"]*)\" From Currency Drop Down$")
    public void iSelectTheFromCurrencyDropDown(String currency) {
        new OpenAccountPage().selectingTheCurrencyFromCurrencyDropDown(currency);
    }

    @And("^I Click On Process Button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickingOnTheProcessButton();
    }

    @Then("^I Can Verify The Account Creation Confirmation Text$")
    public void iCanVerifyTheAccountCreationConfirmationText() {
        new OpenAccountPage().verifyingAccountCreationText();
    }
}
