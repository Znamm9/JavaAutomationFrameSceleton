package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private static final int WAIT_TIME = 15;
    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public WebElement getElementByXpath(String locator){
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
}
