package applications.tricentis.pages;

import Roman.Roman;
import selenium.Selenium;

public class HomePage extends Selenium {
    public HomePage(Roman roman) {
        super(roman);
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
