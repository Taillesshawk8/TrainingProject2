package applications.xyzBank;

import applications.xyzBank.pages.AccountPage;
import applications.xyzBank.pages.LoginPage;
import applications.xyzBank.pages.TransactionsPage;
import org.openqa.selenium.WebDriver;

public class BankingApplication {

    public LoginPage loginPage;
    public AccountPage accountPage;
    public TransactionsPage transactionsPage;

    public BankingApplication(WebDriver driver)
    {
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
    }

}
