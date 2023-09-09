package abstraction;

public class LoanAccount implements BankAccount{
    static double bankBalance = 20000 ;

    @Override
    public void deposit(double amt) {
        bankBalance -= amt ;
        checkBalance();
    }

    @Override
    public void withdraw(double amt) {
        bankBalance += amt ;
        checkBalance();
    }

    @Override
    public void checkBalance() {
        System.out.println("---------------------------------------------");
        System.out.println("LOAN ACCOUNT : LOAN BALANCE IS "+ bankBalance);
        System.out.println("---------------------------------------------");

    }
}
