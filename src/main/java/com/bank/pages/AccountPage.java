package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountPage extends com.bank.utility.Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    // Storing locators
    // Storing Deposit button locator
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositButton;
    // Storing amount entering text box locator
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterAmount;
    // Storing the deposit button locator to be clicked after sending the amount
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButtonAfterAmount;
    // Storing the Withdrawal button locator
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawButton;
    // Storing the withdrawal amount text box locator
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterWithdrawalAmount;
    // Storing the withdrawal button after entering the withdrawal amount
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement withdrawalButton;

    // Defining Methods
    public void clickingOnTheDepositButton() { // Method to click on the deposit button
        clickOnElement(depositButton);
        log.info("Clicking On Deposit Button : " + depositButton.toString());
    }

    public void enteringTheAmountInToTheAmountTextBox(int amount) { // Method to enter the required amount
        sendTextToElement(enterAmount, String.valueOf(amount));
        log.info("Entering The Amount Into Amount Field : " + enterAmount.toString());
    }

    public void clickingOnDepositButtonAfterEnteringTheAmount() {
        clickOnElement(depositButtonAfterAmount);
        log.info("Clicking On Deposit Button : " + depositButtonAfterAmount.toString());
    }

    public void clickingOnTheWithdrawButton() { // Method to click on withdraw button
        clickOnElement(withdrawButton);
        log.info("Clicking On Withdraw Button : " + withdrawalButton.toString());
    }

    public void enteringTheWithdrawalAmountInToTheAmountTextBox(int withdrawAmount) { // Method to enter withdrawal amount
        sendTextToElement(enterWithdrawalAmount, String.valueOf(withdrawAmount));
        log.info("Entering Withdrawal Amount Into Withdraw Amount Field : " + enterWithdrawalAmount.toString());
    }

    public void clickingOnTheWithdrawButtonAfterEnteringTheAmount() { // Method to click on withdraw button
        clickOnElement(withdrawalButton);
        log.info("Clicking On Withdraw Button : " + withdrawalButton.toString());
    }

    public void verifyingTheDepositSuccessfulMessageText() { // Method to verify successful deposit message text
        String expectedDepositText = "Deposit Successful";
        String actualDepositText = driver.findElement(By.xpath("//span[@class='error ng-binding']")).getText();
        Assert.assertEquals(actualDepositText, expectedDepositText, "Invalid Transaction Text...!!!");
    }

    public void verifyingTheWithdrawalSuccessfulMessageText() { // Method to verify successful withdrawal message text
        String expectedWithdrawText = "Transaction successful";
        String actualWithdrawText = driver.findElement(By.xpath("//span[@class='error ng-binding']")).getText();
        Assert.assertEquals(actualWithdrawText, expectedWithdrawText, "Invalid Transaction Text...!!!");

    }

}
