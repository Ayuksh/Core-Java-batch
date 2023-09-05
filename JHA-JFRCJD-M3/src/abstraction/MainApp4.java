package abstraction;

import java.util.Scanner;

public class MainApp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("1. PAYTM ");
        System.out.println("2. GOOGLE PAY");
        int ch = sc.nextInt() ;
        AmazonPayment ap ;

        if (ch == 1)
            ap = new Paytm();
        else
            ap = new GooglePay();

        ap.transaction();
        ap.receiveMessage();
        ap.getBill();
    }
}
