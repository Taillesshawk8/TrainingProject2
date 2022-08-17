package applications.tricentis;

import Roman.Roman;
import applications.tricentis.pages.CartPage;
import applications.tricentis.pages.StorePage;
import applications.tricentis.pages.LoginPage;
import applications.tricentis.pages.RegisterPage;

public class TricentisApplication {

    public CartPage cartPage;
    public StorePage storePage;
    public LoginPage loginPage;
    public RegisterPage registerPage;

    public TricentisApplication(Roman roman){
        cartPage = new CartPage(roman);
        storePage = new StorePage(roman);
        loginPage = new LoginPage(roman);
        registerPage = new RegisterPage(roman);
    }
}
