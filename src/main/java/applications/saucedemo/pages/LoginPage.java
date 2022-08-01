package applications.saucedemo.pages;

import Roman.Roman;
import applications.saucedemo.models.Credential;
import org.openqa.selenium.By;
import selenium.Selenium;

public class LoginPage extends Selenium {

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginBtn = By.id("login-button");

    public LoginPage(Roman roman) {
        super(roman);
    }

    public void login(Credential credential){
        navigateTo();
        sendKeys(usernameField, credential.username);
        sendKeys(passwordField, credential.password);
        click(loginBtn);
    }

    @Override
    protected String get_uri() {
        return "https://www.saucedemo.com/";
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }
}
