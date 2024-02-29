import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class travelphphSignup {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openPhpTravelsDemo() {

        driver.get("https://phptravels.org/register.php");


        //perform assertions here
    }

    public void testRegistration() {
        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        WebElement lastNameInput = driver.findElement(By.name("lastname"));
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement confirmPasswordInput = driver.findElement(By.name("confirmpassword"));
        WebElement cityInput = driver.findElement(By.name("city"));
        WebElement stateInput = driver.findElement(By.name("state"));
        WebElement phoneInput = driver.findElement(By.name("phone"));
        WebElement postcodeInput = driver.findElement(By.name("postcode"));
        WebElement billingAddressInput = driver.findElement(By.name("billingaddress"));
        WebElement additionalInfoInput = driver.findElement(By.name("additionalinfo"));
        WebElement securityQuestionInput = driver.findElement(By.name("securityquestion"));
        WebElement securityAnswerInput = driver.findElement(By.name("securityanswer"));
        WebElement mailingListCheckbox = driver.findElement(By.name("mailinglist"));
        WebElement registerButton = driver.findElement(By.xpath("//button[@type='submit']"));

        // Input test data
        firstNameInput.sendKeys("john");
        lastNameInput.sendKeys("Doe");
        emailInput.sendKeys("johndoe@example.com");
        passwordInput.sendKeys("testpassword");
        confirmPasswordInput.sendKeys("testpassword");
        cityInput.sendKeys("dc");
        stateInput.sendKeys("washington");
        phoneInput.sendKeys("1234567890");
        postcodeInput.sendKeys("20002");
        billingAddressInput.sendKeys("123 Main St, City, usa");
        additionalInfoInput.sendKeys("Additional information");
        securityQuestionInput.sendKeys("What is your favorite color?");
        securityAnswerInput.sendKeys("Blue");
        mailingListCheckbox.click();

        // Click the register button
        registerButton.click();

        // Wait for registration to complete and assert a success message or any other validation
        WebElement successMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-success')]"));
        assertTrue(successMessage.isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();

}}
