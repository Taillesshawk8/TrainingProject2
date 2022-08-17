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
        String[] items = {"Computing and Internet","Fiction","Health Book"};
        String item = "Fiction";
        TricentisApplication app = new TricentisApplication(roman());
        app.loginPage.login(new Credential("titanslayer@gamil.com","Eren-san"));
        app.storePage.goToBooks();
        app.storePage.addItemToCart(item);
        app.storePage.goToCart();
        Assertions.assertFalse(app.cartPage.isCartEmpty());
        System.out.println("Added '"+item+"' to cart.");
    }

    @AfterEach
    public void tricentisClearCart(){
        TricentisApplication app = new TricentisApplication(roman());
//        app.loginPage.login(new Credential("titanslayer@gamil.com","Eren-san"));
        app.storePage.navigateTo();
        app.storePage.goToCart();
        app.cartPage.clearCart();
        Assertions.assertTrue(app.cartPage.isCartEmpty());
    }
}