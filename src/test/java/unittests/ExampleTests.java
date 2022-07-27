package unittests;

import Roman.RomanBase;
import applications.saucedemo.SauceDemoApplication;
import applications.saucedemo.models.Credential;
import applications.xyzBank.BankingApplication;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExampleTests  extends RomanBase {



    @BeforeEach
    public void setup()
    {
        roman()._driver = roman().selenium.getChromeDriver();

        roman()._driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void sauceLabs(){
        SauceDemoApplication app = new SauceDemoApplication(roman());
        app.loginPage.login(new Credential("standard_user","secret_sauce"));
    }



    @Test
    public void depositTest()
    {
        BankingApplication app = new BankingApplication(roman());
        app.loginPage.login("Harry Potter");
        app.accountPage.makeDeposit(1234);
    }

    @Test
    public void depositTest2()
    {
        BankingApplication app = new BankingApplication(roman());
        app.loginPage.login("Ron Weasly");
        app.accountPage.makeDeposit(4321);
    }

}
