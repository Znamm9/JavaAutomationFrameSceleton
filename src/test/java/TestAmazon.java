import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAmazon {

    WebDriver driver;

    @Test
    public void one(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://amazon.com");
    }

    public void tearDown(){
        driver.quit();
    }
}
