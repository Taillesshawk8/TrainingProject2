package applications.saucedemo;

import Roman.Roman;
import applications.saucedemo.pages.LoginPage;

public class SauceDemoApplication {

    public LoginPage loginPage;
    public SauceDemoApplication(Roman roman)
    {
        loginPage = new LoginPage(roman);
    }
}
