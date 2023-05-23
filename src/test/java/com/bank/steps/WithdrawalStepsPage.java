package com.bank.steps;

import com.bank.pages.AccountPage;
import com.bank.pages.CustomerLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class WithdrawalStepsPage {
    @And("^I Choose \"([^\"]*)\" From Customer Drop Down$")
    public void iChooseFromCustomerDropDown(String customer) {
        new CustomerLoginPage().selectingCustomerNameFromYourNameDropDown(customer);
    }

    @And("^I Click On Withdraw Button$")
    public void iClickOnWithdrawButton() {
        new AccountPage().clickingOnTheWithdrawButton();
    }

    @And("^I Click On Withdraw Button After Entering The Amount$")
    public void iClickOnWithdrawButtonAfterEnteringTheAmount() {
        new AccountPage().clickingOnTheWithdrawButtonAfterEnteringTheAmount();
    }

    @Then("^I Can Verify That Transaction Successful Message Text$")
    public void iCanVerifyThatTransactionSuccessfulMessageText() {
        new AccountPage().verifyingTheWithdrawalSuccessfulMessageText();
    }
}
