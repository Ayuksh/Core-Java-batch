package loopingStatement;

import java.util.Scanner;

public class DoWhileExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean status = false ;

        do{
            status = true ;
            System.err.println("THIS IS DO WHILE !!");
            System.out.println("ENTER 'N' TO STOP EXECUTE DO WHILE ");
            char ch = sc.next().charAt(0);
            if (ch == 'N' || ch == 'n')
                status = false ;
        }while (status);


    }
}
