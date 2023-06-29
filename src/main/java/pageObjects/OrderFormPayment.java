package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormPayment extends BasePage {                      //Extends BasePage for parallel execution

    public WebDriver driver;
    public OrderFormPayment() throws IOException {//public OrderFormPayment(WebDriver driver)  was changed for parallel execution
        //this.driver = driver;         //Deleted and added super(); for parallel execution
        super();
    }

    By payByCheck = By.xpath("//span[.='Pay by Check']");
    By payByWire = By.xpath("//span[.='Pay by bank wire']");
    By termsAndConditions = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
    By orderBtn = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");



    public WebElement getPayByCheckRadioBtn() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(payByCheck);
    }

    public WebElement getPayByWireRadioBtn() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(payByWire);
    }

    public WebElement getTermsConditionsCheckbox() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(termsAndConditions);
    }

    public WebElement getOrderBtn() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(orderBtn);
    }

}
