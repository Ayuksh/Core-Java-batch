package demoPackage;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hello world !!");
        System.out.println("ENTER NUMBER ");
        int a = sc.nextInt();

        System.out.println("ENTER NUMBER ");
        int b = sc.nextInt();

        int c = a+b ;
        System.out.println("sum "+ c);
    }
}


