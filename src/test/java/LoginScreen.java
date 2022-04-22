import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginScreen {

    private static WebDriver driver;

    public static String mainLoginScreen_Attempt_Valid(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        Thread.sleep(2000);
        driver.findElement(By.id("userInput")).sendKeys("doc");
        Thread.sleep(2000);
        driver.findElement(By.id("passInput")).sendKeys("Holliday@1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='loginBtn newRow']")).click();
        waitForElementToBeClickable(By.xpath("//div[@id='moveVehicleBtn']"));
        String currentURL = driver.getCurrentUrl();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        return currentURL;
    }

    public static String mainLoginScreen_Attempt_Invalid(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        Thread.sleep(2000);
        driver.findElement(By.id("userInput")).sendKeys("TEST");
        Thread.sleep(2000);
        driver.findElement(By.id("passInput")).sendKeys("TEST");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='loginBtn newRow']")).click();
        Thread.sleep(2000);
        String errorMessage = driver.findElement(By.xpath("//div[@class='errorText']")).getText();
        Thread.sleep(2000);
        return errorMessage;
    }

    public static void waitForElementToBeClickable(By by){
        WebDriverWait waitToClick = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitToClick.until(ExpectedConditions.elementToBeClickable(by));
    }

//    public static void clickingSomething(By by) {
//        driver.findElement(by).click();
//    }
//
//    public static void clicking_Login_Button() {
//        clickingSomething(By.xpath("//div[@class='loginBtn newRow']"));
//    }
//
//    public static void clicking_UserName_Input() {
//        clickingSomething(By.id("userInput"));
//    }
//
//    public static void clicking_Password_Input() {
//        clickingSomething(By.id("passInput"));
//    }
//
//    public static void typing_UserName_Input_Good() {
//        driver.findElement(By.id("userInput")).sendKeys("TEST");
//    }
//
//    public static void typing_Password_Input_Good() {
//        driver.findElement(By.id("passInput")).sendKeys("TEST");////TEST
//    }
}
