package pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Inputs_Test {

    private WebDriver driver;
    InputsPage inputsPage;

    @Before
    public void setUp() throws Exception {
        inputsPage = new InputsPage(driver);
        driver = inputsPage.chromeDriverConnection();
        inputsPage.visit("https://the-internet.herokuapp.com/inputs");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        inputsPage.digitNumber();
    }

}
