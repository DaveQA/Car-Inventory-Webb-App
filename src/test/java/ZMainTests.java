import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.log.Log;

public class ZMainTests {

    private static WebDriver driver;

    @BeforeAll
    public static void browserSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dholliday\\Desktop\\QA Resources\\Selenium Project Items\\WebDrivers\\Chrome\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://qa-carinventory-qa1.store.pullapart.com");
    }

    @Test
    public void loginScreen_Good(){
        LoginScreen.loginScreen_Good(driver);
    }
}
