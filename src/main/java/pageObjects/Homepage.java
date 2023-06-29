package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Homepage extends BasePage {                      //Extends BasePage for parallel execution

    public WebDriver driver;

    public Homepage() throws IOException {              //public Homepage(WebDriver driver)  was changed for parallel execution
        //this.driver = driver;         //Deleted and added super(); for parallel execution
        super();
    }

    By toggle = By.cssSelector("a[class='toggle']");
    By homepageLInk = By.linkText("HOMEPAGE");
    By accordionLink = By.linkText("ACCORDION");
    By browserTabsLink = By.linkText("BROWSER TABS");
    By buttonsLink = By.linkText("BUTTONS");
    By calcLink = By.linkText("CALCULATOR (JS)");
    By contactUsLink = By.linkText("CONTACT US FORM TEST");
    By datePickerLink = By.linkText("DATE PICKER");
    By dropdownLink = By.linkText("DROPDOWN CHECKBOX & RADIO");
    By fileUpload = By.linkText("FILE UPLOAD");
    By hiddenElementsLink = By.linkText("HIDDEN ELEMENTS");
    By iFrameLink = By.linkText("IFRAME");
    By loaderLink = By.linkText("LOADER");
    By loginPortalLink = By.linkText("LOGIN PORTAL TEST");
    By mouseLink = By.linkText("MOUSE MOVEMENT");
    By popupLink = By.linkText("POP UPS & ALERTS");
    By predictiveLink = By.linkText("PREDICTIVE SEARCH");
    By tablesLink = By.linkText("TABLES");
    By testStoreLink = By.linkText("TEST STORE");
    By aboutMeLink = By.linkText("ABOUT ME");
    By cookie = By.cssSelector("a[class='close-cookie-warning']");

    public WebElement getToggle(){
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(toggle);
    }
    public WebElement getHomepageLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(homepageLInk);
    }

    public WebElement getAccordionLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(accordionLink);
    }

    public WebElement getBrowserTabLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(browserTabsLink);
    }

    public WebElement getButtonLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(buttonsLink);
    }

    public WebElement getCalcLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(calcLink);
    }

    public WebElement getContactUsLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(contactUsLink);
    }

    public WebElement getDatePickerLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(datePickerLink);
    }

    public WebElement getDropdownLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(dropdownLink);
    }

    public WebElement getFileUploadLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(fileUpload);
    }

    public WebElement getHiddenElementsLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(hiddenElementsLink);
    }

    public WebElement getIframeLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(iFrameLink);
    }

    public WebElement getLoaderLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(loaderLink);
    }

    public WebElement getLoginPortalLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(loginPortalLink);
    }

    public WebElement getMouseLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(mouseLink);
    }

    public WebElement getPopupLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(popupLink);
    }

    public WebElement getPredictiveLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(predictiveLink);
    }

    public WebElement getTablesLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(tablesLink);
    }

    public WebElement getTestStoreLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(testStoreLink);
    }

    public WebElement getAboutMeLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(aboutMeLink);
    }

    public WebElement getCookie() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(cookie);
    }

}
