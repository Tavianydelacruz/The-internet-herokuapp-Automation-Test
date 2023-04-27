package pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Dropdown_Test {

    private WebDriver driver;
    DropdownPage dropdownPage;

    @Before
    public void setUp() throws Exception {
        dropdownPage = new DropdownPage(driver);
        driver = dropdownPage.chromeDriverConnection();
        dropdownPage.visit("https://the-internet.herokuapp.com/dropdown");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        dropdownPage.DropdownOptionSelect();
    }

}
