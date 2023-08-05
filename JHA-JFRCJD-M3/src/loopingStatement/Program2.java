package loopingStatement;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        System.out.println("ENTER AN NUMBER ");
        int num = new Scanner(System.in).nextInt() ;

        int fact = 1;
        for (int i =1 ; i<=num ; i++)
        {
           fact *= i ;
        }
        System.out.println(fact);
    }
}
