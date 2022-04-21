import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TypingThings {

    private static WebDriver driver;

    public static void typing_UserName_Input_Good() {
        driver.findElement(By.id("userInput")).sendKeys("TEST");
    }

    public static void typing_Password_Input() {
        driver.findElement(By.id("passInput")).sendKeys("TEST");
    }
}
