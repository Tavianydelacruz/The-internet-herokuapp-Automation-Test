package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {

    By inputUsername = By.xpath("//*[@id=\"username\"]");
    By inputPassword = By.xpath("//*[@id=\"password\"]");
    By btnLogin = By.xpath("//*[@id=\"login\"]/button");
    By btnLogout = By.xpath("//*[@id=\"content\"]/div/a/i");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void logInValidUser() throws InterruptedException {
        typeOn(inputUsername,"tomsmith");
        typeOn(inputPassword,"SuperSecretPassword!");
        clickOn(btnLogin);
        Thread.sleep(1000);
        clickOn(btnLogout);
        Thread.sleep(1000);

    }

}
