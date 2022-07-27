package selenium;

import Roman.Roman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractBankingPage extends AbstractPage{



    public AbstractBankingPage(Roman roman)
    {
        super(roman);
    }

    public boolean isDisplayed(By by)
    {
        return findOne(by).isDisplayed();
    }

    public void selectFromDropdown(By by, String text)
    {
        Select selectElement = new Select(findOne(by));
        selectElement.selectByVisibleText(text);
    }
}
