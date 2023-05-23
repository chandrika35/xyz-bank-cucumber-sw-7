package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerStepsPage {
    @Given("^I Am On Home Page$")
    public void iAmOnHomePage() {

    }

    @When("^I Click On Bank Manager Login Button$")
    public void iClickOnBankManagerLoginButton() {
        new BankManagerLoginPage().clickOnBankManagerButton();
    }

    @And("^I Click On Add Customer Button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickingOnAddCustomerButton();
    }

    @And("^I Enter \"([^\"]*)\" Into First Name Field$")
    public void iEnterIntoFirstNameField(String firstName) {
        new AddCustomerPage().enteringFirstNameInToFirstNameField(firstName);
    }

    @And("^I Enter \"([^\"]*)\" Into Last Name Filed$")
    public void iEnterIntoLastNameFiled(String lastName) {
        new AddCustomerPage().enteringLastNameInToLastNameField(lastName);
    }

    @And("^I Enter \"([^\"]*)\" Into Postcode Field$")
    public void iEnterIntoPostcodeField(String postCode) {
        new AddCustomerPage().enteringPostCodeInToPostCodeField(postCode);
    }

    @And("^I Click On The Add Customer Button$")
    public void iClickOnTheAddCustomerButton() {
        new AddCustomerPage().clickingOnAddCustomer();
    }

    @Then("^I Can Verify The Customer Successfully Added Text In The Alert Box$")
    public void iCanVerifyTheCustomerSuccessfullyAddedTextInTheAlertBox() {
        new AddCustomerPage().verifyingTheCustomerAddedAlert();
    }
}

