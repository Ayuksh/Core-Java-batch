package calculatorApp;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER ONE ");
        int num1 = sc.nextInt() ;
        System.out.println("ENTER NUMBER TWO ");
        int num2 = sc.nextInt();

        Calculator c1 = new Calculator(num1 , num2 );
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
    }
}
