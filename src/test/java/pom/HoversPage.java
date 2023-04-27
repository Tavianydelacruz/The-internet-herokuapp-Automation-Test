package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HoversPage extends Base {

    By Perfil1 = By.xpath("//*[@id=\"content\"]/div/div[1]/img");
    By Perfil2 = By.xpath("//*[@id=\"content\"]/div/div[2]/img");
    By Perfil3 = By.xpath("//*[@id=\"content\"]/div/div[3]/img");

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    public void hoverProfiles() {
        clickOn(Perfil1);
        clickOn(Perfil2);
        clickOn(Perfil3);
    }
}
