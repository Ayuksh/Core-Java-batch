package abstraction;

public class FactoryClass {

    public static BankAccount createAccount( int ch )
    {
        if (ch == 1)
            return new LoanAccount();
        else
            return new SavingAccount();
    }

}
