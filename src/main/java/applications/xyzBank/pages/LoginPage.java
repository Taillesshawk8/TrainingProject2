package applications.xyzBank.pages;

import Roman.Roman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.AbstractBankingPage;

public class LoginPage extends AbstractBankingPage {

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
