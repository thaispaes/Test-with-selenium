import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    private WebDriver driver;

    @Test
    public void helloWorld()  {
        System.getProperty('webdriver.chrome.driver', 'drivers/chromedriver');
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/");

        driver.quit();
    }
}
