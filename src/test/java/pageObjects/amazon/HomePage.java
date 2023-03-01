package pageObjects.amazon;

import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate(){
        driver.get("https://amazon.com");
    }
}
