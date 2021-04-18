//Driver Management

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import java.util.concurrent.TimeUnit;

public class MngDriver {

    protected static WebDriver driver;

    @BeforeClass
    public static void DriverSetup(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications", "start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void DriverCleanup(){

        driver.manage().deleteAllCookies();

    }

    @AfterClass

    public static void DriverTerminate(){

        driver.close();

    }


}
