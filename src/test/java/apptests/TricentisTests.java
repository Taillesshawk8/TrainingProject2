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
    public void tricentisAddToCart(){
        TricentisApplication app = new TricentisApplication(roman());
        app.loginPage.login();
        app.storePage.addComAndIntToCart();
        Assertions.assertFalse(app.cartPage.checkCart());
        System.out.println("Successfully added item to cart.");
    }

    @Test
    public void tricentisClearCart(){
        TricentisApplication app = new TricentisApplication(roman());
        app.loginPage.login();
        if (app.cartPage.checkCart()) {
            System.out.println("The cart is already empty.");
        } else {
            app.cartPage.removeItem();
            Assertions.assertTrue(app.cartPage.checkCart());
            System.out.println("Successfully removed item, the cart is now empty.");
        }
    }
}