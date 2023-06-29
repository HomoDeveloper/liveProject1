package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormDelivery extends BasePage {                      //Extends BasePage for parallel execution

    public WebDriver driver;

    public OrderFormDelivery() throws IOException {//public OrderFormDelivery(WebDriver driver)  was changed for parallel execution
        //this.driver = driver;         //Deleted and added super(); for parallel execution
        super();
    }
    By firstNameField = By.cssSelector("input[name='firstname']");      //2 elements matching on course
    By lastNameField = By.cssSelector("input[name='lastname']");        //2 elements matching on course
    By companyNameField = By.cssSelector("input[name='company']");
    By addressField = By.cssSelector("input[name='address1']");
    By addressComplementField = By.cssSelector("input[name='address2']");
    By cityField = By.cssSelector("input[name='city']");
    By stateDropdown = By.cssSelector("select[name='id_state']");
    By postcodeField = By.cssSelector("input[name='postcode']");
    By countryDropdown = By.cssSelector("select[name='id_country']");
    By phoneField = By.cssSelector("input[name='phone']");
    By invoiceSameAddCheckboc = By.cssSelector("input#use_same_address");
    By continueBtn = By.cssSelector("button[name='confirm-addresses']");



    public WebElement getFirstNameField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(firstNameField);
    }

    public WebElement getLastnameField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(lastNameField);
    }

    public WebElement getCompanyField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(companyNameField);
    }

    public WebElement getAddressField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(addressField);
    }

    public WebElement getAddressCompField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(addressComplementField);
    }

    public WebElement getCityField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(cityField);
    }

    public WebElement getStateDropdown() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(stateDropdown);
    }

    public WebElement getPostcodeField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(postcodeField);
    }

    public WebElement getCountryDropdown() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(countryDropdown);
    }

    public WebElement getPhoneField() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(phoneField);
    }

    public WebElement getInvoiceSameAddCheckbox() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(invoiceSameAddCheckboc);
    }

    public WebElement getContinueBtn() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(continueBtn);
    }

}
