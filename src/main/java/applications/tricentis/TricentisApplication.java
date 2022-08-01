package applications.tricentis;

import Roman.Roman;
import applications.tricentis.pages.CartPage;
import applications.tricentis.pages.HomePage;
import applications.tricentis.pages.LoginPage;
import applications.tricentis.pages.RegisterPage;

public class TricentisApplication {
    public CartPage cartPage;
    public HomePage homePage;
    public LoginPage loginPage;
    public RegisterPage registerPage;

    public TricentisApplication(Roman roman){
        cartPage = new CartPage(roman);
        homePage = new HomePage(roman);
        loginPage = new LoginPage(roman);
        registerPage = new RegisterPage(roman);
    }
}
