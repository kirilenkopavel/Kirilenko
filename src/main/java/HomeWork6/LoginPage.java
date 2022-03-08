package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(id = "login_email")
    private WebElement login;

    @FindBy(id = "login_password")
    private WebElement password;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    private WebElement submit;


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void loginIn(){
        this.submit.click();
    }

    public LoginPage setLogin(String login){
        this.login.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password){
        this.password.sendKeys(password);
        return this;
    }

    public void loginIn(String login, String password){

        Actions loginIn = new Actions(getDriver());
        loginIn.sendKeys(this.login,login)
                .click(this.password)
                .sendKeys(password)
                .click(this.submit)
                .build()
                .perform();
    }
}
