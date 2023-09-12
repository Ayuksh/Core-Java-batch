package encapsulation;

public class Bank {
    private int accNo ;
    private String name ;
    private double bankBalance ;

    public Bank(int accNo, String name, double bankBalance) {
        this.accNo = accNo;
        this.name = name;
        this.bankBalance = bankBalance;
    }

    public double getBankBalance()
    {
        return this.bankBalance;
    }

    public String getName() {
        return name;
    }

    public void setBankBalance(double bankBalance)
    {
        this.bankBalance = bankBalance ;
    }
}
