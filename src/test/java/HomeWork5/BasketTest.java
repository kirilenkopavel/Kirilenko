package HomeWork5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.function.BooleanSupplier;


public class BasketTest extends AbstractTest {

    @Test
    void addRemoveMainPageTest(){

        Actions authorization = new Actions(getDriver());

        authorization.sendKeys(getDriver().findElement(By.id("user-name")),"standard_user")  // находим элемент инпут логин, вводим: standard_user
                .sendKeys(getDriver().findElement(By.id("password")),"secret_sauce") // находим элемент инпут пароль, вводим secret_sauce
                .click(getDriver().findElement(By.id("login-button")))                     // находим кнопку, клик
                .build()
                .perform();

        Actions add = new Actions(getDriver());

        add.click(getDriver().findElement(By.id("add-to-cart-sauce-labs-backpack")))
                .click(getDriver().findElement(By.xpath("//div[@id=\"shopping_cart_container\"]/a")))
                .build()
                .perform();

        Assertions.assertTrue((BooleanSupplier) getDriver().findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")));
    }
}
