package pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Hovers_Test {

    private WebDriver driver;
   HoversPage hoversPage;

    @Before
    public void setUp() throws Exception {
        hoversPage = new HoversPage(driver);
        driver = hoversPage.chromeDriverConnection();
        hoversPage.visit("https://the-internet.herokuapp.com/hovers");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        hoversPage.hoverProfiles();
    }

}
