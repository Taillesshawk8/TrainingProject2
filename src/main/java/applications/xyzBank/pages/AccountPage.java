package applications.xyzBank.pages;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.SeleniumWrapper;

public class AccountPage extends SeleniumWrapper {

    private By makeDepositBtn = By.xpath("//button[contains(text(),'Deposit')]");
    private By depositAmount = By.xpath("//label[text()='Amount to be Deposited :']/following-sibling::input");
    private By depositBtn = By.xpath("//button[text()='Deposit']");
    private By depositSuccess = By.xpath("//span[text()='Deposit Successful']");

    public AccountPage(WebDriver driver)
    {
        super(driver);
    }

    public void makeDeposit(int amount)
    {
        click(makeDepositBtn);
        sendKeys(depositAmount,amount+"");
        click(depositBtn);
        Assertions.assertEquals(isDisplayed(depositSuccess), true);
    }

    public void makeWithdrawal()
    {

    }

    public void openTransactions()
    {

    }
}
