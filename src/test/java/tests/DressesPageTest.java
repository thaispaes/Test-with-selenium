package tests;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import pages.DressesPage;
import pages.LoginPage;

public class DressesPageTest {

        private DressesPage dressesPage;
        private final String URL = "https://automationpractice.com/index.php";

        @BeforeEach
        void setUp() throws Exception {
                this.dressesPage = new DressesPage();
                this.dressesPage.visit("https://automationpractice.com/index.php");
        }

        @AfterEach
        void tearDown() throws Exception {
                this.dressesPage.quitWebDriver();
        }

        @Test
        void test() {
                //When
                this.dressesPage.viewCasualDressesPage();

                //Then
                Assertions.assertEquals("CASUAL DRESSES", this.dressesPage.getTitlePage());
                Assertions.assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));
        }
}
