package Bank_Account;

import java.io.File;
import java.io.FileNotFoundException;

public class test{

    public static void main(String[] args) throws FileNotFoundException {

        Bank_Account.Account account = new Bank_Account.Account("Sara",1122,1000,1.5);
        Bank_Account.CheckingAccount checkingAccount = new Bank_Account.CheckingAccount("Sara",1122,1000,1.5,0);
        Bank_Account.SavingsAccount savingsAccount = new Bank_Account.SavingsAccount("Sara",1122,1000,1.5,-900);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(40);
        account.withdraw(20);
        account.AccountFile();
        account.PrintAccountFile();

    }
}
