package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddCustomerPage extends com.bank.utility.Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    // Storing locators
    // Storing Add customer locator
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;
    // Storing Enter first name locator
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    // Storing Last name locator
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    // Storing Postcode locator
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;
    // Storing Add customer button locator
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickAddCustomer;

    // Defining Methods
    public void clickingOnAddCustomerButton() { // Method to click on Add customer button
        clickOnElement(addCustomer);
        log.info("Clicking On Add Customer Button : " + addCustomer.toString());
    }

    public void enteringFirstNameInToFirstNameField(String fName) { // Method to Send First name
        sendTextToElement(firstName, fName);
        log.info("Entering First Name Into First Name Filed : " + firstName.toString());
    }

    public void enteringLastNameInToLastNameField(String lName) { // Method to send last name
        sendTextToElement(lastName, lName);
        log.info("Entering Last Name Into Last Name Field : " + lastName.toString());
    }

    public void enteringPostCodeInToPostCodeField(String pCode) { // Method to send post code
        sendTextToElement(postCode, pCode);
        log.info("Entering Postcode Into Postcode Field : " + postCode.toString());
    }

    public void clickingOnAddCustomer() { // Method to click on Add customer after entering necessary data
        clickOnElement(clickAddCustomer);
        log.info("Clicking On Add Customer Button : " + clickAddCustomer);
    }

    public void verifyingTheCustomerAddedAlert() { // Method to verify Customer Addition
        Alert alert = driver.switchTo().alert(); // Creating alert object reference and switch to alert
        String expectedAlertText = "Customer added successfully with customer ";
        String actualAlertText = alert.getText().substring(0, 42); // Storing the alert message and Trimming it to compare with the expected message
        Assert.assertEquals(expectedAlertText, actualAlertText);// Comparing both messages
        alert.accept();
    }
}
