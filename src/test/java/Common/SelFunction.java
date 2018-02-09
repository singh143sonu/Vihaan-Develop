package Common;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Created by Sandeep on 09/02/2017(DD/MM/YYY).
 */
public class SelFunction {

    public static WebDriver driver = null;
    public static WebDriverWait waitVar = null;

    public static java.lang.String githubURL = "https://github.com/";
    public static java.lang.String salesForceURL = "https://genesisenergy--qa2.cs65.my.salesforce.com";
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:/Temp/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        waitVar = new WebDriverWait(driver, 15);
    }

    public void openGithub() {
        driver.get(githubURL);
    }
    public void openSalesforce() {
        driver.get(salesForceURL);

    }
    public void teardown() {
        driver.quit();
    }

    public void ishomepageDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign in")));
        driver.findElement(By.linkText("Sign in")).isDisplayed();
    }

    public void clickSigninLink() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    public void isloginsectionDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(By.name("login")));
        waitVar.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        driver.findElement(By.name("login")).sendKeys("sandeep.bhadouria@gmail.com");
        driver.findElement(By.name("password")).sendKeys("lasses12!@");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/form/div[4]/input[3]")).click();
    }
    public void isSFloginsectionDisplayed() {
        waitVar.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        waitVar.until(ExpectedConditions.presenceOfElementLocated(By.name("pw")));
        driver.findElement(By.name("username")).sendKeys("sandeep.bhadauria@genesisenergy.co.nz.qa2");
        driver.findElement(By.name("pw")).sendKeys("Killer123$");
        driver.findElement(By.name("Login")).click();
    }

}
