package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
/**
 * Created by Sandeep on 7/13/2017.
 */
public class DriverFactory {
    private static ThreadLocal<WebDriverThread> driverThread;

    @BeforeSuite
    public static void instantiateDriverObject() {
        System.setProperty("webdriver.gecko.driver", "C:/Users/Jyoysna/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
        driverThread = new ThreadLocal<WebDriverThread>() {
            @Override
            protected WebDriverThread initialValue() {
                WebDriverThread webDriverThread = new WebDriverThread();
                return webDriverThread;
            }
        };
    }

    public static WebDriver getDriver() throws Exception {return driverThread.get().getDriver();}

    @AfterMethod
    public static void quitDriver() throws Exception {
        driverThread.get().quitDriver();
    }
}
