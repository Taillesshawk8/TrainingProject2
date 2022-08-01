package applications.xyzBank.pages;

import Roman.Roman;
import org.openqa.selenium.By;
import selenium.Selenium;

public class LoginPage extends Selenium {

    public LoginPage(Roman roman)
    {
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

    private final By customerLoginBtn = By.xpath("//button[text()='Customer Login']");
    private final By customerSelect = By.id("userSelect");
    private final By loginBtn = By.xpath("//button[text()='Login']");

    public void login(String customerName)
    {
        _driver.navigate().to("https://www.way2automation.com/angularjs-protractor/banking/#/login");
        click(customerLoginBtn);
        selectFromDropdown(customerSelect, customerName);
        click(loginBtn);
    }
}
