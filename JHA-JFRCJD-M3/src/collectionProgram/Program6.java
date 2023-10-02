package collectionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list1 = new ArrayList();

        for (int i =0 ; i<5 ; i++) {
            System.out.println("ENTER A NUMBER ");
            int a = sc.nextInt();
            list1.add(a);
        }

        System.out.println( list1 );
    }
}
