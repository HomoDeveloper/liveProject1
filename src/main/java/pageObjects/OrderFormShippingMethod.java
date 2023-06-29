package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormShippingMethod extends BasePage {                      //Extends BasePage for parallel execution

    public WebDriver driver;
    public OrderFormShippingMethod() throws IOException {//public OrderFormShippingMethod(WebDriver driver)  was changed for parallel execution
        //this.driver = driver;         //Deleted and added super(); for parallel execution
        super();
    }

    By deliveryMsgTextbox = By.cssSelector("textarea#delivery_message");
    By continueBtn = By.cssSelector("[name='confirmDeliveryOption']");



    public WebElement getDeliveryMsgTextbox() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(deliveryMsgTextbox);
    }

    public WebElement getContinueBtn() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(continueBtn);
    }
}
