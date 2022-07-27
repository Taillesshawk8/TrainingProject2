package unittests;

import applications.xyzBank.BankingApplication;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.SeleniumWrapper;

import java.time.Duration;

public class ExampleTests {

    public WebDriver driver;

    @BeforeEach
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @AfterEach
    public void teardown()
    {
        driver.close();
        driver.quit();
    }

    @Test
    public void depositTest()
    {
        BankingApplication app = new BankingApplication(driver);
        app.loginPage.login("Harry Potter");
        app.accountPage.makeDeposit(1234);
    }

    @Test
    public void depositTest2()
    {
        BankingApplication app = new BankingApplication(driver);
        app.loginPage.login("Ron Weasly");
        app.accountPage.makeDeposit(4321);
    }

}
