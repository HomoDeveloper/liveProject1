package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BasePage {

    //public static WebDriver driver;       //Deleted for parallel execution
    private String url;
    private Properties prop;
    public static String screenDestinationPath;     // We create this variable in order to take the timestamp info and use it on our Reports on ExtentManager class

    public BasePage() throws IOException {          //We  load the general properties like url and browser from config.properties  file
        prop = new Properties();
        FileInputStream data = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");
        prop.load(data);
    }


    public static WebDriver getDriver(){       // Initializing the drivers. The drivers are already installed in our project in drivers package
 /*       if (prop.getProperty("browser").equalsIgnoreCase("chrome")){          //Deleted for parallel execution and added static on methods decleration
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return driver;*/
        return WebDriverInstance.getDriver();
    }

    public String getUrl(){
        url = prop.getProperty("url");
        return url;
    }

    public static String takeSnapShot(String name) throws IOException {          //Changed from void to public static String so we can use it on our Reports on ExtentManager class
        //File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);       //Deleted for parallel execution
        File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        //File destFile = new File(System.getProperty("user.dir") + "\\target\\screenshots\\" + timestamp() + ".png");      //Changes so we can use it on our Reports on ExtentManager class
        String destFile = System.getProperty("user.dir") + "\\target\\screenshots\\" + timestamp() + ".png";
        screenDestinationPath = destFile;
        try {
            FileUtils.copyFile(srcFile, new File(destFile));
        } catch (IOException e){
            e.printStackTrace();
        }
        return name;
        //FileUtils.copyFile(srcFile,destFile);     //Changes so we can use ituse it on our Reports on ExtentManager class
    }
    public static String timestamp(){       //Changed to statix when we changed takeSnapShot method to static
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    public static String getScreenDestinationPath(){        //Added so we can return screenDestinationPath and use it on Reports on ExtentManager class
        return  screenDestinationPath;
    }

    public static void waitForElemenInvisible(WebElement element, int timer){   //Transfered from BasePage for parallel execution
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timer));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

}
