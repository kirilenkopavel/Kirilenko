package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountMainPage extends AbstractPage {
    @FindBy(xpath = "//a[@class=\"open-menu-user\"]")
    private WebElement burger;
    @FindBy(xpath = "/html/body/div[3]/div/ul/li[7]/a/span[2]")
    private WebElement logout;

    public AccountMainPage(WebDriver driver){
        super(driver);

    }

    public void logOut() {
        Actions logOut = new Actions(getDriver());
        logOut.click(this.burger)
                .click(this.logout)
                .build()
                .perform();
    }
}
