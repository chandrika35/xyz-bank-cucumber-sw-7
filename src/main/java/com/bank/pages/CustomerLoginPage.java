package com.bank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CustomerLoginPage extends com.bank.utility.Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    // Storing locators
    // Storing Customer login button locator
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLoginButton;
    // Storing Your name locator
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectYourName;
    // Storing Login button locator
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    // Storing the Logout Tab locator
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logoutTab;
    // Storing login locator used after selecting the required customer from the customer login page
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement customerLogin;

    // Defining Methods
    public void clickingOnCustomerLoginButton() { // Method to click on customer login
        clickOnElement(customerLoginButton);
        log.info("Clicking On Customer Login Button : " + customerLogin.toString());
    }

    // Method to select customer name from your name-drop down menu
    public void selectingCustomerNameFromYourNameDropDown(String yName) {
        clickOnElement(selectYourName);
        log.info("Clicking On Customer Name Selection Drop Down : " + selectYourName.toString());
        selectByVisibleTextFromDropDown(selectYourName, yName);
        log.info("Selecting Customer Name From The Drop Down : " + selectYourName.toString());
    }

    public void clickingOnTheLoginButton() { // Method to click on the login button
        clickOnElement(loginButton);
        log.info("Clicking On Login Button : " + loginButton.toString());
    }

    public boolean verifyingTheLogoutTabIsDisplayedOrNot() { // Method to verify the Logout Tab
        boolean isLogoutTabPresent = driver.findElement(By.xpath("//button[@class='btn logout']")).isDisplayed();
        log.info("Verifying Whether The Logout Tab Is Displayed Or Not : ");
        return isLogoutTabPresent;
    }

    public void clickingOnTheLogoutTab() { // Method to click on the logout tab
        clickOnElement(logoutTab);
        log.info("Clicking On Logout Tab : " + logoutTab.toString());
    }

    public void clickingOnTheLoginAfterSelectingCustomerName() { // Method to click on Login
        clickOnElement(customerLogin);
        log.info("Clicking On Login Tab After Selecting Customer Name : " + customerLogin.toString());
    }
    public void verifyThatYourNameTextIsDisplayed(){
        String actualText = driver.findElement(By.xpath("//label[normalize-space()='Your Name :']")).getText();
        Assert.assertEquals(actualText, "Your Name :", "Invalid Message Prompt...!!!");
    }
}
