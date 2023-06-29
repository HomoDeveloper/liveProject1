package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopProductPage extends BasePage {                      //Extends BasePage for parallel execution

    public WebDriver driver;
    public ShopProductPage() throws IOException {//public ShopProductPage(WebDriver driver)  was changed for parallel execution
        //this.driver = driver;         //Deleted and added super(); for parallel execution
        super();
    }

    By sizeOption = By.cssSelector("[data-product-attribute='1']");
    By quantityIncrease = By.cssSelector(".touchspin-up");
    By quantityDecrease = By.cssSelector(".touchspin-down");
    By addToCartBtn = By.cssSelector(".add-to-cart.btn.btn-primary");
    By homepageLink = By.xpath("//span[.='Home']");



    public WebElement getSizeOption() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(sizeOption);
    }

    public WebElement getQuantIncrease() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(quantityIncrease);
    }

    public WebElement getQuantDecrease() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(quantityDecrease);
    }

    public WebElement getAddToCartBtn() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(addToCartBtn);
    }

    public WebElement getHomepageLink() {
        this.driver = getDriver();          //Added for parallel execution
        return driver.findElement(homepageLink);
    }

}
