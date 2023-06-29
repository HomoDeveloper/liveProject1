package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopContentPanel extends BasePage {                      //Extends BasePage for parallel execution

    public WebDriver driver;

    public ShopContentPanel() throws IOException {//public ShopContentPanel(WebDriver driver)  was changed for parallel execution
        //this.driver = driver;         //Deleted and added super(); for parallel execution
        super();
    }

    By continueShoppingBtn = By.xpath("//button[contains(text(), 'Continue')]");
    By checkoutBtn = By.cssSelector(".cart-content-btn .btn-primary");

    public WebElement getContinueShopBtn() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(continueShoppingBtn);
    }

    public WebElement getCheckoutBtn() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(checkoutBtn);
    }
}
