package applications.xyzBank;

import Roman.Roman;
import applications.xyzBank.pages.AccountPage;
import applications.xyzBank.pages.LoginPage;
import applications.xyzBank.pages.TransactionsPage;

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
