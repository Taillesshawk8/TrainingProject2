package apptests;

import Roman.RomanBase;
import applications.tricentis.TricentisApplication;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class TricentisTests extends RomanBase {

    @BeforeEach
    public void setup(){
        roman()._driver = roman().selenium.getChromeDriver();
        roman()._driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void tricentis(){
        TricentisApplication app = new TricentisApplication(roman());
        app.loginPage.login();

    }
}
