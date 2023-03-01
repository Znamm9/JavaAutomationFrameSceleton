package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class TestInit {

    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void before(){
        ChromeOptions chromeOptions = new ChromeOptions();
        try {
            driver.set(new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public WebDriver getDriver(){
        return driver.get();
    }

    @AfterMethod
    public void tearDown(){
        driver.get().quit();
    }
}
