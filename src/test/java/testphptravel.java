




import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testphptravel {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openPhpTravelsDemo() {

        driver.get("https://phptravels.com/demo/");


        //perform assertions here
    }
    
    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
