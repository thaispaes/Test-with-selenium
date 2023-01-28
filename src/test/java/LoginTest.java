import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationpractice.com/index.php");

    }

    @AfterEach
    void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    void test() {
        WebElement emailAddressElement = driver.findElement(By.id("email"));
        emailAddressElement.sendKeys("emailteste");

        WebElement passwordElement = driver.findElement(By.name("passwd"));
        passwordElement.sendKeys("key");

        WebElement sendButtonElement = driver.findElement(By.xpath("xpathdoelemento"));
        sendButtonElement.click();

        WebElement tagMyAccount = driver.findElement(By.tagName("h1"));
        String textTagH1 = tagMyAccount.getText();

        Assertions.assertEquals("MY ACCOUNT", textTagH1);

    }
}
