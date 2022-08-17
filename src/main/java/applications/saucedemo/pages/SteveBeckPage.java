package applications.saucedemo.pages;

import Roman.Roman;
import applications.saucedemo.models.Credential;
import org.openqa.selenium.By;
import selenium.AbstractPage;

public class SteveBeckPage extends AbstractPage {

    private By usernameField = null;
    private By passwordField = null;
    private By submitBtn = null;

    public SteveBeckPage(Roman roman) {
        super(roman);
    }

    public void login(Credential credential)
    {
        navigateTo();
        sendKeys(usernameField,credential.username);
        sendKeys(passwordField, credential.password);
        click(submitBtn);
    }

    @Override
    protected String get_uri() {
        return null;
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }
}
