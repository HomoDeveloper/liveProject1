package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormPersInfo extends BasePage {                      //Extends BasePage for parallel execution

    public WebDriver driver;

    public OrderFormPersInfo() throws IOException {//public OrderFormPersInfo(WebDriver driver)  was changed for parallel execution
        //this.driver = driver;         //Deleted and added super(); for parallel execution
        super();
    }

    By genderMr = By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
    By genderMrs = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
    By firstNameField = By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lastname']");
    By emailField = By.cssSelector("form#customer-form > section input[name='email']");
    By passwordField = By.cssSelector("form#customer-form > section input[name='password']");
    By birthDateField = By.cssSelector("input[name='birthday']");
    By receiveOffersCheckbox = By.cssSelector("div:nth-of-type(7)  span > label > span");
    By newsletterCheckbox = By.cssSelector("div:nth-of-type(8)  span > label > span");
    By termsConditionsCheckbox = By.cssSelector("input[name='psgdpr']");
    By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");



    public WebElement getGenderMr() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(genderMr);
    }

    public WebElement getGenderMrs() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(genderMrs);
    }

    public WebElement getFirstNameField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(firstNameField);
    }

    public WebElement getLastnameField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(lastNameField);
    }

    public WebElement getEmailField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(emailField);
    }

    public WebElement getPasswordField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(passwordField);
    }

    public WebElement getBirthDateField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(birthDateField);
    }

    public WebElement getRecOfferCheckbox() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(receiveOffersCheckbox);
    }

    public WebElement getNewsletterCheckbox() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(newsletterCheckbox);
    }

    public WebElement getTermsConditionsCheckbox() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(termsConditionsCheckbox);
    }

    public WebElement getContinueBtn() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(continueBtn);
    }
}
