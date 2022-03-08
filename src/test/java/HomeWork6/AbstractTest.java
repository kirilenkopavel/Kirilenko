package HomeWork6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AbstractTest {
    private static WebDriver webDriver;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments ("start-maximized");
        options.addArguments ("--incognito");
        options.addArguments ("disable-popup-blocking");
        webDriver = new ChromeDriver(options);
        //webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @BeforeEach
    void goTo(){
        Assertions.assertDoesNotThrow( ()-> webDriver.get("https://dev-py.jivestor.com/"),
                "Страница не доступна");
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void close(){
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return this.webDriver;
    }
}
