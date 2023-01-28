package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.LoginPage;

public class LoginPageTest {
    private LoginPage loginPage;
    private final String URL = "https://automationpractice.com/index.php";

    @BeforeEach
    void setUp() throws Exception {
        this.loginPage = new LoginPage();
        this.loginPage.visit(this.URL);
    }

    @AfterEach
    void tearDown() throws Exception {
        this.loginPage.quitWebDriver();
    }

    @Test
    void test() {
        //When
        this.loginPage.signin();

        //Then
        Assertions.assertTrue(this.loginPage.getMyAccountMessage().equals("MY ACCOUNT"));
        Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
    }

}
