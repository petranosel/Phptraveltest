




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
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"swup\"]/section[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/div/input"));
        firstname.click();
        firstname.sendKeys("Mohi");

        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"swup\"]/section[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div[2]/div/input"));
        lastname.sendKeys("Uddin");

        WebElement businessname = driver.findElement(By.xpath("//*[@id=\"swup\"]/section[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/input"));
        businessname.sendKeys("GTL");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"swup\"]/section[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[3]/input"));
        email.sendKeys("mohi123@example.com");

        WebElement result = driver.findElement(By.xpath("//*[@id=\"number\"]"));
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", result);


        driver.findElement(By.xpath("//*[@id=\"demo\"]")).click();


    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

