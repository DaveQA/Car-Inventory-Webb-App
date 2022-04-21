import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickThings {

    private static WebDriver driver;

    public static void clicking_UserName_Input(){
        driver.findElement(By.id("userInput")).click();
    }

    public static void clicking_Password_Input(){
        driver.findElement(By.id("passInput")).click();
    }
}
