package abstraction;

import java.util.Scanner;

public class MainApp10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SELECT THE BANK ACCOUNT ");
        System.out.println("1. LOAN ACCOUNT");
        System.out.println("2. SAVING ACCOUNT ");
        int ch = sc.nextInt() ;

        BankAccount acc = FactoryClass.createAccount(ch) ;

        for( int i =0 ;; i++) {
            System.out.println("SELECT THE OPERATION ");
            System.out.println("1. DEPOSIT ");
            System.out.println("2. WITHDRAW ");
            System.out.println("3. CHECK BALANCE ");
            System.out.println("4. exit ");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("ENTER AMT TO DEPOSIT ");
                double amt = sc.nextDouble();
                acc.deposit(amt);
            } else if (ch == 2) {
                System.out.println("ENTER AMT TO WITHDRAW ");
                double amt = sc.nextDouble();
                acc.withdraw(amt);
            } else if (ch == 3) {
                acc.checkBalance();
            }else {
                break;
            }
        }

    }
}
