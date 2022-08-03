package apptests;

import Roman.RomanBase;
import applications.tricentis.TricentisApplication;
import applications.tricentis.models.Credential;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class TricentisTests extends RomanBase {

    @BeforeEach
    public void setup(){
        roman()._driver = roman().selenium.getChromeDriver();
        roman()._driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void tricentisAddToCart(){
        String item = "Computing and Internet";
        TricentisApplication app = new TricentisApplication(roman());
        app.loginPage.login(new Credential("titanslayer@gamil.com","Eren-san"));
        app.storePage.clickBooksSidebar();
        app.storePage.addToCart(item);
        app.storePage.clickCart();
        Assertions.assertFalse(app.cartPage.checkCart());
        System.out.println("Successfully added item to cart.");
    }

    @Test
    public void tricentisClearCart(){
        TricentisApplication app = new TricentisApplication(roman());
        app.loginPage.login(new Credential("titanslayer@gamil.com","Eren-san"));
        app.storePage.clickCart();
        while(!app.cartPage.checkCart()){
            app.cartPage.removeItem();
        }Assertions.assertTrue(app.cartPage.checkCart());
        System.out.println("Successfully cleared cart");
    }
}