import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _00_MainTests {

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
    @DisplayName("Login Screen")
    class Main01LoginScreenTest {
        @Test
        @DisplayName("TS_LoginScreen_01 - Successful login")
        public void TS_LoginScreen_01_Test() {
            Assertions.assertEquals(_01_LoginScreen.TS_LoginScreen_01(driver), "https://qa-carinventory-qa1.store.pullapart.com/home", "Was not able to login");
        }

        @Test
        @DisplayName("TS_LoginScreen_02 - Invalid username and Invalid password")
        public void TS_LoginScreen_02_Test() {
            Assertions.assertEquals(_01_LoginScreen.TS_LoginScreen_02(driver), "User name or password is incorrect. Please try again.", "Error message was not confirmed, check application");
        }

        @Test
        @DisplayName("TS_LoginScreen_03 - Valid username and Invalid password")
        public void TS_LoginScreen_03_Test() {
            Assertions.assertEquals(_01_LoginScreen.TS_LoginScreen_03(driver), "User name or password is incorrect. Please try again.", "Error message was not confirmed, check application");
        }

        @Test
        @DisplayName("TS_LoginScreen_04 - Invalid username and valid password")
        public void TS_LoginScreen_04_Test() {
            Assertions.assertEquals(_01_LoginScreen.TS_LoginScreen_04(driver), "User name or password is incorrect. Please try again.", "Error message was not confirmed, check application");
        }

//        @Test
//        @DisplayName("TS_LoginScreen_05_TC_LS_22 - Entering alpha characters in the username field")
//        public void TS_LoginScreen_05_Test() throws InterruptedException {
//            Assertions.assertEquals(_01_LoginScreen.TS_LoginScreen_05_TC_LS_22(driver),"test","Field verification for alpha characters failed, check application");
//        }

        @Test
        @DisplayName("TS_LoginScreen_07 - Checking for site logo")
        public void TS_LoginScreen_07_Test() {
            Assertions.assertEquals(_01_LoginScreen.TS_LoginScreen_07(driver),"Car Inventory","Site logo has changed, check application");
        }
    }
}
