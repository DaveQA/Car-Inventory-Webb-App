import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_LoginScreen {

    private static WebDriver driver;

    public static String TS_LoginScreen_01(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.id("userInput")).sendKeys("qastorem");
        driver.findElement(By.id("passInput")).sendKeys("qaSTOREMANAGER1");
        driver.findElement(By.xpath("//div[@type='submit']")).click();
        waitForLoading(driver);
        String currentURL = driver.getCurrentUrl();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        return currentURL;
    }

    public static String TS_LoginScreen_02(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.id("userInput")).sendKeys("TESTUSERNAME");
        driver.findElement(By.id("passInput")).sendKeys("TESTPASSWORD");
        driver.findElement(By.xpath("//div[@type='submit']")).click();
        waitForLoading(driver);
        String redTextErrorMessage = driver.findElement(By.id("errorPage")).getText();
        driver.navigate().refresh();
        return redTextErrorMessage;
    }

    public static String TS_LoginScreen_03(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.id("userInput")).sendKeys("qastorem");
        driver.findElement(By.id("passInput")).sendKeys("TESTPASSWORD");
        driver.findElement(By.xpath("//div[@type='submit']")).click();
        waitForLoading(driver);
        String redTextErrorMessage = driver.findElement(By.id("errorPage")).getText();
        driver.navigate().refresh();
        return redTextErrorMessage;
    }

    public static String TS_LoginScreen_04(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.id("userInput")).sendKeys("TESTUSERNAME");
        driver.findElement(By.id("passInput")).sendKeys("qaSTOREMANAGER1");
        driver.findElement(By.xpath("//div[@type='submit']")).click();
        waitForLoading(driver);
        String redTextErrorMessage = driver.findElement(By.id("errorPage")).getText();
        driver.navigate().refresh();
        return redTextErrorMessage;
    }

    public static String TS_LoginScreen_05_TC_LS_22(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        driver.findElement(By.id("userInput")).sendKeys("0123456789");
        Thread.sleep(5000);
        driver.findElement(By.id("passInput")).sendKeys("qaSTOREMANAGER1");
        String usernameField = driver.findElement(By.id("userInput")).getText();
        return usernameField;
    }

    public static String TS_LoginScreen_07(WebDriver driver1){
        driver = driver1;
        driver.findElement(By.id("userInput")).sendKeys("TESTUSERNAME");
        driver.findElement(By.id("passInput")).sendKeys("qaSTOREMANAGER1");
        driver.findElement(By.xpath("//div[@type='submit']")).click();
        waitForLoading(driver);
        String logoText = driver.findElement(By.xpath("//a[@class='navbar-brand']")).getText();
        driver.navigate().refresh();
        return logoText;
    }

    public static void waitForLoading(WebDriver driver1) {
        driver = driver1;
        WebDriverWait waitToClick = new WebDriverWait(driver, Duration.ofSeconds(15));
        waitToClick.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("#loginContainer > div.loader.show.spinner-border"))));
    }
}
