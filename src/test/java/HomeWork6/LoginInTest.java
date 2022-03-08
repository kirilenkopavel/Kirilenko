package HomeWork6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginInTest extends AbstractTest {
    @Test
    void loginIn(){
        new MainPage(getWebDriver()).goToLoginPage();
        Assertions.assertTrue(getWebDriver().getTitle().equals("Login"), "страница входа недоступна");
        new LoginPage(getWebDriver()).setLogin("kirilenkopavel@bk.ru").setPassword("12345678").loginIn();
        Assertions.assertTrue((java.util.function.BooleanSupplier) getWebDriver().findElement(By.xpath("//a[@class=\"open-menu-user\"]")));

    }

    @AfterEach
    void logOut(){
        new MainPage(getWebDriver()).goToLoginPage();
        Assertions.assertTrue(getWebDriver().getTitle().equals("account overview"), "страница аккаунта не доступна");
        new AccountMainPage(getWebDriver()).logOut();
        new WebDriverWait(getWebDriver(), Duration.ofSeconds(5));
        Assertions.assertTrue(getWebDriver().findElement(By.xpath("\"//a[@class=\\\"wl-login-link ng-scope\\\"]\"")).getText().equals("ВХОД"));
    }

}
