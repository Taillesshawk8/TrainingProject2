package applications.xyzBank;

import Roman.Roman;
import pages.AccountPage;
import pages.LoginPage;
import pages.TransactionsPage;

public class BankingApplication {

    public LoginPage loginPage;
    public AccountPage accountPage;
    public TransactionsPage transactionsPage;

    public BankingApplication(Roman roman)
    {
        loginPage = new LoginPage(roman);
        accountPage = new AccountPage(roman);
    }

}
