package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OpenAccountPage extends com.bank.utility.Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    // Storing locators
    // Storing Open account button locator
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;
    // Storing the customer selection locator
    @CacheLookup
    @FindBy(css = "#userSelect")
    WebElement customerNameSelect;
    //By.xpath("//select[@id='userSelect']");
    // Storing the Currency locator
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropDown;
    // Storing the Process button locator
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement processButton;

    // Defining Methods
    public void clickingOnTheOpenAccountButton() { // Method to click on open account button
        clickOnElement(openAccount);
        log.info("Clicking On Open An Account Button : " + openAccount.toString());
    }

    // Method to Select the customer name from customer-name drop down menu
    public void selectingCreatedCustomerFromTheCustomerNameDropDown(String cName) {
        clickOnElement(customerNameSelect);
        log.info("Clicking On The Customer Name Drop Down : " + customerNameSelect.toString());
        selectByVisibleTextFromDropDown(customerNameSelect, cName);
        log.info("Selecting Customer Name From The Drop Down : " + customerNameSelect.toString());
    }

    // Method to select the currency from currency drop down menu
    public void selectingTheCurrencyFromCurrencyDropDown(String currency) {
        clickOnElement(currencyDropDown);
        log.info("Clicking On The Currency Drop Down : " + currencyDropDown.toString());
        selectByVisibleTextFromDropDown(currencyDropDown, currency);
        log.info("Selecting The Desired Currency From Currency Drop Down : " + currencyDropDown.toString());
    }

    public void clickingOnTheProcessButton() { // Method to click on process button
        clickOnElement(processButton);
        log.info("Clicking On The Process Button : " + processButton.toString());
    }

    public void verifyingAccountCreationText() {
        Alert alert = driver.switchTo().alert(); // Creating alert object reference and switch to alert
        String expectedAlertText = "Account created successfully";
        String actualAlertText = alert.getText().substring(0, 28);
        Assert.assertEquals(actualAlertText, expectedAlertText, "Invalid Message Prompt...!!!");
        alert.accept();
    }
}
