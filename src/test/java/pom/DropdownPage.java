package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPage extends Base{

    By dList = By.xpath("//*[@id=\"dropdown\"]");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void DropdownOptionSelect() throws InterruptedException {
        Thread.sleep(1000);
        selectByIndex(dList,1);
        Thread.sleep(1000);
        selectByIndex(dList,2);
        Thread.sleep(1000);
    }
}
