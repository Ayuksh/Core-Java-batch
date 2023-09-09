package abstraction;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        String s = "java";


        System.out.println("SELECT THE SWITCH");
        System.out.println("1. LED ");
        System.out.println("2. SOLAR");
        int ch = new Scanner(System.in).nextInt() ;
       Switch s1 ;
       LED l1 = new LED();
        if(ch == 1)
            s1 = new LED();
        else
           s1 = new SolarLIght();

        s1.switchON();
        s1.switchOff();
    }
}
