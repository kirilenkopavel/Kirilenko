package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MainPage extends  AbstractPage {

    @FindBy(xpath = "//a[@class=\"wl-login-link ng-scope\"]")
    private WebElement login;


    public MainPage(WebDriver driver){
        super(driver);

    }

    public void goToLoginPage(){
        login.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://dev-py.jivestor.com/login"));

    }
}
