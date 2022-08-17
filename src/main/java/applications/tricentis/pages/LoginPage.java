package applications.tricentis.pages;

import Roman.Roman;
import applications.tricentis.models.Credential;
import org.openqa.selenium.By;
import selenium.Selenium;

public class LoginPage extends Selenium {
    public LoginPage(Roman roman) {
        super(roman);
    }

    @Override
    protected String get_uri() {
        return "http://demowebshop.tricentis.com/";
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }

    private final By loginButton = By.xpath("//a[@href=\"/login\"]");
    private final By emailField = By.xpath("//input[@id=\"Email\"]");
    private final By passwordField = By.xpath("//input[@id=\"Password\"]");
    private final By submitButton = By.xpath("//input[@value=\"Log in\"]");

    public void login(Credential credential){
        navigateTo();
        click(loginButton);
        sendKeys(emailField,"titanslayer@gmail.com");
        sendKeys(passwordField,"Eren-san");
        click(submitButton);
    }
}
