package uk.co.automationtesting;

import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks {          //extends BasePage ws changed for parallel execution
    public AddRemoveItemBasketTest() throws IOException {
        super();
    }

    //DELETED FOR PARALLEL EXECUTION
/*  @BeforeTest
    public void setup(){
        driver = getDriver();
        driver.get(getUrl());
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver = null;
    }*/

    @Test
    public void addRemoveItem() throws InterruptedException, IOException {

        ExtentManager.log("Starting addRemoveItem Test...");

        Homepage home = new Homepage();       //driver was deleted for paralles execution
        home.getCookie().click();
        //Thread.sleep(5000);
        //home.getToggle().click();
        home.getTestStoreLink().click();

        ShopHomePage shopHome = new ShopHomePage();       //driver was deleted for paralles execution
        ExtentManager.pass("Reached the Shop Homepage");
        shopHome.getProdOne().click();

        ShopProductPage shopProd = new ShopProductPage();       //driver was deleted for paralles execution
        ExtentManager.pass("Reached the Shop Product Page");
        Select sizeOption = new Select(shopProd.getSizeOption());
        sizeOption.selectByVisibleText("M");
        shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();

        ShopContentPanel shopContent = new ShopContentPanel();       //driver was deleted for paralles execution
        ExtentManager.pass("Reached the Shop Content Panel Page");
        shopContent.getContinueShopBtn().click();
        shopProd.getHomepageLink().click();
        shopHome.getProdTwo().click();
        shopProd.getAddToCartBtn().click();
        shopContent.getCheckoutBtn().click();

        ShoppingCart cart = new ShoppingCart();       //driver was deleted for paralles execution
        cart.getDeleteItemTwo().click();
        //Transfered wait to BasePage and made a method for waitElement
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));      //We had to use an explicit wait so that the second item would have time to disappear and the new total amount could be generated
        //wait.until(ExpectedConditions.invisibilityOf(cart.getDeleteItemTwo()));
        waitForElemenInvisible(cart.getDeleteItemTwo(),3);
        String totalAmountText = cart.getTotalAmount().getText();
        System.out.println("Total Amount: " + totalAmountText);

        try {
            Assert.assertEquals(cart.getTotalAmount().getText(), "$45.24");
            ExtentManager.pass("Total amount mathces expected amount");
        }catch (AssertionError e){
            Assert.fail("Total amount does not mathces expected amount");
        }
        Thread.sleep(3000);

    }


}
