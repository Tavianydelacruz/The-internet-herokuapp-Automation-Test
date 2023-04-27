package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputsPage extends Base{

    By inputNumber = By.xpath("//*[@id=\"content\"]/div/div/div/input");

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void digitNumber() throws InterruptedException {
        typeOn(inputNumber,"1990");
        getText(inputNumber).equals("1990");
        Thread.sleep(1000);
    }

}
