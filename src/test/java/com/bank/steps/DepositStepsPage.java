package com.bank.steps;

import com.bank.pages.AccountPage;
import com.bank.pages.CustomerLoginPage;
import cucumber.api.java.en.And;

public class DepositStepsPage {
    @And("^I Select \"([^\"]*)\" From The Customer Drop Down$")
    public void iSelectFromTheCustomerDropDown(String customer) {
        new CustomerLoginPage().selectingCustomerNameFromYourNameDropDown(customer);
    }

    @And("^I Click On The Deposit Button$")
    public void iClickOnTheDepositButton() {
        new AccountPage().clickingOnTheDepositButton();
    }

    @And("^I Enter The \"([^\"]*)\" Into Amount Field$")
    public void iEnterTheIntoAmountField(Integer amount) {
        new AccountPage().enteringTheAmountInToTheAmountTextBox(amount);
    }

    @And("^I Click On Deposit Button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickingOnDepositButtonAfterEnteringTheAmount();
    }

    @And("^I Can Verify The Successful Deposit Message Text$")
    public void iCanVerifyTheSuccessfulDepositMessageText() {
        new AccountPage().verifyingTheDepositSuccessfulMessageText();
    }
}
