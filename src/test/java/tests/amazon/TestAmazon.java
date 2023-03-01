package tests.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.amazon.HomePage;
import tests.TestInit;

public class TestAmazon extends TestInit {


    @Test
    public void one(){
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.sleep(7000);
        homePage.navigate();
    }

    @Test
    public void checkHeader(){
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.sleep(7000);
        homePage.navigate();
        Assert.assertTrue(homePage.getHeader().isDisplayed());
    }

    @Test
    public void checkCopy(){
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.sleep(7000);
        homePage.navigate();
        Assert.assertTrue(homePage.getFooter().isDisplayed());
    }
}
