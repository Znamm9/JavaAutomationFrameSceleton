package pageObjects.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate(){
        driver.get("https://amazon.com");
    }

    public WebElement getHeader() {
        return getElementByXpath("//div[@id='navbar']");
    }

    public WebElement getFooter() {
        return getElementByXpath("//div[@id='navFooter']");
    }
}
