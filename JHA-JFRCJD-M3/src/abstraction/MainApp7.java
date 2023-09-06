package abstraction;

import java.util.Scanner;

public class MainApp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("SELECT THE ROLE ");
        System.out.println("1. MANAGER");
        System.out.println("2. DEVELOPER ");
        int ch = sc.nextInt();

        Employee e1 ;

        if (ch == 1)
            e1 = new Manager() ;
        else
            e1 = new Developer();

        e1.getDesignation();
        e1.getJob();
    }
}
