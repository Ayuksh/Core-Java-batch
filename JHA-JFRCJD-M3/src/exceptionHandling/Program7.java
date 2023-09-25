package exceptionHandling;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10 , 20 , 30};

        System.out.println("ENTER A NUMBER ");

        try {
            int n = sc.nextInt();
            System.out.println("ELEMENT : " + arr[n]);
        }catch (ArrayIndexOutOfBoundsException A)
        {
            System.out.println("EXCEPTION OCCUR !!");
        }finally {
            System.out.println("THIS IS FINALLY BLOCK !!");
            sc.close();
        }


    }
}
