package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class SeleniumWrapper {

    public WebDriver _driver;
    public int counter =0;

    public SeleniumWrapper(WebDriver driver)
    {
        this._driver = driver;
    }

    public WebElement findOne(By by)
    {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by)
    {
        findOne(by).click();
    }

    public void sendKeys(By by, String text)
    {
        findOne(by).sendKeys(text);
    }

    public boolean isDisplayed(By by)
    {
        return findOne(by).isDisplayed();
    }

    public String getText(By by)
    {
        return findOne(by).getText();
    }

    public void selectFromDropdown(By by, String text)
    {
        Select selectElement = new Select(findOne(by));
        selectElement.selectByVisibleText(text);
    }
}
