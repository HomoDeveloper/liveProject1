package uk.co.automationtesting;

import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;


@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks {          //extends BasePage ws changed for parallel execution
    public OrderCompleteTest() throws IOException {
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
    public void endToEndTest() throws InterruptedException, IOException {

        ExtentManager.log("Starting endToEndTest Test...");

        Homepage home = new Homepage();       //driver was deleted for paralles execution
        home.getCookie().click();
        //Thread.sleep(5000);
        //home.getToggle().click();
        home.getTestStoreLink().click();

        ShopHomePage shopHome = new ShopHomePage();       //driver was deleted for paralles execution
        ExtentManager.pass("Reached the Shop Homepage");
        shopHome.getProdOne().click();
        ExtentManager.pass("Clicked Product One");



        ShopProductPage shopProd = new ShopProductPage();       //driver was deleted for paralles execution
        ExtentManager.pass("Reached the Shop Product Page");

        Select sizeOption = new Select(shopProd.getSizeOption());
        sizeOption.selectByVisibleText("M");
        shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();
        ExtentManager.pass("Added item to cart");

        //Thread.sleep(3000);

        ShopContentPanel shopContent = new ShopContentPanel();       //driver was deleted for paralles execution
        shopContent.getCheckoutBtn().click();

        ShoppingCart cart = new ShoppingCart();       //driver was deleted for paralles execution
        cart.getHavePromo().click();
        cart.getPromoTextbox().sendKeys("20OFF");
        cart.getPromoAddBtn().click();
        cart.getProceedCheckoutBtn().click();
        ExtentManager.pass("Added Promo Code");

        //Thread.sleep(3000);

        OrderFormPersInfo personalInfo = new OrderFormPersInfo();       //driver was deleted for paralles execution
        personalInfo.getGenderMr().click();
        personalInfo.getFirstNameField().sendKeys("John");
        personalInfo.getLastnameField().sendKeys("Wick");
        personalInfo.getEmailField().sendKeys("johnWick@gmail.com");
        personalInfo.getTermsConditionsCheckbox().click();
        personalInfo.getContinueBtn().click();
        //Thread.sleep(3000);

        OrderFormDelivery deliveryInfo = new OrderFormDelivery();       //driver was deleted for paralles execution
        deliveryInfo.getCompanyField().sendKeys("Shooter Corporation");
        deliveryInfo.getAddressField().sendKeys("Killer Instict Street 69");
        deliveryInfo.getCityField().sendKeys("Houston");
        Select stateOption = new Select(deliveryInfo.getStateDropdown());
        stateOption.selectByVisibleText("Texas");
        deliveryInfo.getPostcodeField().sendKeys("69666");
        Select countryOption = new Select(deliveryInfo.getCountryDropdown());
        countryOption.selectByVisibleText("United States");
        deliveryInfo.getPhoneField().sendKeys("+3069469696969");
        deliveryInfo.getContinueBtn().click();
        //Thread.sleep(3000);

        OrderFormShippingMethod shipMethod = new OrderFormShippingMethod();       //driver was deleted for paralles execution
        shipMethod.getDeliveryMsgTextbox().sendKeys("KNOCK THE BELL TWICE YOU DIE!!!");
        shipMethod.getContinueBtn().click();
        //Thread.sleep(3000);

        OrderFormPayment paymentForm = new OrderFormPayment();       //driver was deleted for paralles execution
        paymentForm.getPayByWireRadioBtn().click();
        paymentForm.getTermsConditionsCheckbox().click();
        paymentForm.getOrderBtn().click();

        Thread.sleep(3000);


        //shopHome.getProdTwo().click();

    }

}
