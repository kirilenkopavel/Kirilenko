package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Java Web UI
 *@author Pavel Kirilenko
 *@version 05.02.2022
 */
public class TestKeys2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//div/a[@id=\"item_4_title_link\"]/div[@class=\"inventory_item_name\"]")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.id("continue-shopping")).click();
        driver.findElement(By.xpath("//div/a[@id=\"item_4_title_link\"]/div[@class=\"inventory_item_name\"]")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        driver.quit();
    }
}

