package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickThings {

    private static WebDriver driver;

    public static void clickingSomething(By by) {
        driver.findElement(by).click();
    }

    public static void clicking_Login_Button() {
        clickingSomething(By.xpath("//div[@class='loginBtn newRow']"));
    }

    public static void clicking_UserName_Input() {
        clickingSomething(By.id("userInput"));
    }

    public static void clicking_Password_Input() {
        clickingSomething(By.id("passInput"));
    }
}
