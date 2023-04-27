package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Chrome Driver/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElement (By locator){
        return driver.findElement(locator);
    }

    public String getText (WebElement element){
        return element.getText();
    }

    public String getText (By locator){
        return driver.findElement(locator).getText();
    }

    public void typeOn (By locator, String inputText){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(inputText);
    }

    public void clickOn (By locator){
        driver.findElement(locator).click();
    }

    public void selectByIndex (By locator, int index){
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);
    }

    public void visit (String url){
        driver.get(url);
    }


}
