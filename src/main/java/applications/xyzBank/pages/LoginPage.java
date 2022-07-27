package applications.xyzBank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper{

    public LoginPage(WebDriver driver)
    {
        super(driver);

    }

    private By customerLoginBtn = By.xpath("//button[text()='Customer Login']");
    private By customerSelect = By.id("userSelect");
    private By loginBtn = By.xpath("//button[text()='Login']");

    public void login(String customerName)
    {
        _driver.navigate().to("https://www.way2automation.com/angularjs-protractor/banking/#/login");
        click(customerLoginBtn);
        selectFromDropdown(customerSelect, customerName);
        click(loginBtn);
    }
}
