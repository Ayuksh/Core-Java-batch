package polimorphism;

import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s1 ;
        System.out.println("SELECT THE SHAPE ");
        System.out.println("1. SQUARE ");
        System.out.println("2. CIRCLE ");
        int ch = sc.nextInt() ;

        if (ch == 1)
            s1 = new Square() ;
        else
            s1 = new Circle();

        s1.area();

    }
}
