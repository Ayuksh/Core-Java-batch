package exceptionHandling;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("ENTER YOUR AGE ");

        int age = sc.nextInt() ;
        if (age >= 18)
            System.out.println("ELIGIBLE FOR VOTING ");
        else
            throw new ArithmeticException();
    }
}
