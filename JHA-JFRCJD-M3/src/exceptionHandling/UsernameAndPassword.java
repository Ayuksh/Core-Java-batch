package exceptionHandling;

import java.util.Scanner;

public class UsernameAndPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER USERNAME ");
        String name = sc.next();
        System.out.println("ENTER PASSWORD ");
        String password = sc.next();

        if (!name.equals("qspider"))
            throw new InvalidNameException("INVALID USER NAME ");
        else if(!password.equals("1234"))
            try {
                throw new InvalidPasswordException("invalid password plz enter valid password ");
            } catch (InvalidPasswordException e) {
                throw new RuntimeException(e);
            }
        System.out.println("LOGIN SUCCESSFUL !!");

    }
}
