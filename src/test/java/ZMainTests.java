import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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

    @Nested
    @DisplayName("Main Login Screen Tests")
    class MainLoginScreenTest {
        @Test
        @DisplayName("Entering a valid login")
        public void mainLoginScreen_Attempt_Valid_Test() throws InterruptedException {
            Assertions.assertEquals(LoginScreen.mainLoginScreen_Attempt_Valid(driver), "https://qa-carinventory-qa1.store.pullapart.com/home", "Was not able to login");
        }

        @Test
        @DisplayName("Entering an invalided login")
        public void mainLoginScreen_Attempt_Invalid_Test() throws InterruptedException {
            Assertions.assertEquals(LoginScreen.mainLoginScreen_Attempt_Invalid(driver), "User name or password is incorrect. Please try again.", "Error Message was not displayed");
        }
    }
}
