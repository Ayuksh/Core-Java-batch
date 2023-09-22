package exceptionHandling;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("ENTRE A NUMBER ");
        String num1 = sc.next();
        try {
            int a = Integer.parseInt(num1);
            System.out.println(a + 10);
        }catch (NumberFormatException n)
        {
            System.out.println("EXCEPTION OCCUR ");
        }

    }
}
