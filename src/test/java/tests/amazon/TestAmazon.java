package tests.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjects.amazon.HomePage;
import tests.TestInit;

public class TestAmazon extends TestInit {


    @Test
    public void one(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
    }
}
