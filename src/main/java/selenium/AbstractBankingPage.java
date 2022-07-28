package selenium;

import Roman.Roman;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

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
