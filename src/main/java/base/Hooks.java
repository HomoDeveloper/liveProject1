package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Hooks extends  BasePage {          //Created for parallel execution

    public Hooks() throws IOException {
        super();
    }

    @BeforeTest
    public void setUp(){
        getDriver().get(getUrl());
    }

    @AfterTest
    public void tearDown(){
        WebDriverInstance.cleanUpDriver();
    }

}
